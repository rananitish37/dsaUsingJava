public class TrafficSeverityReordering {
    public static void main(String[] args) {
        int severity[] = {1, 0, 2, 1, 0, 2};

        int start=0,mid=0,end=severity.length-1;
        while(mid<=end){
            if(severity[mid] == 0){
                swap(start, mid,severity);
                start++;
                mid++;
            }else if(severity[mid] == 2){
                swap(mid, end, severity);
                end--;
            }else{
                mid++;
            }
        }
        for(int x: severity){
            System.out.print(x+" ");
        }
    }
    public static void swap(int a, int b,int [] severity){
        int temp = severity[a];
        severity[a]=severity[b];
        severity[b]=temp;
    }
}
