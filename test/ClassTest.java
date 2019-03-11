import junit.framework.TestCase;
import org.junit.*;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2019/3/11
 * Time: 14:35
 * Description:
 * \
 */
public class ClassTest {

    @Test
    public void testClassLoader(){
        ClassLoader classLoader = Test.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);

        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);
    }

    @Test
    public void testInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<TestClass> s = (Class<TestClass>) Class.forName("TestClass");
        System.out.println(s.getInterfaces());
        TestClass testInstance = s.newInstance() ;
        for(Method method: s.getMethods()){
            System.out.println(method);
        }

        System.out.println("\n");
        for(Method method: s.getDeclaredMethods()){
            System.out.println(method);
            method.setAccessible(true);
            method.invoke(testInstance,null) ;
        }
    }
}
