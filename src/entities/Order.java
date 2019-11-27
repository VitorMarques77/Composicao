package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	public static final SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> order = new ArrayList<>();
	private Client cliente;
	
	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrder() {
		return order;
	}
	public Client getCliente() {
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	public void addItem(OrderItem orderItem) {
		order.add(orderItem);
	}
	public void removeItem(OrderItem orderItem) {
		order.remove(orderItem);
	}
	public double total() {
		double total = 0;
		for(OrderItem c:order) {
			total += c.subTotal();
		}
		return total;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+sdf2.format(moment)+"\n");
		sb.append("Order status: "+status+"\n");
		sb.append(cliente);
		sb.append("Order items: \n");
		for (OrderItem c:order) {
			sb.append(c);
		}
		sb.append(String.format("Total Price: $%.2f", total()));
		return sb.toString();
	}
	
}
