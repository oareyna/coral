
class Animal{

    protected String name;
    Animal(String name){
        this.name = name;

    }
 
    public String speak(){
 
        return "*Generic Animal sound*";

    }
 


    public String toString() {
 
        return "Animal: " + this.name;

    }
 


    public boolean equals(Object o){

        if(o instanceof Animal){

            return true;

        }

        else{

            return false;

        }

    }

}
 
 
class Mammal extends Animal{

    protected boolean warmBlooded = true;
    protected String dietType;
    protected int numLegs;
    protected String sound;
 
    Mammal(String name, boolean warmBlooded, String dietType, int numLegs, String sound){

        super(name);
        this.warmBlooded = warmBlooded;
        this.dietType = dietType;
        this.numLegs = numLegs;
        this.sound = sound;

    }
 

    public String speak(){
 
        return this.name + ": "+ this.sound;

    }
 
    public void performTrick(){

        System.out.println(this.name + " is performing a trick.");

    }

}


class Dog extends Mammal{
 
    Dog(String name){
        super(name, true, "omnivore", 4, "Woof!");

    }


    public String speak(){
 
        return this.name + " says: " + this.sound;

    }
 

    public boolean equals(Object o){

        if(this.name == o && o.equals(this)){

            return true;

        }

        return false;

    }

}


class Cat extends Mammal{
 
    Cat(String name){
        super(name, true, "carnivore", 4, "Meow!");

    }


    public String speak(){
 
        return this.name + " says: " + this.sound;

    }

}


final class Human extends Mammal{
 
    Human(String name) {
        super(name, true, "omnivore", 2, "Hello!");

    }

}

class Reptile extends Animal{

    boolean warmblooded = false;
    int numLegs;
    String dietType;
    String sound;
 
    Reptile(String name, boolean warmblooded, int numLegs, String dietType, String sound){

        super(name);
        this.warmblooded = warmblooded;
        this.numLegs = numLegs;
        this.dietType = dietType;
        this.sound = sound;

    }


    public String speak(){
 
        return this.name + "'s sound: " + this.sound;

    }

}
 

class Animal_Kingdom {

    public static void main(String[] args) {

        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");
        System.out.println(a1.speak());
        System.out.println(a2.speak());
        System.out.println(a1.equals(new Dog("Buddy")));
        Mammal mammal = (Mammal) a1;
        mammal.performTrick();

    }

}
 
 


class Bird extends Animal{
 
 
    Bird(String name) {

        super(name);

    }


    public String speak(){

        return this.name + "'s sound: chirp!";

    }

}

// 2. Try to extend Human – what happens and why?
 
// I get the error: Cannot inherit from final 'Human'

// I believe error is because Human is the final class, which means that it can't have a subclass.

// It is a final version of that particular class. 3. Override equals() in cat or dog also check the type
 

 
