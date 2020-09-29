class Main {
  public static void main(String[] args) {
    MyClass[] mc = new MyClass[10]; //10개의 MyClass형의 객체를 갖는 배열 선언

    for(int i = 0 ; i < 10 ; i++) {

      mc[i] = new MyClass();//MyClass클래스의 객체 생성
      System.out.println("MyClass Instance의 수:" + mc[0].getObjectNum() +"개");
      // MyClass 클래스의 getObjectNum()매서드 호출 object_num 변수 출력

    }
  }
}



// main() 앞에는 항상, 반드시 static 선언을 해야한다. 
// 왜? 

// static 기본 사용법은 
// static 데이터형 변수명;      static 반환형 매서드이름(변수들...)

// static 으로 선언된 변수, 매서드 객체와는 상관없이 호출할수 있다는 의미. 따라서 객체를 생성할 필요 없이 클래스 이름만으로도 사용할수 있다. 
//예를 들면 Math 클래스는 대부분 매서들 static으로 선언했기때문에 간단한 계산할 때 매번 객체를 생성할 필요없이 바로 사용가능하다. abs(절댓값)  static으로 선언이 되어 있기 때문에  int x = Math.abs(x);
// Math m = math();
// int x = m.abs(x);

// 1. static 매서드는 오직 static 변수만 사용할수 있다. 
// 2. static 매서드는 오직 같은 클래스 내에서의 static 매서드만 호출할 수 있다. 
// 3. static 매서드는 this 사용할수 없다. 
// 4. static 매서드와 일반 매서드는 오버라이딩 될 수 없다. 

// static은 특정한 인스턴스에 속하지 않는다. 
// 같은 클래스로 생성한 객체들이 값을 공유하고 싶을 때 사용할 수 있다. 
// 타 언어에서 전역변수의 역할로 사용되기도 한다. 
