package org.example;

public class Cats {

    String Breed;
    int Age;
    double Weight;

    Cats(){
    }

    Cats(String Breed_, int Age_, double Weight_){
        Breed = Breed_;
        Age = Age_;
        Weight = Weight_;
    }

    public void Miau(){
        System.out.println("Miiaauu!");
    }

}
