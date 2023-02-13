public class Box {

    int height;
    int weight ;
    int length;

public static void calculate_area(int height , int weight ) {
    System.out.println(height * weight);
}

public static void calculate_area(int height,int weight ,int length  )

{
    System.out.println(height*weight*length);
}


public void display()

{

    System.out.println(+height);
    System.out.println(+weight);
    System.out.println(+length);
}



    public static void main(String[]argn){
        calculate_area(20,54 );
        calculate_area(12,23,34);

    Box num1=new Box();
    num1.height=12;
    num1.weight=23;
    num1.length=8;
    num1.display();


    }
}