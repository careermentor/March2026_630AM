package secondpkg;

public class SmartPhone implements Phone, GPS, Camera
{
	

	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Camera: 50 Megapixel");
	}


	public void gps() {
		// TODO Auto-generated method stub
		System.out.println("GPS: enabled");
		
	}

	
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("Iphone");
		
	}
	                                                    
	public static void main(String[] args) {        
		                                                   
		SmartPhone sp = new SmartPhone();                  
		                                                   
		sp.camera();                                       
		sp.phone();                                        
		sp.gps();                                          
                                                     
		                                                   
	}    
}
                                                     