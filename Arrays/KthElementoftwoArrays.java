class KthElementoftwoArrays
{
    public int kthElement(int a[], int b[], int k) {
        // code here
        int count = 0;
        int ans=0;
        int n=a.length;
        int m= b.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                ans=a[i];
                i++;
                count++;
            }else{
                ans=b[j];
                j++;
                count++;
            }
            if(count==k)return ans;
        }
        while(i<n){
            ans=a[i];
            i++;
            count++;
            if(count==k)break;
            
        }
        while(j<m){
            ans=b[j];
            j++;
            count++;
            if(count==k)break;
        }
        return ans;
    }
}