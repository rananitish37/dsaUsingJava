package Graph;

import java.util.ArrayList;

public class DetectCycle {
    static class Edge {
        int src, dest, weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // First component (0-1-2-3 connected)
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));

        System.out.println(cycleExist(graph));

    }

    private static boolean cycleExist(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(visited[i]){
                if(cycleExistUtil(graph, visited, 1, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean cycleExistUtil(ArrayList<Edge>[] graph, boolean[] visited,int curr, int parent) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(visited[e.dest] && cycleExistUtil(graph, visited, e.dest, curr)){
                return true;
            } else if(visited[e.dest] && e.dest != parent){
                return true;
            }
        }
        return false;
    }
}
