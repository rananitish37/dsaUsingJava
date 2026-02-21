package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.CreatingGraph.Edge;

public class BFS {
    public static void BfsTraversal(ArrayList<Edge>[] graph){
        int V = graph.length;
        boolean []visited = new boolean[V];
        for (int i = 0; i < visited.length; i++) {
            visited[i]=false;
        }
        Queue<Integer> queue = new LinkedList<>();

        queue.add(graph[0].get(0).src);
        while (!queue.isEmpty()) {  
            int curr = queue.peek();
            if(!visited[curr]){
                for(int i=0; i<graph[curr].size(); i++){
                    queue.add(graph[curr].get(i).dest);
                }
                visited[curr]=true;
                System.out.print(curr+" ");
            }
            queue.poll();
        }
    }
}
