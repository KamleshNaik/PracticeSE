/*
 * to perform unit testing on user story 1 for the plant application 
 * rollno:1937
 */
public class PlantClass {
	public Integer UserID;
	public String User_Name;
	public String User_Password;
	public Integer User_Age;
	
	//parameterized constructor
	public PlantClass(Integer userID, String user_Name, String user_Password, Integer user_Age) {
		super();
		UserID = userID;
		User_Name = user_Name;
		User_Password = user_Password;
		User_Age = user_Age;
	}

	public Integer getUserID() {
		return UserID;
	}

	public void setUserID(Integer userID) {
		UserID = userID;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getUser_Password() {
		return User_Password;
	}

	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}

	public Integer getUser_Age() {
		return User_Age;
	}

	public void setUser_Age(Integer user_Age) {
		User_Age = user_Age;
	}
	
	public String Check_User_Registration(Integer u_id, String u_name, String u_password, Integer u_age) {
		//to check if the user has not entered any field empty
		if(u_id == null || u_name == "" || u_password == "" || u_age == null)
		{
			return"user has not entered some fields please fill all credentials";
		}
		else if(u_id == this.UserID || u_name == this.User_Name || u_password == this.User_Password || u_age == this.User_Age)
		{
			return "succesfully registered";
		}
		else
			return "failed to register";
	}
}

	