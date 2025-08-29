public class InversionCount1TLE {
    static int inversionCount(int arr[]) {
        // Code Here
        int n=arr.length;
        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(i<j && arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
