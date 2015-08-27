package fr.hafrang.smsapi;

import fr.hafrang.smsapi.exceptions.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Gère l'envoi des messages
 */
public class SMSManager {

    private String url = "https://smsapi.free-mobile.fr/sendmsg";

    /**
     * Envoyer un message à un utilisateur, ou générer
     * une erreur
     *
     * @param user    - Utilisateur
     * @param message - Message
     * @throws SMSSendingException - Erreur lors de la tentative d'envoi
     */
    public void send(User user, String message) throws SMSSendingException {
        try {
            URL url = new URL(getUrl() + "?user=" + user.getLogin() + "&pass=" + user.getPass() + "&msg="
                    + message.replace(" ", "%20"));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int response = connection.getResponseCode();
            switch (response) {
                case 200:
                    break;
                case 400:
                    throw new ParamMissingException();
                case 402:
                    throw new TooMuchSMSSentException();
                case 403:
                    throw new AuthentificationFailedException();
                case 500:
                    throw new ServerException();
            }
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retourne l'URL de l'API de Free Mobile
     *
     * @return String - URL de l'API de Free Mobile
     */
    private String getUrl() {
        return url;
    }
}
