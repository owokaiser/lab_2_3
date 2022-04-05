class Main {
  public static void main(String[] args) {
   int size=10;
    double z=0;
    double tab[]= new double[size];
    for(int i=0;i<size;i++){
      tab[i]=Math.random()*100+1;
      z=z+tab[i];}
    double y = z/size;
    System.out.println(y);
  }
}