package second;

public class Main {
    public static void main(String[] args) {
        AuthenticationService service = new AuthenticationImpl();

        try {
            System.out.println(service.checkAuthorization("asda", "34", "34"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
