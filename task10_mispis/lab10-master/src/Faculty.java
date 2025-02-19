public class Faculty {

	private String name;
	private String phoneNumber;
	private String email;
	private Dean dean;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Dean getDean() {
		return this.dean;
	}

	/**
	 * 
	 * @param dean
	 */
	public void setDean(Dean dean) {
		this.dean = dean;
	}

	@Override
	public String toString() {
		return "Faculty{" +
				"name='" + name + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", email='" + email + '\'' +
				", dean=" + dean +
				'}';
	}
}