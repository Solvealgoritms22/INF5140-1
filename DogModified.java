package animalshop;

public class DogModified {
//Declaraciones de campo de instancia
private String name;
private String breed;
private String barkNoise = "Woof";
private double weight;
private int age;
private double height;
private boolean isGoodBoy;
private int verbalCommandsAble;
private boolean hasTrick;

public DogModified(String name, String breed, String noise, double weight, int age, double height, boolean isGoodBoy, int verbalCommandsAble, boolean hasTrick) {
this.name = name;
this.breed = breed;
this.barkNoise = noise;
this.weight = weight;
this.age = age;
this.height = height;
this.isGoodBoy = isGoodBoy;
this.verbalCommandsAble = verbalCommandsAble;
this.hasTrick = hasTrick;
}

public String getName() {
return this.name;
}//fin del metodo getName

public void setName(String name) {
this.name = name;
}//fin del metodo setName

public String getBreed() {
return this.breed;
}//fin del metodo getBreed

public void setBreed(String breed) {
this.breed = breed;
}//fin del metodo setBreed

public double getWeight() {
return this.weight;
}//fin del metodo getWeight

public void setWeight(double weight) {
this.weight = weight;
}//fin del metodo setWeight

public int getAge() {
return this.age;
}//efin del metodo getAge

public void setAge(int age) {
this.age = age;
}//fin del metodo setAge

public double getHeight(){
return this.height;
}//fin del metodo getHeight

public void setHeight(double height){
this.height = height;
}//fin del metodo setHeight

public boolean getIsGoodBoy(){
return this.isGoodBoy;
}//fin del metodo getIsGoodBoy

public void setIsGoodBoy(boolean isGoodBoy){
this.isGoodBoy = isGoodBoy;
}//fin del metodo setIsGoodBoy

public int getVerbalCommandsAble(){
return this.verbalCommandsAble;
}//fin del metodo getVerbalCommandsAble

public void setVerbalCommandsAble(int verbalCommandsAble){
this.verbalCommandsAble = verbalCommandsAble;
}//fin del metodo setVerbalCommandsAble

public boolean getHasTrick(){
return this.hasTrick;
}//fin del metodo getHasTrick

public void setHasTrick(boolean hasTrick){
this.hasTrick = hasTrick;
}//fin del metodo setHasTrick

public void bark(){
System.out.println("Bark Noise: " + barkNoise + "\n");
}//fin del metodo bark

public void bark(String barkNoise){
System.out.println("Bark Noise: " + barkNoise + "\n");
}//fin del metodo bark

public static void main(String[] args) {
DogModified dog1 = new DogModified("Bailey", "Boerboel", "arf-arf", 80.2, 5, 20.7, true, 5, true);
System.out.println("\nName: " + dog1.getName() + "\n");
System.out.println("Weight: " + dog1.getWeight() + "\n");
System.out.println("Breed: " + dog1.getBreed() + "\n");
System.out.println("Age: " +dog1.getAge() + "\n");
System.out.println("Height: " + dog1.getHeight() + "\n");
System.out.println("Is a Good Boy?: " + dog1.getIsGoodBoy() + "\n");
System.out.println("Verbal Commands Able: " + dog1.getVerbalCommandsAble() + "\n"); 
System.out.println("Has Tricks? " + dog1.getHasTrick() + "\n");
dog1.bark();
}//fin del metodo main
}//fin de la clase perro