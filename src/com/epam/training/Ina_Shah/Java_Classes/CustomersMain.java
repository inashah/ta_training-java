package com.epam.training.Ina_Shah.Java_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class CustomersMain {
    public static void main(String[] args) {

        Customers[] testArray = new Customers[]{};
        testArray = generateListOfCustomers();
        sortCustomersByName(testArray);
        filterByCreditCard(testArray,1111, 3333);

        //System.out.println(getString(getCustomersByRangeOfNumberOfCard(testArray, 5489_4788L, 5489_9996L)));

    }

    public static Customers[] generateListOfCustomers()
    {
        Customers customer1 = new Customers(1, "First4", "Surname", "MiddleName", new Address("City", "street", 1, 2));
        Customers customer2 = new Customers(2, "First3", "Surname2", "MiddleName2", new Address(), 2222, 100000456);
        Customers customer3 = new Customers(3, "First2", "Surname3", "MiddleName", new Address("City3", "Street3", 3));
        Customers customer4 = new Customers(4, "First1", "Surname4", "", new Address(), 4444, 1006);
        //Customer customerTwo = new Customer("Petr", "Petrov", "Petrovich", new Address(), 5489_1324L, 7897_4812_1236L);
        Customers[] testArray = new Customers[]{customer1, customer2, customer3, customer4};
        System.out.println(getString(testArray));

        return testArray;

    }
    public static String getString(Customers[] customers) {
        String result = "";
        for (Customers c : customers)
            if (c != null)
                result += c.toString() + "\n";
        return result;
    }

    public static void filterByCreditCard(Customers[] customers, long min, long max) {
        List<Customers> filtered = new ArrayList<>();
        for (Customers c : customers)
            if (c.getCardNumber() >= min && c.getCardNumber() <= max)
                filtered.add(c);
        Customers[] filteredArray = new Customers[filtered.size()];
        filteredArray = filtered.toArray(filteredArray);
        System.out.println("Filtered array:\n"+ getString(filteredArray)+"\n");
        //return list.toArray(new Customer[list.size()]);
    }

    public static void sortCustomersByName(Customers[] notSorted) {
        List<Customers> sorted = Arrays.asList(notSorted);
        Collections.sort(sorted);
        Customers[] sortedArray = new Customers[sorted.size()];
        sortedArray = sorted.toArray(sortedArray);
        System.out.println("Sorted array:\n"+ getString(sortedArray)+"\n");
       // return sorted.toArray(new Customers[sorted.size()]);

    }
}
