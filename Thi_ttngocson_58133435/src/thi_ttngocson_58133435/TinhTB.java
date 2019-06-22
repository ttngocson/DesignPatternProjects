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
public class TinhTB extends ItemDecorator{
    
    private float hsKT;

    public void setHsKT(float hsKT) {
        this.hsKT = hsKT;
    }

    public TinhTB(Item item) {
        super(item);
    }
    
    protected void tinhVaHTDiemTB(){
        float diemTB = item.getBasedItem().getdiemKT()*hsKT + item.getBasedItem().getdiemKT()*(1-hsKT);
        item.getBasedItem().setDiemTB(diemTB);
    }

    @Override
    public void display() {
        //super.display(); //To change body of generated methods, choose Tools | Templates.
        item.display();
        System.out.println("Điểm trung bình môn học: " + String.valueOf(item.getBasedItem().getDiemTB()));
    }
    
}
