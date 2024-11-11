package tp_compteur_sans_aspect;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COMPTEUR c = new COMPTEUR(300);
		System.out.println("avant incrementer :" +c.getVal());
		
		c.incrementer(1000);
		
		System.out.println("apres incrementer :" +c.getVal());
		
		System.out.println("avant decrementer :" +c.getVal());

		c.decrementer(50);
		
		System.out.println("apres decrementer :" +c.getVal());

		System.out.println(c.toString());

	}

}
