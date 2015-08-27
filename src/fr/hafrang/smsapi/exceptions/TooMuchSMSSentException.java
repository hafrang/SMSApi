package fr.hafrang.smsapi.exceptions;

/**
 * Cette erreur est g�n�r�e si trop de SMS ont �t�s envoy�s en
 * trop peu de temps.
 * <p/>
 * Le code de retour HTTP correspondant � cette erreur est : 402
 */
public class TooMuchSMSSentException extends SMSSendingException {

    public TooMuchSMSSentException() {
        super("Trop de SMS ont �t� envoy�s en trop peu de temps.");
    }

}
