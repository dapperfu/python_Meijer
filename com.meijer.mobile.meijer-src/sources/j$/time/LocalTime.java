package j$.time;

import com.medallia.digital.mobilesdk.l8;
import fsimpl.C14170dq;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class LocalTime implements Temporal, j$.time.temporal.k, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;

    /* renamed from: e, reason: collision with root package name */
    public static final LocalTime f139292e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocalTime[] f139293f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    public final byte f139294a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f139295b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f139296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139297d;

    static {
        int i10 = 0;
        while (true) {
            LocalTime[] localTimeArr = f139293f;
            if (i10 < localTimeArr.length) {
                localTimeArr[i10] = new LocalTime(i10, 0, 0, 0);
                i10++;
            } else {
                LocalTime localTime = localTimeArr[0];
                f139292e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime now() {
        return O(Clock.systemDefaultZone());
    }

    public static LocalTime now(ZoneId zoneId) {
        return O(Clock.c(zoneId));
    }

    public static LocalTime O(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instantA = clock.a();
        ZoneId zone = clock.getZone();
        Objects.requireNonNull(instantA, "instant");
        Objects.requireNonNull(zone, "zone");
        return Z((((int) Math.floorMod(instantA.getEpochSecond() + zone.H().d(instantA).f139317b, 86400)) * 1000000000) + instantA.getNano());
    }

    public static LocalTime of(int i10, int i11) {
        ChronoField.HOUR_OF_DAY.i0(i10);
        if (i11 == 0) {
            return f139293f[i10];
        }
        ChronoField.MINUTE_OF_HOUR.i0(i11);
        return new LocalTime(i10, i11, 0, 0);
    }

    public static LocalTime Q(int i10, int i11, int i12, int i13) {
        ChronoField.HOUR_OF_DAY.i0(i10);
        ChronoField.MINUTE_OF_HOUR.i0(i11);
        ChronoField.SECOND_OF_MINUTE.i0(i12);
        ChronoField.NANO_OF_SECOND.i0(i13);
        return C(i10, i11, i12, i13);
    }

    public static LocalTime Z(long j10) {
        ChronoField.NANO_OF_DAY.i0(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (i10 * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (i11 * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return C(i10, i11, i12, (int) (j12 - (i12 * 1000000000)));
    }

    public static LocalTime from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.n.f139552g);
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new c(3));
    }

    public static LocalTime C(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f139293f[i10];
        }
        return new LocalTime(i10, i11, i12, i13);
    }

    public LocalTime(int i10, int i11, int i12, int i13) {
        this.f139294a = (byte) i10;
        this.f139295b = (byte) i11;
        this.f139296c = (byte) i12;
        this.f139297d = i13;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).j0();
        }
        return temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return H(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return n0();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return n0() / 1000;
            }
            return H(temporalField);
        }
        return temporalField.Z(this);
    }

    public final int H(TemporalField temporalField) {
        switch (g.f139490a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f139297d;
            case 2:
                throw new j$.time.temporal.o("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f139297d / 1000;
            case 4:
                throw new j$.time.temporal.o("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f139297d / 1000000;
            case 6:
                return (int) (n0() / 1000000);
            case 7:
                return this.f139296c;
            case 8:
                return o0();
            case 9:
                return this.f139295b;
            case 10:
                return (this.f139294a * 60) + this.f139295b;
            case 11:
                return this.f139294a % C14170dq.XOR;
            case 12:
                int i10 = this.f139294a % C14170dq.XOR;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f139294a;
            case 14:
                byte b10 = this.f139294a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f139294a / C14170dq.XOR;
            default:
                throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
    }

    public int getHour() {
        return this.f139294a;
    }

    public int getMinute() {
        return this.f139295b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j10, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.f0(this, j10);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.i0(j10);
        switch (g.f139490a[chronoField.ordinal()]) {
            case 1:
                return q0((int) j10);
            case 2:
                return Z(j10);
            case 3:
                return q0(((int) j10) * 1000);
            case 4:
                return Z(j10 * 1000);
            case 5:
                return q0(((int) j10) * 1000000);
            case 6:
                return Z(j10 * 1000000);
            case 7:
                int i10 = (int) j10;
                if (this.f139296c != i10) {
                    ChronoField.SECOND_OF_MINUTE.i0(i10);
                    return C(this.f139294a, this.f139295b, i10, this.f139297d);
                }
                return this;
            case 8:
                return l0(j10 - o0());
            case 9:
                int i11 = (int) j10;
                if (this.f139295b != i11) {
                    ChronoField.MINUTE_OF_HOUR.i0(i11);
                    return C(this.f139294a, i11, this.f139296c, this.f139297d);
                }
                return this;
            case 10:
                return j0(j10 - ((this.f139294a * 60) + this.f139295b));
            case 11:
                return i0(j10 - (this.f139294a % C14170dq.XOR));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return i0(j10 - (this.f139294a % C14170dq.XOR));
            case 13:
                int i12 = (int) j10;
                if (this.f139294a != i12) {
                    ChronoField.HOUR_OF_DAY.i0(i12);
                    return C(i12, this.f139295b, this.f139296c, this.f139297d);
                }
                return this;
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                int i13 = (int) j10;
                if (this.f139294a != i13) {
                    ChronoField.HOUR_OF_DAY.i0(i13);
                    return C(i13, this.f139295b, this.f139296c, this.f139297d);
                }
                return this;
            case 15:
                return i0((j10 - (this.f139294a / C14170dq.XOR)) * 12);
            default:
                throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime q0(int i10) {
        if (this.f139297d == i10) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.i0(i10);
        return C(this.f139294a, this.f139295b, this.f139296c, i10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (g.f139491b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return k0(j10);
                case 2:
                    return k0((j10 % 86400000000L) * 1000);
                case 3:
                    return k0((j10 % l8.b.f93366d) * 1000000);
                case 4:
                    return l0(j10);
                case 5:
                    return j0(j10);
                case 6:
                    return i0(j10);
                case 7:
                    return i0((j10 % 2) * 12);
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.C(this, j10);
    }

    public final LocalTime i0(long j10) {
        return j10 == 0 ? this : C(((((int) (j10 % 24)) + this.f139294a) + 24) % 24, this.f139295b, this.f139296c, this.f139297d);
    }

    public final LocalTime j0(long j10) {
        if (j10 != 0) {
            int i10 = (this.f139294a * 60) + this.f139295b;
            int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return C(i11 / 60, i11 % 60, this.f139296c, this.f139297d);
            }
        }
        return this;
    }

    public final LocalTime l0(long j10) {
        if (j10 != 0) {
            int i10 = (this.f139295b * 60) + (this.f139294a * C14170dq.SCREEN) + this.f139296c;
            int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return C(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f139297d);
            }
        }
        return this;
    }

    public final LocalTime k0(long j10) {
        if (j10 != 0) {
            long jN0 = n0();
            long j11 = (((j10 % 86400000000000L) + jN0) + 86400000000000L) % 86400000000000L;
            if (jN0 != j11) {
                return C((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    public LocalTime minusMinutes(long j10) {
        return j0(-(j10 % 1440));
    }

    public LocalTime minusSeconds(long j10) {
        return l0(-(j10 % 86400));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139547b || temporalQuery == j$.time.temporal.n.f139546a || temporalQuery == j$.time.temporal.n.f139550e || temporalQuery == j$.time.temporal.n.f139549d) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.f139552g) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.n.f139551f) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.f139548c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(n0(), ChronoField.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jN0 = localTimeFrom.n0() - n0();
            switch (g.f139491b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jN0;
                case 2:
                    return jN0 / 1000;
                case 3:
                    return jN0 / 1000000;
                case 4:
                    return jN0 / 1000000000;
                case 5:
                    return jN0 / 60000000000L;
                case 6:
                    return jN0 / 3600000000000L;
                case 7:
                    return jN0 / 43200000000000L;
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, localTimeFrom);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final int o0() {
        return (this.f139295b * 60) + (this.f139294a * C14170dq.SCREEN) + this.f139296c;
    }

    public final long n0() {
        return (this.f139296c * 1000000000) + (this.f139295b * 60000000000L) + (this.f139294a * 3600000000000L) + this.f139297d;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f139294a, localTime.f139294a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f139295b, localTime.f139295b)) == 0 && (iCompare = Integer.compare(this.f139296c, localTime.f139296c)) == 0) ? Integer.compare(this.f139297d, localTime.f139297d) : iCompare;
    }

    public boolean isAfter(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public boolean isBefore(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f139294a == localTime.f139294a && this.f139295b == localTime.f139295b && this.f139296c == localTime.f139296c && this.f139297d == localTime.f139297d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jN0 = n0();
        return (int) (jN0 ^ (jN0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f139294a;
        byte b11 = this.f139295b;
        byte b12 = this.f139296c;
        int i10 = this.f139297d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new n((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void r0(DataOutput dataOutput) throws IOException {
        if (this.f139297d == 0) {
            if (this.f139296c == 0) {
                if (this.f139295b == 0) {
                    dataOutput.writeByte(~this.f139294a);
                    return;
                } else {
                    dataOutput.writeByte(this.f139294a);
                    dataOutput.writeByte(~this.f139295b);
                    return;
                }
            }
            dataOutput.writeByte(this.f139294a);
            dataOutput.writeByte(this.f139295b);
            dataOutput.writeByte(~this.f139296c);
            return;
        }
        dataOutput.writeByte(this.f139294a);
        dataOutput.writeByte(this.f139295b);
        dataOutput.writeByte(this.f139296c);
        dataOutput.writeInt(this.f139297d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static LocalTime m0(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        byte b10 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
            i10 = 0;
        } else {
            byte b11 = dataInput.readByte();
            if (b11 < 0) {
                ?? r52 = ~b11;
                i10 = 0;
                b10 = r52;
                i11 = 0;
            } else {
                byte b12 = dataInput.readByte();
                if (b12 < 0) {
                    i11 = ~b12;
                    i10 = 0;
                    b10 = b11;
                } else {
                    i10 = dataInput.readInt();
                    b10 = b11;
                    i11 = b12;
                }
            }
        }
        return Q(i12, b10, i11, i10);
    }
}
