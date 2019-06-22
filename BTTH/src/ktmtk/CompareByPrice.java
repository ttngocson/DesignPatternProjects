/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk;

/**
 *
 * @author transon
 */
public class CompareByPrice implements ICompare<Sach>{

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
