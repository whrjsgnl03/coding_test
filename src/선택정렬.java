public class 선택정렬 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int z;

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            z = arr[min];
            arr[min] = arr[i];
            arr[i] = z;
        }
        for (int i = 0; i < arr.length; i++) {System.out.printf("%d", arr[i]);}
    }
}
//타켓넘버 미로탈출