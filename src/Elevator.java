import java.util.*;

public class Elevator {
   
   Scanner scanner = new Scanner(System.in);
   
   String[] name; // ó�� ���������� �����Ҷ� ����� �̸��� �Է¹޴� �迭�Դϴ�.
   int [] weight; // ó�� ���������� �����Ҷ� ����� �����Ը� �Է¹޴� �迭�Դϴ�.
   String[] name2; // 1������ 3�� , 3������ 1�� ���� ���� 2������ ������� Ż�� �Է¹޴� �̸� �迭�Դϴ�.
   int [] weight2; // 1������ 3�� , 3������ 1�� ���� ���� 2������ ������� Ż�� �Է¹޴� ������ �迭�Դϴ�.
   int Password=0; // 1�� ��й�ȣ�� �Է¹޴� ������ �Դϴ�.
   int sum=0 ; // ���� �ʰ����� �� ó���� ���������Ϳ� ������ ������� ������ ���Դϴ�.
   int sum2=0 ; //  ���� �ʰ����� �� 2������ ����� �߰��� ź ������� ������ ���Դϴ�.
   int number=0; // ó���� �̸��� �����Ը� �Է¹����� �ο����� ����� �迭�� ũ�⸦ ���ϴ� �������Դϴ�.
   int number2=0; // 2������ �߰��� ������ �ο����� ����� �迭�� ũ�⸦ ���ϴ� ������ �Դϴ�.
   
   public Elevator() {
}
   
