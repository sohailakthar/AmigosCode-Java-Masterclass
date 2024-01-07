package com.sohail.M12_ClassesAndObjects.Exercise;

// We can use max function without specifying Math ie instead of Math.max(), we can simply use it as max()
import static java.lang.Math.max;
public class StaticAndInstanceBlock {
    public static void main(String[] args) {
        Person p1 = new Person("Sohail", "Akthar");
        Person p2 = new Person("Shoaib", "Akthar");
        Person p3 = new Person("Shaik", "Faizan");

        System.out.println(Person.count);   // For each of the Person instances, p1, p2 and p3, the count gets incremented. So count = 3.

        System.out.println(max(3, 15));     // Notice that we didn't write it as 'Math.max(3,15)' but 'max(3,15'
    }
}
