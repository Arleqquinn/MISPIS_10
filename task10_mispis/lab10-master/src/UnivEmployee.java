public abstract class UnivEmployee {

	protected String firstName;
	protected String lastName;
	protected String email;
	protected String phoneNumber;
	protected String position;

	public UnivEmployee(String firstName, String lastName, String email, String phoneNumber, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.position = position;
	}
}