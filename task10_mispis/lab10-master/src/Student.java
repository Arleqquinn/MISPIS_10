public class Student {

	private String facultyName;
	private Integer year;
	private Integer groupNumber;
	private String firstName;
	private String lastName;

	public Student(String facultyName, Integer year, Integer groupNumber, String firstName, String lastName) {
		this.facultyName = facultyName;
		this.year = year;
		this.groupNumber = groupNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFacultyName() {
		return this.facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Integer getYear() {
		return this.year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String sendHomework(String homework){
		return doHomework(homework);
	}

	public String doHomework(String homework){
		return homework;
	}



	@Override
	public String toString() {
		return "Student{" +
				"facultyName='" + facultyName + '\'' +
				", year=" + year +
				", groupNumber=" + groupNumber +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}