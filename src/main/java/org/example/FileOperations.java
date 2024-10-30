package org.example;

import java.io.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/sameer/Documents/abc.txt");

//        file.delete();
//        file.listFiles();

//        List<String> lines= Files.readAllLines(Paths.get("/home/sameer/Documents/abc.txt"));
//        for(String s:lines){
//            System.out.println(s);
//        }
//        FileWriter fw=new FileWriter(file,true);
//        fw.append("abcdhijklmopqrstuvwxyz \n");
//        fw.close();
//        FileReader fr=new FileReader(file);
//        int c;
//        while((c=fr.read())!=-1){
//            char ch=(char)c;
//            System.out.print(ch);
//        }
//        fr.close();
//        OutputStream os=new FileOutputStream("/home/sameer/Documents/b.txt");
//        for(int i=65;i<=90;i++){
////            os.write(i);
//            os.write(i);
//        }
//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        try {
//            in = new FileInputStream("/home/sameer/Documents/abc.txt");
//            out = new FileOutputStream("/home/sameer/Documents/b.txt");
//
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        }finally {
//            if (in != null) {
//                in.close();
//            }
//            if (out != null) {
//                out.close();
//            }
//        }

//        InputStream is=new FileInputStream("/home/sameer/Documents/abc.txt");
//        int size=is.available();
//        for(int i=0;i<size;i++){
//            os.write((char) is.read());
//        }
//        System.out.println();
    }
}