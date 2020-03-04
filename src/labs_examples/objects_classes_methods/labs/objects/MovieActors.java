package labs_examples.objects_classes_methods.labs.objects;

public class MovieActors {

    public static void main(String[] args) {

        Movie myMovie = new Movie("Titanic",1997);

        Actors myHero = new Actors("Leonardo Decaprio");

        Actors myHeroine = new Actors("Kate winslet");

        System.out.println("Movie " + myMovie.title + " is released on " + myMovie.year + ". It has actors " + myHero.name + " and " + myHeroine.name);

    }



}


class Movie {
    String title;
    int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

class Actors {
    String name;

    public Actors(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                '}';
    }
}