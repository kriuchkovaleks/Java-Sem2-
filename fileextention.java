// Задание 3 - Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt

// 2 Расширение файла: pdf

// 3 Расширение файла:

// 4 Расширение файла: jpg

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class fileextention {
    public static void main(String[] args) {

        try {
            File dir = new File("D:/Education/Programming/Java/Seminar2");
            String[] list_of_files = dir.list();
            for (String i : list_of_files) {
                get_extention(i);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private static void get_extention(String name) {
        Logger lg = Logger.getAnonymousLogger();
        StringBuilder sb = new StringBuilder();
        int point_index = 0;
        String point = ".";
        char[] name_arr = name.toCharArray();
        for (int i = 0; i < name_arr.length; i++) {
            if (point.equals(Character.toString(name_arr[i]))) {
                point_index = i;
            }
        }
        sb.append("File extention is: ");
        for (int i = point_index + 1; i < name_arr.length; i++) {
            sb.append(name_arr[i]);
        }
        lg.info(sb.toString());
    }
}
