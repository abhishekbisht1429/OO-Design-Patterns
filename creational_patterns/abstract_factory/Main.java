class Main {
  public static void main(String[] args) {
    PrinterFactory factoryOne = new PrinterFactoryOne();
    PrinterFactory factoryTwo = new PrinterFactoryTwo();

    Client client1 = new Client(factoryOne);
    Client client2 = new Client(factoryTwo);

    client1.use();
    client2.use();
  }
}
