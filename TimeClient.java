import java.time.LocalDateTime;

public interface TimeClient {
    void setWorkTime(int hour, int minute, int second);
    void setWorkDate(int day, int month, int year);
    void setTimeVacation(int day, int month, int year,
                        int hour, int minute, int second);
    LocalDateTime getLocalWorkTime();
    LocalDateTime getLocalWorkDate();
    LocalDateTime getLocalTimeVacatoin();
}