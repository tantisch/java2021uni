package hw9.Ex6_4;

class Lettuce extends Vegetable {
    Lettuce(){
        super("lettuce", 8);
    }

    @Override
    public String toString() {
        return name + ", calories: " + this.calories;
    }
}

class Tomato extends Vegetable {
    Tomato(){
        super("tomato", 4);
    }

    @Override
    public String toString() {
        return name + ", calories: " + this.calories;
    }
}

class Cucumber extends Vegetable {
    Cucumber(){
        super ("cucumber", 2);
    }

    @Override
    public String toString() {
        return name + ", calories: " + this.calories;
    }
}

class Root extends Vegetable {
    Root(){
        super("root", 5);
    }

    @Override
    public String toString() {
        return name + ", calories: " + this.calories;
    }
}