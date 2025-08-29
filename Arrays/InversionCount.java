import java.util.ArrayList;

public class InversionCount {
    static int count;

    static int inversionCount(int arr[]) {
        count = 0; // reset for each test case
        mergeSort(0, arr.length - 1, arr);
        return count;
    }

    public static void mergeSort(int start, int end, int arr[]) {
        if (start >= end) return;
        int mid = (end + start) / 2;

        mergeSort(start, mid, arr);
        mergeSort(mid + 1, end, arr);
        merge(start, end, mid, arr);
    }

    public static void merge(int start, int end, int mid, int arr[]) {
        int left = start;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
                count += (mid - left + 1); // all remaining left-side elements are inversions
            }
        }

        while (left <= mid) temp.add(arr[left++]);
        while (right <= end) temp.add(arr[right++]);

        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }
}
