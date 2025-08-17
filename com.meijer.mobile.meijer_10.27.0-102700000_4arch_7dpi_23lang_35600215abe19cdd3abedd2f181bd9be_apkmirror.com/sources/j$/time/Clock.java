package j$.time;

import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class Clock {
    public abstract Instant a();

    public abstract ZoneId getZone();

    public static Clock systemUTC() {
        return a.f138732b;
    }

    public static Clock systemDefaultZone() {
        return new a(ZoneId.systemDefault());
    }

    public static a c(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            return a.f138732b;
        }
        return new a(zoneId);
    }

    public long b() {
        return a().toEpochMilli();
    }
}
