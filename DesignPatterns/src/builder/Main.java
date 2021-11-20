package builder;

public class Main {

	public static void main(String[] args) {
		SmartHome smartHome = new SmartHome.SmartHomeBuilder()
				.withName("name")
				.withSerialNumber(1)
				.withAddressName("address")
				.build();
		System.out.println(smartHome.getSerialNumber());

	}

}
