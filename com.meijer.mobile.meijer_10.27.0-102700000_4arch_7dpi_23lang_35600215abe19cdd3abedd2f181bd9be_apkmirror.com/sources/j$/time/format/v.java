package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f138887a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f138888b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f138889c = true;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f138890d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f138891e;

    public v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f138890d = arrayList;
        this.f138891e = null;
        this.f138887a = dateTimeFormatter;
        arrayList.add(new B());
    }

    public final Chronology d() {
        Chronology chronology = c().f138801c;
        if (chronology != null) {
            return chronology;
        }
        Chronology chronology2 = this.f138887a.f138818e;
        return chronology2 == null ? IsoChronology.INSTANCE : chronology2;
    }

    public final boolean a(char c10, char c11) {
        if (this.f138888b) {
            return c10 == c11;
        }
        return b(c10, c11);
    }

    public final boolean h(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 <= charSequence.length() && i11 + i12 <= charSequence2.length()) {
            if (this.f138888b) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (charSequence.charAt(i10 + i13) == charSequence2.charAt(i11 + i13)) {
                    }
                }
                return true;
            }
            for (int i14 = 0; i14 < i12; i14++) {
                char cCharAt = charSequence.charAt(i10 + i14);
                char cCharAt2 = charSequence2.charAt(i11 + i14);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    public final B c() {
        return (B) this.f138890d.get(r0.size() - 1);
    }

    public final Long e(ChronoField chronoField) {
        return (Long) ((HashMap) c().f138799a).get(chronoField);
    }

    public final int g(TemporalField temporalField, long j10, int i10, int i11) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) ((HashMap) c().f138799a).put(temporalField, Long.valueOf(j10));
        return (l10 == null || l10.longValue() == j10) ? i11 : ~i10;
    }

    public final void f(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        c().f138800b = zoneId;
    }

    public final String toString() {
        return c().toString();
    }
}
