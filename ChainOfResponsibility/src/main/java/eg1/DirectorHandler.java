package eg1;

import java.math.BigDecimal;

public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
            return null;
        }
        return !request.getName().equalsIgnoreCase("bob");

    }
}
