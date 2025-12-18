package TightCoupling;

public class ApplicationMain {
    public static void main(String[] args) {
        userService userService = new userService();
        userService.notifyUser("ok we got you!!");
    }
}
