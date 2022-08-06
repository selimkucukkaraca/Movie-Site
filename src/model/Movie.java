package model;

public class Movie {
    private int id;
    private String name;
    private String category;
    private int imdb;

    public Movie(int id, String name, String category, int imdb) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.imdb = imdb;
    }


    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImdb() {
        return imdb;
    }

    public void setImdb(int imdb) {
        this.imdb = imdb;
    }

    @Override
    public String toString() {
        return "Movie = " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", imdb=" + imdb + "\n";
    }
}
