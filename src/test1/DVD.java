public class DVD {
	private String title;
    private String genre;
    private int year;
    private boolean onLoan;
    private String loanedTo;
    
  
    /**
     * Primary constructor, makes a blank DVD
     */
    public DVD(){
        title = "";
        genre = "";
        year = 0;
        onLoan = false;
        loanedTo = "";
    }
    
    
    /**
     * The secondary constructor that has a valid title, genre and year
     * @param title - the name of the DVD
     * @param genre - the genre of the DVD
     * @param year  - the year the DVD was created
     */
    public DVD(String title, String genre, int year){
        this(); //invoke primary constructor (a.k.a constructor chaining)
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
    
    /**
     * Another constructor that allows user to enter who and if it is on loan, plus
     * All parameters of the secondary constructor
     * @param title - the name of the DVD
     * @param genre - the genre of the DVD
     * @param year  - the year the DVD was created 
     * @param onLoan - whether or not the DVD is loaned out
     * @param loanedTo  - who the DVD is loaned out to
     */
    public DVD(String title, String genre, int year, boolean onLoan, String loanedTo){
        this(title,genre,year);
		this.onLoan = onLoan;
        this.loanedTo = loanedTo;
    }
    
    /**
     * Accessor for title attribute
     * @return the title of the DVD
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Mutator for the DVD's title attribute
     * @param title  - the new title to set the attribute to
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Accessor for genre attribute
     * @return the genre of the DVD
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Mutator for the DVD's genre attribute
     * @param genre  - the new genre to set the attribute to
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Accessor for year attribute
     * @return the year of the DVD
     */
    public int getYear() {
        return year;
    }

    /**
     * Mutator for the DVD's year attribute
     * @param year  - the new year to set the attribute to
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Accessor for onLoan attribute
     * @return whether or not the DVD has been loaned to someone
     */
    public boolean getOnLoan() {
        return onLoan;
    }

    /**
     * Mutator for the DVD's onLoan attribute
     * @param onLoan  - the new onLoan status of the DVD
     */
    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    /**
     * Accessor for loanedTo attribute
     * @return the name of the person who has borrowed the DVD
     */
    public String getLoanedTo() {
        return loanedTo;
    }

    /**
     * Mutator for the DVD's loanedTo attribute
     * @param loanedTo  - the new name for the person who has borrowed the DVD
     */
    public void setLoanedTo(String loanedTo) {
        this.loanedTo = loanedTo;
    }
    
    /**
     * Standard Java toString method which all classes should have 
     * @return String showing all information about the DVD
     */
    public String toString() {
        return "DVD: " + 
                "\ntitle = " + title
                + "\ngenre = " + genre 
                + "\nyear = " + year 
                + "\nonLoan = " + onLoan 
                + "\nloanedTo = " + loanedTo;
    }
    
}
