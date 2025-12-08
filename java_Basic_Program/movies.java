interface bark{
    String voice = "woof";

    void display();

}

public class movies implements bark {

    public void display(){
        System.out.println("bow bow");

    }
    int a = 1;
    int b = 2;
    int  sum = a + b;



//    String actor;
//    String movies;
//    int movieCount;
//
//    movies(String actor, String movies, int movieCount){
//        this.actor = actor;
//        this.movies = movies;
//        this.movieCount = movieCount;
//    }

//    void display(){
//        System.out.println(actor+ " acted in " +movies+ " and worked in " +movieCount+ " movies in total");
//    }
}
