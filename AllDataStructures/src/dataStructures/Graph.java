package dataStructures;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
	int V;
	int graph [][];

	Graph()
	{
		V=1;
		graph=new int[1][1];
	}
	Graph(int V)
	{
		this.V=V;
		graph=new int[V][V];
	}
	void printGraph()
	{
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<V;j++)
			{
				System.out.println("Edge between "+i+"--->"+j+" "+graph[i][j]);
			}
		}
	}
	
	void printGraphInMatrixFormat()
	{
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<V;j++)
			{
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean addEdge(int v,int u,int value)
	{
		graph[v][u]=value;
		return true;
	}
	 boolean isBipartite(int G[][],int src)
	    {
	        // Create a color array to store colors assigned to all veritces.
	        // Vertex number is used as index in this array. The value '-1'
	        // of  colorArr[i] is used to indicate that no color is assigned
	        // to vertex 'i'.  The value 1 is used to indicate first color
	        // is assigned and value 0 indicates second color is assigned.
	        int colorArr[] = new int[V];
	        for (int i=0; i<V; ++i)
	            colorArr[i] = -1;
	 
	        // Assign first color to source
	        colorArr[src] = 1;
	 
	        // Create a queue (FIFO) of vertex numbers and enqueue
	        // source vertex for BFS traversal
	        LinkedList<Integer>q = new LinkedList<Integer>();
	        q.add(src);
	 
	        // Run while there are V in queue (Similar to BFS)
	        while (q.size() != 0)
	        {
	            // Dequeue a vertex from queue
	            int u = q.poll();
	 
	            // Return false if there is a self-loop 
	            if (G[u][u] == 1)
	                return false;  
	 
	            // Find all non-colored adjacent V
	            for (int v=0; v<V; ++v)
	            {
	                // An edge from u to v exists and destination v is
	                // not colored
	                if (G[u][v]==1 && colorArr[v]==-1)
	                {
	                    // Assign alternate color to this adjacent v of u
	                    colorArr[v] = 1-colorArr[u];
	                    q.add(v);
	                }
	 
	                // An edge from u to v exists and destination v is
	                // colored with same color as u
	                else if (G[u][v]==1 && colorArr[v]==colorArr[u])
	                    return false;
	            }
	        }
	        // If we reach here, then all adjacent V can
	        //  be colored with alternate color
	        return true;
	    }
	public static void main(String [] args)
	{
		Graph graph=new Graph(5);
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no of V: \n");
		graph.V=in.nextInt();
		for(int i=0;i<graph.V;i++)
		{
			for(int j=0;j<graph.V;j++)
			{
				//System.out.println("Is there any Edge from vertex "+i+" to "+j+ " If there is edge enter 1 else 0");
				int edgevalue=in.nextInt();
				if(edgevalue!=0)
				graph.graph[i][j]=edgevalue;
			}
		}
		//graph.addEdge(1, 2, 5);
		graph.printGraphInMatrixFormat();
		System.out.println(graph.isBipartite(graph.graph, 0));
		
	}
}
