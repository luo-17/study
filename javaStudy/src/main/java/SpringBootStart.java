import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.logging.Logger;

@SpringBootApplication(exclude={XADataSourceAutoConfiguration.class, DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"springBoot"})
public class SpringBootStart {
    public static void main(String[] srg){
        Logger log=Logger.getLogger("main-启动");
        log.info("spring boot 开始启动");
        ApplicationContext context= SpringApplication.run(SpringBootStart.class,srg);
        log.info("spring boot 启动完毕");

    }
}
