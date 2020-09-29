//Main.java
public class Main
{
  public static void main(String[] args)
  {
    D d= new D();
    E e= new E();
    F f= new F();

    //d.a= 500;  //외부 클래스에서 접근 가능
    //e.b= 500;  //private은 외부 클래스에서 접근 불가능
     f.c= 500;  //protected 는 외부 클래스에서 접근 불가능

    //d.method_A();
    // e.method_B();
     f.method_C();

    d.method_D();//외부 클래스에서 접근 가능
    e.method_E();//외부 클래스에서 접근 가능
    f.method_F();//외부 클래스에서 접근 가능

    //System.out.println("a = "+ d.a);
     //System.out.println("b = "+ e.b);
     System.out.println("c = "+ f.c);
  }
}

//A.java
public class A
{
  public int a;

  public void method_A()
  {
    a= 100;
  }
}


// public 은 가장 일반적인 접근제어자. public 으로 선언된 변수, 매서드 등은 어떠한 자바 프로그램에서든 제한없이 접근 사용가능, 다른 클래서에서 얼마든 상속받거나 접근 가능하다. 
// 특히 생성자는 반드시 public을 사용해야만 한다.

//B.java
public class B
{
  private int b;

  private void method_B()
  {
    b= 200;
  }
}


//private 가장 폐쇄적인 접근제어자이다. private으로 선언된 변수, 매서드 등은 해당 클래스 내에만 사용 가능하다. 다른 클래스로 부터 보호하고 싶은 변수, 매서드 앞에 사용한다. 
// 실제 프로그래머들이 private을 사용하는 주된 이유는 이후에 변경할 가능성이 있을때 사용하게 된다. 

//C.java
public class C
{
  protected int c;

  protected void method_C()
  {
    c= 300;
  }
}


// protected 상속을 위한 접근 제어자. protected선언된 변수, 매서드 등은 해당 클래스를 상속받은 서브클래스에게만 public 동작하고 서브클래스가 아닌 클래스들에게는 private으로 동작한다. 즉, 서브클래스와 자기자신클래스에서만 사용 가능하다. 

//D.java
public class D extends A
{
  public void method_D()
  {
    method_A();
  }
}

//E.java
public class E extends B
{
  public void method_E()
  {
    // method_B();
  }
}


// B private

//F.java
public class F extends C
{
  public void method_F()
  {
    method_C();
  }
}
// c -> protected



