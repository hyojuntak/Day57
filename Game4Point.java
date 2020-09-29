class Main {
  public static void main(String[] args) {

    Point p = new Point;  // Point 클랙스의 객체 p 생성
    p.x = 10;             // Point 클래스의 객체 p (멤버)변수 x에 10을 저장
    p.y = 20;             // Point 클래스의 객체 p (멤버)변수 y에 20을 저장

  }
}

class Point  { // 클래스 정의


  int x;
  int y;

//매써드
public void printXY() {

  System.println("x = "+ x + "y = " + y);

}
}

// 객체지향 프로그래밍 (OOP Object Oriented Programming)
// OOP 3R 가독성(Readability):쉽게 알아볼수있고, 재사용성(Reuseablity), 신뢰성(Reliablity): 협업시 다른 프로그래머가 만든 내용에 대해
// 예전 -> 좋은프로그램 = 작은프로그램
// 지금 ->             !=                3R


// Class 클래스(책) = 변수(페이지수,제목, 가격) + 매서드(읽기,사기,쓰고....
// 클래스로 객체(인스턴스)를 생성,각각의 객체는 각각의 고유한 특성을 가진다.

// 
