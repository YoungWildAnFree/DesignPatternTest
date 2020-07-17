package eg1;

public class eg1Main {

    public static void main(String[] args) {

        ChannelCollection channelCollection = populateChannels();
        ChannelIterator iterator = channelCollection.iterator(ChannelTypeEnum.ALL);
        while (iterator.hasNext()){
            Channel next = iterator.next();
            System.out.println(next.toString());
        }

        System.out.println("*******");
        ChannelIterator englishIterator = channelCollection.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()){
            Channel next = englishIterator.next();
            System.out.println(next.toString());
        }


    }

    private static ChannelCollection populateChannels(){
        ChannelCollection channelCollection = new ChannelCollectionImpl();
        channelCollection.addChannel(new Channel(99.1,ChannelTypeEnum.ENGLISH));
        channelCollection.addChannel(new Channel(99.2,ChannelTypeEnum.FRENCH));
        channelCollection.addChannel(new Channel(99.3,ChannelTypeEnum.HINDI));
        channelCollection.addChannel(new Channel(99.5,ChannelTypeEnum.ENGLISH));
        channelCollection.addChannel(new Channel(99.0,ChannelTypeEnum.ENGLISH));
        channelCollection.addChannel(new Channel(99.14,ChannelTypeEnum.FRENCH));

        return channelCollection;
    }
}
