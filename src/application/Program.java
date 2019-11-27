package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf1.parse(sc.next());
		sc.nextLine();
		Client cliente = new Client (name,email,birth);
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(new Date(),OrderStatus.valueOf(status),cliente);
		System.out.print("How many items to this order? ");
		int quantityorder = sc.nextInt();
		sc.nextLine();
		for (int i =1;i<=quantityorder;i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			String productname = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			order.addItem(new OrderItem(quantity, new Product(productname, price)));
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
