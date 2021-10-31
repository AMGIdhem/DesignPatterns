package methodFactory;

public class ClientComptant extends Client {

	@Override
	protected Commande creeCommande(double montant) {
		return new CommandeComptant(montant);
	}

}
