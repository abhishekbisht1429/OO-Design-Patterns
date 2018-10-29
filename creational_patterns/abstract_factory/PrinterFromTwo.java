class PrinterFromTwo implements Printer {
  @Override
  void print(String string) {
    System.out.println(string);
    //add signature for Factory 2
    System.out.println("  - by Printer of Two");
  }
}
