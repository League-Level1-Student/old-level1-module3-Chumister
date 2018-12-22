
public class Netflix {
public static void main(String[] args) {
	Movie M1 = new Movie("Bright", 2);
	Movie M2 = new Movie("The Emoji Movie", 0);
	Movie M3 = new Movie ("Pokemon 2000",4);
	Movie M4 = new Movie ("Thor Ragnarok", 5);
	Movie M5 = new Movie("The Adventures of Pluto Nash", 1);
	NetflixQueue net = new NetflixQueue();
	net.addMovie(M5);
	net.addMovie(M4);
	net.addMovie(M3);
	net.addMovie(M2);
	net.addMovie(M1);
net.printMovies();
net.sortMoviesByRating();

System.out.println("The best movie is"+ net.getBestMovie());
for (int i = 0; i < 4; i++) {
	System.out.println("The second best movie is"+net.getMovie(0));
	
}

}

}
