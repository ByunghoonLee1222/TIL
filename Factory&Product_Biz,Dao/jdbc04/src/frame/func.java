package frame;

import java.util.ArrayList;

import com.FactoryBiz;
import com.ProductsBiz;

import vo.Factory;
import vo.Products;

public class func {

	public static void join(String k) {
		Products p = null;
		Factory f = null;
		Biz<String, Products> dao = new ProductsBiz();
		Biz<String, Factory> dao1 = new FactoryBiz();
		try {

			p = dao.get(k);
			f = dao1.get(p.getFactno());
			System.out.println("[pdno=" + p.getPdno() + ", pdname=" + p.getPdname() + ", pdsubname=" + p.getPdsubname()
					+ ", factno=" + p.getFactno() + ", pddate=" + p.getPddate() + ", pdcost=" + p.getPdcost()
					+ ", pdprice=" + p.getPdprice() + ", pdamount=" + p.getPdamount() + ", facname=" + f.getFacname()
					+ ", facloc=" + f.getFacloc() + "]");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void joinall() {
		Biz<String, Products> dao = new ProductsBiz();
		Biz<String, Factory> dao1 = new FactoryBiz();
		ArrayList<Products> p = new ArrayList<>();
		Factory fac = null;
		try {

			p = dao.get();
			for (int i = 0; i < p.size(); i++) {
				fac = dao1.get((p.get(i).getFactno()));
				System.out.println(p.get(i).toStringd() + fac.toStringd());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
