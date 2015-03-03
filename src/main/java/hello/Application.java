package hello;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        if (log.isDebugEnabled()) {
            // List beans provided by Spring Boot
            String[] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
            for (String bean : beans)
                log.debug("Bean: {}", bean);
        }
    }

}
