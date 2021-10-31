package methodFactory;

public class CommandeCredit extends Commande {

	CommandeCredit(double montant) {
		super(montant);
	}

	@Override
	public void paye() {
		System.out.println("Le paiement de la commande au cr�dit de :"+montant+" est effectu�.");
	}
	
	@Override
	public boolean valide() {
		return (montant>=1000.0)&&(montant<=5000.0);
	}
	
}
