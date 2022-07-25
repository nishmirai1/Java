class shape{
    
    double height;
    double width;
    shape(double h, double w)
    {
       
        height=h;
        width=w;
    }
    
    void print_sup()
    {
        System.out.println("I am in superclass shape");
    }
}
class triangle extends shape{
    String s;
    triangle(double h, double w)
    {
        super(h,w);
        width=w;
        height=h;
    }
    double area()
    {
        return width*height/2;
    }
    void print_sup()
    {
        System.out.println("I am in subclass extending of shape");
    }
}

class rectangle extends shape{
    String s;
    triangle(double h, double w)
    {
        super(h,w);
        width=w;
        height=h;
    }
    double area()
    {
        return width*height/2;
    }
    void print_sup()
    {
        System.out.println("I am in subclass extending of shape");
    }
}





public class inheritance {
    public static void main(String[]args){
        triangle t1=new triangle(10,20);      
        t1.print_sup();
        t1.print_sup();
        System.out.println("Area="+t1.area());
    
        }


}
