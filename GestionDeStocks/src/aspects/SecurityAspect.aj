package aspects;

import java.util.Scanner;

import metier.Produit;

public aspect SecurityAspect {
	
	
	private static int c = 0;
	private static String l ="eya";

	
	
	pointcut patch(): call(* metier..Produit.retirer(..))  ;	
	void around(): patch(){
		
		
		Scanner clavier=new Scanner(System.in);
		System.out.print("login=");
		String login= clavier.toString();
		System.out.print("login="+login);
	
		Scanner clavier2=new Scanner(System.in);
		System.out.print("code=");
		int code=clavier.nextInt();
		System.out.print("code="+code);
	
		if((login==l)&&(code==c)) {
			proceed();
		}		
		else {
			throw new IllegalStateException("login or code incorrect");
		}		
	}
	
	pointcut patch2(): call(* metier..Produit.deposer(..))  ;	
	void around(): patch(){
		
		
		Scanner clavier=new Scanner(System.in);
		System.out.print("login=");
		String login= clavier.toString();
		System.out.print("login="+login);
	
		Scanner clavier2=new Scanner(System.in);
		System.out.print("code=");
		int code=clavier.nextInt();
		System.out.print("code="+code);
	
		if((login==l)&&(code==c)) {
			proceed();
		}		
		else {
			throw new IllegalStateException("login or code incorrect");
		}		
	}
	
	
	

}

