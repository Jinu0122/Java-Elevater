import java.util.*;

public class Elevator {
   
   Scanner scanner = new Scanner(System.in);
   
   String[] name; // 坦製 燭軒今戚斗 脊舌拝凶 紫寓税 戚硯聖 脊径閤澗 壕伸脊艦陥.
   int [] weight; // 坦製 燭軒今戚斗 脊舌拝凶 紫寓税 倖巷惟研 脊径閤澗 壕伸脊艦陥.
   String[] name2; // 1寵拭辞 3寵 , 3寵拭辞 1寵 哀凶 亀掻 2寵拭辞 紫寓級戚 纏凶 脊径閤澗 戚硯 壕伸脊艦陥.
   int [] weight2; // 1寵拭辞 3寵 , 3寵拭辞 1寵 哀凶 亀掻 2寵拭辞 紫寓級戚 纏凶 脊径閤澗 倖巷惟 壕伸脊艦陥.
   int Password=0; // 1寵 搾腔腰硲研 脊径閤澗 痕呪誤 脊艦陥.
   int sum=0 ; // 舛据 段引庚拭 級嬢哀 坦製拭 燭軒今戚斗拭 脊舌廃 紫寓級税 倖巷惟 杯脊艦陥.
   int sum2=0 ; //  舛据 段引庚拭 級嬢哀 2寵拭辞 紫寓戚 蓄亜稽 添 紫寓級税 倖巷惟 杯脊艦陥.
   int number=0; // 坦製拭 戚硯引 倖巷惟研 脊径閤聖凶 昔据呪研 弘嬢坐 壕伸税 滴奄研 舛馬澗 痕呪誤脊艦陥.
   int number2=0; // 2寵拭辞 蓄亜稽 点聖凶 昔据呪研 弘嬢坐 壕伸税 滴奄研 舛馬澗 痕呪誤 脊艦陥.
   
   public Elevator() {
}
   
