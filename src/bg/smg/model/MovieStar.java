package bg.smg.model;

import lombok.Data;

import java.sql.Date;

@Data
public class MovieStar {
    private String name;
    private String address;
    private char gender;
    private Date birthdate;

}
