/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhothucpham;
import java.util.Scanner;
import quanlykhothucpham.NhaPhanPhoi;
/**
 *
 * @author vietthanh
 */
abstract class ThucPham {

    protected String name;
    protected String id_ThucPham;
    protected String ten_ThucPham;
    protected String HSD;
    protected NhaPhanPhoi nhaPhanPhoi;
    protected double price;

    public ThucPham(){}
    public ThucPham(String _id_ThucPham, String _ten_ThucPham, String _HSD,double _price, NhaPhanPhoi _nhaPhanPhoi) {
        this.id_ThucPham = _id_ThucPham;
        this.ten_ThucPham = _ten_ThucPham;
        this.HSD = _HSD;
        this.nhaPhanPhoi = _nhaPhanPhoi;
        this.price = _price;
    }

    public void Read(String sep){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print(sep + "+ Nhap ten thuc pham: ");
        this.ten_ThucPham = input.next();
        System.out.print(sep + "+ Nhap id cua thuc pham: ");
        this.id_ThucPham = input.next();
        System.out.print(sep + "+ Nhap HSD cua thuc pham: ");
        this.HSD = input.next();
        System.out.print(sep + "+ Nhap gia cua thuc pham: ");
        this.price = input.nextDouble();
        this.nhaPhanPhoi = new NhaPhanPhoi();
        this.nhaPhanPhoi.Read(sep + "|-> ");
    }
    public void Read(){
       Read("");
    }

    public  void Print(String sep){
        System.out.println(sep + "Cac thong tin thuc pham:");
        System.out.println(sep + "+ Ten cua thuc pham la: " + this.ten_ThucPham);
        System.out.println(sep + "+ ID cua thuc pham la: " + this.id_ThucPham);
        System.out.println(sep + "+ HSD cua thuc pham la: " + this.HSD);
        System.out.println(sep + "+ Gia cua san pham la: " + this.price);
        this.nhaPhanPhoi.Print(sep+"    ");
    }

    public void Print(){
        Print("");
    }


    /**
     * @return the id_ThucPham
     */
    public String getId_ThucPham() {
        return this.id_ThucPham;
    }

    /**
     * @param id_ThucPham the id_ThucPham to set
     */
    public void setId_ThucPham(String id_ThucPham) {
        this.id_ThucPham = id_ThucPham;
    }

    /**
     * @return the ten_ThucPham
     */
    public String getTen_ThucPham() {
        return this.ten_ThucPham;
    }

    /**
     * @param ten_ThucPham the ten_ThucPham to set
     */
    public void setTen_ThucPham(String ten_ThucPham) {
        this.ten_ThucPham = ten_ThucPham;
    }

    /**
     * @return the HSD
     */
    public String getHSD() {
        return this.HSD;
    }

    /**
     * @param HSD the HSD to set
     */
    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    /**
     * @return the NhaPhanPhoi
     */
    public NhaPhanPhoi getNhaPhanPhoi() {
        return this.nhaPhanPhoi;
    }

    /**
     * @param _nhaPhanPhoi the _nhaPhanPhoi to set
     */
    public void setNhaPhanPhoi(NhaPhanPhoi _nhaPhanPhoi) {
        this.nhaPhanPhoi = _nhaPhanPhoi;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double _price){
        this.price = _price;
    }

    public String getName(){ return  this.name;}
    protected abstract double getVAT();
    protected abstract void MucDo();
    abstract public double totalPrice();

}