   public Elevator(int Password) {
   
   this.Password = Password;
   } // Password 研 脊径閤聖企 this 研 紫遂梅柔艦陥.
public void Tim() {
   System.out.println("≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞≦＞");
   System.out.println(" ");
   System.out.println("                                                   ��Elevator∃  ");
   System.out.println("                                                   ");
   System.out.println("                    1534002 政走汎                                        ");
   System.out.println("                    1534019 沿肯但                                        ");
   System.out.println("                    1534037 据曽硲                                        ");
   System.out.println("                    1534039 酵遭酔                                        ");
   System.out.println("");
   System.out.println("");
   System.out.println("＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠＜≠");
   pause(3000);
   System.out.println("弦戚 採膳廃 燭軒今戚斗 戚走幻!!");
   pause(3000);
   System.out.println("疏惟 坐爽写生檎 疏畏柔艦陥 ^^!!");
   pause(5000);
} // 坦製拭 煽費税 繕 俳腰引 戚硯聖 竺誤馬澗 越 脊艦陥!
   
public void clearScreen() {
   for (int i = 0; i < 10; i++)
         System.out.println("");
} // 坦製 鉢檎拭辞 煽費 社鯵馬壱 覗稽詮闘 獣拙穿税 朔因娃聖 脊径廃 鋼差庚脊艦陥.
   
public void full() {
      for(int j = 0 ; j< weight.length ; j++) {
             sum += weight[j];
         }
          if(sum>=200) {
             System.out.println("舛据 段引 脊艦陥. 原走厳拭 添紫寓精 鎧形爽室推.");
          number=number-1;
          int i=number;
        while(true) {
            pause(3000);
               System.out.println(name[i]+"(戚)亜 鎧携柔艦陥.");
               pause(1000);
                sum=sum-weight[i];
              i--;  
                if(sum<200) {
                  
                   break;
                }
           }
       }

} // 湛腰属 舛据 段引庚生稽 倖巷惟亜 200徹稽 戚雌 角嬢亜檎 原走厳拭 添 紫寓聖 鎧軒惟 馬澗 脊径庚 脊艦陥!

public void full2() {
    System.out.print("薄仙 脊舌拝 昔据呪研 脊径馬室推.>>");   
      number2 = scanner.nextInt();
      
      name2 = new String[number2];
      weight2 = new int[number2];
      
      for(int i=0; i<number2 ;i++) {
         System.out.print("級嬢娃 授辞企稽 戚硯聖 脊径背爽室推.>>");
         String n2 = scanner.next();
         System.out.print("級嬢娃 授辞企稽 倖巷惟研 脊径背爽室推.>>");
         int w2 = scanner.nextInt();
         name2[i]= n2;
         weight2[i]= w2;
         }
      
      for(int j = 0 ; j< weight2.length ; j++) {
             sum2 += weight2[j];
         }
      pause(1000);
     System.out.println("紫寓級戚 燭軒今戚斗 照生稽 級嬢娃陥.");
    pause(2000);
     sum2=sum+sum2;
    if(sum2>=200) {
   number2=number2-1;
   int j=number2;
while(true) {
     System.out.println("舛据 段引 脊艦陥. 原走厳拭 添紫寓精 鎧形爽室推.");
     pause(3000);
        System.out.println(name2[j]+"(戚)亜 鎧携柔艦陥.");
        pause(1000);
         sum2=sum2-weight2[j];
       j--;  
         if(sum2<200) {
           
            break;
         }
    }
}  
    pause(1000);
  System.out.println("5段板 庚戚 丸琵艦陥");
  pause(5000);
  System.out.println("庚戚 丸縛柔艦陥.");
} // 砧腰属 舛据 段引 庚生稽 坦製拭 展壱 赤揮 紫寓 + 掻娃拭 添紫寓税 巷惟研 希背 200 徹稽亜 角生檎 
  // 原走厳 添 紫寓聖 皐澗 脊径 庚 脊艦陥.

public void heterology() { 
   pause(1000);
   System.out.println("搾雌婚戚 随験艦陥 訊拭拭拭拭!!!!!!!!");
   pause(1000);
   System.out.println("【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【");
   pause(1000);
   System.out.println("搾戚戚戚戚戚紫焼焼焼焼焼焼しししし今拭拭拭拭拭拭拭拭拭拭傾傾傾傾傾");
   pause(1000);
   System.out.println("【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【");
   pause(1000);
   System.out.println("搾戚戚戚戚戚紫焼焼焼焼焼焼しししし今拭拭拭拭拭拭拭拭拭拭傾傾傾傾傾");
   pause(1000);
   System.out.println("【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【");
   pause(1000);
   System.out.println("搾戚戚戚戚戚紫焼焼焼焼焼焼しししし今拭拭拭拭拭拭拭拭拭拭傾傾傾傾傾");
   pause(1000);
   System.out.println("【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【");
   pause(1000);
   System.out.println("搾戚戚戚戚戚紫焼焼焼焼焼焼しししし今拭拭拭拭拭拭拭拭拭拭傾傾傾傾傾");
   pause(1000);
   System.out.println("【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【");
   pause(1000);
   System.out.println("搾戚戚戚戚戚紫焼焼焼焼焼焼しししし今拭拭拭拭拭拭拭拭拭拭傾傾傾傾傾");
   pause(1000);
   System.out.println("【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【");
   pause(1000);
   System.out.println("据昔 乞牽澗 戚雌薄雌戚 降持梅柔艦陥.");
   pause(1000);
   System.out.println("1寵生稽 鎧形亜 切疑生稽 庚戚 伸験艦陥. 重紗備 企杷馬淑珠.");
   pause(1000);
   System.exit(0);
   
} // 戚雌 薄雌戚 蟹尽聖凶 蟹神澗 庚姥 脊艦陥!
   
public void sElevator() {
   
   System.out.print("雁重戚 据馬澗 搾腔腰硲研 脊径馬室推.>>");
   Password = scanner.nextInt();
   System.out.print("薄仙 脊舌拝 昔据呪研 脊径馬室推.>>");   
   number = scanner.nextInt();
   
   name = new String[number];
   weight = new int[number];
   
   for(int i=0; i<number ;i++) {
      System.out.print("級嬢娃 授辞企稽 戚硯聖 脊径背爽室推.>>");
      String n = scanner.next();
      System.out.print("級嬢娃 授辞企稽 倖巷惟研 脊径背爽室推.>>");
      int w = scanner.nextInt();
      name[i]= n;
      weight[i]= w;
      }
} // 坦製拭 搾腔腰硲研 脊径馬壱, 級嬢哀 紫寓級税 昔据引 益 昔据税 壕伸聖 持失背 戚硯引 倖巷惟研 増嬢隔澗 依脊艦陥.
   public void pause(int time) {
       try {
            Thread.sleep(time);
          } catch (InterruptedException e) { }
   } // 十顕 敗呪研 戚遂背 覗鍵闘庚戚 廃腰拭 蟹神澗杏 号走馬澗 敗呪脊艦陥. 社什税 箭鋼戚 戚 敗呪虞壱 背亀 巷淫杯艦陥... �m...
   public void floor1(){ // 1寵,2寵,3寵 拭辞 獣拙馬澗杏 魚稽 幻級醸澗汽 floor1精 1寵拭辞 獣拙馬澗 庚 脊艦陥.
     Scanner scanner = new Scanner(System.in);
   
      for(int i=0; true ; i++) {
       System.out.print("1寵脊艦陥 搾腔腰硲研 脊径馬室推 >> ");
       int Password2 = scanner.nextInt();
       if(Password2==Password)  {
          System.out.println("搾腔腰硲亜 限柔艦陥.");
          break;
       }
          else {
          System.out.print("搾腔腰硲亜 堂携柔艦陥. 陥獣 脊径馬畏柔艦猿? Y,N >> ");
          String yn2 = scanner.next();
          if(yn2.equals("Y")) {
              
          }
              else{
                 System.out.print("雁重精 VIP亜 焼艦糠稽 �i移概柔艦陥. ");
                 System.exit(0);
              }
          }
      } // 搾腔腰硲研 脊径背 限生檎 級嬢亜壱 堂軒檎 級嬢哀呪 蒸惟 幻球澗 依脊艦陥.
      pause(1000);
      System.out.println("臣虞亜澗 獄動聖 刊献陥.");
      pause(1000);
      System.out.print("燭軒今戚斗亜 1寵拭 赤澗亜? Y/N>>  ");
      String yn3 = scanner.next();
      if(yn3.equals("Y")) {
         System.out.println("燭軒今戚斗 庚戚 伸鍵陥.");
      } 
         else {
            System.out.println("薄仙 燭軒今戚斗亜 鎧形神澗掻脊艦陥. 奄陥形爽室推.");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("燭軒今戚斗亜 亀鐸梅柔艦陥 庚戚 伸験艦陥.");
            pause(1000);
            System.out.println("燭軒今戚斗 庚戚 伸鍵陥.");
         } // 燭軒今戚斗亜 1寵戚檎 郊稽 庚戚伸軒壱 1寵戚焼艦檎 燭軒今戚斗亜 鎧形神澗 乞芝脊艦陥.
      pause(2000);     
      System.out.println("燭軒今戚斗拭 級嬢娃陥.");
      pause(2000);
      
      full(); // 紫寓級戚 燭軒今戚斗拭 級嬢亜壱 湛腰属 舛据段引庚聖 伊紫杯艦陥.

      System.out.println("5段板 庚戚 丸琵艦陥");
      pause(5000);
      System.out.println("庚戚丸縛柔艦陥");
      pause(1000);
      System.out.print("伸顕(1), 2寵(2) , 3寵(3) 巷譲聖 喚牽畏柔艦猿? ex)1,2,3 >> ");
      int floor1 = scanner.nextInt(); // 燭軒今戚斗拭 脊舌馬壱  2寵,3寵 伸顕 獄動 聖 弘嬢詐艦陥.
      switch (floor1){
      case 1:
         pause(1000);
         System.out.println("庚戚伸験艦陥 照括備 亜淑獣神.");
         System.exit(0); // 1腰精 伸顕 獄動生稽 陥獣 伸軒澗 獄動脊艦陥.
         break;
      case 2:
         pause(1000);
         System.out.println("燭軒今戚斗亜 2寵聖狽背 臣虞亜澗 掻脊艦陥.");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.print("燭軒今戚斗拭 戚雌薄雌戚 析嬢概柔艦猿? Y/N >> ");
         String yn4 = scanner.next();
         if(yn4.equals("Y")){
            
            heterology(); // 戚雌薄雌庚聖 災君辛艦陥.
         }
         else {
            pause(1000);
            System.out.println("2寵拭 亀鐸梅柔艦陥. 5段疑照 庚戚 伸験艦陥.");
            pause(5000);
            System.out.println("庚戚 丸琵艦陥. 照括備 亜淑獣神.");
         }  
         System.exit(0);
         break; // 2 澗 2寵生稽 臣虞亜澗 庚生稽 戚雌薄雌戚 析嬢蟹檎 戚雌薄雌 庚聖 災君神壱
                // 益係走 省生檎 2寵拭 臣虞亜辞 庚戚 伸験艦陥.
      case 3:
         pause(1000);
         System.out.println("燭軒今戚斗亜 3寵聖狽背 臣虞亜澗 掻脊艦陥.");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("薄仙 燭軒今戚斗亜 2寵拭 亀鐸梅柔艦陥.");
         pause(1000);
         System.out.print("郊甥 2寵 燭軒今戚斗拭辞 臣虞亜澗 獄動聖 喚袈柔艦猿? Y/N >> ");
         String yn5 = scanner.next(); // 食奄辞 N 聖 刊牽檎 燭軒今戚斗亜 伸軒走 省壱 域紗 臣虞逢艦陥.
         if(yn5.equals("Y")) {
            pause(1000);
             System.out.println("燭軒今戚斗亜 2寵拭 舛託板 庚戚伸験艦陥.");
             pause(1000); 
             System.out.print("郊甥楕拭辞 燭軒今戚斗 照生稽 紫寓戚 点柔艦猿? Y/N >> ");
             String yn6 = scanner.next(); // 庚戚 伸軒走幻 添 紫寓戚蒸生檎 陥獣 庚戚 丸備壱 臣虞逢艦陥.
             if(yn6.equals("Y")) {
                  full2(); // 幻鉦拭 紫寓戚 点生檎 砧腰属 舛据段引庚聖 伊紫杯艦陥.
             }
             else {
                pause(1000);
                 System.out.println("5段板 庚戚 丸琵艦陥");
                 pause(5000);
                 System.out.println("庚戚 丸縛柔艦陥.");
                 }
             }
             else { 
            }

         pause(1000);
         System.out.println("燭軒今戚斗亜 3寵聖 狽背 臣虞逢艦陥.");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
        System.out.println("3寵拭 亀鐸梅柔艦陥. 5段疑照 庚戚 伸験艦陥.");
        pause(5000);
        System.out.println("庚戚 丸琵艦陥. 照括備 亜淑獣神.");
      
         break;     
      }
      } // 舛据 段引庚戚 魁蟹檎 庚戚 丸備壱 臣虞逢艦陥.
   
