class Farmer {
    String name;
    Farm f;
    Animal a;

    Farmer(String name, Farm f, Animal a) {
        this.name = name;
        this.f = f;
        this.a = a;
    }

    void showFarmer() {
        System.out.println("Farmer Name: " + name);
        f.showFarm();
        System.out.println();
        a.showAnimal();
    }
}

class Farm {
    String location;
    Crop c;

    Farm(String location, Crop c) {
        this.location = location;
        this.c = c;
    }

    void showFarm() {
        System.out.println("Farm Location: " + location);
        System.out.println();
        c.showCrop();
    }
}

class Crop {
    String cropName;
    Harvest h;

    Crop(String cropName, Harvest h) {
        this.cropName = cropName;
        this.h = h;
    }

    void showCrop() {
        System.out.println("Crop Name is " + cropName + " harvest upto "+ h.showHarvest());

    }
}

class VegetableCrop extends Crop {
    VegetableCrop(String cropName, Harvest h) {
        super(cropName, h);
    }
    void showVegetableCrop() {
        System.out.println("This is a Vegetable Crop: " + cropName);
    }
}

class FruitCrop extends Crop {
    FruitCrop(String cropName, Harvest h) {
        super(cropName, h);
    }
    void showFruitCrop() {
        System.out.println("This is a Fruit Crop: " + cropName);
    }
}

class Animal {
    String animalType;

    Animal(String animalType) {
        this.animalType = animalType;
    }

    void showAnimal() {
        System.out.println("Animal Type is " + animalType);
    }
}

class Cow extends Animal {
    Milk m;

    Cow(String animalType, Milk m) {
        super(animalType);
        this.m = m;
    }

    void showCow()
    {
        System.out.println(m.showMilk());
    }
}

class Chicken extends Animal {
    Chicken(String animalType) {
        super(animalType);
    }

    void showChicken() {
        System.out.println("This is a Chicken.");
    }
}

class Milk {
    int quantity;

    Milk(int quantity) {
        this.quantity = quantity;
    }

    String showMilk() {
        return "Milk Produced: " + quantity + " liters";
    }
}

class Harvest {
    int quantity;

    Harvest(int quantity) {
        this.quantity = quantity;
    }

    String showHarvest() {
        return quantity + " kg";
    }
}

public class Farming {
    public static void main(String[] args) {
        Harvest wheatHarvest = new Harvest(500);
        Crop wheatCrop = new Crop("Wheat", wheatHarvest);
        Farm farm = new Farm("Dharapuram", wheatCrop);

        Milk cowMilk = new Milk(50);
        Cow cow = new Cow("Cow", cowMilk);

        Farmer farmer = new Farmer("Aravinth", farm, cow);
        farmer.showFarmer();
        cow.showCow();

        System.out.println();
        Harvest tomatoHarvest = new Harvest(200);
        VegetableCrop tomatoes = new VegetableCrop("Tomatoes", tomatoHarvest);
        tomatoes.showVegetableCrop();
        tomatoes.showCrop();

        System.out.println();
        Harvest mangoHarvest = new Harvest(300);
        FruitCrop mangoes = new FruitCrop("Mangoes", mangoHarvest);
        mangoes.showFruitCrop();
        mangoes.showCrop();

        System.out.println();
        Chicken chicken = new Chicken("Chicken");
        chicken.showChicken();
    }
}
