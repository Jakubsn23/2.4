class Main {
  public static void main(String[] args) {
    System.out.println("Wybierz funkcję:");
    System.out.println("1.Pole prostokąta");
    System.out.println("2.Pole trójkąta");
    Scanner scanner = new Scanner(System.in);
    int pole = scanner.nextInt();
    
    switch(pole)
      {
        case 1:
          System.out.println("Podaj długość boku a:");
          double a = scanner.nextInt();

          System.out.println("Podaj długość boku b:");
          double b = scanner.nextInt();

          double pole1;
          pole1 = a * b; 
          
          System.out.println(pole1);
          break;
        
        case 2:
          System.out.println("Podaj wysokość h:");
          double h = scanner.nextInt();

          System.out.println("Podaj długość boku c:");
          double c = scanner.nextInt();

          double pole2;
          pole2 = (h+c)/2;

          System.out.println(pole2);
          break;
      }
  }
}