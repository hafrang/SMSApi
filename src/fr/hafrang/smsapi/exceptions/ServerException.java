package fr.hafrang.smsapi.exceptions;

/**
 * Cette erreur est générée si une erreur se produit côté serveur.
 * <p/>
 * Le code de retour HTTP correspondant à cette erreur est : 500
 */
public class ServerException extends SMSSendingException {

    public ServerException() {
        super("Erreur côté serveur. Veuillez réessayer ultérieurement.");
    }

}
