package cn.ms.springboot;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.NetworkTrafficServerConnector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:DateServiceTest-context.xml"})
public class ServerRunner {

    private static Server server;

    @BeforeClass
    public static void startWebapp() throws Exception {
        server = new Server();

        NetworkTrafficServerConnector networkTrafficServerConnector = new NetworkTrafficServerConnector(server);
        networkTrafficServerConnector.setPort(8080);
//        connector.setPort(8080);

        server.addConnector(networkTrafficServerConnector);


        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/remoting");

        webAppContext.setWar("/Users/Emily/home/ideaProject/springboot/target/springboot-1.0-SNAPSHOT.war");

        server.setHandler(webAppContext);
        server.start();
        System.out.println("syetem start sucess.");
    }

    @AfterClass
    public static void stopWebapp() throws Exception {
        server.stop();
    }
}