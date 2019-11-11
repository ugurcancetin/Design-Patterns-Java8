package project1;

public class App {
    public static void main(String[] args) {
        Message message = new TextMessage("Test Message...");
        System.out.println(message.getContent());
    }
}
