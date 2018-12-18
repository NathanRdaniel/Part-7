
public class Firefly{


    public Firefly( double x, double y, double z ){
        x =  (double )(Math. random() * 10.0 + -10.0);
        y =  (double )(Math. random() * 10.0 + -10.0);
        z =  (double )(Math. random() * 10.0 + -10.0);
    }

    public double getX()  {return x;}
    public double getY()  {return y;}
    public double getZ()  {return z;}
    
    }
class Move
{ 

    public Move(double x, double y, double z){  
         x =  (double )(Math. random() * 1.0 + -1.0);
         y =  (double )(Math. random() * 1.0 + -1.0);
         z =  (double )(Math. random() * 1.0 + -1.0);
    }
}