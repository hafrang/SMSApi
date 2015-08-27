package fr.hafrang.smsapi.exceptions;

/**
 * Cette erreur est générée si trop de SMS ont étés envoyés en
 * trop peu de temps.
 * <p/>
 * Le code de retour HTTP correspondant à cette erreur est : 402
 */
public class TooMuchSMSSentException extends SMSSendingException {

    public TooMuchSMSSentException() {
        super("Trop de SMS ont été envoyés en trop peu de temps.");
    }

}
