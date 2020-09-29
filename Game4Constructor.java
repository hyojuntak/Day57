class Main {
  public static void main(String[] args) {

    Clock c = new Clock(10,55,16);
    c.printTime();  //Clock클래스의 printTime() 매서드를 호출

  }
}

class Clock {

  int hour;
  int min;
  int sec;

  //생성자
  public Clock(int h, int m, int s) {

    hour = h;
    min = m;
    sec = s;

  }

  public Clock() {


  }


  public void printTime() {

    System.out.println(hour + ":" + min + ":" + sec);
  }


}



// 클래스를 사용할 때 new명령어를 사용한다. 
// 클래스 이름 변수(s) = new 클래스이름 (인수들...)
// s를 통해서 클래스 내부로 접근
// 접근할때는 s.매써드     s.pop()

//생성자를 사용시 
//public 클래스이름 (매개변수들... { //명령어들 })
// 1 public 으로 선언   2 반환형은 없다

// 클래스를 정의하면서 생성자를 만들지 않을때,
// 자바가 기본 생성자를 만들어 준다.  기본 생성자는 클래스와 이름이 같고 인수는 받지 않는 ...아무일도 하지 않는 매서드를 만든다.  



/////////////////////////////////////////////////////////

//가비지 컬렉션
//c c++ 메모리 관리를 직접 즉 시스템 리소스를 반드시 프로그레머가 반환을 해줘야한다. 프로그레머에게 큰 부담
//그러나 자바는 알아서 스스로 해결한다. 
