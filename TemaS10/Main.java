package TemaS10;


import java.util.*;

public class Main {
        public static void main(String[] args) {

            //1

            System.out.println("ArrayList:");
            System.out.println("1.");

            List<String> colorList = new ArrayList<>();
            colorList.add("blue");
            colorList.add("green");
            colorList.add("red");
            colorList.add("pink");
            System.out.println(colorList);

            //2

            System.out.println("2.");

            List<Integer> myList = new ArrayList<>();
            myList.add(3);
            myList.add(5);
            myList.add(7);
            myList.add(0, 9);
            System.out.println(myList);

            //3
            System.out.println("3.");

            List <Integer> newList = new ArrayList<>();
            newList.add(5);
            newList.add(9);
            newList.add(1);
            newList.add(3);

            System.out.println(newList);

            newList.remove(2);
            System.out.println(newList);

            System.out.println("4.");

            List <String> foodList = new ArrayList<>();
            foodList.add("eggs");
            foodList.add("milk");
            foodList.add("bread");
            foodList.add("bananas");
            foodList.add("apples");
            foodList.add("potatoes");
            foodList.add("carrots");

            System.out.println(foodList);

            foodList.set(3, "cheese");

            System.out.println(foodList);

            int indexUpdate = 7;
            String newValeu = "cheese";

            if (indexUpdate >= 0 && indexUpdate < foodList.size()) {
                foodList.set(indexUpdate, newValeu);
                System.out.println("Updated food list: " + foodList);
            } else {
                System.out.println("Invalid update.");
            }

            System.out.println("5.");

            List<Integer> firstLinkedList = new ArrayList<>();
            firstLinkedList.add(5);
            firstLinkedList.add(0);
            firstLinkedList.add(8);
            firstLinkedList.add(4);
            firstLinkedList.add(1);

            System.out.println(firstLinkedList);

            firstLinkedList.remove(2);

            System.out.println(firstLinkedList);

            System.out.println("6.");

            List<Integer> anotherList = new ArrayList<>();
            anotherList.add(5);
            anotherList.add(9);
            anotherList.add(11);
            anotherList.add(56);
            anotherList.add(98);
            anotherList.add(6);

            System.out.println("3rd element in anotherList is: " + anotherList.get(2));

            System.out.println("LinkedList:");
            System.out.println("7.");

            LinkedList<Integer> anotherLinkedList = new LinkedList<>();
            anotherLinkedList.add(6);
            anotherLinkedList.add(9);
            anotherLinkedList.add(3);
            System.out.println(anotherLinkedList);

            anotherLinkedList.addFirst(5);
            System.out.println(anotherLinkedList);

            System.out.println("8.");

            LinkedList<Integer> newLinkedList = new LinkedList<>();
            newLinkedList.add(6);
            newLinkedList.add(9);
            newLinkedList.add(3);

            System.out.println(newLinkedList);

            newLinkedList.addLast(11);

            System.out.println(newLinkedList);

            System.out.println("9.");
            LinkedList<Integer> secondLinkedList = new LinkedList<>();
            secondLinkedList.add(6);
            secondLinkedList.add(9);
            secondLinkedList.add(6);
            secondLinkedList.add(5);
            secondLinkedList.add(12);
            secondLinkedList.add(6);
            secondLinkedList.add(20);

            int elementToFind = 6;

            System.out.println("First occurrence of " + elementToFind + " is at index: " + secondLinkedList.indexOf(6));
            System.out.println("Last occurrence of " + elementToFind + " is at index: " + secondLinkedList.lastIndexOf(6));

            System.out.println("HashSet: ");
            System.out.println("10.");

            HashSet<Integer> myHashSet = new HashSet<>();
            myHashSet.add(7);
            myHashSet.add(8);
            myHashSet.add(2);
            myHashSet.add(1);

            System.out.println(myHashSet);
            int elementToAdd = 20;

            LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<>();

            for (int element : myHashSet) {
                myLinkedHashSet.add(element);
            }

            myLinkedHashSet.add(elementToAdd);

            System.out.println(myLinkedHashSet);

            System.out.println("11.");

            HashSet<Integer> secondHashSet = new HashSet<>();

            secondHashSet.add(9);
            secondHashSet.add(4);
            secondHashSet.add(2);
            secondHashSet.add(1);

            System.out.println("secondHashSet size: " + secondHashSet.size());


            System.out.println("12.");

            HashSet<Integer> thirdHashSet = new HashSet<>();
            thirdHashSet.add(7);
            thirdHashSet.add(2);
            thirdHashSet.add(9);
            thirdHashSet.add(1);
            thirdHashSet.add(5);

            System.out.println("Initial thirdHashSet: " + thirdHashSet);

            thirdHashSet.clear();

            System.out.println("Updated thirdHashSet: " + thirdHashSet);

            System.out.println("13.");

            HashSet<Integer> anotherHashSet = new HashSet<>();
            anotherHashSet.add(4);
            anotherHashSet.add(3);
            anotherHashSet.add(2);
            anotherHashSet.add(1);
            anotherHashSet.add(8);
            anotherHashSet.add(7);
            anotherHashSet.add(7);
            anotherHashSet.add(7);

            System.out.println(anotherHashSet);

            List<Integer> arrList = new ArrayList<>(anotherHashSet);

            System.out.println(arrList);

            System.out.println("14.");

            HashSet<String> elevi = new HashSet<>();

            elevi.add("Ana");
            elevi.add("Diana");
            elevi.add("Cosmin");
            elevi.add("Bogdan");
            elevi.add("Andrei");
            elevi.add("Florin");

            System.out.println("Hash Set: " + elevi);

            HashSet <String> cloneElevi = (HashSet<String>) elevi.clone();

            System.out.println("Hash Set clone: " + elevi);


        }
    }
