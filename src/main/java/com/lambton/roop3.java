package com.lambton;

public class roop3 {
    public static void main(String args[]) {
        int c[] = new int[5];
        int a[] = new int[2];
        a[0] = 100;
        a[1] = 200;
        System.out.println(a);
        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int c1 = d.length;
        for (int i = 0; i < c1; i++) {
            System.out.println(d[i]);
        }
        System.out.println(d[0]);
        System.out.println(d.length);
        int[] x1, y1; //both are array
        int x2, y2[]; //int,array
        int x3[], y3; //array,int
        int y4[][];
        y4 = new int[3][3];
        System.out.println("using compact for");
        for (int p : d) {
            System.out.println(p);
        }
        findarray();
        values();
        reverse2();
        string2();
    }
    public static int findarray() {
        int a1[] = new int[]{1, 2, 3};
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            sum = sum + a1[j];
        }
        int avg;
        avg = sum / a1.length;
        System.out.println("sum of array " + sum);
        System.out.println("avg " + avg);
        return (sum);
    }
    public static void values() {
        int a2[] = new int[]{100, 300, 400, 600, 987};
        int max = a2[0];
        int min = a2[0];
        for (int t = 0; t < 5; t++) {
            if (a2[t] < min) {
                min = a2[t];
            }
            if (a2[t] > max) {
                max = a2[t];
            }
        }
        System.out.println("maximum value " + max);
        System.out.println("min value " + min);
    }
    public static void reverse2() {
        int arr1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int r = arr1.length - 1; r >= 0; r--) {
            System.out.print(arr1[r]);
        }
    }
    public static void string2() {
        String[] str5;
        str5 = new String[10];
        str5[0] = "IKROOP";
        str5[1] = "CANADA";
        str5[2] = "INDIA";
        str5[3] = "NEPAL";
        str5[4] = "TORONTO";
        str5[5] = "NEW YORK";
        str5[6] = "PATEL";
        str5[7] = "RAMAN";
        str5[8] = "SCARBOROUGH";
        str5[9] = "NORTH YORK";
        for (int w = 0; w < str5.length; w++) {
            System.out.println(str5[w]);
            System.out.println(revstring(str5[w]));
        }
       /* String[] temp = new String[10];
        for (int k = str5.length - 1; k >= 0; k--) {
            temp[k] = str5[k];
            System.out.println(temp[k]);
        }
*/
    }
    public static String revstring(String s) {
        char ch[] = s.toCharArray();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        return rev;
    }
       /* public static String revstr(String s)
        {
            String temp;
            char names[]=s.toCharArray();
            int len =names.length;
            int j;
            for(int i=0;j=len-1;i<len/2;i++;j--)
            {
                temp=names[i];
                names[i]=names[j];
                names[j]=temp;
            System.out.println(names[j];
            }
        }*/

}
