import javax.swing.Box;
class const_over{
    double l,b,h;
    const_over(double l,double b,double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    const_over(double l)
    {
        this.l=b=h;
    }
    double volume()
    {
        return l*b*h;
    }
    void print()
    {
        System.out.println("method overloading");
    }
    void print(double v)
    {
        System.out.println("volume of box="+v);
}
}

public class constr_demo {
    public static void main(String[] args) {
        double r1,r2;
        const_over cuboid=new const_over(10,20,10);
        const_over cube=new const_over(10);
        r1=cuboid.volume();
        r2=cube.volume();
        cuboid.print();
        cube.print();
        cuboid.print(r1);
        cube.print(r2);
    }
        
    
    }
       
        
    

    

