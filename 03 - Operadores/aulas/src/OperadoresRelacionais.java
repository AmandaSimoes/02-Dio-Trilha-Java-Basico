public class OperadoresRelacionais {
    public static void main(String[] args) {
      
        int i1 = 10;
        int i2 = 20;
        System.out.println ("10 == 20 " + (i1 == i2));
        System.out.println ("10 != 20 " + (i1 != i2));
        System.out.println ("10 > 20 " + (i1 > i2));
        System.out.println ("10 <= 20 " + (i1 <= i2));
      

        float f1 = 4.5f;
        float f2 = 3.5f;
        System.out.println ("4.5 == 3.5 " + (f1 == f2));
        System.out.println ("4.5 != 3.5 " + (f1 != f2));
        System.out.println ("4.5 > 3.5 " + (f1 > f2));
        System.out.println ("4.5 <= 3.5 " + (f1 <= f2));

        String s1 = "fulano";
        String s2 = "fulano";
        String s3 = "Ciclano";
        System.out.println ("Fulano == fulano " + (s1 == s2));
        System.out.println ("Fulano == Ciclano " + (s1 == s3));
        System.out.println ("Fulano != Fulano " + (s1 != s2));
        System.out.println ("Fulano != Ciclano " + (s1 != s3));

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        System.out.println ("true == false " + (b1 == b2));
        System.out.println ("true != false " + (b1 != b2));
        System.out.println ("true != false " + (b1 != b3));

        long l1 = 1597l;
        long l2 = 8997l;
        System.out.println ("1597 == 8997 " + (l1 == l2));
        System.out.println ("1597 != 8997 " + (l1 != l2));
        System.out.println ("1597 > 8997 " + (l1 > l2));
        System.out.println ("1597 <= 8997 " + (l1 <= l2));

        

        
        
  
    }
        
    
    
}