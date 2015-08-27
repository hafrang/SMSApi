package fr.hafrang.smsapi.exceptions;

/**
 * Erreur générique généré en cas d'échec lors de l'envoi, elle est
 * généré grâce fonction du code de retour HTTP (voir ci-dessous).
 * <p/>
 * Le code de retour HTTP indique le succès ou non de l'opération :
 * 200 : Le SMS a été envoyé sur votre mobile.
 * 400 : Un des paramètres obligatoires est manquant.
 * 402 : Trop de SMS ont été envoyés en trop peu de temps.
 * 403 : Le service n'est pas activé sur l'espace abonné, ou login / clé incorrect.
 * 500 : Erreur côté serveur. Veuillez réessayer ultérieurement.
 */
public abstract class SMSSendingException extends Exception {

    public SMSSendingException(String message) {
        super(message);
    }

}
