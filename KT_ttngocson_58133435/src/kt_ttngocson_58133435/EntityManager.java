/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_ttngocson_58133435;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
/*
class abstract EntityManager có cho đối tượng trừu tượng T
+ là public
# là protect, abstract
- là private
các class ko phải abstract thì 
+ là public
# là protect
- là private
*/
public abstract class EntityManager<T> {
    //thuộc tính của EntityManager<T>
    ICompare<T> compare;
    protected ArrayList<T> list;
    //constructor thuộc tính list
    public EntityManager(ArrayList<T> list) {
        this.list = list;
    }
    //setter thuộc tính compare
    public void setCompare(ICompare<T> compare) {
        this.compare = compare;
    }
    // hàm getKey là hàm abtract kiểu trả về là int, các hàm abstract sẽ định nghĩa trong hàm extent của nó
    protected abstract int getKey(T t);
    //hàm add trả về giá trị boolean(true, false) đầu tiên kiểm tra t có trong danh sách chưa, nếu có rồi return false, nếu chưa có thì add vào list rồi return true
    public boolean add(T t){
        boolean kt = false;
        for(T _t: list)
            if(getKey(_t)==getKey(t))
                kt = true;
        if(kt == false){
            list.add(t);
            return true;
        }
        return false;
    }
    //hàm này trả về ArrayList<T>, if(compare.Compare(_t, t)>=0) có nghĩa là kiểm _t có lớn hơn hoặc bằng t ko, nếu có thì add vào subList 
    public ArrayList<T> getSubList(T t){
        ArrayList<T> subList = new ArrayList<>();
        for(T _t : list){
            if(compare.Compare(_t, t)>=0)
                subList.add(_t);
        }
        return subList;
    }
}
