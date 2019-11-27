package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	public static final SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birth;
	private Order order;
	
	public Client(String name, String email, Date birth) {
		this.name = name;
		this.email = email;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Client: "+name+"("+sdf1.format(birth)+")"+" - "+email+"\n";
	}
}
