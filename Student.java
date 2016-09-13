class Student{  
  int rollno;  
  String name;  
  
  void insertRecord(int r, String n){  //method  
    rollno=r;  
    name=n;  
  }  
  
  void displayInformation(){System.out.println(rollno+" "+name);}//method  
  
  public static void main(String args[]){  
    Student s1=new Student();  
    Student s2=new Student();  
  
    s1.insertRecord(1,"Yatin");  
    s2.insertRecord(2,"ABC");  
  
    s1.displayInformation();  
    s2.displayInformation();  
  }  
}  
