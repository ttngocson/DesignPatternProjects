/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF_BT2;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public interface IViewSach {
    public Sach themSach();
    public Sach capNhatSach();
    public Sach xoaSach();
    public void hienThiDS_Sach(ArrayList<Sach> dsSach);
}
