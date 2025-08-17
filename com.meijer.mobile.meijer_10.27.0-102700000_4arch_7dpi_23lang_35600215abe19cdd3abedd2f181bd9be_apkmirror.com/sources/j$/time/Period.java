package j$.time;

import fsimpl.C14045dq;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class Period implements j$.time.temporal.m, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Period f138713d = new Period(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    public final int f138714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138716c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.o(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        return localDate.until(localDate2);
    }

    public static Period a(int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return f138713d;
        }
        return new Period(i10, i11, i12);
    }

    public Period(int i10, int i11, int i12) {
        this.f138714a = i10;
        this.f138715b = i11;
        this.f138716c = i12;
    }

    public int getDays() {
        return this.f138716c;
    }

    @Override // j$.time.temporal.m
    public final Temporal C(ChronoLocalDate chronoLocalDate) {
        Temporal temporalB;
        Chronology chronology = (Chronology) chronoLocalDate.d(j$.time.temporal.n.f138957b);
        if (chronology == null || IsoChronology.INSTANCE.equals(chronology)) {
            int i10 = this.f138715b;
            if (i10 != 0) {
                long j10 = (this.f138714a * 12) + i10;
                temporalB = chronoLocalDate;
                if (j10 != 0) {
                    temporalB = chronoLocalDate.b(j10, (TemporalUnit) ChronoUnit.MONTHS);
                }
            } else {
                int i11 = this.f138714a;
                temporalB = chronoLocalDate;
                if (i11 != 0) {
                    temporalB = chronoLocalDate.b(i11, (TemporalUnit) ChronoUnit.YEARS);
                }
            }
            int i12 = this.f138716c;
            return i12 != 0 ? temporalB.b(i12, ChronoUnit.DAYS) : temporalB;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            if (this.f138714a == period.f138714a && this.f138715b == period.f138715b && this.f138716c == period.f138716c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f138716c, 16) + Integer.rotateLeft(this.f138715b, 8) + this.f138714a;
    }

    public final String toString() {
        if (this == f138713d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f138714a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f138715b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f138716c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new n(C14045dq.LIGHTEN, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
