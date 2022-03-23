

public class prumerException extends Exception{

    public prumerException()
    {
        super("Nezadan zadny prumer");
    }
    public prumerException(String text)
    {
        super(text);
    }
}