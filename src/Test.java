/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2019/3/6
 * Time: 17:36
 * Description:
 * \
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Integer a = 100 ;
//
//        System.out.println( a.toString());
        Class<TestClass> s = (Class<TestClass>) Class.forName("TestClass");
        s.newInstance() ;
    }
}
