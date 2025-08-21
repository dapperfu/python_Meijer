package com.google.maps.model;

import j$.time.LocalTime;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class OpeningHours implements Serializable {
    private static final long serialVersionUID = 1;
    public Boolean openNow;
    public Period[] periods;
    public SpecialDay[] specialDays;
    public String type;
    public String[] weekdayText;

    public static class Period implements Serializable {
        private static final long serialVersionUID = 1;
        public OpenClose close;
        public OpenClose open;

        public static class OpenClose implements Serializable {
            private static final long serialVersionUID = 1;
            public DayOfWeek day;
            public LocalTime time;

            public enum DayOfWeek {
                SUNDAY("Sunday"),
                MONDAY("Monday"),
                TUESDAY("Tuesday"),
                WEDNESDAY("Wednesday"),
                THURSDAY("Thursday"),
                FRIDAY("Friday"),
                SATURDAY("Saturday"),
                UNKNOWN("Unknown");

                private final String name;

                public String getName() {
                    return this.name;
                }

                DayOfWeek(String str) {
                    this.name = str;
                }
            }

            public String toString() {
                return String.format("%s %s", this.day, this.time);
            }
        }

        public String toString() {
            return String.format("%s - %s", this.open, this.close);
        }
    }

    public static class SpecialDay implements Serializable {
        private static final long serialVersionUID = 1;
        public String date;
        public Boolean exceptionalHours;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[Special Day: ");
            if (this.date != null) {
                sb2.append(" (\"");
                sb2.append(this.date);
                sb2.append("\")");
            }
            if (this.exceptionalHours != null) {
                sb2.append(" (\"");
                sb2.append(this.exceptionalHours);
                sb2.append("\")");
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[OpeningHours:");
        Boolean bool = this.openNow;
        if (bool != null && bool.booleanValue()) {
            sb2.append(" openNow");
        }
        sb2.append(" ");
        sb2.append(Arrays.toString(this.periods));
        if (this.specialDays != null) {
            sb2.append(" (\"");
            sb2.append(this.specialDays);
            sb2.append("\")");
        }
        if (this.type != null) {
            sb2.append(" (\"");
            sb2.append(this.type);
            sb2.append("\")");
        }
        return sb2.toString();
    }
}
