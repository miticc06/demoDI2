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

    private NVBatChuot nvBatChuot;
    
    public MeoBatChuot() {
        nvBatChuot = new NVBatChuot();
    }
    
    public String ThamGiaNV() {
        return nvBatChuot.ThucHien();
    }
}
