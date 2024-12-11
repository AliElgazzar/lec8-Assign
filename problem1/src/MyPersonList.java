
// Common task : Make se to check your code should not throw any run time exception
public class MyPersonList {
    private final int INITIAL_LENGTH = 3;
    private Person[] PersonArray;
    private int size;

    // Default Constructor
    public MyPersonList() {
        PersonArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // 1. Implement method to Add as last element, make sure you have enough room else call resize()
    public void add(Person s) {

        if (s == null) {
            return;
        }

        if (size == PersonArray.length) {
            resize();
        }

        PersonArray[size++] = s;
    }

    // 2. get person information by passing index
    public Person get(int i) {

        if (i < 0 || i >= size) {
            return null;
        }
        for (int index = 0; index < size; index++) {
            if (index == i) {
                return PersonArray[index];
            }
        }
        return null;
    }


    // 3. Find a Person object by passing their last name
    public boolean find(String lastName) {
        if (lastName == null) return false;
        for (int index = 0; index < size; index++) {
            if (PersonArray[index] != null && PersonArray[index].getLast().equalsIgnoreCase(lastName)) {
                return true;
            }
        }
        return false;
    }

    // 4. Remove a Person object by passing their last name
    public boolean remove(String lastName) {
        if (lastName == null || size == 0) return false;

        for (int index = 0; index < size; index++) {
            if (PersonArray[index] != null && PersonArray[index].getLast().equalsIgnoreCase(lastName)) {
                for (int j = index; j < size - 1; j++) {
                    PersonArray[j] = PersonArray[j + 1];
                }
                size--;
                PersonArray[size] = null;
                return true;
            }
        }
        return false;
    }

    // 5. Resizing the list
    private void resize() {

        Person[] newPersonArray = new Person[INITIAL_LENGTH * 2];

        System.arraycopy(PersonArray, 0, newPersonArray, 0, size);

        PersonArray = newPersonArray;
    }

    // To display all the persons list
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(PersonArray[i] + ", \n");
        }
        sb.append(PersonArray[size - 1] + "]");
        return sb.toString();
    }

    // Return the size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Bruce", "Tom", 36));
        list.add(new Person("Paul", "Corozza", 51));
        list.add(new Person("Joe", "Lermon", 53));
        list.add(new Person("Anne", "Dow", 55));
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        list.remove("Lermon");
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        System.out.println("\nSearching of Lermon: " + list.find("Lermon"));
        System.out.println(list.get(2));
    }
}

