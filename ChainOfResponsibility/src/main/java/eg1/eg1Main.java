package eg1;

import java.math.BigDecimal;


/**
 * 责任链模式是一种把多个处理器组合在一起，依次处理请求的模式；
 * 责任链模式的好处是添加新的处理器或者重新排列处理器非常容易；
 * 责任链模式经常用在拦截、预处理请求等。
 *
 *在实际场景中，财务审批就是一个责任链模式。假设某个员工需要报销一笔费用
 * Manager：只能审核1000元以下的报销；
 * Director：只能审核10000元以下的报销；
 * CEO：可以审核任意额度。
 *
 * 用责任链模式设计此报销流程时，每个审核者只关心自己责任范围内的请求，并且处理它。对于超出自己责任范围的，扔给下一个审核者处理，这样，将来继续添加审核者的时候，不用改动现有逻辑。
 * */
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
