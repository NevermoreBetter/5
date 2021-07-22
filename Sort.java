package com.company;

public class Sort {
    public Student arr[];
    public int last=0;

    public Sort(int size){
        arr=new Student[size];
    }

    public static void DoubleBubbleSort(Student[] stud, int size){
        int left=1;
        int right=size-1;
        while (left<=right){
            for (int i=left;i<=right;i++){
                if (stud[i-1].missedLes<stud[i].missedLes){
                    Student temp=stud[i];
                    stud[i]=stud[i-1];
                    stud[i-1]=temp;
                }
            }
            right--;
            for (int i=right;i>=left;i--){
                if(stud[i-1].missedLes<stud[i].missedLes){
                    Student temp=stud[i];
                    stud[i]=stud[i-1];
                    stud[i-1]=temp;
                }
            }
            left++;
        }
    }
}
