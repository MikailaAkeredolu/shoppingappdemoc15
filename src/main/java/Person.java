public abstract class Person {
    //properties, instance variable, attributes, fields
    private String name;
    private Size size;

    public Person(String name, Size size ){
        this.name = name;
        this.size = size;
    }

    public abstract void printInfo(); //signatures

    //create a getter
    public String getName(){
        return this.name;
    }

    public Size getSize() {
        return size;
    }
}
