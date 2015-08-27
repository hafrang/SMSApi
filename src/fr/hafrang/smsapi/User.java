package fr.hafrang.smsapi;

/**
 * Utilisateur du service de notifications par SMS de Free Mobile.
 * Il est déffinit par un login constitués de 8 chiffres,
 * et d'une clé d'authentification spécifique au service de
 * notifications par SMS, il est constitué de 14 caractères
 * (chiffres, lettres (majuscules/minuscules)
 */
public class User {

    private String login;
    private String pass;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    /**
     * Retourne le login de l'utilisateur
     *
     * @return String - Login de l'utilisateur
     */
    public String getLogin() {
        return login;
    }

    /**
     * Définit un nouveau login pour l'utilisateur
     *
     * @param login - Nouveau login de l'utilisateur
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retourne la clé d'authentification de l'utilisateur
     *
     * @return String - Clé d'authentification de l'utilisateur
     */
    public String getPass() {
        return pass;
    }

    /**
     * Définit une nouvelle clé d'authentification pour
     * l'utilisateur
     *
     * @param pass - Nouvelle login de l'utilisateur
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
}
