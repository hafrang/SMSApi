package fr.hafrang.smsapi.exceptions;

/**
 * Cette erreur est générée si l'un (ou plusieurs) des paramètres
 * obligatoires a été oublié.
 * <p/>
 * Le code de retour HTTP correspondant à cette erreur est : 400
 */
public class ParamMissingException extends SMSSendingException {

    public ParamMissingException() {
        super("Un des paramètres obligatoires est manquant.");
    }

}
