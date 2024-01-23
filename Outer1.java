public class Outer1{

class Inner {
void print(int j){
System.out.println(j);
}
}

public static void main(String[] args){
Outer1 o=new Outer1();
Outer1.Inner i=o.new Inner();
i.print(10);
}
}