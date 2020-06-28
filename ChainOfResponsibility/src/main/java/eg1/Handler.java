package eg1;

public interface Handler {

    /**
     * @param request
     * @return 返回Boolean.TRUE = 成功/返回Boolean.FALSE = 拒绝/返回null = 交下一个处理
     *
     */
    Boolean process(Request request);


}
