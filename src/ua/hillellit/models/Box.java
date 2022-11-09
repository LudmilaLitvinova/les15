package ua.hillellit.models;

import java.util.ArrayList;
import java.util.List;
import ua.hillellit.models.fruits.Fruit;

public class Box<T extends Fruit> {

  List<T> list = new ArrayList<>();
  float boxWeight;

  public void addFruit(T fruit) {
    if (fruit != null) {
      list.add(fruit);
      boxWeight += fruit.weight;
    }
  }

  public void addFruits(List<T> fruits) {
    if (fruits != null) {
      list.addAll(fruits);
      boxWeight += fruits.get(0).weight*fruits.size();
    }
  }

  public float getBoxWeight() {
    return boxWeight;
  }

  public boolean compare(Box box) {
    if (box != null) {
      return this.getBoxWeight() == box.getBoxWeight();
    }
    return false;
  }

  public void merge(Box<T> box) {
    if (box != null) {
      this.list.addAll(box.list);
      boxWeight += box.getBoxWeight();
      box.list.removeAll(list);
      box.boxWeight=0f;
    }
  }
}