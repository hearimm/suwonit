package dp.composite;

import java.util.ArrayList;
import java.util.List;

public class DeviceGroup {

	private List<Device> devices = new ArrayList<Device>();
	
	public void addDevice(Device d) {
		devices.add(d);
	}
	
	public void removeDevice(Device d) {
		devices.remove(d);
	}
	
	public void turnOn() {
		for(Device device : devices)
			device.turnOn(); //��ü�鿡 ���� ����
	}

	public void turnOff() {
		for(Device device : devices)
			device.turnOff();
	}

	
	public void addDeviceTo (Device device, Integer toDeviceId) {
		Device composite = findDevice(toDeviceId);
		try {
			composite.addDevice(device);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Device findDevice(Integer toDeviceId) {
		// TODO Auto-generated method stub
		return null;
	}
}
