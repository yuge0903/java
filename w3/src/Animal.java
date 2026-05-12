// Lớp cơ sở đại diện cho một con vật chung
class Animal {
    protected String name;
    protected String species;
    protected String color;

    // Constructor
    public Animal(String name, String species, String color) {
        this.name = name;
        this.species = species;
        this.color = color;
    }

    // Phương thức hiển thị thông tin chi tiết về động vật
    public void display() {
        System.out.println("Tên: " + name);
        System.out.println("Loài: " + species);
        System.out.println("Màu: " + color);
    }

    // Phương thức di chuyển của động vật
    public void go() {
        System.out.println("Cách di chuyển...");
    }
}

// Lớp con của lớp Animal đại diện cho động vật ăn cỏ
class Herbivore extends Animal {
    protected String foodType;

    // Constructor
    public Herbivore(String name, String species, String color, String foodType) {
        super(name, species, color);
        this.foodType = foodType;
    }

    // Override phương thức hiển thị thông tin chi tiết
    @Override
    public void display() {
        super.display();
        System.out.println("Loại thức ăn: " + foodType);
    }
}

// Lớp con của lớp Herbivore đại diện cho bò
class Cow extends Herbivore {
    private int milkQuantity;

    // Constructor
    public Cow(String name, String species, String color, String foodType, int milkQuantity) {
        super(name, species, color, foodType);
        this.milkQuantity = milkQuantity;
    }

    // Override phương thức hiển thị thông tin chi tiết
    @Override
    public void display() {
        super.display();
        System.out.println("số lượng sữa: " + milkQuantity);
    }
}

// Lớp con của lớp Herbivore đại diện cho cừu
class Sheep extends Herbivore {
    private int woolQuantity;

    // Constructor
    public Sheep(String name, String species, String color, String foodType, int woolQuantity) {
        super(name, species, color, foodType);
        this.woolQuantity = woolQuantity;
    }

    // Override phương thức hiển thị thông tin chi tiết
    @Override
    public void display() {
        super.display();
        System.out.println("số lượng lông: " + woolQuantity);
    }
}

// Lớp con của lớp Animal đại diện cho động vật ăn thịt
class Carnivore extends Animal {
    protected String foodType;

    // Constructor
    public Carnivore(String name, String species, String color, String foodType) {
        super(name, species, color);
        this.foodType = foodType;
    }

    // Override phương thức hiển thị thông tin chi tiết
    @Override
    public void display() {
        super.display();
        System.out.println("Loại thức ăn: " + foodType);
    }
}

// Lớp con của lớp Carnivore đại diện cho sư tử
class Lion extends Carnivore {
    private int speed;

    // Constructor
    public Lion(String name, String species, String color, String foodType, int speed) {
        super(name, species, color, foodType);
        this.speed = speed;
    }

    // Override phương thức hiển thị thông tin chi tiết
    @Override
    public void display() {
        super.display();
        System.out.println("Tốc độ: " + speed);
    }
}

// Lớp con của lớp Carnivore đại diện cho hổ
class Tiger extends Carnivore {
    private int strength;

    // Constructor
    public Tiger(String name, String species, String color, String foodType, int strength) {
        super(name, species, color, foodType);
        this.strength = strength;
    }

    // Override phương thức hiển thị thông tin chi tiết
    @Override
    public void display() {
        super.display();
        System.out.println("Sức mạnh: " + strength);
    }
}

class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng và hiển thị thông tin chi tiết
        Cow cow = new Cow("Wagyu", "Cow", "White", "Grass", 10);
        System.out.println("thông tin con bò:");
        cow.display();
        cow.go();
        System.out.println();

        Sheep sheep = new Sheep("Dolly", "Sheep", "Black", "Grass", 5);
        System.out.println("Thông tin con cừu:");
        sheep.display();
        sheep.go();
        System.out.println();

        Lion lion = new Lion("Simba", "Lion", "Golden", "Meat", 50);
        System.out.println("thông tin con sư tử:");
        lion.display();
        lion.go();
        System.out.println();

        Tiger tiger = new Tiger("COvid", "Tiger", "Orange", "Meat", 70);
        System.out.println("thông tin con hổ:");
        tiger.display();
        tiger.go();
    }
}

