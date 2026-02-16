package Swetha.notificationSystem;

public class UserService {
    private final Notification notificationService;

    public UserService(Notification notificationService) {
        this.notificationService = new EmailNotificationService();
    }

    public void notifyUser()
    {
        notificationService.send("Welcome!");
    }

}
