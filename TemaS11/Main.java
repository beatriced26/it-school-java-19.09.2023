package TemaS11;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("1.Write a Java program to iterate through all elements in a array list.");

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);

        for (Integer element : arrList) {
            System.out.println(element);
        }

        System.out.println("2. Write a Java program to insert an element into the array list at the first position.");

        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(6);
        anotherList.add(5);
        anotherList.add(9);
        anotherList.add(2);

        System.out.println("Initial list: " + anotherList);

        anotherList.add(0, 50);

        System.out.println("Updated list: " + anotherList);

        System.out.println("3.Write a Java program to sort a given array list.");

        List<Integer> secondArrList =new ArrayList<>();
        secondArrList.add(8);
        secondArrList.add(3);
        secondArrList.add(1);
        secondArrList.add(9);

        System.out.println("Initial list: " + secondArrList);

        Collections.sort(secondArrList);

        System.out.println("Sorted list: ");

        for (Integer element : secondArrList) {
            System.out.println(element);
        }

        System.out.println("4. Write a Java program to copy one array list into another.");

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("pencils");
        shoppingList.add("highlighter");
        shoppingList.add("backpack");
        shoppingList.add("ruler");

        System.out.println("Initial list: " + shoppingList);

        List<String> copiedList = new ArrayList<>(shoppingList);

        System.out.println("Copied list: " + copiedList);

        System.out.println("5. Write a Java program of swap two elements in an array list.");

        List<String> foodList = new ArrayList<>();
        foodList.add("bread");
        foodList.add("eggs");
        foodList.add("milk");
        foodList.add("cheese");
        foodList.add("apples");

        System.out.println("Initial list: ");
        for (String elements : foodList) {
            System.out.println(elements);
        }

        int index1 = 2;
        int index2 = 4;

        if(index1 >= 0 && index1 < foodList.size() && index2 >= 0 && index2 < foodList.size()) {
            String x = foodList.get(index1);
            foodList.set(index1, foodList.get(index2));
            foodList.set(index2, x);
        }

        System.out.println("Updated list after swapping elements: ");
        for (String elements : foodList) {
            System.out.println(elements);
        }

        System.out.println("6. Write a Java program to trim the capacity of an array list the current list size.");

        List<Integer> gradeList = new ArrayList<>(10);
        gradeList.add(10);
        gradeList.add(6);
        gradeList.add(8);
        gradeList.add(3);
        gradeList.add(7);


        ((ArrayList<Integer>) gradeList).trimToSize();

        System.out.println("Trimmed size: " + gradeList.size());

        System.out.println("7. Write a Java program to empty an array list.");

        List<Integer> newArrList = new ArrayList<>();
        newArrList.add(8);
        newArrList.add(9);
        newArrList.add(3);
        newArrList.add(8);

        System.out.println("Initial list: " + newArrList);

        newArrList.removeAll(newArrList);

        System.out.println("Updated list: " + newArrList);

        System.out.println("8. Write a Java program to iterate through all elements in a linked list starting at the specified position.");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(9);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(12);
        linkedList.add(98);
        linkedList.add(9);

        int startPosition1 = 3;

        ListIterator<Integer> iterator = linkedList.listIterator(startPosition1);
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        System.out.println("9. Write a Java program to iterate a linked list in reverse order.");

        LinkedList<Integer> anotherLinkedList = new LinkedList<>();
        anotherLinkedList.add(9);
        anotherLinkedList.add(7);
        anotherLinkedList.add(3);
        anotherLinkedList.add(1);
        anotherLinkedList.add(2);
        anotherLinkedList.add(4);
        anotherLinkedList.add(5);

        System.out.println("Initial Linked List: " + anotherLinkedList);

        ListIterator<Integer> iterator1 = anotherLinkedList.listIterator(anotherLinkedList.size());

        while (iterator1.hasPrevious()){
            System.out.println(iterator1.previous());
        }

        System.out.println("10. Write a Java program to insert some elements at the specified position into a linked list.");

        LinkedList<String> carLinkedList = new LinkedList<>();

        carLinkedList.add("Ford");
        carLinkedList.add("Renault");
        carLinkedList.add("Audi");
        carLinkedList.add("Volkswagen");
        carLinkedList.add("Nissan");
        carLinkedList.add("Dacia");

        System.out.println("Initial list: " + carLinkedList);

        int startPosition = 2;

        LinkedList<String> newCarLinkedList = new LinkedList<>();
        newCarLinkedList.add("BMW");
        newCarLinkedList.add("Tesla");


        carLinkedList.addAll(2,newCarLinkedList);

        System.out.println("Updated list: " + carLinkedList);

        System.out.println("11. Write a Java program to get the first and last occurrence of the specified elements in a linked list.");

        LinkedList<Integer> numberLinkedList = new LinkedList<>();
        numberLinkedList.add(11);
        numberLinkedList.add(8);
        numberLinkedList.add(1);
        numberLinkedList.add(2);
        numberLinkedList.add(7);
        numberLinkedList.add(8);
        numberLinkedList.add(5);
        numberLinkedList.add(4);

        int elementToFind = 8;

        System.out.println("First occurrence of: " + elementToFind + " is at index: " + numberLinkedList.indexOf(8));
        System.out.println("Last occurrence of: " + elementToFind + " is at index: " + numberLinkedList.lastIndexOf(8));

        System.out.println("12. Write a Java program to join two linked lists.");

        LinkedList<String> nameLinkedList = new LinkedList<>();
        nameLinkedList.add("Ana");
        nameLinkedList.add("Andrei");
        nameLinkedList.add("Dan");
        nameLinkedList.add("Stefan");
        nameLinkedList.add("Diana");

        System.out.println("Initial list: ");
        for (String element : nameLinkedList) {
            System.out.println(element);
        }

        LinkedList<String> secondNameLinkedList = new LinkedList<>();
        secondNameLinkedList.add("Cristina");
        secondNameLinkedList.add("Vlad");
        secondNameLinkedList.add("Alexandra");

        nameLinkedList.addAll(secondNameLinkedList);

        System.out.println("Updated list: ");
        for (String element : nameLinkedList) {
            System.out.println(element);
        }

        System.out.println("13. Write a Java program to clone a linked list to another linked list.");

        LinkedList<Integer> thirdLinkedList = new LinkedList<>();
        thirdLinkedList.add(7);
        thirdLinkedList.add(6);
        thirdLinkedList.add(3);
        thirdLinkedList.add(5);

        System.out.println("Initial list: ");
        for (Integer element : thirdLinkedList) {
            System.out.println(element);
        }

        LinkedList<Integer> copiedLinkedList = new LinkedList<>(thirdLinkedList);

        System.out.println("Copied list: ");
        for (Integer element : copiedLinkedList) {
            System.out.println(element);
        }

        System.out.println("14. Write a Java program to remove and return the first element of a linked list.");

        LinkedList<Integer> fourthLinkedList = new LinkedList<>();
        fourthLinkedList.add(9);
        fourthLinkedList.add(7);
        fourthLinkedList.add(5);
        fourthLinkedList.add(3);

        System.out.println("Initial list: " );
        for (Integer element : fourthLinkedList) {
            System.out.println(element);
        }

        int firstElement = fourthLinkedList.pollFirst();

        System.out.println("First element removed: " + firstElement);
        System.out.println("Updated list: ");
            for (Integer element : fourthLinkedList) {
                System.out.println(element);
            }

        System.out.println("15. Write a Java program to retrieve but does not remove, the first element of a linked list.");

        LinkedList<Integer> fifthLinkedList = new LinkedList<>();
        fifthLinkedList.add(6);
        fifthLinkedList.add(5);
        fifthLinkedList.add(3);
        fifthLinkedList.add(1);
        fifthLinkedList.add(9);

        System.out.println("Print the fifth list: ");
        for (Integer element : fifthLinkedList) {
            System.out.println(element);
        }

        System.out.println("Retrieve the first element of fifth list: " + fifthLinkedList.getFirst());

        System.out.println("16. Write a Java program to iterate through all elements in a hash list.");

        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("Ana");
        hashSet.add("Andrei");
        hashSet.add("Dan");
        hashSet.add("Bogdan");

        System.out.println("Iterate through all elements in hash set: ");
        for (String elements : hashSet) {
            System.out.println(elements);
        }

        System.out.println("17. Write a Java program to test a hash set is empty or not.");
        HashSet<Integer> secondHashSet = new HashSet<>();

        boolean isEmpty = secondHashSet.isEmpty();
        if(isEmpty){
            System.out.println("The Second Hash Set is empty.");
        } else {
            System.out.println("The Second Hash Set is not empty.");
        }

        secondHashSet.add(7);

        isEmpty= secondHashSet.isEmpty();
        if(isEmpty){
            System.out.println("The Second Hash Set is empty.");
        } else {
            System.out.println("The Second Hash Set is not empty.");
        }

        System.out.println("18. Write a Java program to convert a hash set to an array.");

        HashSet<Integer> gradeHashSet = new HashSet<>();
        gradeHashSet.add(9);
        gradeHashSet.add(5);
        gradeHashSet.add(1);
        gradeHashSet.add(8);

        Integer [] array = gradeHashSet.toArray(new Integer[0]);

        System.out.println("Elements in array");
        for (Integer elements : array) {
            System.out.println(elements);
        }

        System.out.println("19. Write a Java program to convert a hash set to a List/ArrayList.");

        HashSet<Integer> initialHashSet = new HashSet<>();
        initialHashSet.add(9);
        initialHashSet.add(4);
        initialHashSet.add(3);
        initialHashSet.add(2);
        initialHashSet.add(7);

        System.out.println("Initial Hash Set: " + initialHashSet);

        List<Integer> convertHashSet = new ArrayList<>(initialHashSet);

        System.out.println("Converted Hash List to Array List: " + convertHashSet);

        System.out.println(" 20. Write a Java program to compare two sets and retain elements which are same on both sets.");

        HashSet<Integer> firstSet = new HashSet<>();
        firstSet.add(9);
        firstSet.add(4);
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(11);

        HashSet<Integer> secondtSet = new HashSet<>();
        secondtSet.add(3);
        secondtSet.add(12);
        secondtSet.add(11);
        secondtSet.add(87);
        secondtSet.add(2);
        secondtSet.add(20);

        firstSet.retainAll(secondtSet);

        System.out.println("Retained elements: ");
        for (Integer elements : firstSet) {
            System.out.println(elements);
        }

        System.out.println("21. Write a Java program to remove all of the elements from a hash set.");

        HashSet<String> exampleHashSet = new HashSet<>();
        exampleHashSet.add("carti");
        exampleHashSet.add("caiete");
        exampleHashSet.add("pixuri");

        System.out.println("Initial example hash set. " + exampleHashSet);

        exampleHashSet.clear();

        System.out.println("Hash set after removal of elements: " + exampleHashSet);

        System.out.println("22. Write a Java program to add all the elements of a specified tree set to another tree set.");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(2);

        System.out.println(treeSet);

        TreeSet<Integer> newTreeSet = new TreeSet<>(treeSet);

        System.out.println(newTreeSet);

        System.out.println(" 23. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        TreeSet<String> secondTreeSet = new TreeSet<>();
        secondTreeSet.add("cana");
        secondTreeSet.add("farfurie");
        secondTreeSet.add("lingura");
        secondTreeSet.add("furculita");
        System.out.println("Initial tree set: " + secondTreeSet);

        NavigableSet<String> reverseOrder = secondTreeSet.descendingSet();

        System.out.println("Reverse order tree set: " + reverseOrder);

        System.out.println("24. Write a Java program to find the numbers less than 7 in a tree set.");

        TreeSet<Integer> numberTreeSet = new TreeSet<>();
        numberTreeSet.add(9);
        numberTreeSet.add(1);
        numberTreeSet.add(2);
        numberTreeSet.add(5);
        numberTreeSet.add(12);

        System.out.println("Numbers less than 7 in number tree set");

        for (Integer elements : numberTreeSet) {
            if(elements < 7) {
                System.out.println(elements);
            }
        }

        System.out.println(" 25. Write a Java program to get the element in a tree set which is less than or equal to the given element.");
        TreeSet <Integer> anotherTreeSet = new TreeSet<>();
        anotherTreeSet.add(8);
        anotherTreeSet.add(7);
        anotherTreeSet.add(10);
        anotherTreeSet.add(2);
        anotherTreeSet.add(4);

        int givenElement = 5;

        Integer elementToRetrieve = anotherTreeSet.floor(givenElement);

        if (elementToRetrieve != null) {
            System.out.println("Element less than or equal to " + givenElement + " is: " + elementToRetrieve);
        }else {
            System.out.println("There is no elements less than or equal to " + givenElement);
        }

        System.out.println("26. Write a Java program to retrieve and remove the first element of a tree set.");

        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(3);
        treeSet2.add(2);
        treeSet2.add(5);
        treeSet2.add(7);

        System.out.println("Initial tree set: " + treeSet2);

        treeSet2.pollFirst();

        System.out.println("Updated tree set list: " + treeSet2);

        System.out.println(" 27. Write a Java program to retrieve and remove the last element of a tree set.");

        TreeSet<Integer> treeSet3 = new TreeSet<>();

        treeSet3.add(8);
        treeSet3.add(9);
        treeSet3.add(10);
        treeSet3.add(11);

        System.out.println("Initial tree set: " + treeSet3);

        treeSet3.pollLast();

        System.out.println("Updated tree set: " + treeSet3);

        System.out.println(" 28. Write a Java program to copy all of the mappings from the specified map to another map.");

        Map<Integer, String> firstMap = new HashMap<>();
        firstMap.put(1, "Ana");
        firstMap.put(2, "Diana");
        firstMap.put(3, "Calin");
        firstMap.put(4, "Amalia");

        System.out.println("Fist Map: " + firstMap);

        Map<Integer, String> secondMap = new HashMap<>(firstMap);
        System.out.println("Copied Map: " + secondMap);

        secondMap.putAll(firstMap);

        System.out.println("Copied Map using putAll: " + secondMap);

        System.out.println("29. Write a Java program to check whether a map contains key-value mappings (empty) or not.");

        Map<String, Integer> map1 = new HashMap<>();

        boolean isEmpty1 = map1.isEmpty();

        if (isEmpty1) {
            System.out.println("Map is empty. ");
        } else {
            System.out.println("Map is not empty. ");
        }


            map1.put("Banane", 2);
            map1.put("Mere", 3);

            isEmpty1 = map1.isEmpty();

            if (isEmpty1) {
                System.out.println("Map is empty. ");
            } else {
                System.out.println("Map is not empty. ");
            }

        System.out.println(" 30. Write a Java program to test if a map contains a mapping for the specified key.");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "cars");
        map2.put(7, "bikes");
        map2.put(9, "trucks");

        int specifiedKey = 5;

        boolean containsKey = map2.containsKey(5);

        if (containsKey) {
            System.out.println("The map contains key: " + specifiedKey);
        }else {
            System.out.println("The map does not contain key: " + specifiedKey);
        }

        System.out.println("31. Write a Java program to test if a map contains a mapping for the specified value.");


        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Ana", 6);
        map3.put("Ionut",7);
        map3.put("Andrei", 10);

        int specifiedValue = 10;

        boolean containsValue = map3.containsValue(specifiedValue);

        if (containsValue){
            System.out.println("The map contains value of: " + specifiedValue);
        } else {
            System.out.println("The map does not contain value of: " + specifiedValue);
        }

    }

    }






