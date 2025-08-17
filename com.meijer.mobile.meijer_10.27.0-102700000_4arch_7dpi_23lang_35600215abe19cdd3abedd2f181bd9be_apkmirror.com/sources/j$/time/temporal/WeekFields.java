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
    public static final g f138930i;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a, reason: collision with root package name */
    public final DayOfWeek f138931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138932b;

    /* renamed from: c, reason: collision with root package name */
    public final transient q f138933c;

    /* renamed from: d, reason: collision with root package name */
    public final transient q f138934d;

    /* renamed from: e, reason: collision with root package name */
    public final transient q f138935e;

    /* renamed from: f, reason: collision with root package name */
    public final transient q f138936f;

    /* renamed from: g, reason: collision with root package name */
    public final transient q f138937g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentMap f138929h = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);

    static {
        a(DayOfWeek.SUNDAY, 1);
        f138930i = h.f138946d;
    }

    public static WeekFields a(DayOfWeek dayOfWeek, int i10) {
        String str = dayOfWeek.toString() + i10;
        ConcurrentMap concurrentMap = f138929h;
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
        this.f138933c = new q("DayOfWeek", this, chronoUnit, chronoUnit2, q.f138967f);
        this.f138934d = new q("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, q.f138968g);
        this.f138935e = new q("WeekOfYear", this, chronoUnit2, ChronoUnit.YEARS, q.f138969h);
        g gVar = h.f138946d;
        this.f138936f = new q("WeekOfWeekBasedYear", this, chronoUnit2, gVar, q.f138970i);
        this.f138937g = new q("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, ChronoField.YEAR.f138926d);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f138931a = dayOfWeek;
        this.f138932b = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f138931a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i10 = this.f138932b;
        if (i10 < 1 || i10 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f138931a, this.f138932b);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e10.getMessage());
        }
    }

    public TemporalField weekOfYear() {
        return this.f138935e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f138931a.ordinal() * 7) + this.f138932b;
    }

    public final String toString() {
        return "WeekFields[" + this.f138931a + "," + this.f138932b + "]";
    }
}
