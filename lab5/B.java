class B extends A{
    protected String b = "Bill";

    public B(){
    }

    public B(String b, X x){
        super("Albus", x);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}