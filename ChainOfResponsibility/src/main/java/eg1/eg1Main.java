package eg1;

import java.math.BigDecimal;

public class eg1Main {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();


        /** 注意 加入链条的顺序 */
        handlerChain.addHandler(new DirectorHandler());
        handlerChain.addHandler(new ManagerHandler());
        handlerChain.addHandler(new CEOHandler());

        handlerChain.process(new Request("Bob",new BigDecimal("123")));

        handlerChain.process(new Request("aaa",new BigDecimal("1001")));

        handlerChain.process(new Request("Bob",new BigDecimal("200000")));

        handlerChain.process(new Request("bbbb",new BigDecimal("200000")));


    }
}
