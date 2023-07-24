package S5D1.entities;

public class AnanasDecorator extends ToppingDecorator {
	private final double price = 1.0;
	private final double nutritionalInfo = 2.0;

	public AnanasDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getName() {
		return super.getName() + " + Ananas";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}

	@Override
	public double getNutritionalInfo() {
		// TODO Auto-generated method stub
		return super.getNutritionalInfo() + nutritionalInfo;
	}
}
