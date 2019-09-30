package example1;

import example1.message.JSONMessage;
import example1.message.Message;

public class JSONMessageCreator  extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
