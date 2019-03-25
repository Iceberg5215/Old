package app.formats;

public class Film {
    private String film;
    private Integer rating;
    private Integer theatre;
    private String duration;
    private String time;
    private String date;
    private double price;

    public Film(String film, Integer rating, Integer theatre, String duration, String time, String date, double price) {
        this.film = film;
        this.rating = rating;
        this.theatre = theatre;
        this.duration = duration;
        this.time = time;
        this.date = date;
        this.price = price;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getTheatre() {
        return theatre;
    }

    public void setTheatre(Integer theatre) {
        this.theatre = theatre;
    }
}
