package com.google.maps.model;

import j$.time.LocalTime;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class OpeningHours implements Serializable {
    private static final long serialVersionUID = 1;
    public Boolean openNow;
    public Period[] periods;
    public Boolean permanentlyClosed;
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

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[OpeningHours:");
        Boolean bool = this.permanentlyClosed;
        if (bool != null && bool.booleanValue()) {
            sb2.append(" permanentlyClosed");
        }
        Boolean bool2 = this.openNow;
        if (bool2 != null && bool2.booleanValue()) {
            sb2.append(" openNow");
        }
        sb2.append(" ");
        sb2.append(Arrays.toString(this.periods));
        return sb2.toString();
    }
}
