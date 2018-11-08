public class PrimitiveAdapter {
  BytetoBinary btb;
  PrimitiveAdapter(BytetoBinary btb) {
    this.btb = btb;
  }
  public String convert(int val) {
    int bitmask = 0x000000FF;
    String binary = "";
    int typeSize = 4;
    for(int i=0;i<typeSize;++i) {
      int temp = bitmask & val; // temp will store the bits after masking
      bitmask = bitmask<<BytetoBinary.BYTE_SIZE;
      /* Shift the bits to the right side so that BytetoBinary.convert can convert
         it to binary representation */
      temp = temp>>>(i*BytetoBinary.BYTE_SIZE);

      //append the binary representation of the converted byte
      binary=btb.convert((short)temp)+" "+binary;
    }
    return binary;
  }

  public String convert(long val) {
    long bitmask = 0x00000000000000FF;
    String binary = "";
    int typeSize = 8;
    for(int i=0;i<typeSize;++i) {
      long temp = bitmask & val; // temp will store the bits after masking
      bitmask = bitmask<<BytetoBinary.BYTE_SIZE;
      /* Shift the bits to the right side so that BytetoBinary.convert can convert
         it to binary representation */
      temp = temp>>>(i*BytetoBinary.BYTE_SIZE);
      //append the binary representation of the converted byte
      binary=btb.convert((short)temp)+" "+binary;
    }
    return binary;
  }
  /* .... similarly there can be implementations for other data typeSize
     but for simplicity it has been limited to only int and long
  */
}
