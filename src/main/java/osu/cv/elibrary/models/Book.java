package osu.cv.elibrary.models;

public class Book {
    private int id;
    private String name;
    private String author;
    private String downloadLink;
    private boolean purchased;

    public Book(int id, String name, String author, String downloadLink) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.downloadLink = downloadLink;
//        this.purchased = false;
    }

//
//    public boolean isPurchased() {
//        return purchased;
//    }
//
//    public void setPurchased(boolean purchased) {
//        this.purchased = purchased;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}
