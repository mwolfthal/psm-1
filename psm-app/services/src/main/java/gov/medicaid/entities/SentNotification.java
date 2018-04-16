package gov.medicaid.entities;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import gov.medicaid.entities.EmailTemplate;

/**
 * Represents an email notification
 */
@javax.persistence.Entity
@Table(name = "sent_notifications")
public class SentNotification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notification_id")
    private long notificationId;

    @Enumerated(EnumType.STRING)
    @Column(name = "notification_type",
            nullable = false)
    private EmailTemplate notificationType;

    /**
     * The email address that the notification was sent to
     */
    @Column(name = "sent_to",
            nullable = false)
    private String sentTo;

    /**
     * The content of the notification (the processed template)
     */
    @Column(name = "notification_content",
            nullable = false)
    private String notificationContent;

    @Column(name = "sent_at",
            nullable = false)
    private Date sentAt;

    public SentNotification() {
    }

    public long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    public EmailTemplate getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(EmailTemplate notificationType) {
        this.notificationType = notificationType;
    }

    public String getSentTo() {
        return sentTo;
    }

    public void setSentTo(String emailAddress) {
        this.sentTo = emailAddress;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }
}
