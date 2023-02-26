//package animalshop;
public class Dog {
//instance field declarations
private String name;
private String breed;
private String barkNoise = "Woof";
private double weight;

public Dog(String name, String breed, String noise, double weight) {
this.name = name;
this.breed = breed;
this.barkNoise = noise;
this.weight = weight;
}

public String getName() {
return this.name;
}//end method getName

public void setName(String name) {
this.name = name;
}//end method setName

public String getBreed() {
return this.breed;
}//end method getBreed

public void setBreed(String breed) {
this.breed = breed;
}//end method setBreed

public double getWeight() {
return this.weight;
}//end method getWeight

public void setWeight(double weight) {
this.weight = weight;
}//end method setWeight

public void bark(){
System.out.println("Bark Noise: " + barkNoise + "\n");
}//end method bark

public void bark(String barkNoise){
System.out.println("Bark Noise: " + barkNoise + "\n");
}//end method bark

public static void main(String[] args) {
Dog dog1 = new Dog("Bailey", "Boerboel", "arf-arf", 80.2);
System.out.println("Name: " + dog1.getName() + "\n");
System.out.println("Weight: " + dog1.getWeight() + "\n");
System.out.println("Breed: " + dog1.getBreed() + "\n");
dog1.bark();
}//end method main

}//end class Dog