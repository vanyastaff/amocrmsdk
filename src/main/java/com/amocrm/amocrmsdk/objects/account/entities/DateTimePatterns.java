package com.amocrm.amocrmsdk.objects.account.entities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class DateTimePatterns {
    @SerializedName("date_pattern")
    private String datePattern;

    @SerializedName("short_date_pattern")
    private String shortDatePattern;

    @SerializedName("short_time_pattern")
    private String  shortTimePattern;

    @SerializedName("date_format")
    private String dateFormat;

    @SerializedName("time_format")
    private String timeFormat;

    @SerializedName("timezone")
    private String timezone;

    @SerializedName("timezone_offset")
    private String timezoneOffset;

    @Override
    public int hashCode() {
        return Objects.hash(datePattern, shortDatePattern, shortTimePattern, dateFormat, timeFormat, timezone, timezoneOffset);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateTimePatterns other = (DateTimePatterns) o;
        return Objects.equals(datePattern, other.datePattern) &&
                Objects.equals(shortDatePattern, other.shortDatePattern) &&
                Objects.equals(shortTimePattern, other.shortDatePattern) &&
                Objects.equals(dateFormat, other.dateFormat) &&
                Objects.equals(timeFormat, other.timeFormat) &&
                Objects.equals(timezone, other.timezone) &&
                Objects.equals(timezoneOffset, other.timezoneOffset);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DateTimePatterns{");
        sb.append("datePattern=").append(datePattern);
        sb.append(", shortDatePattern=").append(shortDatePattern);
        sb.append(", shortTimePattern=").append(shortTimePattern);
        sb.append(", dateFormat=").append(dateFormat);
        sb.append(", timeFormat=").append(timeFormat);
        sb.append(", timezone=").append(timezone);
        sb.append(", timezoneOffset=").append(timezoneOffset);
        sb.append('}');
        return sb.toString();
    }
}
