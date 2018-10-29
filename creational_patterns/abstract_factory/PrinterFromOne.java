class PrinterFromOne implements Printer {
  @Override
  public void print(String string) {
    System.out.println(string);
    //add the signature at the end of the message
    System.out.println("  -by Printer from Factory One");
  }
}
