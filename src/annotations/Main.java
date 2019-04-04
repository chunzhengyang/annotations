package annotations;

class SomeClass{
    void doStuff(){

    }
}

class AnotherClass extends SomeClass{
    @Override
    void doStuff(){
        System.out.println("Doing stuff");
    }

    // @Override // This is not allowed because there is no super.somethingElse
    void somethingElse(){

    }
}

public class Main {

    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.doStuff();
    }
}
