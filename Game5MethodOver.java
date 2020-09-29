//Main.java
public class Main
{
  public static void main(String[] args)
  {
    Dog yourDog= new Dog("벤지", 4);

    yourDog.bark();
    yourDog.bite("우체부");


    Snoopy myDog= new Snoopy();

    myDog.bark(); // 메소드 오버라이딩
    myDog.bite("낸시", 9); // 메소드 오버로딩
  }
}


//  자바에서는 인수의 개수나 종류가 다르기만 하면 얼마든지 같은 이름의 매서드 생성이 가능하다. 이것을 매서드 오버로딩 한다. 이와 비슷하지만 다른 개념인 매서드 오버라이딩 MethodOverriding에서도 클래스의 상속에서 일어나는 다형성의 한 종류이다. 

//Dog.java

public class Dog
{
  String dog_name;
  int dog_age;


// 생성자 

  public Dog(String name, int age)
  {
    dog_name= name;
    dog_age= age;
  }

  public void bite()
  {
    System.out.println(dog_name +"가 아무도 물지 않았습니다.");
  }

  public void bite(String name)
  {
    System.out.println(dog_name +"가 "+ name +"을 물었습니다.");
  }

  public void bark()
  {
    System.out.println("멍멍");
  }
}



//Snoopy.java
public class Snoopy extends Dog
{
  public Snoopy()
  {
    super("스누피", 3);
  }

  public void bite(String name, int age)
  {
    System.out.println(dog_name +"가 문 "+ name +"는 "+ age +"살입니다. (메소드 오버로딩)");
  }

  public void bark()
  {
    System.out.println("안녕하세요, "+ dog_name +"입니다. (메소드 오버라이딩)");
  }
}




