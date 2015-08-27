package fr.hafrang.smsapi;

/**
 * Utilisateur du service de notifications par SMS de Free Mobile.
 * Il est d�ffinit par un login constitu�s de 8 chiffres,
 * et d'une cl� d'authentification sp�cifique au service de
 * notifications par SMS, il est constitu� de 14 caract�res
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
     * D�finit un nouveau login pour l'utilisateur
     *
     * @param login - Nouveau login de l'utilisateur
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retourne la cl� d'authentification de l'utilisateur
     *
     * @return String - Cl� d'authentification de l'utilisateur
     */
    public String getPass() {
        return pass;
    }

    /**
     * D�finit une nouvelle cl� d'authentification pour
     * l'utilisateur
     *
     * @param pass - Nouvelle login de l'utilisateur
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
}
