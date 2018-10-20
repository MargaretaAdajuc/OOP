public class Main {

    public static void main(String[] args) {
        X x = new X("Xenophilius");

        A a = new A("Albus", x);
        System.out.println(a.toString());

        B b = new B("Bill", x);
        System.out.println(b.toString());

        C c = new C("Cedric", x);
        System.out.println(c.toString());

        D d = new D("Dobby", x);
        System.out.println(d.toString());

        E e = new E("Errol", x);
        System.out.println(e.toString());

        F f = new F("Fred", x);
        System.out.println(f.toString());

        G g = new G("George", x);
        System.out.println(g.toString());

        H h = new H("Hagrid", x);
        System.out.println(h.toString());

        I i = new I("Igor", x);
        System.out.println(i.toString());

        J j = new J("James", x);
        System.out.println(j.toString());
    }
}
