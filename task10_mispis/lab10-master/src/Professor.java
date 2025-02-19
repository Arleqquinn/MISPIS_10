public class Professor extends UnivEmployee {

	private String facultyName;

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 * @param position
	 */
	public Professor(String firstName, String lastName, String email, String phoneNumber, String position) {
		super(firstName, lastName, email, phoneNumber, position);
	}

	public String getFacultyName() {
		return this.facultyName;
	}

	/**
	 * 
	 * @param facultyName
	 */
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	/**
	 * 
	 * @param text
	 */
	public void postHomework(String text) {
		// TODO - implement Professor.postHomework
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param text
	 */
	public Integer checkHomework(String text) {
		// TODO - implement Professor.checkHomework
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Professor{" +
				"facultyName='" + facultyName + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", position='" + position + '\'' +
				'}';
	}
}