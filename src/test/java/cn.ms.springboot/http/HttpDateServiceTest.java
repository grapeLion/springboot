package cn.ms.springboot.http;

import cn.ms.springboot.ServerRunner;
import cn.ms.springboot.springremoting.http.HttpDateService;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;


public class HttpDateServiceTest extends ServerRunner {

    @Resource(name = "httpDateService")
    private HttpDateService httpDateService;

    @Test
    public void getGetDate() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(httpDateService.getDate()));
    }
}
