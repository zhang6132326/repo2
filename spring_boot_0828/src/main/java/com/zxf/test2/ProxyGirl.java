package com.zxf.test2;

public class ProxyGirl implements Human  {
    private Human human;

    public ProxyGirl() {
        super();
    }

    public ProxyGirl(Human human){
        super();
        this.human=human;
    }
    public void eat(){
        System.out.println("11111");
        human.eat();
        System.out.println("2222222");
    }
}
