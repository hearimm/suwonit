package dp.composite;

public abstract class Device {
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void addDevice(Device device) throws Exception {
		throw new Exception("�߰��Ұ�");
	}
	public void removeDevice(Device device) {
		
	}
}