   public Elevator(int Password) {
   
   this.Password = Password;
   } // Password �� �Է¹����� this �� ����߽��ϴ�.
public void Tim() {
   System.out.println("�������������������������������������������");
   System.out.println(" ");
   System.out.println("                                                   ��Elevator��  ");
   System.out.println("                                                   ");
   System.out.println("                    1534002 ������                                        ");
   System.out.println("                    1534019 ���â                                        ");
   System.out.println("                    1534037 ����ȣ                                        ");
   System.out.println("                    1534039 ������                                        ");
   System.out.println("");
   System.out.println("");
   System.out.println("�������������������������������������������");
   pause(3000);
   System.out.println("���� ������ ���������� ������!!");
   pause(3000);
   System.out.println("���� ���ּ����� ���ڽ��ϴ� ^^!!");
   pause(5000);
} // ó���� ������ �� �й��� �̸��� �����ϴ� �� �Դϴ�!
   
public void clearScreen() {
   for (int i = 0; i < 10; i++)
         System.out.println("");
} // ó�� ȭ�鿡�� ���� �Ұ��ϰ� ������Ʈ �������� ������� �Է��� �ݺ����Դϴ�.
   
public void full() {
      for(int j = 0 ; j< weight.length ; j++) {
             sum += weight[j];
         }
          if(sum>=200) {
             System.out.println("���� �ʰ� �Դϴ�. �������� ź����� �����ּ���.");
          number=number-1;
          int i=number;
        while(true) {
            pause(3000);
               System.out.println(name[i]+"(��)�� ���Ƚ��ϴ�.");
               pause(1000);
                sum=sum-weight[i];
              i--;  
                if(sum<200) {
                  
                   break;
                }
           }
       }

} // ù��° ���� �ʰ������� �����԰� 200Ű�� �̻� �Ѿ�� �������� ź ����� ������ �ϴ� �Է¹� �Դϴ�!

public void full2() {
    System.out.print("���� ������ �ο����� �Է��ϼ���.>>");   
      number2 = scanner.nextInt();
      
      name2 = new String[number2];
      weight2 = new int[number2];
      
      for(int i=0; i<number2 ;i++) {
         System.out.print("�� ������� �̸��� �Է����ּ���.>>");
         String n2 = scanner.next();
         System.out.print("�� ������� �����Ը� �Է����ּ���.>>");
         int w2 = scanner.nextInt();
         name2[i]= n2;
         weight2[i]= w2;
         }
      
      for(int j = 0 ; j< weight2.length ; j++) {
             sum2 += weight2[j];
         }
      pause(1000);
     System.out.println("������� ���������� ������ ����.");
    pause(2000);
     sum2=sum+sum2;
    if(sum2>=200) {
   number2=number2-1;
   int j=number2;
while(true) {
     System.out.println("���� �ʰ� �Դϴ�. �������� ź����� �����ּ���.");
     pause(3000);
        System.out.println(name2[j]+"(��)�� ���Ƚ��ϴ�.");
        pause(1000);
         sum2=sum2-weight2[j];
       j--;  
         if(sum2<200) {
           
            break;
         }
    }
}  
    pause(1000);
  System.out.println("5���� ���� �����ϴ�");
  pause(5000);
  System.out.println("���� �������ϴ�.");
} // �ι�° ���� �ʰ� ������ ó���� Ÿ�� �ִ� ��� + �߰��� ź����� ���Ը� ���� 200 Ű�ΰ� ������ 
  // ������ ź ����� ���� �Է� �� �Դϴ�.

public void heterology() { 
   pause(1000);
   System.out.println("����� �︳�ϴ� �ֿ�������!!!!!!!!");
   pause(1000);
   System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
   pause(1000);
   System.out.println("�����������̻�ƾƾƾƾƾƤ���������������������������������������");
   pause(1000);
   System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
   pause(1000);
   System.out.println("�����������̻�ƾƾƾƾƾƤ���������������������������������������");
   pause(1000);
   System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
   pause(1000);
   System.out.println("�����������̻�ƾƾƾƾƾƤ���������������������������������������");
   pause(1000);
   System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
   pause(1000);
   System.out.println("�����������̻�ƾƾƾƾƾƤ���������������������������������������");
   pause(1000);
   System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
   pause(1000);
   System.out.println("�����������̻�ƾƾƾƾƾƤ���������������������������������������");
   pause(1000);
   System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
   pause(1000);
   System.out.println("���� �𸣴� �̻������� �߻��߽��ϴ�.");
   pause(1000);
   System.out.println("1������ ������ �ڵ����� ���� �����ϴ�. �ż��� �����Ͻʼ�.");
   pause(1000);
   System.exit(0);
   
} // �̻� ������ �������� ������ ���� �Դϴ�!
   
public void sElevator() {
   
   System.out.print("����� ���ϴ� ��й�ȣ�� �Է��ϼ���.>>");
   Password = scanner.nextInt();
   System.out.print("���� ������ �ο����� �Է��ϼ���.>>");   
   number = scanner.nextInt();
   
   name = new String[number];
   weight = new int[number];
   
   for(int i=0; i<number ;i++) {
      System.out.print("�� ������� �̸��� �Է����ּ���.>>");
      String n = scanner.next();
      System.out.print("�� ������� �����Ը� �Է����ּ���.>>");
      int w = scanner.nextInt();
      name[i]= n;
      weight[i]= w;
      }
} // ó���� ��й�ȣ�� �Է��ϰ�, �� ������� �ο��� �� �ο��� �迭�� ������ �̸��� �����Ը� ����ִ� ���Դϴ�.
   public void pause(int time) {
       try {
            Thread.sleep(time);
          } catch (InterruptedException e) { }
   } // ���� �Լ��� �̿��� ����Ʈ���� �ѹ��� �����°� �����ϴ� �Լ��Դϴ�. �ҽ��� ������ �� �Լ���� �ص� �����մϴ�... �m...
   public void floor1(){ // 1��,2��,3�� ���� �����ϴ°� ���� ������µ� floor1�� 1������ �����ϴ� �� �Դϴ�.
     Scanner scanner = new Scanner(System.in);
   
      for(int i=0; true ; i++) {
       System.out.print("1���Դϴ� ��й�ȣ�� �Է��ϼ��� >> ");
       int Password2 = scanner.nextInt();
       if(Password2==Password)  {
          System.out.println("��й�ȣ�� �½��ϴ�.");
          break;
       }
          else {
          System.out.print("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϰڽ��ϱ�? Y,N >> ");
          String yn2 = scanner.next();
          if(yn2.equals("Y")) {
              
          }
              else{
                 System.out.print("����� VIP�� �ƴϹǷ� �i�ܳ����ϴ�. ");
                 System.exit(0);
              }
          }
      } // ��й�ȣ�� �Է��� ������ ���� Ʋ���� ���� ���� ����� ���Դϴ�.
      pause(1000);
      System.out.println("�ö󰡴� ��ư�� ������.");
      pause(1000);
      System.out.print("���������Ͱ� 1���� �ִ°�? Y/N>>  ");
      String yn3 = scanner.next();
      if(yn3.equals("Y")) {
         System.out.println("���������� ���� ������.");
      } 
         else {
            System.out.println("���� ���������Ͱ� �����������Դϴ�. ��ٷ��ּ���.");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("���������Ͱ� �����߽��ϴ� ���� �����ϴ�.");
            pause(1000);
            System.out.println("���������� ���� ������.");
         } // ���������Ͱ� 1���̸� �ٷ� ���̿����� 1���̾ƴϸ� ���������Ͱ� �������� ����Դϴ�.
      pause(2000);     
      System.out.println("���������Ϳ� ����.");
      pause(2000);
      
      full(); // ������� ���������Ϳ� ���� ù��° �����ʰ����� �˻��մϴ�.

      System.out.println("5���� ���� �����ϴ�");
      pause(5000);
      System.out.println("���̴������ϴ�");
      pause(1000);
      System.out.print("����(1), 2��(2) , 3��(3) ������ �����ڽ��ϱ�? ex)1,2,3 >> ");
      int floor1 = scanner.nextInt(); // ���������Ϳ� �����ϰ�  2��,3�� ���� ��ư �� ����ϴ�.
      switch (floor1){
      case 1:
         pause(1000);
         System.out.println("���̿����ϴ� �ȳ��� ���ʽÿ�.");
         System.exit(0); // 1���� ���� ��ư���� �ٽ� ������ ��ư�Դϴ�.
         break;
      case 2:
         pause(1000);
         System.out.println("���������Ͱ� 2�������� �ö󰡴� ���Դϴ�.");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.print("���������Ϳ� �̻������� �Ͼ���ϱ�? Y/N >> ");
         String yn4 = scanner.next();
         if(yn4.equals("Y")){
            
            heterology(); // �̻������� �ҷ��ɴϴ�.
         }
         else {
            pause(1000);
            System.out.println("2���� �����߽��ϴ�. 5�ʵ��� ���� �����ϴ�.");
            pause(5000);
            System.out.println("���� �����ϴ�. �ȳ��� ���ʽÿ�.");
         }  
         System.exit(0);
         break; // 2 �� 2������ �ö󰡴� ������ �̻������� �Ͼ�� �̻����� ���� �ҷ�����
                // �׷��� ������ 2���� �ö󰡼� ���� �����ϴ�.
      case 3:
         pause(1000);
         System.out.println("���������Ͱ� 3�������� �ö󰡴� ���Դϴ�.");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("���� ���������Ͱ� 2���� �����߽��ϴ�.");
         pause(1000);
         System.out.print("�ٱ� 2�� ���������Ϳ��� �ö󰡴� ��ư�� �������ϱ�? Y/N >> ");
         String yn5 = scanner.next(); // ���⼭ N �� ������ ���������Ͱ� ������ �ʰ� ��� �ö󰩴ϴ�.
         if(yn5.equals("Y")) {
            pause(1000);
             System.out.println("���������Ͱ� 2���� ������ ���̿����ϴ�.");
             pause(1000); 
             System.out.print("�ٱ��ʿ��� ���������� ������ ����� �����ϱ�? Y/N >> ");
             String yn6 = scanner.next(); // ���� �������� ź ����̾����� �ٽ� ���� ������ �ö󰩴ϴ�.
             if(yn6.equals("Y")) {
                  full2(); // ���࿡ ����� ������ �ι�° �����ʰ����� �˻��մϴ�.
             }
             else {
                pause(1000);
                 System.out.println("5���� ���� �����ϴ�");
                 pause(5000);
                 System.out.println("���� �������ϴ�.");
                 }
             }
             else { 
            }

         pause(1000);
         System.out.println("���������Ͱ� 3���� ���� �ö󰩴ϴ�.");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
        System.out.println("3���� �����߽��ϴ�. 5�ʵ��� ���� �����ϴ�.");
        pause(5000);
        System.out.println("���� �����ϴ�. �ȳ��� ���ʽÿ�.");
      
         break;     
      }
      } // ���� �ʰ����� ������ ���� ������ �ö󰩴ϴ�.
   
