

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AMenu {
    public static List<Movie> readMoviesFromFile(String filePath) {
        List<Movie> movies = new ArrayList<>();
        filePath = "Movies.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] data = line.split("; ");

                String title = data[0];
                int year = Integer.parseInt(data[1]);
                String genre = data[2];
                double rating = Double.parseDouble(data[3].replace(',', '.'));

                Movie movie = new Movie();
                movies.add(movie);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return movies;
    }
    /*public static void main(String[] args) {

    }
    public static void main(String[] args) {
        String filePath = "path/to/your/movies.txt";
        List<Movie> movies = readMoviesFromFile(filePath);

        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - Genre: " +
                    movie.getGenre() + ", Rating: " + movie.getRating());
        }
    }
}*/

}
