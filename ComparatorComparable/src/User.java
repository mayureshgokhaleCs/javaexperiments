
public class User implements Comparable<User>{
String username;
String password;
public User(String username, String password) {
	// TODO Auto-generated constructor stub
	this.username=username;
	this.password=password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int compareTo(User u) {
	// TODO Auto-generated method stub
	
	return -1*(this.getUsername().compareToIgnoreCase(u.getUsername()));
}

}
