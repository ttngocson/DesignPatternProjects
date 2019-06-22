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
public class CompareByPrice implements ICompare<Sach> {

    // so sánh giá sách t1, t2 nếu t1<t2 trả về -1, t1>t2 trả về 1, bằng trả về 0
    @Override
    public int Compare(Sach t1, Sach t2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(t1.giaBia < t2.giaBia)
            return -1;
        else if(t1.giaBia > t2.giaBia)
            return 1;
        return 0;
    }
    
}
