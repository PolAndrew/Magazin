package ua.lviv.registration;

import ua.lviv.metods.Scan;
import ua.lviv.people.Persons;

public class Registration {
 Persons person=new Persons();
 
 public void reg(){
	 System.out.println("¬ведите им€:");
	 person.setFirstName(Scan.scStr());
	 System.out.println("¬вед≥ть ‘ам≥л≥ю:");
	 person.setLastName(Scan.scStr());
	 System.out.println("¬вед≥ть ¬аш в≥к:");
	 person.setAge(Scan.scInt());
	 System.out.println("¬вед≥ть ваш Email(ваш логин):");
	 person.setLogin(Scan.scStr());
	 System.out.println("¬вед≥ть пароль:");
	 person.setPass(Scan.scStr());
	 
	 
 }
}
