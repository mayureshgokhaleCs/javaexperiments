class x
{
  private String g;
  
  public x(String paramString)
  {
    this.g = paramString;
  }
  
  public void d()
  {
    int i = 0;
    String str = "";
    for (i = 0; i < this.g.length(); i++) {
      str = str + new k().l(this.g.charAt(i) + new z().y());
    }
    if (str.equals(new y().z())) {
      new v().y(1);
    } else {
      new v().y(0);
    }
  }
}
