package ua.lviv.registration;

import ua.lviv.metods.Scan;
import ua.lviv.people.Persons;

public class Registration {
 Persons person=new Persons();
 
 public void reg(){
	 System.out.println("������� ���:");
	 person.setFirstName(Scan.scStr());
	 System.out.println("������ �����:");
	 person.setLastName(Scan.scStr());
	 System.out.println("������ ��� ��:");
	 person.setAge(Scan.scInt());
	 System.out.println("������ ��� Email(��� �����):");
	 person.setLogin(Scan.scStr());
	 System.out.println("������ ������:");
	 person.setPass(Scan.scStr());
	 
	 
 }
}
