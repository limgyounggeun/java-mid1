package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : availableZoneIds) {
            System.out.println(zoneId);
            ZoneId zone = ZoneId.of(zoneId);
            System.out.println(zone.getRules());
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId1);
    }
}
