class Animal {
    String name;
    String species;
    String color;

    Animal(String name, String species, String color) {
        this.name = name;
        this.species = species;
        this.color = color;
    }

    void go() {
        System.out.println(name + " is moving.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
    }
}

class Herbivore extends Animal {
    String foodType;

    Herbivore(String name, String species, String color, String foodType) {
        super(name, species, color);
        this.foodType = foodType;
    }

    @Override
    void go() {
        System.out.println(name + " is grazing.");
    }
}

class Cow extends Herbivore {
    int milkQuantity;

    Cow(String name, String color, int milkQuantity) {
        super(name, "Cow", color, "Grass");
        this.milkQuantity = milkQuantity;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Food Type: " + foodType);
        System.out.println("Milk Quantity: " + milkQuantity + " liters");
    }
}

class Sheep extends Herbivore {
    int woolQuantity;

    Sheep(String name, String color, int woolQuantity) {
        super(name, "Sheep", color, "Grass");
        this.woolQuantity = woolQuantity;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Food Type: " + foodType);
        System.out.println("Wool Quantity: " + woolQuantity + " kg");
    }
}

class Carnivore extends Animal {
    String foodType;

    Carnivore(String name, String species, String color, String foodType) {
        super(name, species, color);
        this.foodType = foodType;
    }

    @Override
    void go() {
        System.out.println(name + " is hunting.");
    }
}

class Lion extends Carnivore {
    int speed;

    Lion(String name, String color, int speed) {
        super(name, "Lion", color, "Meat");
        this.speed = speed;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Food Type: " + foodType);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Tiger extends Carnivore {
    int strength;

    Tiger(String name, String color, int strength) {
        super(name, "Tiger", color, "Meat");
        this.strength = strength;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Food Type: " + foodType);
        System.out.println("Strength: " + strength + " units");
    }
}

class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Bessie", "White", 10);
        cow.display();
        cow.go();

        System.out.println();

        Sheep sheep = new Sheep("Shaun", "Black", 5);
        sheep.display();
        sheep.go();

        System.out.println();

        Lion lion = new Lion("Simba", "Golden", 60);
        lion.display();
        lion.go();

        System.out.println();

        Tiger tiger = new Tiger("Shere Khan", "Orange", 80);
        tiger.display();
        tiger.go();
    }
}
