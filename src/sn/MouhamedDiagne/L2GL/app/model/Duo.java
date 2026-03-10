package sn.MouhamedDiagne.L2GL.app.model;

public final class Duo<A,B> {
    private final A a;
    private final B b;
    public Duo(A a,B b)
    {
        if(a==null || b==null)
        {
            throw new NullPointerException();
        }
        this.a=a;
        this.b=b;
    }
    public A getA() {
        return a;
    }
    public B getB() {
        return b;
    }
}
