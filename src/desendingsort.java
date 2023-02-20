import java.util.Arrays;
import java.util.Collections;

public class desendingsort {

    public static void main(String[] args)
    {




        //(comment sorting )

        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};

        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }






        //(comment descending order )

//        Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println("Array elements in descending order: " +Arrays.toString(array));


        //(comment largeNumber )


//        Integer [] arr = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
//
//        Integer largeNumber = arr[0];
//        for(int num:arr){
//            if(largeNumber<num){
//                largeNumber=num;
//            }
//            System.out.println(num + "");
//        }
//        System.out.println();
//        System.out.println("largeNumber 1-" + largeNumber );
//
//        Arrays.sort(arr);
//        Integer largeNumber2 = arr[arr.length-1];
//        System.out.println("largeNumber 2-" + largeNumber2 );


        //(comment smallNumber )



//
//        Integer [] arr = {1000, 5, 7, 12};
//
//        Integer smallNumber = arr[0];
//        for(int num:arr){
//            if(smallNumber>num){
//                smallNumber=num;
//            }
//            System.out.println(num + "");
//        }
//        System.out.println();
//        System.out.println(smallNumber+10+"smallNumber 1-"  );
//
//        Arrays.sort(arr);
//        Integer smallNumber2 = arr[0];
//        System.out.println(smallNumber2+10+"smallNumber 2-"  );


        //(comment present or not present)


  //      Integer [] arr = {1000, 5,50, 7, 12,23};
//        Integer Number = arr[0];
//        for(int num:arr){
//           if(num==50){
//               System.out.println(num + "is exit");
//           }else{
//               System.out.println(num + "is not exit");
//           }
//
//       }


        //(comment present or not present)

//        Integer [] arr = {1000, 5,50, 7, 12,23};
//        int a = 23;
//        boolean is = false;
//        for(int num:arr){
//            if(a==num){
//                is=true;
//            }
//        }
//
//        System.out.println(is ?a+ " Number is present":a+" Number is not present");
    }


}


