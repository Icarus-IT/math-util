/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longvnt.util;
// import static fu.util.MatchUtility.getFactory; .*
// câu lệnh từ JDK 8(5) khai báo sẵn hàm static
//ở dưới gọi hàm static 
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // ta test thử hàm của ta
        //dùng mắt để so sanh kết quả thực tế khi chạy và kết quả ta mong dợi
        long expected =120;// ta mong nhận 120 nếu gọi hàm 5!
        long actual = MathUtility.getFactorial(5);
        System.out.println("5!: Expected: "+expected+"; Actual : "+actual);
        
        //expected: 720 nếu tính 6!
        System.out.println("6!: "+MathUtility.getFactorial(6));
        //expected: 1 nếu tính 1!
        System.out.println("0!: "+MathUtility.getFactorial(0));
        System.out.println("Goodbye and good luck to you all the FINAL EXAM");
        System.out.println("Hope that you all will get the GREEN ICON");
        //expected: IllegalArgumentException if tính -5
        System.out.println("-5!: "+MathUtility.getFactorial(-5));
        
        //int thử PI coi có giống Math.PI he,?
        System.out.println("PI: "+ MathUtility.PI);
        
    }
}
