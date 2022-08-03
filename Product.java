class Product{
  String name;
  String location;
  int weight;
 
  public Product(String name){
    this.name=name;
    this.location= "shelf";
    this.weight= 1;
  }

  public Product(String name, String location){
    this.name= name;
    this.location= location;
    this.weight=1;
  }

  public Product(String name, int weight){
    this.name= name;
    this.location= "shelf";
    this.weight=weight;
  }

  public String toString(){
    return String.format("%s (%d kg) can be found from the %s", name, weight, location);
  }
}
