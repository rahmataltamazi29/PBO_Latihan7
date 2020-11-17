class A {}
class B extends A {}
class C extends B {}

public class overload
{
void myOverload(A a)
{
System.out.println("Overload.myOverload(A a)");
}
void myOverload(C c)
{
System.out.println("Overload.myOverload(B b)");
}
public static void main(String[] args)
{
overload o = new overload();
C b = new C();
o.myOverload(b);
/*
*statement di atas akan menjalankan myOverload(B

b), karena

*method tersebut lebih "dekat" dengan method

yang dicari

*bila dibandingkan dengan myOverload(A a)
*/
}}