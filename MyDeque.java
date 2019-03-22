public class MyDeque<E>{
  private E[] data;
  private int size, start, end;
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }
  public int size(){
    return data.length;
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
      E[] dataTemp = new (E[])new Object[data.length + 1];
      for (int i = 0; i < data.length; i++){
        dataTemp[i + 1] = data[i];
      }
      dataTemp[start] = element;
      data = dataTemp;
      return;
    }
    if (start != 0 && end != start - 1){
      dataTemp
    }


  }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
