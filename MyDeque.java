public class MyDeque<E>{
  private E[] data;
  private int size, start, end;
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    size = 10;
    end = 9;
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
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
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
