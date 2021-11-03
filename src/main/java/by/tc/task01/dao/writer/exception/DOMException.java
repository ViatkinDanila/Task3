package by.tc.task01.dao.writer.exception;

public class DOMException extends Exception{
    public DOMException(){
        super();
    }
    public DOMException(String message){
        super(message);
    }
    public DOMException(Exception e){
        super(e);
    }
    public DOMException(String message, Exception e){
        super(message,e);
    }
}
