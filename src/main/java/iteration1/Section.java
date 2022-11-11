package iteration1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Section {
    @JsonProperty("day")
    private String day;
    @JsonProperty("hour")
    private String hours;

    public Section(String day, String hours) {
        this.day = day;
        this.hours = hours;
    }

    public Section(){

    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Session{" +
                "day='" + day + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }
}
