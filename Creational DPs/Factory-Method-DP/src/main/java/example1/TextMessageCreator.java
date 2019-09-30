package example1;

import example1.message.Message;
import example1.message.TextMessage;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
