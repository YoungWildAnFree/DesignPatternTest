package eg1;

public class Channel {

    private Double frequency;
    private ChannelTypeEnum TYPE;


    public Channel(Double frequency, ChannelTypeEnum TYPE) {
        this.frequency = frequency;
        this.TYPE = TYPE;
    }


    public Double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }


    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", TYPE=" + TYPE +
                '}';
    }
}
