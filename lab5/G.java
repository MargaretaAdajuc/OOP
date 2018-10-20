class G extends F{
    protected String g = "George";

    public G(){
    }

    public G(String g, X x){
        super ("Fred", x);
        this.g = g;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
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