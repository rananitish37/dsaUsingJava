public class WeirdAlgorithm {
    public static void main(String[] args) {
        int n=17;
        System.out.print(n);
        while(n != 1){
            int val = 0;
            if(n%2==0){
                val = n/2;
            }else{
                val = (n*3)+1;
            }
            n=val;
            System.out.print(" -> "+val);
        }
    }
}
