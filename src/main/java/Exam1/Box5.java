package Exam1;

public class Box5 extends Box{
    public Box5(){
        lenght = 15;
        width = 15;
        height = 15;
    }
    @Override
    public String getName(){
        return "Box5";
    }
    @Override
    public int getPrice(){
        return 80;
    }
}
