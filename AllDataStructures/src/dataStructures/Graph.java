package dataStructures;

import java.util.Scanner;
import java.util.LinkedList;

public class Graph {
	int vertices;
	int graph [][];

	Graph()
	{
		vertices=1;
		graph=new int[1][1];
	}
	Graph(int vertices)
	{
		this.vertices=vertices;
		graph=new int[vertices][vertices];
	}
	void printGraph()
	{
		for(int i=0;i<vertices;i++)
		{
			for(int j=0;j<vertices;j++)
			{
				System.out.println("Edge between "+i+"--->"+j+" "+graph[i][j]);
			}
		}
	}
	boolean addEdge(int v,int u,int value)
	{
		graph[v][u]=value;
		return true;
	}
	
	public static void main(String [] args)
	{
		System.out.println("Enter the no of Vertices in Graph:");
		Scanner in=new Scanner(System.in);
		String str = in.nextLine().trim();
		System.out.println(str);
		
		Graph graph=new Graph(5);
		graph.addEdge(1, 2, 5);
		graph.printGraph();
		
	}
}
