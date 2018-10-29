class PrinterFactoryOne implements PrinterFactory {
  @Override
  public Printer createPrinter() {
    return new PrinterFromOne();
  }
}
