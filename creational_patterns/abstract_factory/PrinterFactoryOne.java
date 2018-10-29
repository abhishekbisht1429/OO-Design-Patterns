class PrinterFactoryOne implements PrinterFactory {
  @Override
  Printer createPrinter() {
    return new PrinterFactoryOne();
  }
}
