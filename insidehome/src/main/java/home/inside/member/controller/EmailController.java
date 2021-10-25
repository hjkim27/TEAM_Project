package home.inside.member.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.SendEmailCommand;

@Controller
public class EmailController {

	@RequestMapping("/inside/email.do")
	public String sendEmail(SendEmailCommand cmd, Model model) throws Exception{
		String host = "smtp.naver.com";
		final String username = "qlrmf2470@naver.com";
		final String password = "qlrmf2470!@";
		int port = 587;
		
		String receiverMail = cmd.getReceiverMail();
		String emailTitle = cmd.getEmailTitle();
		String emailContent = cmd.getEmailContent();
		
		Properties prop = System.getProperties();
		prop.put("mail.smtp.host", host);
		prop.put("mail.smtp.port", port);
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.ssl.enable", "true");
		prop.put("mail.smtp.ssl.trust", host);
		
		Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		session.setDebug(true);
		
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(username));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(receiverMail));
		msg.setSubject(emailTitle);
		msg.setText(emailContent);
		Transport.send(msg);
		return "user/main/checkIn";
	}
}
