package jdbc;


public class Movie {
	private int id;
	private String title;
	private String genre;
	private int yearOfRelease;

	public Movie(int id, String title, String genre, int yearOfRelease) {
		super();
		this.setId(id);
		this.setTitle(title);
		this.setGenre(genre);
		this.setYearOfRelease(yearOfRelease);
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String genre, int yearOfRelease) {
		super();
		this.setTitle(title);
		this.setGenre(genre);
		this.setYearOfRelease(yearOfRelease);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", yearOfRelease=" + yearOfRelease + "]";
	}

}
