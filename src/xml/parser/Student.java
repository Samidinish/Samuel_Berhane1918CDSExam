package xml.parser;

public class Student {

	/*
	 * Student class have 4 variables which will be constructed as Student Object into List<Student>.
	 */
	public String firstName;
	public String lastName;
	public String score;
	public String id;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString(){

		return "Student (id= "+id+") \""+ firstName+"\" \""+lastName+"\" Grade = "+score;
	}
	
}
