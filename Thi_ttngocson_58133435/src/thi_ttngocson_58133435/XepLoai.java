/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi_ttngocson_58133435;

/**
 *
 * @author transon
 */
public class XepLoai extends ItemDecorator{

    public XepLoai(Item item) {
        super(item);
    }
    
    protected void hienThiXL(){
        System.out.print("Xếp loại học lực: ");
        if(item.getBasedItem().getDiemTB() < 5)
            System.out.println("Yếu");
        else if(item.getBasedItem().getDiemTB() < 7 && item.getBasedItem().getDiemTB() >= 5)
            System.out.println("Trung bình");
        else if(item.getBasedItem().getDiemTB() < 8 && item.getBasedItem().getDiemTB() >= 7)
            System.out.println("Khá");
        else if(item.getBasedItem().getDiemTB() >= 8)
            System.out.println("Giỏi");
    }

    @Override
    public void display() {
        item.display();
        hienThiXL();
    }
    
}
