package Exam1;

public class Box1 extends Box{
    public Box1(){
        lenght = 5;
        width = 10;
        height = 10;
    }
    @Override
    public String getName(){
        return "Box1";
    }
    @Override
    public int getPrice(){
        return 40;
    }
}
