package ua.lviv.metods;



import sklads.Koshuk;
import sklads.Sklads;

public class Menu {

	public static void menu(){

		KoshukOperation ko = new KoshukOperation();
		Koshuk koshuk = new Koshuk();

		System.out.println("������ ����! \n  ������� �����");
		System.out.println("1- �������� �����");
		System.out.println("2- ����������� �����");
		System.out.println("3- �������� ����� � �������");
		System.out.println("4- ����������� ����� � ������");

		System.out.println("5- ������ �����");
		System.out.println("6- �������� � ������");

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
