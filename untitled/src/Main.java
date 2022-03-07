import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        //initializing list
        ArrayList<Print> list = new ArrayList<>();

        //initializing figures
        Print circle1= new circle(50,50,20);
        Print rec1=new rectangle(100,50, 40,50);
        Print triangle1=new triangle(50,80,90,80,60,100);
        Print line1 = new line(100,80 ,150,100);
        Print ellipsis1=new ellipsis(200, 200,100,150);
        Print sq1=new square(500,500,100);

        //adding to list
        list.add(circle1);
        list.add(rec1);
        list.add(triangle1);
        list.add(line1);
        list.add(ellipsis1);
        list.add(sq1);

        for (Print a:list){
            a.print();
        }


    }
}
