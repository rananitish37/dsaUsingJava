package Graph;

public class CreationgGraph {
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

        public Edge(int s, int w, int d){
            this.src = s;
            this.weight = w;
            this.dest = d;
        }
    }
    public static void main(String[] args) {
        
    }
}
