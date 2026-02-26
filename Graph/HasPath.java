package Graph;

import java.util.ArrayList;

import Graph.CreatingGraph.Edge;

public class HasPath {
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean []visited){
        if(src == dest){
            return true;
        }
        visited[src]=true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            
            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)){
                return true;
            }
        }
        return false;
    }
}
