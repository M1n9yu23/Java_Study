package ch13.exam.ex03;

public class Container<M, G> {
    private M m;
    private G g;

    public void set(M m, G g){
        this.m = m;
        this.g = g;
    }

    public M getKey(){
        return m;
    }

    public G getValue(){
        return g;
    }
}
