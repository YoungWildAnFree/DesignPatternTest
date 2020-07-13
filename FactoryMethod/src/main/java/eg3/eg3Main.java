package eg3;

import java.io.IOException;
import java.nio.file.Paths;

public class eg3Main {

    public static void main(String[] args) throws IOException {

        AbstractFactory fastFactory = new FastFactory();
        HtmlDocument html = fastFactory.createHtml("aaa");
        html.save(Paths.get(".", "fast.html"));


        AbstractFactory goodFactory = new GoodFactory();
        WordDocument bbb = goodFactory.createWord("bbb");
        bbb.save(Paths.get(".","good.word"));

        AbstractFactory fast = AbstractFactory.createFactory("fast");
        HtmlDocument ccc = fast.createHtml("ccc");
        ccc.toHtml();


    }
}
