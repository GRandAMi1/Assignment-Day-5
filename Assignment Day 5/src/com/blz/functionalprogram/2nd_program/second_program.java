public class second_program {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 2, -2, 5, 6, -4, -8, -6,5};              //Enter your data HERE....
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k] == 0) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }

                }

            }

        }
    }
}
