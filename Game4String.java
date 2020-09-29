class Main {
  public static void main(String[] args) {

    StringBuffer sb= new StringBuffer();

    sb.append('R');         // char형
    sb.append("ealty ");    // String형
    sb.append(2007);        // int형
    sb.append(' ');        
    sb.append(7.5);         // double형
    System.out.println(sb);


    
    sb.insert(6, ", B");    // String형
    sb.insert(9, 'C');      // char형
    System.out.println(sb);
  }
}



  
// String 매우 편리한 문자열 클래스
// 한번 저장된 내용은 문자열을 변경하거나 지우는 등의 직접 변동이 불가능하다.(우회는 가능, 새로운 변경된 문자열을 만드는 방법 )

//반면에 StringBuffer 는 현재의 문자열을 직접 동적으로 추가하거나 삽입하거나 삭제가 가능하기 때문에 편리하다.  
