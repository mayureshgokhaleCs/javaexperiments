import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class trial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
User u1= new User("sacin","uu");
User u2= new User("qacin","uu");
User u3= new User("dacin","uu");
User u4= new User("facin","uu");
User u5= new User("vacin","uu");
List<User> k=new ArrayList<User>();
k.add(u1);
k.add(u2);
k.add(u3);
k.add(u4);
k.add(u5);
Collections.sort(k);
for(User s:k){
	System.out.println(s.getUsername());
}
	}

}
