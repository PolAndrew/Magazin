package sklads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ua.lviv.metods.Scan;
import ua.lviv.product.Mobile;
import ua.lviv.product.Product;
import ua.lviv.product.Tablet;
import ua.lviv.product.Watch;


public class Sklads {
	
	
     public static List<Product> sklad = new ArrayList<>();
	
	
	static{
		sklad.add(new Mobile("Samung",41));
		sklad.add(new Tablet("Asus", 55));
		sklad.add(new Watch("Apple", 70));
	}
		
	public static void printSklad(){
		  for (int i = 0; i < sklad.size(); i++) {
			  System.out.println(i+"-"+sklad.get(i).getName()+" "+sklad.get(i).getCost());
			
		  }
			
		}
	public Product findOb() throws IOException{
		return sklad.get(Scan.scInt());
		
	}

	public static List<Product> getSklad() {
		return sklad;
	}

	public static void setSklad(List<Product> sklad) {
		Sklads.sklad = sklad;
	}
	
	
}