   public void floor2(){ // 2寵拭辞 獣拙馬澗 庚脊艦陥.
     Scanner scanner = new Scanner(System.in);
     pause(1000);
     System.out.println("獄動聖 刊献陥.");
     pause(1000);
     System.out.print("燭軒今戚斗亜 2寵拭 赤澗亜? Y/N>>  "); // 燭軒今戚斗亜 2寵戚焼艦檎 臣虞亜暗蟹 鎧形辛艦陥.
      String yn7 = scanner.next();
      if(yn7.equals("Y")) {
         System.out.println("燭軒今戚斗 庚戚 伸鍵陥.");
      }
         else {
            System.out.println("燭軒今戚斗亜 1寵拭 赤澗亜?");
            String yn8 = scanner.next();
            if(yn8.equals("Y")) {
            System.out.println("薄仙 燭軒今戚斗亜 臣虞神澗掻脊艦陥. 奄陥形爽室推.");
            pause(1000);
            System.out.println("＜ ＜");
            pause(1000);
            System.out.println("＜ ＜");
            pause(1000);
            System.out.println("＜ ＜");
            pause(1000);
            System.out.println("燭軒今戚斗亜 亀鐸梅柔艦陥 庚戚 伸験艦陥.");
            pause(1000);
            System.out.println("燭軒今戚斗 庚戚 伸鍵陥.");
            } // 燭軒今戚斗亜 1寵拭赤生檎 臣虞辛艦陥.
            else {
               System.out.println("薄仙 燭軒今戚斗亜 鎧形神澗掻脊艦陥. 奄陥形爽室推.");
                pause(1000);
                System.out.println("≦ ≦");
                pause(1000);
                System.out.println("≦ ≦");
                pause(1000);
                System.out.println("≦ ≦");
                pause(1000);
                System.out.println("燭軒今戚斗亜 亀鐸梅柔艦陥 庚戚 伸験艦陥.");
                pause(1000);
                System.out.println("燭軒今戚斗 庚戚 伸鍵陥.");
            } // 燭軒今戚斗亜 3寵拭 赤生檎 鎧形 辛艦陥.
         }
      pause(2000);     
      System.out.println("燭軒今戚斗拭 級嬢娃陥.");
      pause(2000);
      
      full(); // 湛腰属 舛据 段引庚聖 叔楳杯艦陥.
      
      System.out.println("5段板 庚戚 丸琵艦陥");
      pause(5000);
      System.out.println("庚戚丸縛柔艦陥");
      pause(1000);
      System.out.print("1寵(1), 伸顕(2) , 3寵(3) 巷譲聖 喚牽畏柔艦猿? ex)1,2,3 >> ");
      int floor2 = scanner.nextInt();
      switch (floor2) { // 1聖 喚牽檎 燭軒今戚斗亜 鎧形亜壱 2研 喚牽檎 庚戚 陥獣 伸軒悟
      case 1:  			// 3聖 喚牽檎 3寵生稽 臣虞逢艦陥.
         pause(1000);
         System.out.println("燭軒今戚斗亜 1寵聖狽背 鎧形亜澗 掻脊艦陥.");
         pause(1000);
         System.out.println("≦ ≦");
         pause(1000);
         System.out.println("≦ ≦");
         pause(1000);
         System.out.println("≦ ≦");
         pause(1000);
         System.out.print("燭軒今戚斗拭 戚雌薄雌戚 析嬢概柔艦猿? Y/N >> ");
         String yn9 = scanner.next();
         if(yn9.equals("Y")){
            
            heterology(); // 戚雌薄雌 庚脊艦陥.
         }
         else {
            pause(1000);
            System.out.println("1寵拭 亀鐸梅柔艦陥. 5段疑照 庚戚 伸験艦陥.");
            pause(5000);
            System.out.println("庚戚 丸琵艦陥. 照括備 亜淑獣神.");
         }  
         System.exit(0); // 亀鐸馬檎 覗稽益轡聖 曽戟杯艦陥/
            break;
      case 2:
         pause(1000);
         System.out.println("庚戚伸験艦陥 照括備 亜淑獣神.");
         System.exit(0); 
         break;
      case 3:
         pause(1000);
         System.out.println("燭軒今戚斗亜 3寵聖狽背 臣虞亜澗 掻脊艦陥.");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.println("＜ ＜");
         pause(1000);
         System.out.print("燭軒今戚斗拭 戚雌薄雌戚 析嬢概柔艦猿? Y/N >> ");
         String yn10 = scanner.next();
         if(yn10.equals("Y")){
            
            heterology(); // 戚雌薄雌 庚脊艦陥.
         }
         else {
            pause(1000);
            System.out.println("3寵拭 亀鐸梅柔艦陥. 5段疑照 庚戚 伸験艦陥.");
            pause(5000);
            System.out.println("庚戚 丸琵艦陥. 照括備 亜淑獣神.");
         }  
         System.exit(0); // 亀鐸馬檎 獣什奴戚 曽戟杯艦陥.
         break;
         }      
   }
   public void floor3(){ // 3寵拭辞 獣拙馬澗 庚脊艦陥.
         System.out.println("鎧形亜澗 獄動聖 刊献陥.");
         pause(1000);
         System.out.print("燭軒今戚斗亜 3寵拭 赤澗亜? Y/N>>  ");
         String yn11 = scanner.next(); // 燭軒今戚斗亜 3寵拭 赤走省生檎 燭軒今戚斗亜 臣虞辛艦陥.
         if(yn11.equals("Y")) {
            System.out.println("燭軒今戚斗 庚戚 伸鍵陥.");
         }
            else {
               System.out.println("薄仙 燭軒今戚斗亜 臣虞神澗掻脊艦陥. 奄陥形爽室推.");
               pause(1000);
               System.out.println("＜ ＜");
               pause(1000);
               System.out.println("＜ ＜");
               pause(1000);
               System.out.println("＜ ＜");
               pause(1000);
               System.out.println("燭軒今戚斗亜 亀鐸梅柔艦陥 庚戚 伸験艦陥.");
               pause(1000);
               System.out.println("燭軒今戚斗 庚戚 伸鍵陥.");
            }
         pause(2000);     
         System.out.println("燭軒今戚斗拭 級嬢娃陥.");
         pause(2000);
         
         full(); // 湛腰属 舛据段引庚脊艦陥.

         System.out.println("5段板 庚戚 丸琵艦陥");
         pause(5000);
         System.out.println("庚戚丸縛柔艦陥");
         pause(1000);
         System.out.print("1寵(1), 2寵(2) , 伸顕(3) 巷譲聖 喚牽畏柔艦猿? ex)1,2,3 >> ");
         int floor3 = scanner.nextInt();
         switch (floor3){ // 1聖 脊径馬檎 1寵生稽 2研 脊径馬檎 2寵生稽 3聖 脊径馬檎 庚戚 伸験艦陥.
         case 1 : // 燭軒今戚斗亜 1寵生稽 鎧形亜澗庚脊艦陥  .                                     
            pause(1000);
            System.out.println("燭軒今戚斗亜 1寵聖狽背 鎧形亜澗 掻脊艦陥.");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("薄仙 燭軒今戚斗亜 2寵拭 亀鐸梅柔艦陥.");
            pause(1000);
            System.out.print("郊甥 2寵 燭軒今戚斗拭辞 鎧形亜澗 獄動聖 喚袈柔艦猿? Y/N >> ");
            String yn12 = scanner.next();
            if(yn12.equals("Y")) {
               pause(1000);
                System.out.println("燭軒今戚斗亜 2寵拭 舛託板 庚戚伸験艦陥.");
                pause(1000);
                System.out.print("郊甥楕拭辞 燭軒今戚斗 照生稽 紫寓戚 点柔艦猿? Y/N >> ");
                String yn13 = scanner.next();
                if(yn13.equals("Y")) {
                   
                   full2(); // 掻娃拭 2寵拭辞 誇宙聖企 紫寓戚 蓄亜稽 展檎 舛据段引庚聖 伊紫廃陥.
                }
                else {
                   pause(1000);
                    System.out.println("5段板 庚戚 丸琵艦陥");
                    pause(5000);
                    System.out.println("庚戚 丸縛柔艦陥.");
                    }
                }
                else { 
               }

            pause(1000);
            System.out.println("燭軒今戚斗亜 1寵聖 狽背 鎧形逢艦陥.");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
           System.out.println("1寵拭 亀鐸梅柔艦陥. 5段疑照 庚戚 伸験艦陥.");
           pause(5000);
           System.out.println("庚戚 丸琵艦陥. 照括備 亜淑獣神.");
    
            break;
         case 2: // 2寵聖 狽背 鎧形亜澗 庚戚陥.
            pause(1000);
            System.out.println("燭軒今戚斗亜 2寵聖狽背 鎧形亜澗 掻脊艦陥.");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.println("≦ ≦");
            pause(1000);
            System.out.print("燭軒今戚斗拭 戚雌薄雌戚 析嬢概柔艦猿? Y/N >> ");
            String yn14 = scanner.next();
            if(yn14.equals("Y")){
               
               heterology(); //戚雌薄雌 庚脊艦陥.
            }
            else {
               pause(1000);
               System.out.println("2寵拭 亀鐸梅柔艦陥. 5段疑照 庚戚 伸験艦陥.");
               pause(5000);
               System.out.println("庚戚 丸琵艦陥. 照括備 亜淑獣神.");
            }  
            System.exit(0); // 亀鐸馬檎 獣什奴 曽戟廃陥.
            break;  
         case 3: // 3 伸顕獄動脊艦陥.
            pause(1000);
            System.out.println("庚戚伸験艦陥 照括備 亜淑獣神.");
            System.exit(0);
            break;     //陥獣 伸顕獄動 喚牽檎 蟹亜澗 庚戚陥.
         }
      
   }
   
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
 
