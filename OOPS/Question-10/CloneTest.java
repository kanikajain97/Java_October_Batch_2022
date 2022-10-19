public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
Product pr=new Product(1, "HideAndSeek", 2, "Krckjack");
        
        Product pro=(Product) pr.clone();
        pro.setPname("parleG");
        pro.setPrice(5);
        
        System.out.println(pro);
        if(pro instanceof Product) {
            
            System.out.println("Objects are same");
        }
	        
	    
		
	
	}

}
