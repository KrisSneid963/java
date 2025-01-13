package lt.techin.praktinis;

public class ArraysTask {

    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.
        //%d is used only with numbers/integers - int / long only and its called format specifier -
        // holds value as a placeholder


        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

        System.out.printf("First element: %d\n", getFirstElement(arr));
        System.out.printf("Last element: %d\n", getLastElement(arr));
        System.out.printf("Max mark: %d\n", getMax(arr));
        System.out.printf("Sum: %d\n", getSum(arr));
        System.out.printf("Average: %.2f\n", getAverage(arr));
        System.out.printf("Count of elements greater than 4: %d\n", countElements(arr, 4));
        System.out.printf("Contains 4: %b\n", contains(arr, 4));
        System.out.printf("Last index of 4: %d\n", lastIndexOf(arr, 4));
    }

    // Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    // Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    // Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    } //  for (int i = 0; i < arr.length; i++) {
    //if (arr[i] < min) {
    //min = arr[i];

    // Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < max) {
// max = arr[i];
// }
// }
//    return max;
//}

    // Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
//for (int i = 0; i < arr.length; i++) {
    // sum = sum + arr[i];
    //}
    //return sum;
    //}

    // Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    // Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num > n) {
                count++;
            }
        }
        return count;
    }
    //for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > n) {
    // count = count + 1;
    //}}
    //return count;
    //}

    // Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        for (int num : arr) {
            if (num == n) {
                return true;
            }
        }
        return false;
    }

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == n) {
    //return true;
    //}}
    //return false;}


    // Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}

//for (int i = arr.length - 1; i >= 0; i--) {
// if (arr[i] == n) {
//return i; }}
//return -1;}

