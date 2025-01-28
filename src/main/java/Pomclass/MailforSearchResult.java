package Pomclass;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class MailforSearchResult {
public static void main(String[] args) throws EmailException {
		
		System.out.println("...........TEST STARTED.........");
		sendEmail();
		System.out.println("...........EMAIL SEND.........");

	}

	public static void sendEmail() throws EmailException {
		Email email =new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("pratiksha.damodar@legitquest.com","India@1234"));
		email.setSSLOnConnect(true);
		email.setFrom("pratiksha.damodar@legitquest.com");
		email.setSubject("Website down alert Message");
		email.setMsg("Hi Team Search Result Not working please check LegalResearch website");
		email.addTo("pratikshadamodar@legitquest.com");
		email.addTo("vaibhav.joshi@legitquest.com");
		email.addTo("mamta.Kashyap@legitquest.com.com");
	email.addTo("rajan.batra@legitquest.com");
	 email.addTo("karan.kalia@legitquest.com");
		email.send();
	}

}
