import java.util.*;

public class Elevator {
   
   Scanner scanner = new Scanner(System.in);
   
   String[] name; // 처음 엘리베이터 입장할때 사람의 이름을 입력받는 배열입니다.
   int [] weight; // 처음 엘리베이터 입장할때 사람의 몸무게를 입력받는 배열입니다.
   String[] name2; // 1층에서 3층 , 3층에서 1층 갈때 도중 2층에서 사람들이 탈때 입력받는 이름 배열입니다.
   int [] weight2; // 1층에서 3층 , 3층에서 1층 갈때 도중 2층에서 사람들이 탈때 입력받는 몸무게 배열입니다.
   int Password=0; // 1층 비밀번호를 입력받는 변수명 입니다.
   int sum=0 ; // 정원 초과문에 들어갈 처음에 엘리베이터에 입장한 사람들의 몸무게 합입니다.
   int sum2=0 ; //  정원 초과문에 들어갈 2층에서 사람이 추가로 탄 사람들의 몸무게 합입니다.
   int number=0; // 처음에 이름과 몸무게를 입력받을때 인원수를 물어봐 배열의 크기를 정하는 변수명입니다.
   int number2=0; // 2층에서 추가로 탔을때 인원수를 물어봐 배열의 크기를 정하는 변수명 입니다.
   
   public Elevator() {
}
   
