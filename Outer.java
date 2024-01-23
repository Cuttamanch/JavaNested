public class Outer{

static class Inner{
static void p(){
System.out.println("hi");}}

public static void main(String[] args){
Outer.Inner i=new Outer.Inner();
i.p();
}

}