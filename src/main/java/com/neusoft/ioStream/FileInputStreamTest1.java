package com.neusoft.ioStream;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class FileInputStreamTest1 {

    public static void main(String[] args) throws IOException {
        String str = FileUtils.readFileToString(new File("E:\\workspace_Idea\\Interview\\src\\main\\java\\readme.txt"));
        System.out.println(str);
        // StringBuilder sb = new StringBuilder();
        //
        // try (InputStream is = new FileInputStream("E:\\workspace_Idea\\Interview\\src\\main\\java\\readme.txt")) {
        //     byte[] buffer = new byte[1024];
        //     int length = 0;
        //     while ((length = is.read(buffer)) != -1) {
        //         sb.append(new String(buffer, 0, length));
        //     }
        //     System.out.println(sb.toString());
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}
