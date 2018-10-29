class PrinterFactoryTwo implements PrinterFactory {
  @Override
  public Printer createPrinter() {
    return new PrinterFromTwo();
  }
}
