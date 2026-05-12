package main.java.ch05_abstract_interface.oop.model.vo;

public class Fish extends Animal {

    // Animal의 추상 메서드를 오버라이딩 하지 않으면
    @Override
    public void eat() {
        System.out.println("뻐끔");
    }

    @Override
    public void breathe() {
        System.out.println("아가미로 호흡한다");
    }
}
