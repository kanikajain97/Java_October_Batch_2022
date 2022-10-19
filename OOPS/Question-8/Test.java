import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		Laptop l=new Laptop();
		l.laptopdetails();
		
		Mobile m=new Mobile();
		 m.mobiledetails();
		
		 LCD lcd= new LCD();
		 lcd.lcdDetails();

		 Electronics e=  new Electronics();
		 e.details();

	}

}