   public Elevator(int Password) {
   
   this.Password = Password;
   } // Password 를 입력받을대 this 를 사용했습니다.
public void Tim() {
   System.out.println("▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽");
   System.out.println(" ");
   System.out.println("                                                   ☞Elevator☜  ");
   System.out.println("                                                   ");
   System.out.println("                    1534002 유지훈                                        ");
   System.out.println("                    1534019 김민창                                        ");
   System.out.println("                    1534037 원종호                                        ");
   System.out.println("                    1534039 박진우                                        ");
   System.out.println("");
   System.out.println("");
   System.out.println("▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△");
   pause(3000);
   System.out.println("많이 부족한 엘리베이터 이지만!!");
   pause(3000);
   System.out.println("좋게 봐주셨으면 좋겠습니다 ^^!!");
   pause(5000);
} // 처음에 저희의 조 학번과 이름을 설명하는 글 입니다!
   
public void clearScreen() {
   for (int i = 0; i < 10; i++)
         System.out.println("");
} // 처음 화면에서 저희 소개하고 프로젝트 시작전의 빈공간을 입력한 반복문입니다.
   
public void full() {
      for(int j = 0 ; j< weight.length ; j++) {
             sum += weight[j];
         }
          if(sum>=200) {
             System.out.println("정원 초과 입니다. 마지막에 탄사람은 내려주세요.");
          number=number-1;
          int i=number;
        while(true) {
            pause(3000);
               System.out.println(name[i]+"(이)가 내렸습니다.");
               pause(1000);
                sum=sum-weight[i];
              i--;  
                if(sum<200) {
                  
                   break;
                }
           }
       }

} // 첫번째 정원 초과문으로 몸무게가 200키로 이상 넘어가면 마지막에 탄 사람을 내리게 하는 입력문 입니다!

public void full2() {
    System.out.print("현재 입장할 인원수를 입력하세요.>>");   
      number2 = scanner.nextInt();
      
      name2 = new String[number2];
      weight2 = new int[number2];
      
      for(int i=0; i<number2 ;i++) {
         System.out.print("들어간 순서대로 이름을 입력해주세요.>>");
         String n2 = scanner.next();
         System.out.print("들어간 순서대로 몸무게를 입력해주세요.>>");
         int w2 = scanner.nextInt();
         name2[i]= n2;
         weight2[i]= w2;
         }
      
      for(int j = 0 ; j< weight2.length ; j++) {
             sum2 += weight2[j];
         }
      pause(1000);
     System.out.println("사람들이 엘리베이터 안으로 들어간다.");
    pause(2000);
     sum2=sum+sum2;
    if(sum2>=200) {
   number2=number2-1;
   int j=number2;
while(true) {
     System.out.println("정원 초과 입니다. 마지막에 탄사람은 내려주세요.");
     pause(3000);
        System.out.println(name2[j]+"(이)가 내렸습니다.");
        pause(1000);
         sum2=sum2-weight2[j];
       j--;  
         if(sum2<200) {
           
            break;
         }
    }
}  
    pause(1000);
  System.out.println("5초후 문이 닫힙니다");
  pause(5000);
  System.out.println("문이 닫혔습니다.");
} // 두번째 정원 초과 문으로 처음에 타고 있던 사람 + 중간에 탄사람의 무게를 더해 200 키로가 넘으면 
  // 마지막 탄 사람을 빼는 입력 문 입니다.

public void heterology() { 
   pause(1000);
   System.out.println("비상벨이 울립니다 왜에에에에!!!!!!!!");
   pause(1000);
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   pause(1000);
   System.out.println("비이이이이이사아아아아아아ㅇㅇㅇㅇ베에에에에에에에에에에레레레레레");
   pause(1000);
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   pause(1000);
   System.out.println("비이이이이이사아아아아아아ㅇㅇㅇㅇ베에에에에에에에에에에레레레레레");
   pause(1000);
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   pause(1000);
   System.out.println("비이이이이이사아아아아아아ㅇㅇㅇㅇ베에에에에에에에에에에레레레레레");
   pause(1000);
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   pause(1000);
   System.out.println("비이이이이이사아아아아아아ㅇㅇㅇㅇ베에에에에에에에에에에레레레레레");
   pause(1000);
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   pause(1000);
   System.out.println("비이이이이이사아아아아아아ㅇㅇㅇㅇ베에에에에에에에에에에레레레레레");
   pause(1000);
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   pause(1000);
   System.out.println("원인 모르는 이상현상이 발생했습니다.");
   pause(1000);
   System.out.println("1층으로 내려가 자동으로 문이 열립니다. 신속히 대피하십쇼.");
   pause(1000);
   System.exit(0);
   
} // 이상 현상이 나왔을때 나오는 문구 입니다!
   
public void sElevator() {
   
   System.out.print("당신이 원하는 비밀번호를 입력하세요.>>");
   Password = scanner.nextInt();
   System.out.print("현재 입장할 인원수를 입력하세요.>>");   
   number = scanner.nextInt();
   
   name = new String[number];
   weight = new int[number];
   
   for(int i=0; i<number ;i++) {
      System.out.print("들어간 순서대로 이름을 입력해주세요.>>");
      String n = scanner.next();
      System.out.print("들어간 순서대로 몸무게를 입력해주세요.>>");
      int w = scanner.nextInt();
      name[i]= n;
      weight[i]= w;
      }
} // 처음에 비밀번호를 입력하고, 들어갈 사람들의 인원과 그 인원의 배열을 생성해 이름과 몸무게를 집어넣는 것입니다.
   public void pause(int time) {
       try {
            Thread.sleep(time);
          } catch (InterruptedException e) { }
   } // 슬림 함수를 이용해 프린트문이 한번에 나오는걸 방지하는 함수입니다. 소스의 절반이 이 함수라고 해도 무관합니다... 헿...
   public void floor1(){ // 1층,2층,3층 에서 시작하는걸 따로 만들었는데 floor1은 1층에서 시작하는 문 입니다.
     Scanner scanner = new Scanner(System.in);
   
      for(int i=0; true ; i++) {
       System.out.print("1층입니다 비밀번호를 입력하세요 >> ");
       int Password2 = scanner.nextInt();
       if(Password2==Password)  {
          System.out.println("비밀번호가 맞습니다.");
          break;
       }
          else {
          System.out.print("비밀번호가 틀렸습니다. 다시 입력하겠습니까? Y,N >> ");
          String yn2 = scanner.next();
          if(yn2.equals("Y")) {
              
          }
              else{
                 System.out.print("당신은 VIP가 아니므로 쫒겨났습니다. ");
                 System.exit(0);
              }
          }
      } // 비밀번호를 입력해 맞으면 들어가고 틀리면 들어갈수 없게 만드는 것입니다.
      pause(1000);
      System.out.println("올라가는 버튼을 누른다.");
      pause(1000);
      System.out.print("엘리베이터가 1층에 있는가? Y/N>>  ");
      String yn3 = scanner.next();
      if(yn3.equals("Y")) {
         System.out.println("엘리베이터 문이 열린다.");
      } 
         else {
            System.out.println("현재 엘리베이터가 내려오는중입니다. 기다려주세요.");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("엘리베이터가 도착했습니다 문이 열립니다.");
            pause(1000);
            System.out.println("엘리베이터 문이 열린다.");
         } // 엘리베이터가 1층이면 바로 문이열리고 1층이아니면 엘리베이터가 내려오는 모션입니다.
      pause(2000);     
      System.out.println("엘리베이터에 들어간다.");
      pause(2000);
      
      full(); // 사람들이 엘리베이터에 들어가고 첫번째 정원초과문을 검사합니다.

      System.out.println("5초후 문이 닫힙니다");
      pause(5000);
      System.out.println("문이닫혔습니다");
      pause(1000);
      System.out.print("열림(1), 2층(2) , 3층(3) 무엇을 눌르겠습니까? ex)1,2,3 >> ");
      int floor1 = scanner.nextInt(); // 엘리베이터에 입장하고  2층,3층 열림 버튼 을 물어봅니다.
      switch (floor1){
      case 1:
         pause(1000);
         System.out.println("문이열립니다 안녕히 가십시오.");
         System.exit(0); // 1번은 열림 버튼으로 다시 열리는 버튼입니다.
         break;
      case 2:
         pause(1000);
         System.out.println("엘리베이터가 2층을향해 올라가는 중입니다.");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.print("엘리베이터에 이상현상이 일어났습니까? Y/N >> ");
         String yn4 = scanner.next();
         if(yn4.equals("Y")){
            
            heterology(); // 이상현상문을 불러옵니다.
         }
         else {
            pause(1000);
            System.out.println("2층에 도착했습니다. 5초동안 문이 열립니다.");
            pause(5000);
            System.out.println("문이 닫힙니다. 안녕히 가십시오.");
         }  
         System.exit(0);
         break; // 2 는 2층으로 올라가는 문으로 이상현상이 일어나면 이상현상 문을 불러오고
                // 그렇지 않으면 2층에 올라가서 문이 열립니다.
      case 3:
         pause(1000);
         System.out.println("엘리베이터가 3층을향해 올라가는 중입니다.");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("현재 엘리베이터가 2층에 도착했습니다.");
         pause(1000);
         System.out.print("바깥 2층 엘리베이터에서 올라가는 버튼을 눌렀습니까? Y/N >> ");
         String yn5 = scanner.next(); // 여기서 N 을 누르면 엘리베이터가 열리지 않고 계속 올라갑니다.
         if(yn5.equals("Y")) {
            pause(1000);
             System.out.println("엘리베이터가 2층에 정차후 문이열립니다.");
             pause(1000); 
             System.out.print("바깥쪽에서 엘리베이터 안으로 사람이 탔습니까? Y/N >> ");
             String yn6 = scanner.next(); // 문이 열리지만 탄 사람이없으면 다시 문이 닫히고 올라갑니다.
             if(yn6.equals("Y")) {
                  full2(); // 만약에 사람이 탔으면 두번째 정원초과문을 검사합니다.
             }
             else {
                pause(1000);
                 System.out.println("5초후 문이 닫힙니다");
                 pause(5000);
                 System.out.println("문이 닫혔습니다.");
                 }
             }
             else { 
            }

         pause(1000);
         System.out.println("엘리베이터가 3층을 향해 올라갑니다.");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
        System.out.println("3층에 도착했습니다. 5초동안 문이 열립니다.");
        pause(5000);
        System.out.println("문이 닫힙니다. 안녕히 가십시오.");
      
         break;     
      }
      } // 정원 초과문이 끝나면 문이 닫히고 올라갑니다.
   
