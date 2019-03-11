package proxy;

import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2019/3/11
 * Time: 16:14
 * Description:
 * \
 */
public class DynamicHelloHandler implements InvocationHandler {
    private Object subject ;

    public DynamicHelloHandler(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke " + method.getName());
        method.invoke(subject,args) ;
        System.out.println("after invoke " + method.getName());
        return this;
    }
}
