package oop.assignment2.ex39.base;

import java.util.*;

public class createEmployees {


    public List<Map<String, String>> create() {
        //  makes a map for each 6 employees
        Map<String, String> employee1 = createEmployee1();
        Map<String, String> employee2 = createEmployee2();
        Map<String, String> employee3 = createEmployee3();
        Map<String, String> employee4 = createEmployee4();
        Map<String, String> employee5 = createEmployee5();
        Map<String, String> employee6 = createEmployee6();

        List<Map<String, String>> myList = addToList(employee1, employee2, employee3, employee4, employee5, employee6);
        return myList;
    }

    //  adds every map and puts it in the arrayList
    private List<Map<String, String>> addToList(Map<String, String> employee1, Map<String, String> employee2,
                                                Map<String, String> employee3, Map<String, String> employee4, Map<String, String> employee5,
                                                Map<String, String> employee6) {
        List<Map<String, String>> myList = new ArrayList<Map<String, String>>();
        myList.add(employee1);
        myList.add(employee2);
        myList.add(employee3);
        myList.add(employee4);
        myList.add(employee5);
        myList.add(employee6);

        return myList;
    }

    //  fills in employee 6's data
    private Map<String, String> createEmployee6() {
        Map<String, String> employee6 = new HashMap<String, String>();
        employee6.put("firstname", "Sally");
        employee6.put("lastname", "Webber");
        employee6.put("position", "Web Developer");
        employee6.put("separationdate", "2015-12-18");
        return employee6;
    }

    //  fills in employee 5's data
    private Map<String, String> createEmployee5() {
        Map<String, String> employee5 = new HashMap<String, String>();
        employee5.put("firstname", "Jacquelyn");
        employee5.put("lastname", "Jackson");
        employee5.put("position", "DBA");
        return employee5;
    }

    //  fills in employee 4's data
    private Map<String, String> createEmployee4() {
        Map<String, String> employee4 = new HashMap<String, String>();
        employee4.put("firstname", "Jake");
        employee4.put("lastname", "Jacobson");
        employee4.put("position", "Programmer");
        return employee4;
    }

    //  fills in employee 3's data
    private Map<String, String> createEmployee3() {
        Map<String, String> employee3 = new HashMap<String, String>();
        employee3.put("firstname", "Michaela");
        employee3.put("lastname", "Michaelson");
        employee3.put("position", "Distract Manager");
        employee3.put("separationdate", "2015-12-19");
        return employee3;
    }

    //  fills in employee 2's data
    private Map<String, String> createEmployee2() {
        Map<String, String> employee2 = new HashMap<String, String>();
        employee2.put("firstname", "Tou");
        employee2.put("lastname", "Xiong");
        employee2.put("position", "Software Engineer");
        employee2.put("separationdate", "2016-10-05");
        return employee2;
    }

    //  fills in employee 1's data
    private Map<String, String> createEmployee1() {
        Map<String, String> employee1 = new HashMap<String, String>();
        employee1.put("firstname", "John");
        employee1.put("lastname", "Johnson");
        employee1.put("position", "Manager");
        employee1.put("separationdate", "2016-12-31");
        return employee1;
    }


}
