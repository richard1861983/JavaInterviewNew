import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/3/12.
 */
public class Test_1 {
    /*
     * ��ע�����������
     */
    @Test(id = 1, description = "hello method_1")
    public void method_1() {
    }

    @Test(id = 2)
    public void method_2() {
    }

    @Test(id = 3, description = "last method")
    public void method_3() {
    }

    /*
     * ����ע�⣬��Test_1�� ���б�ע�ⷽ�� ����Ϣ��ӡ����
     */
    public static void main(String[] args) {
        Method[] methods = Test_1.class.getDeclaredMethods();
        for (Method method : methods) {
            /*
             * �жϷ������Ƿ���ָ��ע�����͵�ע��
             */
            boolean hasAnnotation = method.isAnnotationPresent(Test.class);
            if (hasAnnotation) {
                /*
                 * ����ע�����ͷ��ط�����ָ������ע��
                 */
                Test annotation = method.getAnnotation(Test.class);
                System.out.println("Test( method = " + method.getName()
                        + " , id = " + annotation.id() + " , description = "
                        + annotation.description() + " )");
            }
        }
    }
}
