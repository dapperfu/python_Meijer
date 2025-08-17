package j$.time;

import fsimpl.C14045dq;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class j implements TemporalAccessor, j$.time.temporal.k, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f138904c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    public final int f138905a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138906b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int i10 = this.f138905a - jVar.f138905a;
        return i10 == 0 ? this.f138906b - jVar.f138906b : i10;
    }

    static {
        new DateTimeFormatterBuilder().appendLiteral("--").appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();
    }

    public j(int i10, int i11) {
        this.f138905a = i10;
        this.f138906b = i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.Q();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return super.k(temporalField);
        }
        Month monthO = Month.O(this.f138905a);
        monthO.getClass();
        int i10 = h.f138902a[monthO.ordinal()];
        return j$.time.temporal.p.g(1L, i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28, Month.O(this.f138905a).maxLength());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i10;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Z(this);
        }
        int i11 = i.f138903a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f138906b;
        } else {
            if (i11 != 2) {
                throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
            }
            i10 = this.f138905a;
        }
        return i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f138957b) {
            return IsoChronology.INSTANCE;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.q(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        Temporal temporalA = temporal.a(this.f138905a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.k(chronoField).f138966d, this.f138906b), chronoField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f138905a == jVar.f138905a && this.f138906b == jVar.f138906b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f138905a << 6) + this.f138906b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f138905a < 10 ? "0" : "");
        sb2.append(this.f138905a);
        sb2.append(this.f138906b < 10 ? "-0" : "-");
        sb2.append(this.f138906b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new n(C14045dq.DARKEN, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
