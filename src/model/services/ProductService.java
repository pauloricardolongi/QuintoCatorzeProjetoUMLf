package model.services;

import java.util.List;
import java.util.function.Predicate;

import entidades.Product;

public class ProductService {
	
	public double filteredSum(List<Product>list, Predicate<Product> criterio) {
		double sum = 0.0;
		for(Product p : list) {
			if (criterio.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
		
	}

}
