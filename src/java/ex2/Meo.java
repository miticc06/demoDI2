/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author miticc06
 */
public class Meo {
    private NhiemVu nhiemVu;

    public Meo(NhiemVu nhiemVu) {
        this.nhiemVu = nhiemVu;
    }
    
    public String ThamGiaNhiemVu() {
        return nhiemVu.ThucHien();
    }       
}
