package bg.smg.model;

public class Movie {
    private String title;
    private int year;
    private int length;
    private char inColor;
    private Studio studio;
    private MovieExec producer;

    Movie(){
        this.title="";
        this.year=1000;
        this.length=0;
        this.inColor='Y';
        this.studio=new Studio();
        this.producer=new MovieExec();
    }

    Movie(String title, int year, int length, char inColor, Studio studio, MovieExec producer){
        this.title=title;
        this.year=year;
        this.length=length;
        this.inColor=inColor;
        this.studio=studio;
        this.producer=producer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getInColor() {
        return inColor;
    }

    public void setInColor(char inColor) {
        this.inColor = inColor;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public MovieExec getProducer() {
        return producer;
    }

    public void setProducer(MovieExec producer) {
        this.producer = producer;
    }

}
