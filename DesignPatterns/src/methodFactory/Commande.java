package methodFactory;

public abstract class Commande {
	protected double montant;
	
	Commande(double montant) {
		this.montant = montant;
	}
	public abstract boolean valide();
	public abstract void paye();
}
