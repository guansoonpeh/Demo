
public class MethodDemo {
    
    public static int sum(int x, int y){
        return x+y;
    }
    
    public static double sum(double x, double y){
        return x+y;
    }
    
    public static double sum(double... x){
        double result = 0;
        
        for(double temp: x){
            result+=temp;
        }
        
        return result;
    }
    
    public static void chg(int x){
        x=100;
    }
   
    public static void main(String[] args) {
       
         //double result = sum(1.0, 2.0, 3.0, 4.0, 5.0,5.5,20.2);
         int data =0;
         
         chg(data);
         
         System.out.println(data);
    }
    
}
