//Main.java
class Main {
  public static void main(String[] args)
  {
    Manager mng= new Manager("김정아", 80000000, "기획실");

    mng.getInformation();
  }
}



// 상속은 객체지향의 3R 중에 재사용 Reusablity 보장하는 중요한 기능이다. 상속받는 자식 클래스 서브클래스 상속을 해주는 부모 클래스 슈퍼클래스 라고 한다. (자바용어) 

// 필요하다면 상속받아서 변형해서도 사용 가능하다. 

// // 자동차 - 전기자동차
//           - 경규자동차
//           - 휘발유자동차 - 경차
//                         -중형차
//                         -대형타


// 상속의 장점은 이미 만든 클래스와 중복되는 코드들을 또 다시 작성할 필요가 없어서 재 사용성이 높아진다. 이미 만들어서 사용되는 코드들은 테스트되고 검증된 코드이기 때문에 신뢰성이 높아져서 안전하다. 



//Employee.java
public class Employee
{
  String name;
  int salary;

  public Employee(String n, int s)
  {
    name= n;
    salary= s;
  }

  public void getInformation()
  {
    System.out.println("이름: "+ name +", 연봉: "+ salary);
  }
}


//Manager.java
public class Manager extends Employee
{
  String department;

  public Manager(String n, int s, String d)
  {
    super(n,s);
    department= d;
  }

  public void getInformation()
  {
    System.out.println("이름: "+ name +", 부서: "+ department +", 연봉: "+ salary);
  }
}

// c++에서는 여러개의 부모클라스로부터 상속이 가능하지만 자바에서는 오직 하나의 부모로부터만 상속 가능하다. 다중상속이 금지 된다. 
