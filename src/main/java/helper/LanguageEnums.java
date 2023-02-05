package helper;

public class LanguageEnums {
    public enum EnglishText{
        TITLE("Log in to Sherpany meeting management software"),
        EMAIL("Email"),
        PASSWORD("Password"),
        FORGOTPASSWORD("Forgot password?"),
        LOGIN("Log in"),
        OR("or"),
        LOGINWITHSSO("Log in with SSO"),
        NOACCOUNTYET("No account yet?"),
        REQUESTDEMO("Request a demo"),
        GETHELP("Get help"),
        HOMEPAGE("Sherpany.com"),
        MEETINGRESOURCES("Meeting resources"),
        PRIVACYPOLICY("Privacy Policy"),
        TERMSOFUSE("Terms of Use"),
        DOWNLOADON("Download on"),
        WELLRESENDLINK("We'll send a reset link to"),
        SENDLINK("Send link"),
        RETURNTOLOGIN("Return to login"),
        MISSINGEMAILERROR("Please enter a valid email address."),
        MISSINGPASSWORDERROR("We couldn't log you in. Please check your email address and password and try again."),
        SSOLOGINERROR("We could not find any SSO provider based on that email address."),
        LOGINWITHPASSWORD("Log in with password");
        public final String name;
        EnglishText(String name) {
                this.name = name;
            }
    }

    public enum GermanText{
        TITLE("Melden Sie sich bei der Sherpany Meeting Management Software an"),
        EMAIL("E-Mail"),
        PASSWORD("Passwort"),
        FORGOTPASSWORD("Passwort vergessen?"),
        LOGIN("Anmelden"),
        OR("oder"),
        LOGINWITHSSO("Mit SSO anmelden"),
        NOACCOUNTYET("Noch kein Konto?"),
        REQUESTDEMO("Demo anfordern"),
        GETHELP("Brauchen Sie Hilfe?"),
        HOMEPAGE("Sherpany.com"),
        MEETINGRESOURCES("Ressourcen für die Sitzung"),
        PRIVACYPOLICY("Datenschutzbestimmungen"),
        TERMSOFUSE("Nutzungsbedingungen"),
        DOWNLOADON("Herunterladen auf"),
        WELLRESENDLINK("Wir senden einen Link zum Zurücksetzen an"),
        SENDLINK("Link senden"),
        RETURNTOLOGIN("Zurück zur Anmeldung"),
        MISSINGEMAILERROR("Bitte geben Sie eine gültige E-Mail-Adresse ein."),
        MISSINGPASSWORDERROR("Die Anmeldung ist fehlgeschlagen. Bitte überprüfen Sie Ihre E-Mail-Adresse und Ihr Passwort und versuchen Sie es erneut."),
        SSOLOGINERROR("Wir konnten basierend auf dieser E-Mail-Adresse keinen SSO-Anbieter finden."),
        LOGINWITHPASSWORD("Mit Passwort anmelden");
        public final String name;
        GermanText(String name) {
            this.name = name;
        }
    }

    public enum FrenchText{
        TITLE("Se connecter au logiciel de gestion de réunion Sherpany"),
        EMAIL("E-mail"),
        PASSWORD("Mot de passe"),
        FORGOTPASSWORD("Mot de passe oublié?"),
        LOGIN("S'identifier"),
        OR("ou"),
        LOGINWITHSSO("Se connecter avec SSO"),
        NOACCOUNTYET("Pas encore de compte ?"),
        REQUESTDEMO("Demander une démo"),
        GETHELP("Recevoir de l'aide"),
        HOMEPAGE("Sherpany.com"),
        MEETINGRESOURCES("Ressources pour la réunion"),
        PRIVACYPOLICY("Déclaration de protection de données"),
        TERMSOFUSE("Conditions d'utilisation"),
        DOWNLOADON("Téléchargement sur"),
        WELLRESENDLINK("Nous enverrons un lien de réinitialisation à"),
        SENDLINK("Envoyer le lien"),
        RETURNTOLOGIN("Retour à la connexion"),
        MISSINGEMAILERROR("Veuillez entrer une adresse email valide."),
        MISSINGPASSWORDERROR("Nous n'avons pas pu vous connecter. Veuillez vérifier votre adresse e-mail et votre mot de passe et réessayer."),
        SSOLOGINERROR("Nous n'avons pas pu trouver de fournisseur SSO basé sur cette adresse e-mail."),
        LOGINWITHPASSWORD("Se connecter avec le mot de passe");
        public final String name;
        FrenchText(String name) {
            this.name = name;
        }
    }

    public enum ItalianText{
        TITLE("Accedi al software di gestione delle riunioni di Sherpany"),
        EMAIL("Email"),
        PASSWORD("Password"),
        FORGOTPASSWORD("Password dimenticata?"),
        LOGIN("Accedere"),
        OR("o"),
        LOGINWITHSSO("Accedere con SSO"),
        NOACCOUNTYET("Non ha ancora un account?"),
        REQUESTDEMO("Richiedere una demo"),
        GETHELP("Ottenere aiuto"),
        HOMEPAGE("Sherpany.com"),
        MEETINGRESOURCES("Risorse per le riunioni"),
        PRIVACYPOLICY("Informativa sulla privacy"),
        TERMSOFUSE("Condizioni d'uso"),
        DOWNLOADON("Scaricare su"),
        WELLRESENDLINK("Invieremo un link di reset a"),
        SENDLINK("Invia link"),
        RETURNTOLOGIN("Ritornare al login"),
        MISSINGEMAILERROR("Inserire un indirizzo email valido"),
        MISSINGPASSWORDERROR("Non abbiamo potuto effettuare il login. Per favore, controlli il suo indirizzo e-mail e la sua password e riprovi."),
        SSOLOGINERROR("Non siamo riusciti a trovare nessun provider SSO basato su quell'indirizzo email."),
        LOGINWITHPASSWORD("Accedere con la password");
        public final String name;
        ItalianText(String name) {
            this.name = name;
        }
    }
}
