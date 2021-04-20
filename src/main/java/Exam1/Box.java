package Exam1;

public abstract class Box {
    int lenght;
    int width;
    int height;

    public boolean vaildate(int l,int w, int h){
        return (l <= lenght && w <= width && h <=height);
    }
    public abstract String getName();
    public abstract int getPrice();
}
