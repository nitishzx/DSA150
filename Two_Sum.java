import java.util.Arrays;
import java.util.HashMap;

class Two_Sum {

    public static int[] twoSum(int arr[], int target) {
        if (arr.length == 0)
            return new int[] { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (find == arr[j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] twoSumOptimise(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i];
            if (map.containsKey(find))
                return new int[] { map.get(find), i };
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int ans[] = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));
        System.out.println("Optimise answer ");
        int ans2[] = twoSumOptimise(arr, 9);
        System.err.println(Arrays.toString(ans2));

    }
}