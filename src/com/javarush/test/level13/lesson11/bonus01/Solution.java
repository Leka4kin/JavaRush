package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));


        ArrayList<Integer> nums = new ArrayList<>();

        while (reader.ready()){
            int data = Integer.parseInt(reader.readLine());
            if (data % 2 == 0) nums.add(data);
            //System.out.println(data);
        }
        reader.close();
        ArrayList<Integer> result = sort(nums);

        for (int i : result){
            System.out.println(i);
        }


    }

    public static ArrayList<Integer> sort (ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++){
            for (int j = i; j < nums.size(); j++){
                if (nums.get(i) > nums.get(j)){
                    int temp = nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }
        return nums;
    }
}
