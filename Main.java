package com.company;

public class Main {

    public static void main(String[] args) {
	Student[] students = new Student[7];

	students[0]=new Student("a","a",3,2);
	students[1]=new Student("b","b",3,2);
	students[2]=new Student("c","c",1,6);
	students[3]=new Student("d","d",2,2);
	students[4]=new Student("e","e",6,1);
	students[5]=new Student("f","f",5,3);
	students[6]=new Student("g","g",3,100);

        for(Student student: students){
            System.out.println(student.toString());
        }
        System.out.println("------");
        Sort.DoubleBubbleSort(students,7);
        for (Student student:students){
            System.out.println(student.toString());
        }

        Student.show(students,100);

        BST tree = new BST();
        for(Student stud:students){
            tree.insert(stud);
        }
        System.out.println("BST");
        tree.print();
        tree.find(6);
    }
}
