package SyntaxTrainingJava;

public class Array {
    public static void main(String[] args) {
/*kopiering av en del av array till utskrift
        char[] a = {'d','l','h','y','j','a','v','a','g','r','t'};
        char[] b = new char[4];

        System.arraycopy(a, 4, b, 0, 4);
        //srcPos - startposition i källmatrisen
        //dest - destination array-objekt att kopiera till
        //destPos - startposition i destinationsmatrisen
        //längd - antal arrayelement att kopiera
        System.out.println(String.valueOf(b));*/




/*skicka array till en metod (beräkna summan)
        int[] num = {5,7,3,2,8};
        add(num);
    }

    public static void add(int[] num) {
        int sum = 0;
        for(int i=0;i<num.length;i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of array elements is : " + sum);*/


/*returnera array från en metod
        String[] arr = getArrayValues();
        for (String cities : arr) {
            System.out.println(cities);
        }
    }

    public static String[] getArrayValues() {
        String[] arrCities = {"Chennai", "Bangalore", "Delhi"};
        return arrCities;
    }*/




//skapar en array med ett användardefinierat objekt
        Student[] s = new Student[2];
        s[0] = new Student(111,"Ajit");
        s[1] = new Student(112,"Biju");
    }
}
class Student{
    public int rollno;
    public String name;
    public Student(int rno,String n) {
        rollno = rno;
        name = n;
    }
}

   // }
//}
