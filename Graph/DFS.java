package Graph;

import java.util.ArrayList;

import Graph.CreatingGraph.Edge;

public class DFS {
    public static void DfsTraversal(ArrayList<Edge> []graph, int curr, boolean visited[]){
        System.out.print(curr+" ");
        visited[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                DfsTraversal(graph, e.dest, visited);
            }
        }
    }
}
