public class Song implements ISong {
    //this part is done once you crated the interface frist you can bring the implement just like the extend and decliesr the variable and adjest
    // the null and returen value into the name given
    // create this.the variable name = value to be set for the set method
    // go back t the main method and and create obj and use array list to add a new data by creating a new obj for every new data
    // the format for the array list is
    //Arrayalist <dataType> name of the array created = new ArrayList <>();
    // name of th arry .add (name of the obj);
    private long id;
    private String name;
    private String artist;
    private String album;
    private int rating;
    private int year;
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long value) {
        this.id = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String value) {
      this.name= value;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public void setArtist(String value) {
         this.artist = value;
    }

    @Override
    public String getAlbum() {
        return album;
    }

    @Override
    public void setAlbum(String value) {
     this.album = value;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int value) {
      this.rating = value;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int value) {
    this.year = value;
    }
//    public String display(){
//        System.out.println();
//    }
}
