package Exceptions;

public class gameException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	public gameException(String msg) {
        super(msg);
    }
}
