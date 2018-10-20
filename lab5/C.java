class C extends B{
    protected String c = "Cedric";


    public C() {
    }

    public C(String c, X x){
        super("Bil", x);
        this.c = c;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}