package fr.hafrang.smsapi.exceptions;

/**
 * Cette erreur est générée si l'authentification a échoué (login / clé
 * incorect) ou que le service n'est pas activé sur l'espace abonné.
 * <p/>
 * Le code de retour HTTP correspondant à cette erreur est : 403
 */
public class AuthentificationFailedException extends SMSSendingException {

    public AuthentificationFailedException() {
        super("Le service n'est pas activé sur l'espace abonné, ou login / clé incorrect.");
    }

}
