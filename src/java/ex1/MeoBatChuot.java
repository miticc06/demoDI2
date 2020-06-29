package ex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author miticc06
 */

// Mèo bắt chuột
public class MeoBatChuot {

    private NVBatChuot nvGiaiCuu;
    
    public MeoBatChuot() {
        nvGiaiCuu = new NVBatChuot();
    }
    
    public String ThamGiaNV() {
        return nvGiaiCuu.ThucHien();
    }
}
