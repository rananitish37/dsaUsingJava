public class LaundrySegregationSystem {
    public static void main(String[] args) {
        int clothes[] = {2, 0, 2, 1, 1, 0};

        int start=0,mid=0,end=clothes.length-1;
        while(mid<end){
            if(clothes[mid] == 0){
                swap(start, mid,clothes);
                start++;
                mid++;
            }else if(clothes[mid] == 2){
                swap(mid, end, clothes);
                mid++;
                end--;
            }
        }
        for(int x: clothes){
            System.out.print(x+" ");
        }
    }
    public static void swap(int a, int b,int [] clothes){
        int temp = clothes[a];
        clothes[a]=clothes[b];
        clothes[b]=temp;
    }
}
