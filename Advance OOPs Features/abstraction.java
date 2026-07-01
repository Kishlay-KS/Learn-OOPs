abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    abstract void makeSound();
}

class Dog extends Animal {
    
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("The dog " + name + " says : Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("The cat " + name + " says : Meow!");
    }
}