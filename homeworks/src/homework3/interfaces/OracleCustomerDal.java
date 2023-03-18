package homework3.interfaces;

public class OracleCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("oracle veri tabanına eklendi");
	}

}
