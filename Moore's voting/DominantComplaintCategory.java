public class DominantComplaintCategory {
    public static void main(String[] args) {
        int []complaints = {2, 1, 2, 3, 2, 1, 2, 2};
        int count1=0,count2=0,candidate1=0,candidate2=0;

        for(int i=0; i<complaints.length; i++){
            if(complaints[i] == candidate1){
                count1++;
            }
            else if(complaints[i] == candidate2){
                count2++;
            }else if(count1 ==0){
                count1++;
                candidate1=complaints[i];
            }else if(count2 == 0){
                count2++;
                candidate2=complaints[i];
            }else{
                count1--;
                count2--;
            }
        }

        count1=0; 
        count2=0;
        
        for(int i=0; i<complaints.length; i++){
            if(complaints[i]==candidate1) count1++;
            if(complaints[i] == candidate2) count2++;
        }
        if(count1>complaints.length/3){
            System.out.println(candidate1);
        }
        if(count2>complaints.length/3){
            System.out.println(candidate2);
        }
    }
}
