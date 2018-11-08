class BytetoBinary {
  public static final int BYTE_SIZE = 8;
  public String convert(short b) {
    if(b<0 || b>255) {
      throw new IllegalArgumentException("input must be an unsigned byte value");
    }
    StringBuffer strBuf = new StringBuffer(BYTE_SIZE);
    char temp;
    for(int i=0;i<BYTE_SIZE;++i) {
      temp = (b%2==0)?'0':'1';
      strBuf.insert(0,temp);
      b/=2;
    }
    return strBuf.toString();
  }
}
