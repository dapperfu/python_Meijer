package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class Duration implements j$.time.temporal.m, Comparable<Duration>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Duration f139276c = new Duration(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f139277d = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    public final long f139278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139279b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f139278a, duration2.f139278a);
        return iCompare != 0 ? iCompare : this.f139279b - duration2.f139279b;
    }

    public static Duration ofMinutes(long j10) {
        return H(Math.multiplyExact(j10, 60), 0);
    }

    public static Duration ofSeconds(long j10) {
        return H(j10, 0);
    }

    public static Duration ofSeconds(long j10, long j11) {
        return H(Math.addExact(j10, Math.floorDiv(j11, 1000000000L)), (int) Math.floorMod(j11, 1000000000L));
    }

    public static Duration ofMillis(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return H(j11, i10 * 1000000);
    }

    public static Duration O(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (i10 + 1000000000);
            j11--;
        }
        return H(j11, i10);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return O(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long jUntil = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j10 = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j11 = temporal2.j(chronoField) - temporal.j(chronoField);
                if (jUntil > 0 && j11 < 0) {
                    jUntil++;
                } else if (jUntil < 0 && j11 > 0) {
                    jUntil--;
                }
                j10 = j11;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(jUntil, j10);
        }
    }

    public static Duration H(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return f139276c;
        }
        return new Duration(j10, i10);
    }

    public Duration(long j10, int i10) {
        this.f139278a = j10;
        this.f139279b = i10;
    }

    public boolean isNegative() {
        return this.f139278a < 0;
    }

    public long getSeconds() {
        return this.f139278a;
    }

    public int getNano() {
        return this.f139279b;
    }

    public final Duration Q(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofSeconds(Math.addExact(Math.addExact(this.f139278a, j10), j11 / 1000000000), this.f139279b + (j11 % 1000000000));
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        if (seconds == Long.MIN_VALUE) {
            return Q(Long.MAX_VALUE, -nano).Q(1L, 0L);
        }
        return Q(-seconds, -nano);
    }

    public Duration abs() {
        if (!isNegative()) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.f139278a).add(BigDecimal.valueOf(this.f139279b, 9)).multiply(BigDecimal.valueOf(-1L)).movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(f139277d);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
            throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
        }
        return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
    }

    @Override // j$.time.temporal.m
    public final Temporal C(ChronoLocalDate chronoLocalDate) {
        long j10 = this.f139278a;
        Temporal temporalB = chronoLocalDate;
        if (j10 != 0) {
            temporalB = chronoLocalDate.b(j10, (TemporalUnit) ChronoUnit.SECONDS);
        }
        int i10 = this.f139279b;
        return i10 != 0 ? temporalB.b(i10, ChronoUnit.NANOS) : temporalB;
    }

    public long toDays() {
        return this.f139278a / 86400;
    }

    public long toHours() {
        return this.f139278a / 3600;
    }

    public long toMinutes() {
        return this.f139278a / 60;
    }

    public long toSeconds() {
        return this.f139278a;
    }

    public long toMillis() {
        long j10 = this.f139278a;
        long j11 = this.f139279b;
        if (j10 < 0) {
            j10++;
            j11 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j10, 1000), j11 / 1000000);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f139278a == duration.f139278a && this.f139279b == duration.f139279b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f139278a;
        return (this.f139279b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == f139276c) {
            return "PT0S";
        }
        long j10 = this.f139278a;
        if (j10 < 0 && this.f139279b > 0) {
            j10++;
        }
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.f139279b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f139278a < 0 && this.f139279b > 0 && i11 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i11);
        }
        if (this.f139279b > 0) {
            int length = sb2.length();
            if (this.f139278a < 0) {
                sb2.append(2000000000 - this.f139279b);
            } else {
                sb2.append(this.f139279b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new n((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
