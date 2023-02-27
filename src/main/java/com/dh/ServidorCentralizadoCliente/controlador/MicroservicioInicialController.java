import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static java.util.logging.Logger.global;

@RestController
class AccountService {
    @Value(“${message}”)
    private String message;
    @Value(“${global-message}”)
    private String globalMessage;
    @RequestMapping(method = RequestMethod.GET, path=”service”)
    public Map<String,String> message() {
        Map<String,String> response = new HashMap<>();
        response.put(“message”, message);
        response.put(“global-message”, globalMessage);
        return response;
    }
}