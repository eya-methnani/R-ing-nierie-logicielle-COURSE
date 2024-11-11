//en utilisant les mots cles args et target


package application;


import metier.CompteBancaire;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteBancaire c1 = new CompteBancaire (1,900);
	
		//c1.retirer(100);
		//c1.deposer(100);
		
		//System.out.println(c1.toString());
		
		for (int i=0;i<8;i++) {
			CompteBancaire c =new CompteBancaire(1,1);
			System.out.println(c.toString());
		}

	}

}
