package com.google.maps.model;

import j$.time.ZonedDateTime;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class TransitDetails implements Serializable {
    private static final long serialVersionUID = 1;
    public StopDetails arrivalStop;
    public ZonedDateTime arrivalTime;
    public StopDetails departureStop;
    public ZonedDateTime departureTime;
    public String headsign;
    public long headway;
    public TransitLine line;
    public int numStops;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.departureStop);
        sb2.append(" at ");
        sb2.append(this.departureTime);
        sb2.append(" -> ");
        sb2.append(this.arrivalStop);
        sb2.append(" at ");
        sb2.append(this.arrivalTime);
        if (this.headsign != null) {
            sb2.append(" (");
            sb2.append(this.headsign);
            sb2.append(" )");
        }
        if (this.line != null) {
            sb2.append(" on ");
            sb2.append(this.line);
        }
        sb2.append(", ");
        sb2.append(this.numStops);
        sb2.append(" stops");
        sb2.append(", headway=");
        sb2.append(this.headway);
        sb2.append(" s");
        sb2.append("]");
        return sb2.toString();
    }
}
