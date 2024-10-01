class ConstructorO{
    String name;

    public ConstructorO(){
        this.name = "ConstructorO";
    }

    public ConstructorO(String name){
        this.name = name;
    }

    public static void main(String[] args){
        ConstructorO obj1 = new ConstructorO();
        ConstructorO obj2 = new ConstructorO("ConstructorO2");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}