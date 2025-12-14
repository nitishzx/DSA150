import java.util.HashSet;

public class ContaintDupliCate {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 2, 3 };
        boolean ans = false;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             ans = true;
        //             System.out.println(ans);
        //         }
        //     }
        // }
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            if(hs.contains(i)){
                ans=true;
                System.out.println(ans);
                break;
            }
            hs.add(i);
        }
    }

}