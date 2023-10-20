public class Book
{
    private String title;
    private String author;
    private int publicationYear;
    public Book(String t, String a, int py)
    {
        this.title = t;
        this.author = a;
        this.publicationYear = py;
    }


    public String getTitle()
    {
        return title;
    }


    public void setTitle(String t)
    {
        this.title = t;
    }


    public String getAuthor()
    {
        return author;
    }


    public void setAuthor(String a)
    {
        this.author = a;
    }


    public int getPublicationYear()
    {
        return publicationYear;
    }


    public void setPublicationYear(int py)
    {
        this.publicationYear = py;
    }

    public String toString()
    {
        return "Книга: \"" + title + "\", Автор: " + author + ", Год публикации: " + publicationYear;
    }
}
