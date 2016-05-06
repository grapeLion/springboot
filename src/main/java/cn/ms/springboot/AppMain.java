package cn.ms.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by weizheng on 2016/5/4.
 */
@SpringBootApplication
public class AppMain{
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AppMain.class);
        application.run(args);
    }

}




//@SpringBootApplication
//public class AppMain extends SpringBootServletInitializer {
//    private static final Logger log = LoggerFactory.getLogger(AppMain.class);
//    private static SpringApplicationBuilder applicationBuilder;
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        System.out.println("=====================================");
//        this.applicationBuilder = application.profiles(getDefaultProfile()).sources(AppMain.class);
//        return application.bannerMode(Banner.Mode.OFF);
//    }
//    public static void main(String[] args) throws Exception {
//        applicationBuilder.run(args);
//    }
//
//    private static String getDefaultProfile() {
//        String profile = System.getProperty("spring.profiles.active");
//        if (profile != null) {
//            log.info("============Running with Spring profile(s) ==============: {}", profile);
//            return profile;
//        }
//
//        log.warn("=======No Spring profile configured, running with default configuration======");
//        return "local";
//    }
//
//
//
//}
