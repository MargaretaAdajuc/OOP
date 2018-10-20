class E extends D{
    protected String e = "Errol";

    public E(){
    }

    public  E(String e, X x){
        super("Dobby", x);
        this.e = e;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", x=" + x +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}