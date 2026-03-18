package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BipartiteGraph {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // First component (0-1-2-3-4-0 connected)
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 3));

        System.out.print(bipartiteGraph(graph));
    }

    // O(V+E)
    public static boolean bipartiteGraph(ArrayList<Edge> graph[]){
        int V = graph.length;

        int col[] = new int[V];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;//No color
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i]==-1){//BFS
                queue.add(i);
                col[i] = 0; //let suppose it is yellow

                while (!queue.isEmpty()) {
                    int curr = queue.remove();

                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);

                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0? 1:0;
                            col[e.dest] = nextCol;
                            queue.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr]){
                            return false; //NOT BIPARTITE
                        }
                    }
                }
            }
        }

        return true;
    }
}
