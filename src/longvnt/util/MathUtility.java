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
//    public static long getFactorial(int n){
//        if (n<0 ||n>20) throw new IllegalArgumentException("n must be between 0..20");
//        if (n ==0 ||n==1){
//            return 1;
//        } // ko xài else, có else trừ điểm
//        long result =1;
//        for (int i = 2; i <=n; i++) {
//            result*=i; //nhân dồn vào result
//        }
//        return result;
//    }
    //Mình minh họa khái niệm Refactoring - tối ưu, chỉnh sửa lại code
    // cho tốt hơn
    // và minh họa khái niệm Regression test, test hồi quy, test lại những gì đã từng test xanh
    // để check xem code còn xanh như ngày xưa ko
    // sau khi đã sửa code
    // viết đệ quy cho hoành tráng
    //gọi lại chính mình với 1 quy mô khác
    // 5!=5*4!, bắt tính 5!, khoan đi tính 4! rồi tính tiếp
    //4!=4*3!, muốn tính 4!, khoan đi tính 3! tồi tính tiếp
    //3!=3*2!, muốn tính 3!, khoan đi tính 2! tồi tính tiếp
    //2!=2*1!, muốn tính 2!, khoan đi tính 1! tồi tính tiếp
    //đệ quy phải có điểm dừng, ko đi miết à
    // rất dễ bị lặp vô tận nếu ko có dừng
    //1!=1, quy ước r, dừng, hồi ngược lại lên trên ra 5!
    // kết luận n!=n*(n-)!
    public static long getFactorial (int n){
        if (n<0||n>20) throw new IllegalArgumentException("n must be between 0..20");
        if (n==0||n==1) return 1;// điều kiện dừng, lùi n mãi cũng phải dừng
        //n>1 &n<=20 rồi, rấp công thức đệ quy
        return n*getFactorial(n-1);
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