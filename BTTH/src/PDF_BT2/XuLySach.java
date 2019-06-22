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
public class XuLySach{
    
    IViewSach iViewSach;
    ArrayList<Sach> list = DataStore.getInstance().getDsSach();

    public IViewSach getiViewSach() {
        return iViewSach;
    }
    
    public void setIViewSach(IViewSach iViewSach){
        this.iViewSach = iViewSach;
    }
    
    public void themSach(){
        Sach sach = iViewSach.themSach();
        list.add(sach);
        iViewSach.hienThiDS_Sach(list);
    }
    
    public void suaSach(){
        Sach sach = iViewSach.capNhatSach();
        for(Sach _sach : list)
            if(_sach.getMaSach().equals(sach.getMaSach())){
                list.set(list.indexOf(_sach), sach);
                System.out.println("Da sua");
            }
        iViewSach.hienThiDS_Sach(list);
    }
    
    public void xoaSach(){
        Sach sach = iViewSach.xoaSach();
        for(Sach _sach : list)
            if(_sach.getMaSach().equals(sach.getMaSach())){
                list.remove(list.indexOf(_sach));
                System.out.println("Da xoa");
                break;
            }
        iViewSach.hienThiDS_Sach(list);
    }
    
    public void hienThiDanhSach(){
        for(Sach sach : list ){
            System.out.println(sach.toString());
        }
    }
}
