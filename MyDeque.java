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
        returnValue+= data[i];
        returnValue += " ";
      }
      returnValue+= data[end] + "}";
      }
    else{
      for (int i = start; i < end; i++){
        returnValue+= data[i];
        returnValue += " ";
      }
      returnValue+= data[end] + "}";
    }
    return returnValue;
  }
  @SuppressWarnings("unchecked")
  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException("Element is null");
    }
    if (start == 0 && end == data.length){
      resize();
    }
    if (size != 0 && start == 0){
      start = data.length - 1;
    }
    if (size != 0 && start != 0){
      start--;
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
}
