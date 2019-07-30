package hello;

class Greeter {
	private String message;

	public Greeter() {
	}

	public Greeter(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
