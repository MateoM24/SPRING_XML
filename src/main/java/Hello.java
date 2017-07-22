
import org.apache.log4j.Logger;

/*
 * Java class which accept message as dependency injected
 */
public class Hello {

    private static final Logger logger = Logger.getLogger(Hello.class);
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void sayHello(){
        logger.info("SPRING with XML configuration " + message);        }

}

