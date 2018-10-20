public class A {
    protected String a = "Albus";
    public X x = new X ("Xenophilius");

    public A() {
    }

    public A(String a, X x) {
        this.x = x;
        this.a = a;
    }


    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}









