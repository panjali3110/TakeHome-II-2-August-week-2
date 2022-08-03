## Disclaimer:- Fork this repl into your account before starting with the Takehome assignment. 

### Instructions
---
1. Create a new Product.java file.
2. Every product has a name, location and weight.
3. Add the following three constructors to the Product class:
```
// Creates a product with the given name. 
// Its location is set to "shelf" and its weight is set to 1.
public Product(String name) 

// Creates a product with the given name and the given location. 
// Its weight is set to 1.
public Product(String name, String location) 

// Creates a product with the given name and the given weight.
// Its location is set to "shelf".
public Product(String name, int weight)

```
4. Copy the below code snippet inside main method of Main.java file.
```
Product tapeMeasure = new Product("Tape measure");
Product plaster = new Product("Plaster", "home improvement section");
Product tyre = new Product("Tyre", 5);

System.out.println(tapeMeasure);
System.out.println(plaster);
System.out.println(tyre);
```
### Output
---
Run Main.java file and. verify the below output.
```
Tape measure (1 kg) can be found from the shelf
Plaster (1 kg) can be found from the home improvement section
Tyre (5 kg) can be found from the shelf

```
### Credits

https://java-programming.mooc.fi/part-5/2-method-and-constructor-overloading#programming-exercise-constructor-overload