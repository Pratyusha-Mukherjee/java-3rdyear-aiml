import java.util.Scanner;
class rectangle{
    int length;
    int breadth;
    void insert(int len,int bre){
        @SuppressWarnings("unused")
        int length=len;
        @SuppressWarnings("unused")
        int breadth=bre;
    }
    void area( int x,int y){
    int Area = x*y;  
    System.out.println("Area of rectangle is "+Area);
    }
}

class Rectangle1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle:-");
        int a = sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle:-");
        int b = sc.nextInt();
        rectangle r = new rectangle();
        r.insert(a,b);
        r.area(a,b);
    }
}