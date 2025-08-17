package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f138909c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalTime f138910a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f138911b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        if (this.f138911b.equals(mVar.f138911b)) {
            return this.f138910a.compareTo(mVar.f138910a);
        }
        int iCompare = Long.compare(H(), mVar.H());
        return iCompare == 0 ? this.f138910a.compareTo(mVar.f138910a) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f138726g;
        localTime.getClass();
        new m(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f138725f;
        localTime2.getClass();
        new m(localTime2, zoneOffset2);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        m mVar;
        if (temporal instanceof m) {
            mVar = (m) temporal;
        } else {
            try {
                mVar = new m(LocalTime.from(temporal), ZoneOffset.i0(temporal));
            } catch (DateTimeException e10) {
                throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jH = mVar.H() - H();
            switch (l.f138908a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jH;
                case 2:
                    return jH / 1000;
                case 3:
                    return jH / 1000000;
                case 4:
                    return jH / 1000000000;
                case 5:
                    return jH / 60000000000L;
                case 6:
                    return jH / 3600000000000L;
                case 7:
                    return jH / 43200000000000L;
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, mVar);
    }

    public m(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.f138910a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f138911b = zoneOffset;
    }

    public final m O(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f138910a == localTime && this.f138911b.equals(zoneOffset)) ? this : new m(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).j0() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.OFFSET_SECONDS) {
                return this.f138910a.k(temporalField);
            }
            return ((ChronoField) temporalField).f138926d;
        }
        return temporalField.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.f138911b.f138727b;
            }
            return this.f138910a.j(temporalField);
        }
        return temporalField.Z(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (m) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                ChronoField chronoField = (ChronoField) temporalField;
                return O(this.f138910a, ZoneOffset.ofTotalSeconds(chronoField.f138926d.a(j10, chronoField)));
            }
            return O(this.f138910a.a(j10, temporalField), this.f138911b);
        }
        return (m) temporalField.f0(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final m b(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return O(this.f138910a.b(j10, temporalUnit), this.f138911b);
        }
        return (m) temporalUnit.C(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f138959d || temporalQuery == j$.time.temporal.n.f138960e) {
            return this.f138911b;
        }
        if (((temporalQuery == j$.time.temporal.n.f138956a) || (temporalQuery == j$.time.temporal.n.f138957b)) || temporalQuery == j$.time.temporal.n.f138961f) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.f138962g) {
            return this.f138910a;
        }
        if (temporalQuery == j$.time.temporal.n.f138958c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.f138910a.n0(), ChronoField.NANO_OF_DAY).a(this.f138911b.f138727b, ChronoField.OFFSET_SECONDS);
    }

    public final long H() {
        return this.f138910a.n0() - (this.f138911b.f138727b * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f138910a.equals(mVar.f138910a) && this.f138911b.equals(mVar.f138911b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f138910a.hashCode() ^ this.f138911b.f138727b;
    }

    public final String toString() {
        return this.f138910a.toString() + this.f138911b.f138728c;
    }

    private Object writeReplace() {
        return new n((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
