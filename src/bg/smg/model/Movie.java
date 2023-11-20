package bg.smg.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private int year;
    private int length;
    private char inColor;
    private Studio studio;
    private MovieExec producer;

    public Movie(){
        this.title="";
        this.year=1000;
        this.length=0;
        this.inColor='Y';
        this.studio=new Studio();
        this.producer=new MovieExec();
    }

//    @Override
//    public String toString(){
//
//    }
}
