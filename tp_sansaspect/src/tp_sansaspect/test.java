package tp_sansaspect;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteBancaire c1 = new CompteBancaire (1,50000);
		System.out.println("avant RETIRER");
	
		c1.retirer(1000);
		System.out.println("apres RETIRER");
		
		System.out.println(c1.toString());
		

	}

}
