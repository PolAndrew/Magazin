package ua.lviv.metods;

import sklads.HaveBought;
import sklads.Koshuk;
import sklads.Sklads;

public class KoshukOperation {
//	Koshuk koshuk = new Koshuk();
	HaveBought buy = new HaveBought();

	public Koshuk dobavitKoshuk(Koshuk koshuk ) {
		System.out.println("�������� �����:");
		int index = Scan.scInt();
		if (Sklads.getSklad().contains(Sklads.getSklad().get((index)))) {
			koshuk.setKoshuk(Sklads.getSklad().get((index)));
		} else {
			System.out.println("���� ������ ������ �� �����");
		}
		return koshuk;

	}

	public Koshuk removefromKoshuk(Koshuk koshuk){
		System.out.println("������� �����:");
		int index = Scan.scInt();
		if (koshuk.getKoshuk().contains(koshuk.getKoshuk().get(index))) {
			koshuk.getKoshuk().remove(koshuk.getKoshuk().get(index));
			koshuk.printKoshuk();
		} else {
			System.out.println("�� �� ��������� ������ ������");
		}
		return koshuk;
	}

	public Koshuk oplata(Koshuk koshuk){
		System.out.println("������� ���� �����:" + " " + koshuk.rahunok());
		if (koshuk.rahunok() == Scan.scInt()) {
			buy.getBuy().addAll(koshuk.getKoshuk());
			koshuk.getKoshuk().clear();

		} else {
			System.out.println("������ �����");
		}
		return koshuk;
	}
}