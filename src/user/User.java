package user;

public class User {
	
	private int uid;
	private String uname;
	private String upwd;
	private String uemail;
	private String uphone;
	private String uaddress;
	
	public  User(String uname,String upwd, String uemail,String uphone,String uaddress ) {
		
		this.uname= uname;
		this.upwd= upwd;
		this.uemail= uemail;
		this.uphone= uphone;
		this.uaddress= uaddress;
	}
	public User(String uname,String upwd) {
	this.uname=uname;
	this.upwd= upwd;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	
	
}
