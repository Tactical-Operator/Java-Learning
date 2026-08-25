import java.time.ZoneId;
import java.time.ZonedDateTime;
public class zone_time
{
    public static void main(String[] args) {
        ZonedDateTime KolkataZone = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(KolkataZone);
    }
}