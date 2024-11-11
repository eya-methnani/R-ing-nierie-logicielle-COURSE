package tp_sansaspect;

public class CompteBancaire {
	private int code ;
	private double solde ;
	public CompteBancaire(int code, double solde) {
		//super();
		this.code = code;
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "CompteBancaire [code=" + code + ", solde=" + solde + "]";
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void retirer(double montant) {
		solde-= montant;
	}
	public void deposer(double montant) {
		solde+= montant;
	}
}
