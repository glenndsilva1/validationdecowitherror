public class ValidationDecorator extends UserDecorator  {
	public ValidationDecorator(UserService userservice) {
		super(userservice);
	}
	
	public void valid(String value) {
		if(value.contains("a")) {
			userservice.s.add("Validation Error");
		}
		 super.userservice.valid(value);
	}

	public static void main(String args[]) {
		UserService us = new ValidationDecorator1
				                                        (new ValidationDecorator
				                                        		(new UserServiceImpl()));
		us.valid("glann");
		System.out.println(us.messages().size());
	}
}
