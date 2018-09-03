package com.sean.java.concept.ioPractice;

import java.io.*;

public class IOPractice {
    public static void main(String[] args){
        BufferedReader br = null;
        try{
            //open input stream
            br = new BufferedReader(new InputStreamReader(IOPractice.class.getResourceAsStream("io.txt"),"UTF-8"));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(br != null){
                try {
                    //close input stream
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
