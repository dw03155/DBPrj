package co.hazzys.prj.member.vo;

public class MemberVO { //전송 객체(데이터 읽고 쓰기,DTO)
	private String id;
	private String password;
	private String name;
	private String address;
	private String tel;
	private int age;

	public MemberVO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() { // Object 객체가 가지고 있는 toString()을 재정의해서 사용
		System.out.print(id + " | ");
		System.out.print(password + " | ");
		System.out.print(name + " | ");
		System.out.print(address + " | ");
		System.out.print(tel + " | ");
		System.out.println(age);
		return null;
	}

}