public class SegmentTree {
    static int tree [];

    public static void init(int n){
        tree = new int[4*n];
    }
    public static int build(int arr[], int sti, int start,int end){
        if(start ==end){
            tree[sti] = arr[start];
            return arr[start];
        }

        int mid = (start+end)/2;

        int l = build(arr, 2*start+1, start, mid);
        int r = build(arr, 2*start+2, mid+1, end);
        // tree[sti] = l+r;
        tree[sti]  = tree[2*sti+1]+tree[2*sti+2]; 
        return tree[sti];

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n= arr.length;

        init(n);

        build(arr, 0, 0,n-1);

        for (int i : tree) {
            System.out.print(i+" ");
        }
    }
}
