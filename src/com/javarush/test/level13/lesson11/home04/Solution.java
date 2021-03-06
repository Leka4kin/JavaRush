package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine());
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        BufferedWriter out = new BufferedWriter(writer);

        while (true)
        {
            String data = reader.readLine();
            if (data.equals("exit")) {
                out.write("exit");
                out.flush();
                break;
            }
            else
            {
                out.write(data);
                out.write("\r\n");
                out.flush();
            }

        }
        /*reader.close();
        outputStream.close();
        writer.close();
        out.close();*/

    }
}