   public void floor2(){ // 2������ �����ϴ� ���Դϴ�.
     Scanner scanner = new Scanner(System.in);
     pause(1000);
     System.out.println("��ư�� ������.");
     pause(1000);
     System.out.print("���������Ͱ� 2���� �ִ°�? Y/N>>  "); // ���������Ͱ� 2���̾ƴϸ� �ö󰡰ų� �����ɴϴ�.
      String yn7 = scanner.next();
      if(yn7.equals("Y")) {
         System.out.println("���������� ���� ������.");
      }
         else {
            System.out.println("���������Ͱ� 1���� �ִ°�?");
            String yn8 = scanner.next();
            if(yn8.equals("Y")) {
            System.out.println("���� ���������Ͱ� �ö�������Դϴ�. ��ٷ��ּ���.");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("���������Ͱ� �����߽��ϴ� ���� �����ϴ�.");
            pause(1000);
            System.out.println("���������� ���� ������.");
            } // ���������Ͱ� 1���������� �ö�ɴϴ�.
            else {
               System.out.println("���� ���������Ͱ� �����������Դϴ�. ��ٷ��ּ���.");
                pause(1000);
                System.out.println("�� ��");
                pause(1000);
                System.out.println("�� ��");
                pause(1000);
                System.out.println("�� ��");
                pause(1000);
                System.out.println("���������Ͱ� �����߽��ϴ� ���� �����ϴ�.");
                pause(1000);
                System.out.println("���������� ���� ������.");
            } // ���������Ͱ� 3���� ������ ���� �ɴϴ�.
         }
      pause(2000);     
      System.out.println("���������Ϳ� ����.");
      pause(2000);
      
      full(); // ù��° ���� �ʰ����� �����մϴ�.
      
      System.out.println("5���� ���� �����ϴ�");
      pause(5000);
      System.out.println("���̴������ϴ�");
      pause(1000);
      System.out.print("1��(1), ����(2) , 3��(3) ������ �����ڽ��ϱ�? ex)1,2,3 >> ");
      int floor2 = scanner.nextInt();
      switch (floor2) { // 1�� ������ ���������Ͱ� �������� 2�� ������ ���� �ٽ� ������
      case 1:  			// 3�� ������ 3������ �ö󰩴ϴ�.
         pause(1000);
         System.out.println("���������Ͱ� 1�������� �������� ���Դϴ�.");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.print("���������Ϳ� �̻������� �Ͼ���ϱ�? Y/N >> ");
         String yn9 = scanner.next();
         if(yn9.equals("Y")){
            
            heterology(); // �̻����� ���Դϴ�.
         }
         else {
            pause(1000);
            System.out.println("1���� �����߽��ϴ�. 5�ʵ��� ���� �����ϴ�.");
            pause(5000);
            System.out.println("���� �����ϴ�. �ȳ��� ���ʽÿ�.");
         }  
         System.exit(0); // �����ϸ� ���α׷��� �����մϴ�/
            break;
      case 2:
         pause(1000);
         System.out.println("���̿����ϴ� �ȳ��� ���ʽÿ�.");
         System.exit(0); 
         break;
      case 3:
         pause(1000);
         System.out.println("���������Ͱ� 3�������� �ö󰡴� ���Դϴ�.");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.println("�� ��");
         pause(1000);
         System.out.print("���������Ϳ� �̻������� �Ͼ���ϱ�? Y/N >> ");
         String yn10 = scanner.next();
         if(yn10.equals("Y")){
            
            heterology(); // �̻����� ���Դϴ�.
         }
         else {
            pause(1000);
            System.out.println("3���� �����߽��ϴ�. 5�ʵ��� ���� �����ϴ�.");
            pause(5000);
            System.out.println("���� �����ϴ�. �ȳ��� ���ʽÿ�.");
         }  
         System.exit(0); // �����ϸ� �ý����� �����մϴ�.
         break;
         }      
   }
   public void floor3(){ // 3������ �����ϴ� ���Դϴ�.
         System.out.println("�������� ��ư�� ������.");
         pause(1000);
         System.out.print("���������Ͱ� 3���� �ִ°�? Y/N>>  ");
         String yn11 = scanner.next(); // ���������Ͱ� 3���� ���������� ���������Ͱ� �ö�ɴϴ�.
         if(yn11.equals("Y")) {
            System.out.println("���������� ���� ������.");
         }
            else {
               System.out.println("���� ���������Ͱ� �ö�������Դϴ�. ��ٷ��ּ���.");
               pause(1000);
               System.out.println("�� ��");
               pause(1000);
               System.out.println("�� ��");
               pause(1000);
               System.out.println("�� ��");
               pause(1000);
               System.out.println("���������Ͱ� �����߽��ϴ� ���� �����ϴ�.");
               pause(1000);
               System.out.println("���������� ���� ������.");
            }
         pause(2000);     
         System.out.println("���������Ϳ� ����.");
         pause(2000);
         
         full(); // ù��° �����ʰ����Դϴ�.

         System.out.println("5���� ���� �����ϴ�");
         pause(5000);
         System.out.println("���̴������ϴ�");
         pause(1000);
         System.out.print("1��(1), 2��(2) , ����(3) ������ �����ڽ��ϱ�? ex)1,2,3 >> ");
         int floor3 = scanner.nextInt();
         switch (floor3){ // 1�� �Է��ϸ� 1������ 2�� �Է��ϸ� 2������ 3�� �Է��ϸ� ���� �����ϴ�.
         case 1 : // ���������Ͱ� 1������ �������¹��Դϴ�  .                                     
            pause(1000);
            System.out.println("���������Ͱ� 1�������� �������� ���Դϴ�.");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("���� ���������Ͱ� 2���� �����߽��ϴ�.");
            pause(1000);
            System.out.print("�ٱ� 2�� ���������Ϳ��� �������� ��ư�� �������ϱ�? Y/N >> ");
            String yn12 = scanner.next();
            if(yn12.equals("Y")) {
               pause(1000);
                System.out.println("���������Ͱ� 2���� ������ ���̿����ϴ�.");
                pause(1000);
                System.out.print("�ٱ��ʿ��� ���������� ������ ����� �����ϱ�? Y/N >> ");
                String yn13 = scanner.next();
                if(yn13.equals("Y")) {
                   
                   full2(); // �߰��� 2������ �������� ����� �߰��� Ÿ�� �����ʰ����� �˻��Ѵ�.
                }
                else {
                   pause(1000);
                    System.out.println("5���� ���� �����ϴ�");
                    pause(5000);
                    System.out.println("���� �������ϴ�.");
                    }
                }
                else { 
               }

            pause(1000);
            System.out.println("���������Ͱ� 1���� ���� �������ϴ�.");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
           System.out.println("1���� �����߽��ϴ�. 5�ʵ��� ���� �����ϴ�.");
           pause(5000);
           System.out.println("���� �����ϴ�. �ȳ��� ���ʽÿ�.");
    
            break;
         case 2: // 2���� ���� �������� ���̴�.
            pause(1000);
            System.out.println("���������Ͱ� 2�������� �������� ���Դϴ�.");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.println("�� ��");
            pause(1000);
            System.out.print("���������Ϳ� �̻������� �Ͼ���ϱ�? Y/N >> ");
            String yn14 = scanner.next();
            if(yn14.equals("Y")){
               
               heterology(); //�̻����� ���Դϴ�.
            }
            else {
               pause(1000);
               System.out.println("2���� �����߽��ϴ�. 5�ʵ��� ���� �����ϴ�.");
               pause(5000);
               System.out.println("���� �����ϴ�. �ȳ��� ���ʽÿ�.");
            }  
            System.exit(0); // �����ϸ� �ý��� �����Ѵ�.
            break;  
         case 3: // 3 ������ư�Դϴ�.
            pause(1000);
            System.out.println("���̿����ϴ� �ȳ��� ���ʽÿ�.");
            System.exit(0);
            break;     //�ٽ� ������ư ������ ������ ���̴�.
         }
      
   }
   
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
 
   Elevator m = new Elevator();
   
   m.Tim(); // �ڱ�Ұ� �ϴ¹��Դϴ�.
   m.clearScreen(); // �ڽüҰ��� �����Դϴ�.

   m.sElevator(); // ó�� �迭�� �Է¹޴� ���Դϴ�.

   System.out.print("���� �����Դϱ�? ex)1 , 2 , 3 ,����(4)>> ");
   int floor = scanner.nextInt();
   switch (floor){ // ���� �������� ����� ������������ ���� �մϴ�.
   case 1:
      m.floor1();
      break;
   case 2:
      m.floor2();
      break;
   case 3:
      m.floor3();
      break;
   case 4: // �ǹ��� �����ٰ� �ٽ� �������� �������� ���� ���� ��������ϴ�.
      m.pause(1000);
      System.out.println("���� ħ���ϴٰ� �ɸ� ���!! �i�ܳ����ϴ�!!!!!");
      m.pause(1000);
      System.out.println("�ٽ� ���� ���ʽÿ�!!!!!!!!!!!");
      m.pause(1000);
      System.out.println("����@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      m.pause(1000);
      System.out.println("����@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
         break;
      
   }  
   }
}