package eg1;

public class eg1Main {

    /**
     * 提供一种在不暴露其基础表示的情况下访问聚合对象的元素的方法。
     *
     * 迭代器模式不仅涉及遍历集合，我们还可以根据需求提供不同种类的迭代器。
     *
     * 迭代器设计模式通过集合隐藏了遍历的实际实现，而客户端程序仅使用迭代器方法。
     *
     * 让我们用一个简单的例子来了解迭代器模式。假设我们有一个无线电频道列表，并且客户端程序要一一遍或根据频道类型遍历它们。例如，某些客户端程序仅对英语频道感兴趣，并且只想处理它们，而不希望处理其他类型的频道。
     *
     *
     * */

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
