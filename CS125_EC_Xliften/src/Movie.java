
public class Movie {
	private String title;
	private int rating;
	private String movieDescription;
	private int genere;
	private boolean haveSeen;
	private Actor actors;
	////////////////////////////////////////Private variables/////////////////////
	public String getTitle(){
		return this.title;
	}
	public int getRating(){
		return this.rating;
	}
	public String getDes(){
		return this.movieDescription;
	}
	public String getGenere(){
		if(genere == 1) return "ACTION";
		if(genere == 2) return "ROMANCE";
		if(genere == 3) return "COMEDY";
		if(genere == 4) return "DRAMA";
		if(genere == 5) return "DOCUMENTARY";
		return "ANIME";
	}
	public boolean getSeen(){
		return this.haveSeen;
	}
	public String getActors(){
		return this.actors.toString();
	}
	/////////////////////////////////////////Get Methods///////////////////////////
	public void setTitle(String newTitle){
		this.title = newTitle;
	}
	public void setRating(int newRate){
		if(newRate >= 1 && newRate <= 5) this.rating = newRate;
	}
	public void setGenere(String newGenere){
		newGenere = newGenere.toUpperCase();
		if(newGenere.equals("ACTION")) this.genere = 1;
		if(newGenere.equals("ROMANCE")) this.genere = 2;
		if(newGenere.equals("COMEDY")) this.genere = 3;
		if(newGenere.equals("DRAMA")) this.genere = 4;
		if(newGenere.equals("DOCUMENTARY")) this.genere = 5;
		this.genere = 6;
	}
	public void setSeen(boolean seen){
		this.haveSeen = seen;
	}
	/////////////////////////////////////////Set Methods///////////////////////////
	public Movie(){
		this.title = "INIT";
		this.rating = 0;
		this.genere = 0;
		this.haveSeen = false;
		this.movieDescription = "INIT";
		this.actors = new Actor();
	}
	public Movie(String newTitle, int newRating, String newGenere, boolean seen, String description, Actor newActors){
		this.title = newTitle;
		this.rating = newRating;
		this.setGenere(newGenere);
		this.haveSeen = seen;
		this.movieDescription = description;
		this.actors = newActors;
	}
	/////////////////////////////////////////Constructors//////////////////////////
	public String toString(){
		String result = this.title;
		if(!this.haveSeen) result += "(*)";
		result = result + " belongs to genere " + this.getGenere() + " acted by " + this.actors.toString() + ", and has a rate of" + this.rating + ". \nHere is the description: " + this.getDes();
		return result;
	}
}
