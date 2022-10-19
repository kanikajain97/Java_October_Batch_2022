import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

	public static void main(String[] args) throws ParseException {
		
		
		String birth = "03/02/2001";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
		String join = "09/07/2015";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(join);
		
		Employee e=new Employee(1, "ram", 25500.00, "indore", dob, doj);
		
		System.out.println("Employee Details:- "+e.toString());

	}

}
