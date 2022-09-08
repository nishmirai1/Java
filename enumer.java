public class enumer {
    public enum DayOfWeek
    {
        Monday(1),Tuesday(2),Wednessday(3),Tharsday(4),Friday(5),Saturday(6),
        Sunday(7);
        public int val;
        DayOfWeek(int val){
            this.val=val;
        }
        boolean isWorkDay(){
        if(val<6)
        return true;
        else 
        return false;
    }
}
    
  
    public static void main(String[] args) {
      DayOfWeek Day;
      System.out.println("Vertification of Monday(isWorkDay())");
      System.out.println(DayOfWeek.Monday.isWorkDay());
      System.out.println("Vertification of Saturday(isWorkDay())");
      System.out.println(DayOfWeek.Saturday.isWorkDay());  
    }
}




    

