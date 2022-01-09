package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Product;
import model.services.ProductService;

public class Programa {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("dvd",180.90));
		list.add(new Product("Torradeira",200.00));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list);
		
		System.out.println("Soma= " + String.format("%.2f", sum));

	}

}
