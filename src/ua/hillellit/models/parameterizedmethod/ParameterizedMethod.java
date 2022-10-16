package ua.hillellit.models.parameterizedmethod;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {

  public <T> List<T> convertToList(T[] array) {
    List<T> list = new ArrayList<>();

    for (T i : array) {
      list.add(i);
    }
    return list;
  }
}
