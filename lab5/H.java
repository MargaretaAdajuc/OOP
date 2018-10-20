class H extends G{
    protected String h = "Hagrid";
    protected X x = new X("X. Lovegood");

    public H(){
    }

    public H(String h, X x){
        super("George", x);
        this.h = h;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", x=" + x +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", x=" + x +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}