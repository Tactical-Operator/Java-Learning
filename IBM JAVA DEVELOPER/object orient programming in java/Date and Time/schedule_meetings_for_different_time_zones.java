import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class schedule_meetings_for_different_time_zones{
    public static void main(String[] args) {
        ZonedDateTime meetingTimeUTC = ZonedDateTime.parse("2026-08-25T23:00:00Z");


        String[] participantTimeZones = {
            "America/New_York",
            "Asia/Kolkata",
            "Europe/London"
        };

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Meeting time in utc: " + meetingTimeUTC.format(formatter));

        for(String timeZone : participantTimeZones){
            ZonedDateTime LocalTime = meetingTimeUTC.withZoneSameInstant(ZoneId.of(timeZone));// converts to utc time 
            System.out.println("meeting time in "+ timeZone + ": " + LocalTime.format(formatter));
        }
    }
}
// no new update