   public void floor2(){ // 2층에서 시작하는 문입니다.
     Scanner scanner = new Scanner(System.in);
     pause(1000);
     System.out.println("버튼을 누른다.");
     pause(1000);
     System.out.print("엘리베이터가 2층에 있는가? Y/N>>  "); // 엘리베이터가 2층이아니면 올라가거나 내려옵니다.
      String yn7 = scanner.next();
      if(yn7.equals("Y")) {
         System.out.println("엘리베이터 문이 열린다.");
      }
         else {
            System.out.println("엘리베이터가 1층에 있는가?");
            String yn8 = scanner.next();
            if(yn8.equals("Y")) {
            System.out.println("현재 엘리베이터가 올라오는중입니다. 기다려주세요.");
            pause(1000);
            System.out.println("▲ ▲");
            pause(1000);
            System.out.println("▲ ▲");
            pause(1000);
            System.out.println("▲ ▲");
            pause(1000);
            System.out.println("엘리베이터가 도착했습니다 문이 열립니다.");
            pause(1000);
            System.out.println("엘리베이터 문이 열린다.");
            } // 엘리베이터가 1층에있으면 올라옵니다.
            else {
               System.out.println("현재 엘리베이터가 내려오는중입니다. 기다려주세요.");
                pause(1000);
                System.out.println("▼ ▼");
                pause(1000);
                System.out.println("▼ ▼");
                pause(1000);
                System.out.println("▼ ▼");
                pause(1000);
                System.out.println("엘리베이터가 도착했습니다 문이 열립니다.");
                pause(1000);
                System.out.println("엘리베이터 문이 열린다.");
            } // 엘리베이터가 3층에 있으면 내려 옵니다.
         }
      pause(2000);     
      System.out.println("엘리베이터에 들어간다.");
      pause(2000);
      
      full(); // 첫번째 정원 초과문을 실행합니다.
      
      System.out.println("5초후 문이 닫힙니다");
      pause(5000);
      System.out.println("문이닫혔습니다");
      pause(1000);
      System.out.print("1층(1), 열림(2) , 3층(3) 무엇을 눌르겠습니까? ex)1,2,3 >> ");
      int floor2 = scanner.nextInt();
      switch (floor2) { // 1을 눌르면 엘리베이터가 내려가고 2를 눌르면 문이 다시 열리며
      case 1:  			// 3을 눌르면 3층으로 올라갑니다.
         pause(1000);
         System.out.println("엘리베이터가 1층을향해 내려가는 중입니다.");
         pause(1000);
         System.out.println("▼ ▼");
         pause(1000);
         System.out.println("▼ ▼");
         pause(1000);
         System.out.println("▼ ▼");
         pause(1000);
         System.out.print("엘리베이터에 이상현상이 일어났습니까? Y/N >> ");
         String yn9 = scanner.next();
         if(yn9.equals("Y")){
            
            heterology(); // 이상현상 문입니다.
         }
         else {
            pause(1000);
            System.out.println("1층에 도착했습니다. 5초동안 문이 열립니다.");
            pause(5000);
            System.out.println("문이 닫힙니다. 안녕히 가십시오.");
         }  
         System.exit(0); // 도착하면 프로그램을 종료합니다/
            break;
      case 2:
         pause(1000);
         System.out.println("문이열립니다 안녕히 가십시오.");
         System.exit(0); 
         break;
      case 3:
         pause(1000);
         System.out.println("엘리베이터가 3층을향해 올라가는 중입니다.");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.println("▲ ▲");
         pause(1000);
         System.out.print("엘리베이터에 이상현상이 일어났습니까? Y/N >> ");
         String yn10 = scanner.next();
         if(yn10.equals("Y")){
            
            heterology(); // 이상현상 문입니다.
         }
         else {
            pause(1000);
            System.out.println("3층에 도착했습니다. 5초동안 문이 열립니다.");
            pause(5000);
            System.out.println("문이 닫힙니다. 안녕히 가십시오.");
         }  
         System.exit(0); // 도착하면 시스템이 종료합니다.
         break;
         }      
   }
   public void floor3(){ // 3층에서 시작하는 문입니다.
         System.out.println("내려가는 버튼을 누른다.");
         pause(1000);
         System.out.print("엘리베이터가 3층에 있는가? Y/N>>  ");
         String yn11 = scanner.next(); // 엘리베이터가 3층에 있지않으면 엘리베이터가 올라옵니다.
         if(yn11.equals("Y")) {
            System.out.println("엘리베이터 문이 열린다.");
         }
            else {
               System.out.println("현재 엘리베이터가 올라오는중입니다. 기다려주세요.");
               pause(1000);
               System.out.println("▲ ▲");
               pause(1000);
               System.out.println("▲ ▲");
               pause(1000);
               System.out.println("▲ ▲");
               pause(1000);
               System.out.println("엘리베이터가 도착했습니다 문이 열립니다.");
               pause(1000);
               System.out.println("엘리베이터 문이 열린다.");
            }
         pause(2000);     
         System.out.println("엘리베이터에 들어간다.");
         pause(2000);
         
         full(); // 첫번째 정원초과문입니다.

         System.out.println("5초후 문이 닫힙니다");
         pause(5000);
         System.out.println("문이닫혔습니다");
         pause(1000);
         System.out.print("1층(1), 2층(2) , 열림(3) 무엇을 눌르겠습니까? ex)1,2,3 >> ");
         int floor3 = scanner.nextInt();
         switch (floor3){ // 1을 입력하면 1층으로 2를 입력하면 2층으로 3을 입력하면 문이 열립니다.
         case 1 : // 엘리베이터가 1층으로 내려가는문입니다  .                                     
            pause(1000);
            System.out.println("엘리베이터가 1층을향해 내려가는 중입니다.");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("현재 엘리베이터가 2층에 도착했습니다.");
            pause(1000);
            System.out.print("바깥 2층 엘리베이터에서 내려가는 버튼을 눌렀습니까? Y/N >> ");
            String yn12 = scanner.next();
            if(yn12.equals("Y")) {
               pause(1000);
                System.out.println("엘리베이터가 2층에 정차후 문이열립니다.");
                pause(1000);
                System.out.print("바깥쪽에서 엘리베이터 안으로 사람이 탔습니까? Y/N >> ");
                String yn13 = scanner.next();
                if(yn13.equals("Y")) {
                   
                   full2(); // 중간에 2층에서 멈췄을대 사람이 추가로 타면 정원초과문을 검사한다.
                }
                else {
                   pause(1000);
                    System.out.println("5초후 문이 닫힙니다");
                    pause(5000);
                    System.out.println("문이 닫혔습니다.");
                    }
                }
                else { 
               }

            pause(1000);
            System.out.println("엘리베이터가 1층을 향해 내려갑니다.");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
           System.out.println("1층에 도착했습니다. 5초동안 문이 열립니다.");
           pause(5000);
           System.out.println("문이 닫힙니다. 안녕히 가십시오.");
    
            break;
         case 2: // 2층을 향해 내려가는 문이다.
            pause(1000);
            System.out.println("엘리베이터가 2층을향해 내려가는 중입니다.");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.println("▼ ▼");
            pause(1000);
            System.out.print("엘리베이터에 이상현상이 일어났습니까? Y/N >> ");
            String yn14 = scanner.next();
            if(yn14.equals("Y")){
               
               heterology(); //이상현상 문입니다.
            }
            else {
               pause(1000);
               System.out.println("2층에 도착했습니다. 5초동안 문이 열립니다.");
               pause(5000);
               System.out.println("문이 닫힙니다. 안녕히 가십시오.");
            }  
            System.exit(0); // 도착하면 시스템 종료한다.
            break;  
         case 3: // 3 열림버튼입니다.
            pause(1000);
            System.out.println("문이열립니다 안녕히 가십시오.");
            System.exit(0);
            break;     //다시 열림버튼 눌르면 나가는 문이다.
         }
      
   }
   
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
 
   Elevator m = new Elevator();
   
   m.Tim(); // 자기소개 하는문입니다.
   m.clearScreen(); // 자시소개후 공백입니다.

   m.sElevator(); // 처음 배열을 입력받는 문입니다.

   System.out.print("현재 몇층입니까? ex)1 , 2 , 3 ,퇴장(4)>> ");
   int floor = scanner.nextInt();
   switch (floor){ // 현재 몇층인지 물어보고 그층수에따라 실행 합니다.
   case 1:
      m.floor1();
      break;
   case 2:
      m.floor2();
      break;
   case 3:
      m.floor3();
      break;
   case 4: // 건물에 들어갈려다가 다시 나갈려고 했을때의 문을 따로 만들었습니다.
      m.pause(1000);
      System.out.println("몰래 침입하다가 걸린 당신!! 쫒겨났습니다!!!!!");
      m.pause(1000);
      System.out.println("다신 오지 마십시오!!!!!!!!!!!");
      m.pause(1000);
      System.out.println("빼엑@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      m.pause(1000);
      System.out.println("빼엑@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
         break;
      
   }  
   }
}