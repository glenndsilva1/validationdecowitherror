package decoprj.test;

public abstract class UserDecorator implements UserService {
	    protected UserService userservice;
		public UserDecorator(UserService userservice) {
			this.userservice = userservice;
		}
		
		public void create(String value) {
			userservice.valid(value);
		}
}
