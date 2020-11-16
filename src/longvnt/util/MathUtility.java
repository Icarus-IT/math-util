/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longvnt.util;

/**
 *
 * @author USER
 */
public class MathUtility {
    //class này fake class Math của JDK
    //Math của JDK có .abs() .sqrt() .sin() .PI
    // chúng toàn là static, vì là thư viện dùng chung
    public static final double  PI = 3.1415;
    
    // hàm tính giai thừa : n!=1.2.3.4.n
    //0! = 1!=1
    //mình ko tính được giai thừa âm
    //21! cực lớn, tràn kiểu long, chứa ko nổi
    //int: tối đa 2 tỷ 1 mấy
    //hàm tính giai thừa trong giới hạn đầu vào từ 0..20
    public static long getFactorial(int n){
        if (n<0 ||n>20) throw new IllegalArgumentException("n must be between 0..20");
        if (n ==0 ||n==1){
            return 1;
        } // ko xài else, có else trừ điểm
        long result =1;
        for (int i = 2; i <=n; i++) {
            result*=i; //nhân dồn vào result
        }
        return result;
    }
    
}
//muốn kết luận hàm mình ngon, thì ta phải nhìn bằng mắt kết quả chạy của hàm
//và so sanh vs kì vọng
// làm từng trường hop575 chạy hàm, test case
//cách này ổn nhưng tốt sức,
//nâng cao: DÙNG MÀU SẮC, XANH, ĐỎ ĐỂ KẾT LUẬN.
//TA THẤY XANH, HÀM Ý MỌI TÌNH HUỐNG ỔN
// TA THẤY ĐỎ, CHỈ 1 THẰNG ĐỎ, COI NHƯ HÀM TOANG
// TA XÀI THÊM 1 FRAMEWORK, UNIT TEST TÊN CHUNG
// JUNIT, TESTNG,NUNIT,.. LÀ NHỮNG FRAMEWORK CỤ THỂ ĐỂ GIÚP TEST CÁC HÀM 
//MỘT CÁCH HIỆU QUẢ
// DÙNG NÓ TA TÍCH HỢP VÀO 1 QUY TRÌNH LÀM PHẦN MỀM LỚN HƠN. CI-CT-CD