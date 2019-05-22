import message.JSONMessage;
import message.Message;

public class JSONMessageCreator  extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
