public class 삽입정리 {
    public static void main(String[] args) {
        int[] array = {7,5,9,0,3,1,6,2,4,8};

        for (int i = 0; i < array.length - 1; i++) {
            int min;
            for (int j = i + 1; j > 0 ; --j) {
                if (array[j] < array[j - 1]) {
                    min = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = min;
                }
                else {
                    break;
                }
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
