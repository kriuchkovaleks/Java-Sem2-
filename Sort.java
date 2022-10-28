// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.*;
import java.util.logging.Logger;

public class Sort {

    public static void main(String[] args) {
        Logger lg = Logger.getAnonymousLogger();
        int[] arr = new int[] { 1, 3, 1, 6, 5, 4 };
        int count = 1;
        while (count > 0){
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    count = 1;
                } else {
                    count = 0;
                }
                lg.info(arr_print(arr));
            }

        }

   
    }

    private static String arr_print(int[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i : args) {
            sb.append(Integer.toString(i));
            sb.append(" ");
        }
        return sb.toString();
    }
}
