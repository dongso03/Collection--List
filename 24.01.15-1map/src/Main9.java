import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class GeoLocation {
	int x;
	int y;

	public GeoLocation(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "GeoLocation [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof GeoLocation))
			return false;
		GeoLocation other = (GeoLocation) obj;
		return x == other.x && y == other.y;
	}
	

}

public class Main9 {
	public static void main(String[] args) {
		// 위도 경도 주소지
		// 35 128 밀양시 활성동
		// 34 127 남해군 서면
		GeoLocation loc1 =new GeoLocation(35, 128);
		
		Map<GeoLocation, String> map = new  HashMap<>();
		map.put(loc1, "밀양시 활성동");
		map.put(new GeoLocation(34, 127), "남해군 서면");
		
		System.out.println(map);
		
		System.out.println(map.get(new GeoLocation(34, 127)));
		
		for(Entry<GeoLocation, String> e: map.entrySet()) {
			String address = e.getValue();
			if(address.equals("남해군 서면")) {
				System.out.println(e.getKey());
			}
		}
	}
}
