/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longvnt.util.test;

import java.sql.SQLException;
import static longvnt.util.MathUtility.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
    }
    @Test  //@test biến hàm này thành public static void main
    // cách đặt tên hàm sẽ nói lên mục tiêu test hàm, có nhiều quy tắc đặt tên
    //hàm test
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(720, getFactorial(6)); // xanh vì mình tính ra như kì vọng
        assertEquals(1, getFactorial(0));
    }
    //cần test coi có ném về ngoại lệ hay ko
    //nếu đúng là mày ném về ngoại lệ IllegalArgumentException trong
    // tình huống giai thừa -5 thì t có màu xanh
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        getFactorial(-5);
    } // ngoại lệ ko phải là 1 value để đem ra so sánh. Chỉ có thể kiểm tra coi nó có xuất hiện hay ko
    //một khi màu xanh mới cho ra khi file .jar
    
}
