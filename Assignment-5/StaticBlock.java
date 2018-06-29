class StaticBlock{
   static int num;
   static String str;
   static{
      num = 65;
      str = "Static Block";
   }
   
   static void print() {
       
       System.out.println("num : " + num + "\nstr : " + str);
   }
   
   public static void main(String args[])
   {
      print();
   }
}