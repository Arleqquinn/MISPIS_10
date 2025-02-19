public class Dean extends UnivEmployee {

	private String facultyName;


	public Dean(String firstName, String lastName, String email, String phoneNumber, String position) {
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
	 * @param test
	 */
	public void postOrder(String test) {
		// TODO - implement Dean.postOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employee
	 */
	public void appointEmployee(UnivEmployee employee) {
		// TODO - implement Dean.appointEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param text
	 */
	public void approveCurriculum(String text) {
		// TODO - implement Dean.approveCurriculum
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Dean{" +
				"facultyName='" + facultyName + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", position='" + position + '\'' +
				'}';
	}
}