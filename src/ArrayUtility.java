public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum/array.length;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even += 1;
            }
        }
        return even;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int x = array[i];
            array[i] = array[array.length - 1 - i];
            x = array[array.length - 1 - i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i : array) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i : array) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1) {
                str += ", ";
            }
        }
        return str;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i : array) {
            for (int j : array) {
                if (array[i] + array[j] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        n = n % array.length;
        if (n == 0) return;
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i]=array[array.length - n + i];
        }
        for (int i = array.length-1; i> n - 1; i--){
            array[i] = array[i - n];
        }
        for (int i = 0; i < n; i++){
            array[i] = a[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        n = n % array.length;
        if (n == 0) return;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = array[i];
        }
        for (int i = 0; i < array.length - n; i++) {
            array[i] = array[i + n];
        }
        for (int i = 0; i < n; i++) {
            array[array.length - n + i] = a[i];
        }
    }
}
