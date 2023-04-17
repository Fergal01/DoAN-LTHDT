/**
 *
 */
package quanlykhothucpham;
import quanlykhothucpham.*;
import quanlykhothucpham.ThucPham;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Trang
 *
 */
public class DSThucPham {
	private ArrayList<ThucPham> dstp;
	private int num_tp;
	public DSThucPham(ArrayList<ThucPham> _dstp) {
		super();
		this.dstp = _dstp;

	}

	public DSThucPham() {
		super();
        this.dstp = new ArrayList<ThucPham>();

	}
	public void them(ThucPham tp) {
		this.dstp.add(tp);
	}

	public void xoa(ThucPham t) {
		if(dstp.contains(t)) {
			dstp.remove(t);
		}else {
			System.out.println("Khong ton tai thuc pham nay");
		}

	}
	public void sua(int pos,ThucPham t){
		dstp.set(pos,t);
	}

	public int TimtheoID(String _ID){
		for (int i = 0; i < dstp.size(); i++)
			if (dstp.get(i).getId_ThucPham().equals(_ID)) return i;
		return -1;

	}

	public ThucPham TP(int pos){
		return dstp.get(pos);
	}

    public void xoatheoID(String _ID) {
		for (int i = 0; i < dstp.size(); i++) {
//			System.out.println(dstp.get(i).getId_ThucPham());
			if (dstp.get(i).getId_ThucPham().equals(_ID)) {
//				System.out.println("Co ID");
				dstp.remove(i);
			}
		}
	}
	public void ReadKho(){
		Scanner input = new Scanner(System.in).useDelimiter("\n");
		System.out.print("- Nhap so luong thuc pham kho trong kho: ");
		int num_tp = input.nextInt();
		for (int i = 1; i <= num_tp; i++){
			ThucPham X = new ThucPhamKho();

			System.out.println("----------- Nhap thong tin thuc pham thu " + i + "---------");
			X.Read();
			this.them(X);
		}
	}
	public void ReadTuoi(){
		Scanner input = new Scanner(System.in).useDelimiter("\n");
		System.out.print("- Nhap so luong thuc pham tuoi trong kho: ");
		int num_tp = input.nextInt();
		for (int i = 1; i <= num_tp; i++){
			ThucPham X = new ThucPhamTuoiSong();

			System.out.println("----------- Nhap thong tin thuc pham thu " + i + "---------");
			X.Read();
			this.them(X);
		}
	}
    public void Print(){
        if (dstp.size() == 0) System.out.println("Danh sach rong");
        else{
            for (int i = 0; i < dstp.size(); i++){
                System.out.println("--------------- Thuc pham thu " + (i + 1) + "-------------");
                dstp.get(i).Print("|--> ");
                System.out.println("");
            }
        }
    }

	public double totalPrice(){
		double tPrice = 0;
		for (int i = 0; i < dstp.size(); i++)
			tPrice += dstp.get(i).totalPrice();
		return tPrice;
	}
//	public void sua();

}
