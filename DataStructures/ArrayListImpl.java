public class ArrayListImpl<T> {
  Object[] arr = new Object[1];
  
  public ArrayListImpl(Object[] arr) {
    this.arr = arr;
  }
  
  public int size() {
    for (int i = 0 ; i < arr.length ; i ++ ) {
      if (arr[i] == null) {
        return i;
      }
    }
    return arr.length;
  }
  
  public void add(T obj) {
    int len = arr.length;
    for (int i = 0 ; i < len ; i ++ ) {
      if (arr[i] == null) {
        arr[i] = obj;
        return;
      }
    }
    Object[] tmp = new Object[2*len];
    for (int i = 0 ; i < len ; i ++ ) {
      tmp[i] = arr[i];
    }
    tmp[len] = obj;
    arr = tmp;
  } 
  
  public T get(int i) {
    int len = arr.length;
    if (i < 0 || i >= len) {
      return null;
    }
    return (T)arr[i];
  }
}
