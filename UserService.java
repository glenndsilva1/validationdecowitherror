package decoprj.test;

import java.util.ArrayList;

public interface UserService {
	 final ArrayList<String> s = new ArrayList<String>();
      void valid(String value);
      
      default ArrayList<String> messages(){
    	  for(int i=0;i < s.size();i++) {
    		  System.out.println(s.get(i));
    	  }
    	  return s;
      }
      
}
