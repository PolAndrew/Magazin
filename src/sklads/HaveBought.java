package sklads;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.product.Product;

public class HaveBought {
	
private List<Product> buy=new ArrayList<>();

public List<Product> getBuy() {
	return buy;
}

public void setBuy(List<Product> buy) {
	this.buy = buy;
}
public void printBuy(){
	  for (int i = 0; i < buy.size(); i++) {
		  System.out.println(i+"-"+buy.get(i).getName()+" "+buy.get(i).getCost());
		
	  }
		
	}

}
