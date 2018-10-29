class Client {
  PrinterFactory factory;

  Client(PrinterFactory factory) {
    this.factory = factory;
  }

  public void use() {
    Printer p = factory.createPrinter();
    p.print("AbstactFactory design pattern abstracts the implementation"
            +"from the client");
  }
}
