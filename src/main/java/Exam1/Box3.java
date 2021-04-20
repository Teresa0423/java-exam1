package Exam1;

public class Box3 extends Box{
    public Box3(){
        lenght = 15;
        width = 10;
        height = 10;
    }
    @Override
    public String getName(){
        return "Box3";
    }
    @Override
    public int getPrice(){
        return 60;
    }
}
