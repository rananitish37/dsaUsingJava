public class OnCallRosterRotation {
    public static void main(String[] args) {
        char roster[] = {'A', 'B', 'C', 'D', 'E'};   //E, D, C, B, A -> D, E, C, B, A -> D, E, A, B, C
        int k=2;

        int l=0,r=roster.length-1;
        while(l<r){
            char temp = roster[l];
            roster[l] = roster[r];
            roster[r] = temp;
            l++;
            r--;
        }

        l=k;
        r=roster.length-1;
        while(l<r){
            char temp = roster[l];
            roster[l] = roster[r];
            roster[r] = temp;
            l++;
            r--;
        }

        l=0;
        r=k-1;
        while(l<r){
            char temp = roster[l];
            roster[l] = roster[r];
            roster[r] = temp;
            l++;
            r--;
        }
        
        for(char x: roster){
            System.out.print(x+" ");
        }
    }
}
