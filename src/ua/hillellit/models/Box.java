package ua.hillellit.models;

import java.util.ArrayList;
import java.util.List;
import ua.hillellit.models.fruits.Fruit;

public class Box <T extends  Fruit> {

  ArrayList<T> arrayList = new ArrayList<>();
  T fruit;

  public void addFruit(T fruit) {
      this.fruit=fruit;
      arrayList.add(fruit);
    }

  public void addFruits(List<T> fruits) {
    this.fruit = fruits.get(0);
    arrayList.addAll(fruits);
  }

  public float getWeight() {
    return arrayList.size() * fruit.weight;
  }

  public boolean compare(Box box) {
    return this.getWeight() == box.getWeight();
  }
  public void merge(Box<T>box){
    this.arrayList.addAll(box.arrayList);
  }
}
