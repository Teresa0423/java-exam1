package Exam1;

public class Box2 extends Box{
    public Box2(){
        lenght = 10;
        width = 10;
        height = 10;
    }
    @Override
    public String getName(){
        return "Box2";
    }
    @Override
    public int getPrice(){
        return 50;
    }
}
