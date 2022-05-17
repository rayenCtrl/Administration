package LoginMainGerer;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

public class EmailSender {
    public static final String emailId = "gestionnairepi@gmail.com";

    public static final String password = "kks951753";

    public static void sendEmail(Utilisateur user) throws Exception {
        String reciever = user.getEmail();

        System.out.println("Sending Email from " + emailId + " to " + reciever);

        Properties pr = new Properties();

        pr.put("mail.smtp.auth", "true"); // for username and password authentication
        pr.put("mail.smtp.starttls.enable", "true");
        pr.put("mail.smtp.host", "smtp.gmail.com"); // here host is gmail.com
        pr.put("mail.smtp.port", "587"); // port no.

        Session gs = Session.getInstance(pr, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailId, password); // pass your email id and password here

            }
        });

        Message ms = messageContent(gs, emailId, user);

        System.out.println("Message sent! ");

    }

    private static Message messageContent(Session gs, String emailId, Utilisateur user) throws Exception {
        try {
            String reciever = user.getEmail();
            Message msg = new MimeMessage(gs);
            msg.setFrom(new InternetAddress(emailId));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(reciever));
            msg.setSubject("Plateforme Gestion Scolarité PI"); // to set the subject (not mandatory)
            msg.setText(
                    "Bonjour " + user.getNom() + " " + user.getPrenom() + ",\n\n"
                            + "Bienvenue sur la plateforme de gestion scolarité Polytech INTL.\n\n"
                            + "Votre Email est: "
                            + user.getEmail() + "\n" + "Votre mot de passe est : " + user.getMdp() + "\n\n"
                            + "Bon travail," + "\n\n\n"
                            + "Ceci est un test dans le cadre de projet de fin d'année réalisé par Khalil Bessaad et Rayen Lazgheb");
            Transport.send(msg);
            return msg;
        } catch (MessagingException e) {
            System.out.println(e);
        }

        return null;

    }

    // main method
    public static void main(String[] args) throws Exception {
        // sendEmail();
        // Utilisateur malek = new Utilisateur("Malek", "Fehri",
        // "mmlkfehri025@gmail.com", "Administrateur");
        // System.out.println(malek.toString());
        // sendEmail(malek);
        // Utilisateur khalil = new Utilisateur("Khalil", "Bessaad",
        // "k.bessaad19019@pi.tn", "Administrateur");
        // khalil.generateandSetMdp();
        // System.out.println(khalil.toString());
        // sendEmail(khalil);
        Utilisateur rayen = new Utilisateur("Rayen", "Lazgheb", "r.lazghab21167@pi.tn", "Administrateur");
        System.out.println(rayen.toString());
        sendEmail(rayen);
    }

}
