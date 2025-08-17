package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class Instant implements Temporal, j$.time.temporal.k, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    public final long f138693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138694b;

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f138691c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final Instant f138692d = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        return Clock.systemUTC().a();
    }

    public static Instant now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        return clock.a();
    }

    public static Instant ofEpochSecond(long j10) {
        return H(j10, 0);
    }

    public static Instant ofEpochSecond(long j10, long j11) {
        return H(Math.addExact(j10, Math.floorDiv(j11, 1000000000L)), (int) Math.floorMod(j11, 1000000000L));
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = 1000;
        return H(Math.floorDiv(j10, j11), ((int) Math.floorMod(j10, j11)) * 1000000);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.j(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.ISO_INSTANT.parse(charSequence, new c(0));
    }

    public static Instant H(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return f138691c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    public Instant(long j10, int i10) {
        this.f138693a = j10;
        this.f138694b = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.k(temporalField).a(temporalField.Z(this), temporalField);
        }
        int i10 = d.f138793a[((ChronoField) temporalField).ordinal()];
        if (i10 == 1) {
            return this.f138694b;
        }
        if (i10 == 2) {
            return this.f138694b / 1000;
        }
        if (i10 == 3) {
            return this.f138694b / 1000000;
        }
        if (i10 == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.f138926d.a(this.f138693a, chronoField);
        }
        throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i10;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Z(this);
        }
        int i11 = d.f138793a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f138694b;
        } else if (i11 == 2) {
            i10 = this.f138694b / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f138693a;
                }
                throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
            }
            i10 = this.f138694b / 1000000;
        }
        return i10;
    }

    public long getEpochSecond() {
        return this.f138693a;
    }

    public int getNano() {
        return this.f138694b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j10, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.f0(this, j10);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.i0(j10);
        int i10 = d.f138793a[chronoField.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ((int) j10) * 1000;
                if (i11 != this.f138694b) {
                    return H(this.f138693a, i11);
                }
            } else if (i10 == 3) {
                int i12 = ((int) j10) * 1000000;
                if (i12 != this.f138694b) {
                    return H(this.f138693a, i12);
                }
            } else {
                if (i10 != 4) {
                    throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
                }
                if (j10 != this.f138693a) {
                    return H(j10, this.f138694b);
                }
            }
        } else if (j10 != this.f138694b) {
            return H(this.f138693a, (int) j10);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.C(this, j10);
        }
        switch (d.f138794b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return O(0L, j10);
            case 2:
                return O(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return plusMillis(j10);
            case 4:
                return plusSeconds(j10);
            case 5:
                return plusSeconds(Math.multiplyExact(j10, 60));
            case 6:
                return plusSeconds(Math.multiplyExact(j10, 3600));
            case 7:
                return plusSeconds(Math.multiplyExact(j10, 43200));
            case 8:
                return plusSeconds(Math.multiplyExact(j10, 86400));
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public Instant plusSeconds(long j10) {
        return O(j10, 0L);
    }

    public Instant plusMillis(long j10) {
        return O(j10 / 1000, (j10 % 1000) * 1000000);
    }

    public final Instant O(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f138693a, j10), j11 / 1000000000), this.f138694b + (j11 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: minus, reason: merged with bridge method [inline-methods] */
    public Instant c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    public Instant minusSeconds(long j10) {
        if (j10 == Long.MIN_VALUE) {
            return plusSeconds(Long.MAX_VALUE).plusSeconds(1L);
        }
        return plusSeconds(-j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f138958c) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == j$.time.temporal.n.f138957b || temporalQuery == j$.time.temporal.n.f138956a || temporalQuery == j$.time.temporal.n.f138960e || temporalQuery == j$.time.temporal.n.f138959d || temporalQuery == j$.time.temporal.n.f138961f || temporalQuery == j$.time.temporal.n.f138962g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.f138693a, ChronoField.INSTANT_SECONDS).a(this.f138694b, ChronoField.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantFrom);
        }
        switch (d.f138794b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.f138693a, this.f138693a), 1000000000L), instantFrom.f138694b - this.f138694b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.f138693a, this.f138693a), 1000000000L), instantFrom.f138694b - this.f138694b) / 1000;
            case 3:
                return Math.subtractExact(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return Z(instantFrom);
            case 5:
                return Z(instantFrom) / 60;
            case 6:
                return Z(instantFrom) / 3600;
            case 7:
                return Z(instantFrom) / 43200;
            case 8:
                return Z(instantFrom) / 86400;
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long Z(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.f138693a, this.f138693a);
        long j10 = instant.f138694b - this.f138694b;
        return (jSubtractExact <= 0 || j10 >= 0) ? (jSubtractExact >= 0 || j10 <= 0) ? jSubtractExact : jSubtractExact + 1 : jSubtractExact - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public long toEpochMilli() {
        long j10 = this.f138693a;
        return (j10 >= 0 || this.f138694b <= 0) ? Math.addExact(Math.multiplyExact(j10, 1000), this.f138694b / 1000000) : Math.addExact(Math.multiplyExact(j10 + 1, 1000), (this.f138694b / 1000000) - 1000);
    }

    @Override // java.lang.Comparable
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Instant instant) {
        int iCompare = Long.compare(this.f138693a, instant.f138693a);
        return iCompare != 0 ? iCompare : this.f138694b - instant.f138694b;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f138693a == instant.f138693a && this.f138694b == instant.f138694b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f138693a;
        return (this.f138694b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
