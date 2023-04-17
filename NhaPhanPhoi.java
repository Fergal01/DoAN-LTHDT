/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlykhothucpham;
import java.util.Scanner;
/**
 *
 * @author vietthanh
 */
public class NhaPhanPhoi{
    
    private String tenNhaPhanPhoi;
    private String sDT;
    private String diaChi;

    public NhaPhanPhoi(){}
    public NhaPhanPhoi(String _tenNhaPhanPhoi, String _sDT, String _diaChi) {
		super();
		this.tenNhaPhanPhoi = _tenNhaPhanPhoi;
		this.sDT = _sDT;
		this.diaChi = _diaChi;
	}

    public void Read(String sep){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print(sep + "Nhap ten nha phan phoi: ");
        this.tenNhaPhanPhoi = input.next();
        System.out.print(sep + "Nhap SDT nha phan phoi: ");
        this.sDT = input.next();
        System.out.print(sep + "Nhap dia chi nha phan phoi: ");
        this.diaChi = input.next();
    }

    public void Read(){
        Read("+ ");
    }

    public void Print(String sep){
        System.out.println(sep + "Cac thong tin cua nha phan phoi:");
        System.out.println(sep + "+ Ten nha phan phoi la: " + this.tenNhaPhanPhoi);
        System.out.println(sep + "+ SDT nha phan phoi la: " + this.sDT);
        System.out.println(sep + "+ Dia chi nha phan phoi la: " + this.diaChi);
    }
    public  void Print(){
        Print("");
    }

	public String getTenNhaPhanPhoi() {
        return this.tenNhaPhanPhoi;
    }

    public void setTenNhaPhanPhoi(String _tenNhaPhanPhoi) {
        this.tenNhaPhanPhoi = _tenNhaPhanPhoi;
    }

    public String getSDT() {
        return this.sDT;
    }

    public void setSDT(String _sDT) {
        this.sDT = _sDT;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String _diaChi) {
        this.diaChi = _diaChi;
    }
   
}
