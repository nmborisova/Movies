package bg.smg.model;

import lombok.Data;

@Data
public class StarsIn {
    private String movieTitle;
    private int year;
    private MovieStar movieStar;
}
