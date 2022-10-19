import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LCD extends Electronics {
	
	public void lcdDetails() throws ParseException
	{
		Electronics e=new Electronics();
		e.setId(101);
		e.setSemicondoctorType("silicon");
		
		String dt = "04/07/1998";
		Date dateofManufacturing = new SimpleDateFormat("dd/MM/yyyy").parse(dt);
		
		System.out.println("LCD Details...");
		System.out.println("Id -"+e.getId());
		System.out.println("semi-type "+e.getSemicondoctorType());
		System.out.println("DOM :-"+dt);
	}

}
