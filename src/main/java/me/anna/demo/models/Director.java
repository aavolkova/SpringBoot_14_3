package me.anna.demo.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Director {
//    @NotEmpty
//    @Size(min=1, max=50, message = "Must enter name.")


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String genre;

    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Set<Movie> movies;



    // ====== Constructor (we can also do it in the controller)
    public Director(){
        setMovies(new HashSet<>());
    }




    // ======= Custom methods: ========
    // 1) ====== Delete movie from set
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    // 2) ====== Add a Movie: =========
    public void addMovie(Movie m){
        m.setDirector(this);  //set director with this object (set director not by id)
        movies.add(m);
    }
    // ================================





    // ====== Setters and Getters: ======
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

}
