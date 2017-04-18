package bai_8;

public class DogException extends Exception{

	public static final long serialVersionUID = 78293;
	@Override
	public String getMessage() {
		return "Dog exception";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
