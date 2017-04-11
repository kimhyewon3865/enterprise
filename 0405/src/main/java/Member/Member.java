package Member;

public class Member {
	private Long id;
	private String email;
	private String password;
	private String name;
	
	public Member(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}
	
	void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}	
}
