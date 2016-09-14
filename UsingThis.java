class UsingThis{  
    
    int id;  
    String name;  
    String city;  
      
    UsingThis(int id,String name){  
        this.id = id;  //parameter (formal arguments) and instance variables are same that is why we are using this keyword to distinguish between local variable and instance variable.
        this.name = name;  
    }  
    
    UsingThis(int id,String name,String city){  
        this(id,name);//now no need to initialize id and name  
        this.city=city;  
    }  
    
    void display(){
        System.out.println(id+" "+name+" "+city);
    }  
      
    public static void main(String args[]){  
        UsingThis e1 = new UsingThis(1,"Yatin");  
        UsingThis e2 = new UsingThis(2,"ABC","Delhi");  
        e1.display();  
        e2.display();  
   }  
}  