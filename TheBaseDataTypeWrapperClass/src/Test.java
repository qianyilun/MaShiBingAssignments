import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Title: 基础数据类型包装类
 *
 * Questions:
 *
 *      编写一个方法，返回一个double类型的二维数组，数组中的元素通过解析字符串参数获得
 *
 * https://www.youtube.com/watch?v=3gIBy-7J1As&index=110&list=PLEdG6ih2rJtG5xRuKpzgRnqfZPR6EDbGu
 *
 * Created by Allen on 16/12/20.
 */
public class Test {
    public void parseStringToArray() {

        System.out.println("Please enter such as '1, 2; 3, 4, 5; 6, 7, 8' ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();    // input

        String[] parts = s.split(";");

        List<List<Double>> listOfList = new ArrayList<>();

        // initialize
        for (String s1 : parts) {
            String [] s1Parts = s1.split(",");
            List<Double> temp = new ArrayList<>();
            for (String s2 : s1Parts) {
                double d = Double.parseDouble(s2);
                temp.add(d);
            }
            listOfList.add(temp);
        }

        // output
        int i = 0, j = 0;
        for (List lst : listOfList) {
            for (Object o : lst) {
                System.out.printf("d[%d, %d] = %.1f ", i, j, o);
                j++;
            }
            i++;
            System.out.println();
        }

    }


    public static void main(String[] args) {
        new Test().parseStringToArray();
    }
}
