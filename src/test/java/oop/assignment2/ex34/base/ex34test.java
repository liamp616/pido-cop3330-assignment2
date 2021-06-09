package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ex34test {
    @Test
    void john_is_Removed() {
        String [] employee = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String [] expected = {"Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String remove = "John Smith";

        ex34test test = new ex34test();
        String[] actual = test.removeEmployee(employee, remove);
        assertArrayEquals(expected, actual);
    }

    @Test
    void Jackie_is_Removed() {
        String [] employee = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String [] expected = {"John Smith", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String remove = "Jackie Jackson";

        ex34test test = new ex34test();
        String[] actual = test.removeEmployee(employee, remove);
        assertArrayEquals(expected, actual);
    }

    @Test
    void Chris_is_Removed() {
        String [] employee = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String [] expected = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};
        String remove = "Chris Jones";

        ex34test test = new ex34test();
        String[] actual = test.removeEmployee(employee, remove);
        assertArrayEquals(expected, actual);
    }

    @Test
    void Amanda_is_Removed() {
        String [] employee = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String [] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "Jeremy Goodwin"};
        String remove = "Amanda Cullen";

        ex34test test = new ex34test();
        String[] actual = test.removeEmployee(employee, remove);
        assertArrayEquals(expected, actual);
    }

    @Test
    void Jeremy_is_Removed() {
        String [] employee = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String [] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen"};
        String remove = "Jeremy Goodwin";

        ex34test test = new ex34test();
        String[] actual = test.removeEmployee(employee, remove);
        assertArrayEquals(expected, actual);
    }

    //  same method from Solution34.java
    public static String[] removeEmployee(String[] employee, String input) {
        //  make new array that is one smaller
        String [] newEmployee = new String[employee.length-1];
        int employeeIndex = 0;

        for(int i = 0; i < employee.length; i++) {
            //  employeeIndex gets incremented when the employee inputted does not equal the employee at i in the array
            if(!employee[i].equalsIgnoreCase(input)) {
                newEmployee[employeeIndex] = employee[i];
                employeeIndex++;
            }
        }
        System.out.print("\n");
        return newEmployee;
    }
}
