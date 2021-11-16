package com.readfile;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("/Users/shawn/Documents/codebase/Collections_HomeWork/csv_file/sample1.csv"));
        String readFile;
        String[] separateByComma = new String[0];

        HashMap<String, Integer> stringArr = new HashMap<>();

        String [] saveInsurance;


        while ((readFile = br.readLine()) != null) {
            separateByComma = readFile.split(",");


            for (int i = 0; i < separateByComma.length; i++) {
                stringArr.put(separateByComma[4], i);

            }

        }


        for (Map.Entry e : stringArr.entrySet()) {
                System.out.println(e.getKey());


           // BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/shawn/Documents/codebase/Collections_HomeWork/csv_file/" + e.getKey() + ".csv"));
           // bw.write(separateByComma[0] + " " + separateByComma[1]);
          //  bw.close();
        }

        //


    }
}
