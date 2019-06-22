/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF_BT2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author transon
 */
public class SachClient implements IViewSach{
    
    XuLySach xuLySach;
    Scanner sc = new Scanner(System.in);    
    
    public SachClient() {
        xuLySach = new XuLySach();
        xuLySach.setIViewSach(this);
    }

    
    @Override
    public Sach themSach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Sach sach = new Sach();
        System.out.print("Nhap ma sach: ");
        sach.setMaSach(sc.nextLine());
        System.out.print("Nhap ten sach: ");
        sach.setTenSach(sc.nextLine());
        System.out.print("Nhap nha xuat ban: ");
        sach.setNhaXuatBan(sc.nextLine());
        System.out.print("Nhap gia bia: ");
        sach.setGiaBia(sc.nextInt());
        return sach;
    }

    @Override
    public Sach capNhatSach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Sach sach = new Sach();
        System.out.print("Nhap ma sach: ");
        sach.setMaSach(sc.nextLine());
        System.out.print("Nhap ten sach: ");
        sach.setTenSach(sc.nextLine());
        System.out.print("Nhap nha xuat ban: ");
        sach.setNhaXuatBan(sc.nextLine());
        System.out.print("Nhap gia bia: ");
        sach.setGiaBia(sc.nextInt());
        return sach;
    }

    @Override
    public Sach xoaSach() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Sach sach = new Sach();
        System.out.print("Nhap ma sach: ");
        sach.setMaSach(sc.nextLine());
        return sach;
    }

    @Override
    public void hienThiDS_Sach(ArrayList<Sach> dsSach) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Sach sach : dsSach ){
            System.out.println(sach.toString());
        }
    }
    
}
