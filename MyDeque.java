import java.util.*;
@SuppressWarnings("unchecked")
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    size = 0;
    end = 0;
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    size = 0;
    end = 0;
  }
  public int size(){
    return size;
  }
  public String toString(){
    String returnValue = "{";
    if (start>end){
      for (int i = start; i < data.length; i++){
        returnValue+= data[i];
        returnValue += " ";
      }
      for (int i = 0; i < end; i++){
        if(i == end - 1){
          returnValue+= data[end] + "}";
        }
        else{
        returnValue+= data[i];
        returnValue += " ";
      }
      }
    }
    else{
      for (int i = start; i < end; i++){
        if(i == end - 1){
          returnValue+= data[end] + "}";
        }
        else{
        returnValue+= data[i];
        returnValue += " ";
      }

      }

  }
  return returnValue;
}

  @SuppressWarnings("unchecked")
  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException("Element is null");
    }
    if (size() == data.length){
      resize();
    }
    if (size != 0){
      if (start == 0){
      start = data.length - 1;
    }
    else{
      start--;
    }
  }
    data[start] = element;
    size++;

  }

  public void addLast(E element){
    if (element == null) {
      throw new NullPointerException();
     }
    if (size == data.length ) {
      resize();
      }
    if (size!= 0 && end == data.length - 1){
      end = 0;
      }
    else{
      end++;
      }
    data[end] = element;
    size++;
     }
  public E removeFirst(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E returnValue = data[start];
    start++;
    size--;
    return returnValue;
   }
  public E removeLast(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E returnValue = data[end];
    end--;
    size--;
    return returnValue;
  }
  public E getFirst(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return data[start];
  }
  public E getLast(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return data[end];
  }
  public void resize() {
    E[] temp = (E[]) new Object[data.length * 2 + 1];
    int a = 0;
    for (int i = start; i < data.length && (start > end || (start <= end && i <= end)); i++) {
      temp[a] = data[i];
      a++;
    }
    if (start > end) {
      for (int i = 0; i <= end; i++) {
      temp[a] = data[i];
      a++;
     }
   }
    data = temp;
    start = 0;
    end = a;
}
  public static void main(String[] args) {
    MyDeque<Integer> Test1 = new MyDeque<>();
    for (int i = 0; i < 41; i+= 3) {
      Test1.addFirst(i);
    }
    System.out.println(Test1);
  }
}
