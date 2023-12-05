package org.example.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class InterviewSolution {
    public static void main(String[] args) {
        Set<String> ids = new LinkedHashSet<>();
        String filePath=new Scanner(System.in).nextLine();
        try(BufferedReader br =new BufferedReader(new FileReader(filePath))){
            while (br.ready()){
                String line = br.readLine();
                String id= line.substring(line.indexOf(' '),line.indexOf(' ',line.indexOf(' ')+1));
                ids.add(id);
            }
            System.out.println(ids);
            System.out.println(ids.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
