package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {
    static class Edge {
        int src;
        int weight;
        int dest;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.weight = w;
            this.dest = d;
        }
    }

    public static void main(String[] args) {

        // Component 1: 0-1-2-3-4 (your original)
        // (5)
        // 0───────1
        // / \
        // (1) (3)
        // / \
        // 2──────────3
        // | (1)
        // (2) |
        // | |
        // 4

        // Component 2: 5-6
        // 5──────(4)───6

        // Component 3: 7 (isolated)
        // 7 (alone)

        int V = 7;
        // Create a graph
        ArrayList<Edge>[] graph = new ArrayList[V];
        // it is null right now because we have not initialized it yet so at every index
        // of graph it is null right now
        // lest initialize it

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Store the edges connected at 0;
        graph[0].add(new Edge(0, 1, 5));

        // store the edges connected at 1:
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // store the edges connected at 2:
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // store the edges connected at 3:
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // store the edges connected at 4:
        graph[4].add(new Edge(4, 2, 2));

        // 🔥 NEW: Component 2 (Node 5 connected to 6 only)
        graph[5].add(new Edge(5, 6, 4)); // 5→6
        graph[6].add(new Edge(6, 5, 4)); // 6→5 (undirected)

        // 🔥 Node 7 = ISOLATED (3rd component)
        graph[6] = new ArrayList<>(); // Empty - disconnected

        

        DfsTraversal(graph);

    }

    public static void BfsTraversal(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]){
                BfsTraversalUtil(graph,visited,i);
            }
        }
    }
    public static void BfsTraversalUtil(ArrayList<Edge>[] graph, boolean[] visited,int src){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(src);
        while (!queue.isEmpty()) {  
            int curr = queue.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0; i<graph[curr].size(); i++){
                    queue.add(graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void DfsTraversal(ArrayList<Edge> []graph){
        boolean [] visited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                DfsTraversalUtil(graph, i, visited);
            }
        }
    }

    public static void DfsTraversalUtil(ArrayList<Edge> []graph, int curr, boolean visited[]){
        System.out.print(curr+" ");
        visited[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                DfsTraversalUtil(graph, e.dest, visited);
            }
        }
    }
}
