package xceptionhandling;

class cal {
    int a;
    int b;

    public cal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    
public void div() throws Exception{
 
    int res = a/b;
  
    System.out.println(res);

}
}
public class thrownthrows {
    public static void main(String[] args) throws Exception{
        cal c = new cal(10, 0);
        c.div();
    }
}
