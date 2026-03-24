package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // DIRECTED edges for topo sort (0→5)
        // 0 → 1, 0 → 2
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 → 3
        graph[1].add(new Edge(1, 3));

        // 2 → 3, 2 → 4
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));

        // 3 → 5
        graph[3].add(new Edge(3, 5));

        // 4 → 5
        graph[4].add(new Edge(4, 5));

        // Print graph
        for (int i = 0; i < V; i++) {
            System.out.print(i + " → ");
            for (Edge e : graph[i]) {
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }

        topoSort(graph);
    }

    public static void topoSort(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topoSortUtil(graph, i, vis, s); // modified dfs
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    private static void topoSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topoSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
}
