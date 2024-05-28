

//Parent class
class Plane{

    public void planeFly(){
        System.out.println("Plane is flying");
    }
}

//Child class
class CargoPlane extends Plane{

    @Override
    public void planeFly(){
        System.out.println("Cargo plane is flying");
    }
}


class Annotations{
    public static void main(String[] args) {
        
    }
}