package j$.time.chrono;

import com.medallia.digital.mobilesdk.l8;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14874e implements ChronoLocalDateTime, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    public final transient ChronoLocalDate f139336a;

    /* renamed from: b, reason: collision with root package name */
    public final transient LocalTime f139337b;

    public static C14874e C(Chronology chronology, Temporal temporal) {
        C14874e c14874e = (C14874e) temporal;
        if (chronology.equals(c14874e.g())) {
            return c14874e;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + c14874e.g().getId());
    }

    public C14874e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.f139336a = chronoLocalDate;
        this.f139337b = localTime;
    }

    public final C14874e Z(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.f139336a;
        return (chronoLocalDate == temporal && this.f139337b == localTime) ? this : new C14874e(AbstractC14872c.C(chronoLocalDate.g(), temporal), localTime);
    }

    public final int hashCode() {
        return this.f139336a.hashCode() ^ this.f139337b.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate l() {
        return this.f139336a;
    }

    public final String toString() {
        return this.f139336a.toString() + "T" + this.f139337b.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.f139337b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.C(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.j0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (((ChronoField) temporalField).j0() ? this.f139337b : this.f139336a).k(temporalField);
        }
        return temporalField.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).j0() ? this.f139337b.get(temporalField) : this.f139336a.get(temporalField);
        }
        return k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).j0() ? this.f139337b.j(temporalField) : this.f139336a.j(temporalField);
        }
        return temporalField.Z(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final C14874e i(j$.time.temporal.k kVar) {
        if (kVar instanceof ChronoLocalDate) {
            return Z((ChronoLocalDate) kVar, this.f139337b);
        }
        if (kVar instanceof LocalTime) {
            return Z(this.f139336a, (LocalTime) kVar);
        }
        if (kVar instanceof C14874e) {
            return C(this.f139336a.g(), (C14874e) kVar);
        }
        return C(this.f139336a.g(), (C14874e) kVar.f(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final C14874e a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).j0()) {
                return Z(this.f139336a, this.f139337b.a(j10, temporalField));
            }
            return Z(this.f139336a.a(j10, temporalField), this.f139337b);
        }
        return C(this.f139336a.g(), temporalField.f0(this, j10));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final C14874e b(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return C(this.f139336a.g(), temporalUnit.C(this, j10));
        }
        switch (AbstractC14873d.f139335a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return O(this.f139336a, 0L, 0L, 0L, j10);
            case 2:
                C14874e c14874eZ = Z(this.f139336a.b(j10 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.f139337b);
                return c14874eZ.O(c14874eZ.f139336a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                C14874e c14874eZ2 = Z(this.f139336a.b(j10 / l8.b.f93366d, (TemporalUnit) ChronoUnit.DAYS), this.f139337b);
                return c14874eZ2.O(c14874eZ2.f139336a, 0L, 0L, 0L, (j10 % l8.b.f93366d) * 1000000);
            case 4:
                return O(this.f139336a, 0L, 0L, j10, 0L);
            case 5:
                return O(this.f139336a, 0L, j10, 0L, 0L);
            case 6:
                return O(this.f139336a, j10, 0L, 0L, 0L);
            case 7:
                C14874e c14874eZ3 = Z(this.f139336a.b(j10 / 256, (TemporalUnit) ChronoUnit.DAYS), this.f139337b);
                return c14874eZ3.O(c14874eZ3.f139336a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(this.f139336a.b(j10, temporalUnit), this.f139337b);
        }
    }

    public final C14874e O(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return Z(chronoLocalDate, this.f139337b);
        }
        long j14 = j10 / 24;
        long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long jN0 = this.f139337b.n0();
        long j16 = j15 + jN0;
        long jFloorDiv = Math.floorDiv(j16, 86400000000000L) + j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long jFloorMod = Math.floorMod(j16, 86400000000000L);
        return Z(chronoLocalDate.b(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == jN0 ? this.f139337b : LocalTime.Z(jFloorMod));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime N(ZoneId zoneId) {
        return i.H(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime chronoLocalDateTimeV = g().V(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeV);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        if (((ChronoUnit) temporalUnit).compareTo(chronoUnit) >= 0) {
            ChronoLocalDate chronoLocalDateL = chronoLocalDateTimeV.l();
            if (chronoLocalDateTimeV.toLocalTime().isBefore(this.f139337b)) {
                chronoLocalDateL = chronoLocalDateL.c(1L, (TemporalUnit) chronoUnit);
            }
            return this.f139336a.until(chronoLocalDateL, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long j10 = chronoLocalDateTimeV.j(chronoField) - this.f139336a.j(chronoField);
        switch (AbstractC14873d.f139335a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                j10 = Math.multiplyExact(j10, 86400000000000L);
                break;
            case 2:
                j10 = Math.multiplyExact(j10, 86400000000L);
                break;
            case 3:
                j10 = Math.multiplyExact(j10, l8.b.f93366d);
                break;
            case 4:
                j10 = Math.multiplyExact(j10, 86400);
                break;
            case 5:
                j10 = Math.multiplyExact(j10, 1440);
                break;
            case 6:
                j10 = Math.multiplyExact(j10, 24);
                break;
            case 7:
                j10 = Math.multiplyExact(j10, 2);
                break;
        }
        return Math.addExact(j10, this.f139337b.until(chronoLocalDateTimeV.toLocalTime(), temporalUnit));
    }

    private Object writeReplace() {
        return new A((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }
}
