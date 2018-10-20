class I extends H{
    protected String i = "Igor";

    public I(){
    }

    public I(String i, X x){
        super("Hagrid", x);
        this.i = i;
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
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