package bg.smg;

import bg.smg.model.Movie;
import bg.smg.services.MovieExecServiceI;
import bg.smg.services.MovieService;
import bg.smg.services.MovieServiceI;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        MovieServiceI ms = new MovieService();
        List<Movie> movies = ms.getAll();
        for(Movie m : movies) {
            m.toString();
        }
    }
}
