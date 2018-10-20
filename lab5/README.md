# LAB 5
The first task in this lab was to create 10 classes and, from the second class, each one inherits the previous. Also, I had to display their contents to show the inheritance.

![Task 1](https://user-images.githubusercontent.com/34598688/47258800-5d9e0a00-d4a9-11e8-9b86-864df8ce2d35.png)

The second task was to change all the previous String properties to **protected** and to add a new class X, with a **private** String property. Then I had to add a new object X to the A class and to add the X as a state and modify the constructor of A from A(new String("blabla")) to A(new String("blabla"), new X("some name")). The errors occurred were solved by adding the *super* keyword to all of the classes that interited something from A and to add the x object when calling the method by a constructor in main. The J class (the last one) had the same output as the first time.

![Task 2](https://user-images.githubusercontent.com/34598688/47259384-90e49700-d4b1-11e8-9b13-7491860cfcfa.png)

In the third task I had to experiment a little bit with the inheritance property and I have observed that a new initiated value in the first class is inherited by the next ones that have the **extends** property, and when the initial value is changed, the new valsue is inherited. Also, I have observed that a *private* propety cannot be displayed when called from the main function, it has to be at least *protected*.
