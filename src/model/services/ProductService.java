package model.services;

import java.util.List;

import entidades.Product;

public class ProductService {
	
	public double filteredSum(List<Product>list) {
		double sum = 0.0;
		for(Product p : list) {
			if (p.getNome().charAt(0) == 'T') {
				sum += p.getPreco();
			}
		}
		return sum;
		
	}

}
