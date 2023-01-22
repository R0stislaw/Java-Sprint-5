import java.sql.Time;
import java.time.LocalDateTime;
public class Main implements TimeClient {
    int hour;
    int minute;
    int second;
    public static void main(String[] args) {
        setTime(5,5,5);
    }
   @Override
    public void setTime(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        System.out.println(this.hour);
        return null;
    }

    @Override
    public LocalDateTime getLocalWorkDate() {
        return null;
    }
    /*
        @Override
        public void setDate(int day, int month, int year) {

        }
        @Override
        public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        }
    */

}

