package sklads;

import java.util.ArrayList;

import java.util.List;

import ua.lviv.product.Product;

public class Koshuk {
	 private  List<Product> koshuk=new ArrayList<>();
	private int rah=0;

	public int getRah() {
		return rah;
	}

	public void setRah(int rah) {
		this.rah = rah;
	}

	public List<Product> getKoshuk() {
		
		return koshuk;
	}

	public void setKoshuk(Product product) {
		this.koshuk.add(product) ;
	}
	public void printKoshuk(){
		  for (int i = 0; i < koshuk.size(); i++) {
			  System.out.println(i+"-"+koshuk.get(i).getName()+" "+koshuk.get(i).getCost());
			
		  }
			
		}
	public Integer rahunok(){
		for (Product product : koshuk) {
			rah=rah+product.getCost();
		}
		return rah;
	}

	public void setKoshukM(List<Product> koshuk) {
		this.koshuk = koshuk;
	}
	
}
