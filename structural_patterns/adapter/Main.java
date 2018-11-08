class Main {
  public static void main(String[] args) {
    int i = -45;
    long l = 34322352345L;
    BytetoBinary btb = new BytetoBinary();
    PrimitiveAdapter pmAdapter = new PrimitiveAdapter(btb);
    /* BytetoBinary cannot convert the int and long types directly to binary
       so an Adapter class has been defined named 'PrimitiveAdapter'
       which provides a suitable interface for the client to use
    */
    String bin1,bin2;
    bin1 = pmAdapter.convert(i);
    bin2 = pmAdapter.convert(l);

    System.out.println("Binary representation(2's complement form) of "+i+" (datatype - int) :\n"+bin1);
    System.out.println();
    System.out.println("Binary representation(2's complement form) of "+l+" (datatype - long) :\n"+bin2);
  }
}
