package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = -6228491028374L;
    private String id;
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return id + ": " + name;
    }
}
