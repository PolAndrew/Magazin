package ua.lviv.metods;



import sklads.Koshuk;
import sklads.Sklads;

public class Menu {

	public static void menu(){

		KoshukOperation ko = new KoshukOperation();
		Koshuk koshuk = new Koshuk();

		System.out.println("Добрий день! \n  Виберіть товар");
		System.out.println("1- показать товар");
		System.out.println("2- посортувати товар");
		System.out.println("3- добавить товар в корзину");
		System.out.println("4- переглянути товар в корзині");

		System.out.println("5- купити товар");
		System.out.println("6- Видалити с кошика");

		while (true) {
			switch (Scan.scInt()) {
			case 1:
				Sklads.printSklad();

				break;
			case 2:

				break;
			case 3:
				Sklads.printSklad();
				koshuk = ko.dobavitKoshuk(koshuk);

				break;
			case 4:
				koshuk.printKoshuk();

				break;
			case 5:
				ko.oplata(koshuk);

				break;
			case 6:
				koshuk.printKoshuk();
				ko.removefromKoshuk(koshuk);

				break;
			case 7:

				break;

			default:
				break;
			}
		}

	}

}
