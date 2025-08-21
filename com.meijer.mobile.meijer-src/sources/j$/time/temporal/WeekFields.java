package j$.time.temporal;

import j$.time.DayOfWeek;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class WeekFields implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final g f139520i;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a, reason: collision with root package name */
    public final DayOfWeek f139521a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139522b;

    /* renamed from: c, reason: collision with root package name */
    public final transient q f139523c;

    /* renamed from: d, reason: collision with root package name */
    public final transient q f139524d;

    /* renamed from: e, reason: collision with root package name */
    public final transient q f139525e;

    /* renamed from: f, reason: collision with root package name */
    public final transient q f139526f;

    /* renamed from: g, reason: collision with root package name */
    public final transient q f139527g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentMap f139519h = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);

    static {
        a(DayOfWeek.SUNDAY, 1);
        f139520i = h.f139536d;
    }

    public static WeekFields a(DayOfWeek dayOfWeek, int i10) {
        String str = dayOfWeek.toString() + i10;
        ConcurrentMap concurrentMap = f139519h;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i10));
        return (WeekFields) concurrentMap.get(str);
    }

    public WeekFields(DayOfWeek dayOfWeek, int i10) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f139523c = new q("DayOfWeek", this, chronoUnit, chronoUnit2, q.f139557f);
        this.f139524d = new q("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, q.f139558g);
        this.f139525e = new q("WeekOfYear", this, chronoUnit2, ChronoUnit.YEARS, q.f139559h);
        g gVar = h.f139536d;
        this.f139526f = new q("WeekOfWeekBasedYear", this, chronoUnit2, gVar, q.f139560i);
        this.f139527g = new q("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, ChronoField.YEAR.f139516d);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f139521a = dayOfWeek;
        this.f139522b = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f139521a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i10 = this.f139522b;
        if (i10 < 1 || i10 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f139521a, this.f139522b);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e10.getMessage());
        }
    }

    public TemporalField weekOfYear() {
        return this.f139525e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f139521a.ordinal() * 7) + this.f139522b;
    }

    public final String toString() {
        return "WeekFields[" + this.f139521a + "," + this.f139522b + "]";
    }
}
