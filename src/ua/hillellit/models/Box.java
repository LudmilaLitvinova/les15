package ua.hillellit.models;

import java.util.ArrayList;
import java.util.List;
import ua.hillellit.models.fruits.Fruit;

public class Box<T extends Fruit> {

  ArrayList<T> arrayList = new ArrayList<>();
  T fruit;

  public void addFruit(T fruit) {
    if (fruit != null) {
      this.fruit = fruit;
      arrayList.add(fruit);
    }
  }

  public void addFruits(List<T> fruits) {
    if (fruits != null) {
      this.fruit = fruits.get(0);
      arrayList.addAll(fruits);
    }
  }

  public float getWeight() {
    if (arrayList != null && fruit != null) {
      return arrayList.size() * fruit.weight;
    }
    return 0;
  }

  public boolean compare(Box box) {
    if (box != null) {
      return this.getWeight() == box.getWeight();
    }
    return false;
  }

  public void merge(Box<T> box) {
    if (box != null) {
      this.arrayList.addAll(box.arrayList);
    }
  }
}