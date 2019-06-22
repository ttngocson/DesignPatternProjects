/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_ttngocson_58133435;

/**
 *
 * @author transon
 */
// tạo interface ICompare cho đối số trừu tượng T có hàm Compare trả về giá trị kiểu int
public interface ICompare<T> {
    
    public int Compare(T t1, T t2);
    
}
                    