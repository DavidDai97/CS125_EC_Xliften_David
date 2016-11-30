
public class MovieList {
	private Movie data;
	private boolean isFirst;
	private MovieList next;
	/////////////////////////////////////Private Variables/////////////////////////
	public Movie getData(){
		if(this.isFirst) return this.next.data;
		return this.data;
	}
	public boolean isFirst(){
		return this.isFirst;
	}
	public MovieList getNext(){
		return this.next;
	}
	public char getDataTitleChar(){
		if(this.isFirst) return 0;
		return this.data.getTitle().charAt(0);
	}
	public int getDataRating(){
		if(this.isFirst) return 0;
		return this.data.getRating();
	}
	/////////////////////////////////////Get Methods///////////////////////////////
	public MovieList(){
		this.data = new Movie();
		this.isFirst = true;
		this.next = null;
	}
	public MovieList(Movie newData){
		this.data = newData;
		this.isFirst = false;
		this.next = null;
	}
	public MovieList(Movie[] newData){
		this.data = new Movie();
		this.isFirst = true;
		this.next = null;
		MovieList temp = this;
		for(int i = 0; i < newData.length; i++){
			temp.insert(newData[i]);
		}
	}
	public MovieList(Movie newData, MovieList next){
		this.data = newData;
		this.isFirst = false;
		this.next = next;
	}
	/////////////////////////////////////Constructors//////////////////////////////
	public void push_back(Movie newData){
		if(this.next == null){
			this.next = new MovieList(newData);
			return;
		}
		this.next.push_back(newData);
	}
	public void insert(Movie newData){
		if(this.getDataTitleChar() <= newData.getTitle().charAt(0) && this.next == null){
			this.next = new MovieList(newData);
			return;
		}
		if(this.getDataTitleChar() <= newData.getTitle().charAt(0) && this.next.getDataTitleChar() > newData.getTitle().charAt(0)){
			this.next = new MovieList(newData, this.next);
			return;
		}
		this.next.insert(newData);
	}
	/////////////////////////////////////public methods////////////////////////////
}
