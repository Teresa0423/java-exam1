package Exam1;

import java.util.Scanner;

public class Tseter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        Box3 box3 = new Box3();
        Box4 box4 = new Box4();
        Box5 box5 = new Box5();
        Box6 box6 = new Box6();

        System.out.println("plaese enter box's lenght : ");
        int lenght = Integer.parseInt(scanner.next());
        System.out.println("plaese enter box's width : ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("plaese enter box's height : ");
        int height = Integer.parseInt(scanner.next());

        if (box1.vaildate(lenght,width,height)){
            System.out.println(box1.getName() +"\t" + box1.getPrice());
        }
        else if (box2.vaildate(lenght,width,height)){
            System.out.println(box2.getName() +"\t" + box2.getPrice());
        }
        else if (box3.vaildate(lenght,width,height)){
            System.out.println(box3.getName() +"\t" + box3.getPrice());
        }
        else if (box4.vaildate(lenght,width,height)){
            System.out.println(box4.getName() +"\t" + box4.getPrice());
        }
        else if (box5.vaildate(lenght,width,height)){
            System.out.println(box5.getName() +"\t" + box5.getPrice());
        }
        else if (box6.vaildate(lenght,width,height)){
            System.out.println(box6.getName() +"\t" + box6.getPrice());
        }
    }
}
