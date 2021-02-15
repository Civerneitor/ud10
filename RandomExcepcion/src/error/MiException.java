package error;

public class MiException extends Exception{
	private int messageException;
	
	public MiException(int codigoError) {
		super();
		this.messageException=codigoError;
	}
	
	public MiException() {
		super();
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		int message=messageException;
		String res="";
		if(message%2==0) {
			res="Es par";
		}else {
			res="Es impar";
		}
		return res;
	}
	
}
