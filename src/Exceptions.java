public class Exceptions {

    public static void main(String[] args) {

        String[][] array = new String[][]{{"2", "1"}, {"2", "2"}};
        System.out.println(sum2d(array));
    }

    //1 задание
    public static void printArr() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[4]);
    }

    public static Integer nullInt() {
        Integer n = null;
        return n.intValue();
    }

    public static int divide() {
        return 1 / 0;
    }

    //2 задание
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;

        //.NumberFormatException
        //.ArrayIndexOutOfBoundsException
        //.NullPointerException
    }


    //3 задание
    public static int[] arraysDivide(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Lengths aren't equal each other");
        } else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}

