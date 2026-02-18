package Graph;

import java.util.ArrayList;

public class CreatingGraph {
    /*
                  (5)
            0 -----------1
                       /   \
                (1)  /       \ (3)
                   /           \
                  2 ------------ 3
                  |      (1)
             (2)  |
                  |
                  4
    */
    static class Edge{
        int src;
        int weight;
        int dest;

        public Edge(int s, int d, int w){
            this.src = s;
            this.weight = w;
            this.dest = d;
        }
    }
    public static void main(String[] args) {
        /*
                  (5)
            0 -----------1
                       /   \
                (1)  /       \ (3)
                   /           \
                  2 ------------ 3
                  |      (1)
             (2)  |
                  |
                  4
    */
        int V=5;
        // Create a graph
        ArrayList<Edge> [] graph = new ArrayList[V];
        // it is null right now because we have not initialized it yet so at every index of graph it is null right now
        // lest initialize it

        for(int i=0; i<V; i++){
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

        System.out.print("Neigbour of "+graph[1].get(1).src+" is ");
        for(int i=0; i<graph[1].size(); i++){
            System.out.print(graph[1].get(i).dest+" ");
        }
    }
}
