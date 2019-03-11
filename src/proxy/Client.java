package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2019/3/11
 * Time: 16:16
 * Description:
 * \
 */
public class Client {

    private HelloInterface helloProxy ;

    public void aop(){
        Hello hello = new Hello();
        InvocationHandler handle = new DynamicHelloHandler(hello);
        this.helloProxy = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), handle);
    }
    public static void main(String[] args) {
        HelloInterface helloInterface = new HelloProxy();
        helloInterface.sayHello();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Client client = new Client() ;
        client.aop(); ;
        client.helloProxy.sayHello();
    }
}
