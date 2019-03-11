package proxy;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2019/3/11
 * Time: 16:14
 * Description:
 * \
 */
public class HelloProxy implements HelloInterface {

    private HelloInterface helloInterface = new Hello() ;

    @Override
    public void sayHello() {
        System.out.println("Before invoke hello");
        helloInterface.sayHello();
        System.out.println("after invoke hello");
    }
}
