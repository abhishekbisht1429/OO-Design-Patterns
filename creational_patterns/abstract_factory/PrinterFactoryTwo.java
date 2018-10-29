class PrinterFactoryTwo implements PrinterFactory {
  @Override
  void createPrinter() {
    return new PrinterFromTwo();
  }
}
