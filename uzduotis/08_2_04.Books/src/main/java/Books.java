public class Books {

    private String Title;
    private int pages;
    private int publicationYear;

    public Books(String title, int pages, int publicationYear) {
        this.Title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return Title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    //    public String stringToString() {
//        return Title + ", " + pages + "pages, " + "pages" + publicationYear;
//    }
//}
    @Override
    public String toString() {
        return Title + ", " + pages + " pages, " + publicationYear;
    }
}

