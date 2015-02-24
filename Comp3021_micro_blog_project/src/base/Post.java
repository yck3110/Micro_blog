package base;
import java.util.Date;

public class Post {

	private Date date;
	private String content;
	
	
public Post(Date date, String content){
	this.date = date;
	this.content = content;
	
	}

public String getContent() {
	return this.content;
}

public void setContent(String content){
	this.content = content;
	
}

public String toString(){
	return ""+ date + content ; 
}

public boolean equals(Object o){
	
	boolean ans = true;
	
    if (o == null) ans = false;
    
	if (this.getClass()!= o.getClass() ) ans = false;
	
	Post post = (Post) o;
	
	if (this.toString()!= o.toString() ) ans = false;
	
	return ans;
	
}

public int hashCode() {
	int hashCode = 0;
	
	date.hashCode();
	content.hashCode();
	
	return hashCode;

}
public boolean contains(String keyword){
	int index = this.content.indexOf(keyword) ;
	if (index < 0 )
		return false;
	return true;
	
}

}


