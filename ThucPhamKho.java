/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhothucpham;
import quanlykhothucpham.ThucPham;

import java.util.Scanner;

public class ThucPhamKho extends ThucPham {

    private String mucDoKho;
    private double vAT=0.1;

	public ThucPhamKho(String id_ThucPham, String ten_ThucPham, String HSD,double _price, NhaPhanPhoi nhaPhanPhoi, String mucDoKho) {
		super(id_ThucPham, ten_ThucPham, HSD,_price, nhaPhanPhoi);
        //this.vAT=0.1;
	}
    public ThucPhamKho(){
        super.name = "kho";
    }

    public void Read(){
        super.Read();
        this.MucDo();
    }
	/**
	 * @return the mucDoKho
	 */
	public String getMucDoKho() {
		return mucDoKho;
	}

	/**
	 * @param mucDoKho the mucDoKho to set
	 */
	public void setMucDoKho(String mucDoKho) {
		this.mucDoKho = mucDoKho;
	}

    public void MucDo(String sep){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print(sep + "+ Muc do kho: ");
        this.mucDoKho = input.next();
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
        System.out.println(sep + "+ Muc do kho cua thuc pham: " + this.mucDoKho);
        System.out.println(sep + "+ Gia cua san pham: " + this.price);
        System.out.println(sep + "+ Thue thu nhap gia tang (VAT): " + this.vAT);
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
