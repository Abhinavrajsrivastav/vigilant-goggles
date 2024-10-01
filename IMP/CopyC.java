public class CopyC {
    String name;
    int age;

    public CopyC(String name , int age){
      this.name = name;
      this.age = age;
    }

    public CopyC(CopyC obj){
     this.name = obj.name;
     this.age = obj.age;
    }

    public static void main(String[] args) {
        CopyC a = new CopyC("Arun",20);
        //actual data of object a...
        System.out.println("Actual Object data...");
        System.out.println(a);
        
        System.out.println("Copy Object Data...");
        CopyC b = new CopyC(a);
        System.out.println(b);
    }

    @Override
    public String toString(){
        return "name "+name+" age "+age;
    }
}
