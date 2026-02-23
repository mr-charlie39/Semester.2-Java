interface InnerfaceOuter {
    void method1();
    void method2();
    public interface InnerInnerfaceOuter {
        void method3();
        
    }
    
}
public class InnerfaceOuterImpl implements InnerfaceOuter, InnerfaceOuter.InnerInnerfaceOuter {
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }
    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }
    @Override
    public void method3() {
        System.out.println("Method 3 implementation");
    }
    public static void main(String[] args) {
        InnerfaceOuterImpl obj = new InnerfaceOuterImpl();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}