package com.company;

public class Student {

    int course;
    int missedLes;
    String surname;
    String faculty;
    static int last = 0;

    Student(String surname, String faculty, int course, int missedLes) {
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.missedLes = missedLes;
    }

    public int getMissedLes() {
        return missedLes;
    }

    public int getCourse() {
        return course;
    }

    public String getFaculty() {
        return faculty;
    }

    public static Student search(Student[] arr, int key) {
        return find(arr, 0, arr.length - 1, key);
    }

    public static Student find(Student[] arr, int left, int right, int key) {
        if (left > right) {
            return null;
        }
        int med = left + (right - left) / 2;
        if (arr[med].getMissedLes() == key) {
            return arr[med];
        }
        if (left == right) {
            return null;
        }
        if (arr[med].getMissedLes() > key) {
            return find(arr, left, med - 1, key);
        } else {
            return find(arr, med + 1, right, key);
        }
    }

    public static void show(Student[] arr, int missed) {
        if (missed == 100) {
            for (int i = 0; i < arr.length; i++) {
                Student index = find(arr, 0, arr.length - 1, missed);
                System.out.println("Student that missed 100 lessons is on course: " + arr[i].course + "\n" + "faculty: " + arr[i].faculty);
                return;
            }
            return;
        }
    }


    @Override
    public String toString() {
        return String.format("%12s %5s %6d %12d", surname, faculty, course, missedLes);
    }
}


