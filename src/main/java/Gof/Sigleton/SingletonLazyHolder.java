package Gof.Sigleton;

public class SingletonLazyHolder {

    private static class InsctanceHolder {
        public static  SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstancia() {
        return InsctanceHolder.instancia;
    }
}
