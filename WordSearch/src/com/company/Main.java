package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
       ArrayList<String> lines = new ArrayList<>();
       FileReader fr = new FileReader("ProgrammingHistory.txt");
       BufferedReader br = new BufferedReader(fr);
       String line;
       while ((line = br.readLine()) != null){
           lines.add(line);
       }

       System.out.print(wordSearch("program", lines));







	}


	//Requires: nothing
    //Modifies: this
    //Effects: Checks an ArrayList of strings for a given word, returns indexes of strings that contain the word.
	public static ArrayList<Integer> wordSearch(String word, ArrayList lines){
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++)  {
            String line = (String)lines.get(i);
            if (line.contains(word)){
                indexes.add(i);

            }
        }
        return indexes;
    }



}


