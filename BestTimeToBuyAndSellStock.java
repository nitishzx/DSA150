public class BestTimeToBuyAndSellStock {

    static int buyStock(int arr[]) {

        if (arr.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            } else
                max = Math.max(arr[i] - min, max);

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyStock(arr));
    }
}
