/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhothucpham;
import quanlykhothucpham.ThucPham;
import java.util.Scanner;

/**
 *
 * @author vietthanh
 */
public class ThucPhamTuoiSong extends ThucPham{

    private String mucDoTuoi;
    private double vAT = 0.2;

	public ThucPhamTuoiSong(String id_ThucPham, String ten_ThucPham, String HSD,double _price, NhaPhanPhoi nhaPhanPhoi) {
		super(id_ThucPham, ten_ThucPham, HSD,_price, nhaPhanPhoi);
	}

    public ThucPhamTuoiSong(){
        super.name ="tuoi";
    }

	/**
	 * @return the mucDoTuoi
	 */
	public String getMucDoTuoi() {
		return this.mucDoTuoi;
	}

    public void Read(){
        super.Read();
        this.MucDo();
    }
    /**
     * @return the mucDoKho
     */
    public String getMucDoTuoiSong() {
        return mucDoTuoi;
    }

    /**
     * @param mucDoTuoi the mucDoTuoi to set
     */
    public void setMucDoTuoi(String mucDoTuoi) {
        this.mucDoTuoi = mucDoTuoi;
    }

    public void MucDo(String sep){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print(sep + "+ Muc do tuoi song: ");
        this.mucDoTuoi = input.next();
    }

    @Override
    public void MucDo(){
        this.MucDo("");
    }

    public double getVAT(){
        return this.vAT;
    }

    public void Print(String sep){
        super.Print(sep);
        System.out.println(sep + "+ Muc do tuoi song cua thuc pham: " + this.mucDoTuoi);
        System.out.println(sep + "+ Gia cua san pham: " + this.price);
        System.out.println(sep + "+ Thue gia tri gia tang (VAT): " + this.vAT);
        System.out.println(sep + "+ Gia cua san pham sau khi chiu thue: " + this.totalPrice());
    }

    public void Print(){
        Print("");
    }
    @Override
    public double totalPrice(){
        return (this.vAT + 1)*this.price;
    }








}
