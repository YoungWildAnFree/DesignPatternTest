package eg1;

public class AHandler implements Handler{
   private Handler next;

    @Override
    public Boolean process(Request request) {
        if(canProcess(request)){
            return true;
        }else {
            next.process(request);
        }
        return null;
    }


    Boolean canProcess(Request request){
        return true;
    }
}
