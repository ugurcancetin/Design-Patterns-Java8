package project1;

public class App {
    public static void main(String[] args) {
        Message message = new TextMessage("Test Message... <HEAD> - <BODY>");
        System.out.println(message.getContent());

        Message decorator = new HtmlEncodedMessage(message);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }
}
