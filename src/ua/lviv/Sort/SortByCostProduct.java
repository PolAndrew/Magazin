package ua.lviv.Sort;

import java.util.Comparator;

import ua.lviv.product.Product;

public class SortByCostProduct implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		if (p1.getCost() < p2.getCost()) {
			return -1;
		} else if (p1.getCost() > p2.getCost()) {
			return 1;
		} else {
			return 0;
		}
	}
}
