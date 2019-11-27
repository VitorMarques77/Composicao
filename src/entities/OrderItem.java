package entities;

public class OrderItem {
	
	private Integer quantity;
	private double price;
	private Product product;
	
	public OrderItem(Integer quantity,Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	public double subTotal() {
		price = quantity*product.getPrice();
		return price;
	}
	@Override
	public String toString() {
		return product.getName()+" $"+product.getPrice()+", Quantity: "+quantity+String.format(", Subtotal: $%.2f",subTotal())+" \n";
	}
}
