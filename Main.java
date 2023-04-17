package quanlykhothucpham;
import quanlykhothucpham.NhaPhanPhoi;
import quanlykhothucpham.ThucPham;
import quanlykhothucpham.DSThucPham;

import java.security.Principal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		DSThucPham listTP = new DSThucPham();
		Scanner input = new Scanner(System.in).useDelimiter("\n");

		int luaChon = 0;
		do{
			System.out.println("------------MENU--------------");
			System.out.println("Vui long lua chon chuc nang:");
			System.out.println(" 1. Them \n" + " 2. Xoa\n" + " 3. Sua\n" + " 4. Liet Ke\n" + " 0. Thoat Chuong Trinh");
			luaChon = input.nextInt();
			if(luaChon==1) {
				System.out.print("Thuc pham tuoi (1) hay kho (0): ");
				int ok = input.nextInt();

				if (ok > 1) continue;
				System.out.print("So luong thuc pham: ");
				int num_tp = input.nextInt();
				ThucPham X;
				if (ok == 1){
					for (int i = 0; i < num_tp; i++) {
						System.out.println("------------Thuc pham thu " + (i + 1) + "--------------");
						X = new ThucPhamTuoiSong();
						X.Read();
						listTP.them(X);
					}
				}
				else {
					for (int i = 0; i < num_tp; i++) {
						System.out.println("------------Thuc pham thu " + (i + 1) + "--------------");
						X = new ThucPhamKho();
						X.Read();
						listTP.them(X);
					}
				}


			}else if(luaChon==2) {
				System.out.print("Nhap ID cua thuc pham can xoa: ");
				String ID = input.next();
				listTP.xoatheoID(ID);

			}else if(luaChon==3) {
				System.out.print("Nhap ID cua thuc pham can sua: ");
				String ID = input.next();
				int pos = listTP.TimtheoID(ID);
				if (pos < 0){
					System.out.print("Khong co thuc pham nao phu hop voi ID nay!!!");
					continue;
				}
				ThucPham X = listTP.TP(pos);
				ThucPham Y;
				System.out.println("- Nhap thong tin cua san pham can duoc thay doi (luu y cung ID):");
				if (X.getName().equals("kho")){
					Y = new ThucPhamKho();
				}
				else {
					Y = new ThucPhamTuoiSong();
				}
				Y.Read();
				if (!X.getId_ThucPham().equals(Y.getId_ThucPham())){
					System.out.println("Khong duoc sua ID");
					continue;
				}
				listTP.sua(pos,Y);

			}else if(luaChon==4) {
				listTP.Print();
			}
			System.out.println("----------------------------------");
		}	while(luaChon!=0);
//		listTP.ReadKho();
//		listTP.ReadTuoi();
//		listTP.Print();

	}
}