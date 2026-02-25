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

        int l = build(arr, 2*sti+1, start, mid);
        int r = build(arr, 2*sti+2, mid+1, end);
        // tree[sti] = l+r;
        tree[sti]  = tree[2*sti+1]+tree[2*sti+2]; 
        return tree[sti];

        
    }
    public static int getSum(int idx, int si, int sj, int qi, int qj){

        if(qj < si || qi > sj){ //non overlapping
            return 0;
        }else if(si >= qi && sj <= qj){//total overlapping
            return tree[idx];
        }else{ //partial overlapping
            int mid = (si + sj)/2;
            int left = getSum(2*idx+1, si, mid, qi, qj);
            int right = getSum(2*idx+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }

    public static int segmentQuery(int []arr, int qi, int qj){
        int n=arr.length;
        return getSum(0, 0, n-1, qi, qj);

    }
    public static void update(int i, int si, int sj, int idx, int diff){
        if(idx > sj || idx < si){
            return;
        }

        tree[i] += diff;
        if(si != sj){ //non-leaf
            int mid = (si+sj)/2;
            update(2*i+1, si, mid, idx, diff);
            update(2*i+2, mid+1, sj, idx, diff);
        }
    }

    public static void updateSegment(int arr[], int idx, int val){
        int diff = val-arr[idx];
        int n=arr.length;
        arr[idx] = val;
        update(0,0,n-1,idx, diff);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n= arr.length;

        init(n);

        build(arr, 0, 0,n-1);

        for (int i=0; i<tree.length; i++) {
            System.out.print(tree[i]+" ");
        }

        System.out.println(segmentQuery(arr, 2, 6));


        updateSegment(arr, 2,2);

        System.out.println();
        for (int i=0; i<tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
        
        System.out.println(segmentQuery(arr, 2, 6));
    }
}
