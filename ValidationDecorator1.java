package decoprj.test;

public class ValidationDecorator1 extends UserDecorator  {

	public ValidationDecorator1(UserService userservice) {
		super(userservice);
	}
	
	public void valid(String value) {
		if(value.contains("n")) {
			userservice.s.add("Validation Error1");
		}
		 super.userservice.valid(value);
	}
}
