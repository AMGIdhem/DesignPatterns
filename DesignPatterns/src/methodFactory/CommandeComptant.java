package methodFactory;

public class CommandeComptant extends Commande {

	CommandeComptant(double montant) {
		super(montant);
	}

	@Override
	public void paye() {
		System.out.println("Le paiement de la commande au comptant de: "+montant+"est effectu?");
	}
	
	@Override
	public boolean valide() {
		return true;
	}

}
