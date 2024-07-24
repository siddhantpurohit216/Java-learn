abstract class ParentClass{  
    abstract void print(String s);  
    
  public void printFun(String s)
  {
      System.out.println("Header");
      print(s);
      System.out.println("Footer");    }
}