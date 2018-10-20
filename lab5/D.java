class D extends C {
    protected String d = "Dobby";
    public X x = new X("Xenophilius Lovegood");

    public D() {
    }

    public D(String d, X x) {
        super("Cedric", x);
        this.d = d;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", x=" + x +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}