   Elevator m = new Elevator();
   
   m.Tim(); // 切奄社鯵 馬澗庚脊艦陥.
   m.clearScreen(); // 切獣社鯵板 因拷脊艦陥.

   m.sElevator(); // 坦製 壕伸聖 脊径閤澗 庚脊艦陥.

   System.out.print("薄仙 護寵脊艦猿? ex)1 , 2 , 3 ,盗舌(4)>> ");
   int floor = scanner.nextInt();
   switch (floor){ // 薄仙 護寵昔走 弘嬢左壱 益寵呪拭魚虞 叔楳 杯艦陥.
   case 1:
      m.floor1();
      break;
   case 2:
      m.floor2();
      break;
   case 3:
      m.floor3();
      break;
   case 4: // 闇弘拭 級嬢哀形陥亜 陥獣 蟹哀形壱 梅聖凶税 庚聖 魚稽 幻級醸柔艦陥.
      m.pause(1000);
      System.out.println("侯掘 徴脊馬陥亜 杏鍵 雁重!! �i移概柔艦陥!!!!!");
      m.pause(1000);
      System.out.println("陥重 神走 原淑獣神!!!!!!!!!!!");
      m.pause(1000);
      System.out.println("皐植@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      m.pause(1000);
      System.out.println("皐植@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
         break;
      
   }  
   }
}