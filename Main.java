class Main {
  public static void main(String[] args) {
   int size=10;
    double z=0;
    double tab[]= new double[size];
    for(int i=0;i<size;i++){
      tab[i]=Math.random()*10;
      z=z+tab[i];
      System.out.println(z);}
    double y = z/size;
    System.out.println("srednia: "+y);
  }
}