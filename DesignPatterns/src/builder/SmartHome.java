package builder;

public class SmartHome {
	private String name;
	private int serialNumber;
	private String addressName;
	private String addressNumber;
	private String city;
	private String country;
	private String postalCode;
	private int light1PortNum;
	private int light2PortNum;
	private int door1PortNum;
	private int door2PortNum;
	private int microwavePortNum;
	private int tvPortNum;
	private int waterHeaterPortNum;
	
	private SmartHome() {
		
	}
	
	public static class SmartHomeBuilder {
		private String name;
		private int serialNumber;
		private String addressName;
		private String addressNumber;
		private String city;
		private String country;
		private String postalCode;
		private int light1PortNum;
		private int light2PortNum;
		private int door1PortNum;
		private int door2PortNum;
		private int microwavePortNum;
		private int tvPortNum;
		private int waterHeaterPortNum;
		
		public SmartHomeBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public SmartHomeBuilder withSerialNumber(int serialNumber) {
			this.serialNumber = serialNumber;
			return this;
		}
		
		public SmartHomeBuilder withAddressName(String addressName) {
			this.addressName = addressName;
			return this;
		}
		
		public SmartHomeBuilder inCity(String city) {
			this.city = city;
			return this;
		}
		
		public SmartHomeBuilder inCountry(String country) {
			this.country = country;
			return this;
		}
		
		public SmartHome build() {
			SmartHome smartHome = new SmartHome();
			smartHome.name = this.name;
			smartHome.serialNumber = this.serialNumber;
			smartHome.addressName = this.addressName;
			smartHome.city = this.city;
			smartHome.country = this.country;
			return smartHome;
		}
		
	}

	public String getName() {
		return name;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public String getAddressName() {
		return addressName;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public int getLight1PortNum() {
		return light1PortNum;
	}

	public int getLight2PortNum() {
		return light2PortNum;
	}

	public int getDoor1PortNum() {
		return door1PortNum;
	}

	public int getDoor2PortNum() {
		return door2PortNum;
	}

	public int getMicrowavePortNum() {
		return microwavePortNum;
	}

	public int getTvPortNum() {
		return tvPortNum;
	}

	public int getWaterHeaterPortNum() {
		return waterHeaterPortNum;
	}
	
	
}
