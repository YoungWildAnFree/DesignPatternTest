package eg1;

public class eg1Main {
    /**
     *将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。
     *命令模式的设计思想是把命令的创建和执行分离，使得调用者无需关心具体的执行过程。
     * 通过封装Command对象，命令模式可以保存已执行的命令，从而支持撤销、重做等操作
     *
     * 视需求而定。如果TextEditor复杂到一定程度，并且需要支持Undo、Redo的功能时，就需要使用命令模式，因为我们可以给每个命令增加undo()：
     * 然后把执行的一系列命令用List保存起来，就既能支持Undo，又能支持Redo。这个时候，我们又需要一个Invoker对象，负责执行命令并保存历史命令：
     * */
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.add("aaaaaAaaa");


        CopyCommand copyCommand = new CopyCommand(textEditor);

        copyCommand.execute();

        PasteCommand pasteCommand = new PasteCommand(textEditor);

        pasteCommand.execute();



    }


}
