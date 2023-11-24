

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        MainMenu mainMenu = new MainMenu();
        String filePath = "Movies.txt";
        System.out.println(mainMenu.readMoviesFromFile(filePath));

       /* Scanner s = new Scanner(new File("Movies.txt"));

        ArrayList <String> stringList = new ArrayList<>();

        while (s.hasNextLine())
            stringList.add(s.nextLine());

        System.out.println(stringList);


        /*FileReader s = new FileReader(new File("Movies.txt"));

        BufferedReader br = new BufferedReader(s);

        String data = null;

        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();*/
    }
}