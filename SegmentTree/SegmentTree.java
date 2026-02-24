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

        if(qj <= si || qi >= sj){ //non overlapping
            return 0;
        }else if(si >= qi && sj <= qj){//total overlapping
            return tree[idx];
        }else{ //partial overlapping
            int mid = (si + sj)/2;
            int left = getSum(idx*2+1, si, mid, qi, qj);
            int right = getSum(idx*2+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }

    public static int segmentQuery(int []arr, int qi, int qj){
        return getSum(0, 0, arr.length-1, qi, qj);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n= arr.length;

        init(n);

        build(arr, 0, 0,n-1);

        // for (int i=0; i<tree.length; i++) {
        //     System.out.print(tree[i]+" ");
        // }

        System.out.print(segmentQuery(arr, 2, 4));
       
    }
}
