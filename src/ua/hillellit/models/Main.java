package ua.hillellit.models;

import java.util.ArrayList;
import java.util.List;
import ua.hillellit.models.fruits.Apple;
import ua.hillellit.models.fruits.Orange;
import ua.hillellit.models.parameterizedmethod.ParameterizedMethod;

public class Main {

  public static void main(String[] args) {
    Integer[] array = {1, 2, 3, 4, 5};
    ParameterizedMethod parameterizedMethod = new ParameterizedMethod();
    List<Integer> list = parameterizedMethod.convertToList(array);
    System.out.println(list);
    System.out.println("-------------------");

    Apple apl = new Apple();
    Orange orange = new Orange();
    ArrayList<Apple> fewApples = new ArrayList<>();
    fewApples.add(apl);
    fewApples.add(apl);

    Box<Apple> boxApple = new Box<>();
    Box<Orange> boxOrange = new Box<>();

    boxApple.addFruit(apl);
    boxApple.addFruit(apl);
    boxApple.addFruit(apl);
    boxApple.addFruit(apl);


    boxOrange.addFruit(orange);
    boxOrange.addFruit(orange);
    boxOrange.addFruit(orange);
    boxOrange.addFruit(orange);

    System.out.println("Вага яблук: " + boxApple.getBoxWeight());
    System.out.println("Вага апельсинів: " + boxOrange.getBoxWeight());
    System.out.println("Результати порівняння ваги: " + boxApple.compare(boxOrange));
    System.out.println("-------------------");

    boxApple.addFruits(fewApples);
    System.out.println("Вага яблук: " + boxApple.getBoxWeight());
    System.out.println("Вага апельсинів: " + boxOrange.getBoxWeight());
    System.out.println("Результати порівняння ваги: " + boxApple.compare(boxOrange));
    System.out.println("-------------------");

    Box<Apple> boxApple2 = new Box<>();
    boxApple2.addFruit(apl);
    System.out.println("Вага коробки до пересипання: " + boxApple2.getBoxWeight());
    System.out.println("Пересипаємо наступну вагу фруктів: " + boxApple.getBoxWeight());
    boxApple2.merge(boxApple);
    System.out.println("Вага коробки після пересипання: " + boxApple2.getBoxWeight());
  }
}