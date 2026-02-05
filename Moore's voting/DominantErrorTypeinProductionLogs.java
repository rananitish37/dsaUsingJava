public class DominantErrorTypeinProductionLogs {
    public static void main(String[] args) {
        int logs[] ={500, 404, 500, 500, 403, 500, 500};

        int count =0;
        int candidate=0;
        for(int i=0; i<logs.length; i++){
            if(count==0) {
                candidate = logs[i];
                count++;
            }else if(logs[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(candidate);
    }
}
