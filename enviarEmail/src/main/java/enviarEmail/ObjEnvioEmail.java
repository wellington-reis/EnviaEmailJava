package enviarEmail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ObjEnvioEmail {

	private String userName = "wor.testeemail@gmail.com";
	private String senha = "zkcu opjt ufvo aigt";
	
	private String Destinatarios = "";
	private String Remetente = "";
	private String Assunto = "";
	private String TextoEmail = "";
	
	public ObjEnvioEmail(String Destinatario, String Remetente, String Assunto, String TextoEmail) {

		this.Destinatarios = Destinatario;
		this.Remetente = Remetente;
		this.Assunto = Assunto;
		this.TextoEmail = TextoEmail;
	}

	public void enviarEmail(boolean emailHtml) throws Exception {

		Properties properties = new Properties();

		properties.put("mail.smtp.ssl.trust", "*");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.socketFactory.port", "587");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		Session session = Session.getInstance(properties, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(userName, senha);
			}
		});

		Address[] toUser = InternetAddress.parse(Destinatarios);

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName, Remetente));
		message.setRecipients(Message.RecipientType.TO, toUser);
		message.setSubject(Assunto);
		
		if (emailHtml) {
			
			message.setContent(TextoEmail, "text/html; charset = utf-8");
			
		} else {
			
			message.setText(TextoEmail);

		}
		
		
		
		

		Transport.send(message);

	}

}
