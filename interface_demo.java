interface Rectangle{
    float area_rect(float x, float y);
}
interface Triangle{
    float area_tri(float x, float y);
}
class Area implements Rectangle, Triangle{
    public float area_rect(float x, float y){
        return(x*y);
    }
    public float area_tri(float x, float y){
        return(x*y)/2;
    }
}

public class interface_demo {
    public static void main(String [] args){
        Area a= new Area();
        System.out.println("Area of Rectangle:"+a.area_rect(15, 30));
        System.out.println("Area of Triangle:"+a.area_tri(10, 20));
    }
    
}
