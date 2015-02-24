package base;

public class User {

	private int UserID;
	private String UserName, UserEmail;
	
public User (int id, String name, String email ){
	UserID = id ;
	UserName = name ;
	UserEmail= email ;	 
	
}

@Override
public String toString() {
	return "User [UserID=" + UserID + ", UserName=" + UserName + ", UserEmail="
			+ UserEmail + "]";
}



}
