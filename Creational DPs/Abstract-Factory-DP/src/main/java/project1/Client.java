package project1;

import project1.aws.AwsResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib){
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);

        instance.attachStorage(storage);

        return instance;
    }
    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();
    }
}
