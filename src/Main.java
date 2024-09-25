public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String movieName = "Everything Everywhere All at Once";
        System.out.println("Once of my favorite movie's is " + movieName + ".");
        //get in the habit of running code after writing it, helps to minimize error source confusion
        int releaseYear = 2022;
        String movieGenre = "Science Fiction";
        double imdbRating = 7.8;
        boolean isASeries = false;
        //for arrays, make sure to use curly brackets)
        char[] directorsInitial = {'K', 'S'};
        String[] favGenres = {"Supernatural", "Animation", "Drama"};

        System.out.println("This movie was released in " + releaseYear + ".");
        System.out.println("Movie genre: " + movieGenre);
        System.out.println("The IMDB rating is " + imdbRating + " , which is criminal.");
        System.out.println("Is this movie a series? " + isASeries);
        //arrays start at 0. So 0, 1 ,2 ,3
        System.out.println("This movie has two directors, and their initials are " + directorsInitial[0] + " and " + directorsInitial[1] + ".");
        //System.out.println("My favorite movie genres are " + favGenres[0] + ", " + favGenres[1] + ",and " + favGenres[2] + ".");



    }
}