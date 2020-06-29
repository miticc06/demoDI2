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
public class HiepSi {
    private NhiemVu nhiemVu;

    public HiepSi(NhiemVu nhiemVu) {
        this.nhiemVu = nhiemVu;
    }
    
    public String ThamGia() {
        return nhiemVu.ThucHien();
    }       
}
