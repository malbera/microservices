package ch.malbera.notification.service;

import ch.malbera.notification.domain.NotificationType;
import ch.malbera.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
