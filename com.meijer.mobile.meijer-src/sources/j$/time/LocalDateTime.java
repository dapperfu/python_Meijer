package j$.time;

import com.medallia.digital.mobilesdk.l8;
import j$.time.chrono.ChronoLocalDateTime;
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
public final class LocalDateTime implements Temporal, j$.time.temporal.k, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime MIN = of(LocalDate.f139284d, LocalTime.MIN);

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f139289c = of(LocalDate.f139285e, LocalTime.MAX);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f139290a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalTime f139291b;

    public static LocalDateTime now() {
        return now(Clock.systemDefaultZone());
    }

    public static LocalDateTime now(ZoneId zoneId) {
        return now(Clock.c(zoneId));
    }

    public static LocalDateTime now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instantA = clock.a();
        return H(instantA.getEpochSecond(), instantA.getNano(), clock.getZone().H().d(instantA));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime N(ZoneId zoneId) {
        return ZonedDateTime.O(this, zoneId, null);
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return H(instant.getEpochSecond(), instant.getNano(), zoneId.H().d(instant));
    }

    public static LocalDateTime H(long j10, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        ChronoField.NANO_OF_SECOND.i0(j11);
        return new LocalDateTime(LocalDate.l0(Math.floorDiv(j10 + zoneOffset.f139317b, 86400)), LocalTime.Z((((int) Math.floorMod(r5, r7)) * 1000000000) + j11));
    }

    public static LocalDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).D();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.from(temporalAccessor), LocalTime.from(temporalAccessor));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new c(2));
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f139290a = localDate;
        this.f139291b = localTime;
    }

    public final LocalDateTime i0(LocalDate localDate, LocalTime localTime) {
        return (this.f139290a == localDate && this.f139291b == localTime) ? this : new LocalDateTime(localDate, localTime);
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
            return ((ChronoField) temporalField).j0() ? this.f139291b.k(temporalField) : this.f139290a.k(temporalField);
        }
        return temporalField.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).j0() ? this.f139291b.get(temporalField) : this.f139290a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).j0() ? this.f139291b.j(temporalField) : this.f139290a.j(temporalField);
        }
        return temporalField.Z(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate l() {
        return this.f139290a;
    }

    public int getYear() {
        return this.f139290a.getYear();
    }

    public Month getMonth() {
        return Month.O(this.f139290a.f139287b);
    }

    public int getDayOfYear() {
        return this.f139290a.Q();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f139290a.getDayOfWeek();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.f139291b;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return i0((LocalDate) kVar, this.f139291b);
        }
        if (kVar instanceof LocalTime) {
            return i0(this.f139290a, (LocalTime) kVar);
        }
        if (kVar instanceof LocalDateTime) {
            return (LocalDateTime) kVar;
        }
        return (LocalDateTime) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).j0()) {
                return i0(this.f139290a, this.f139291b.a(j10, temporalField));
            }
            return i0(this.f139290a.a(j10, temporalField), this.f139291b);
        }
        return (LocalDateTime) temporalField.f0(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.C(this, j10);
        }
        switch (f.f139387a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Z(this.f139290a, 0L, 0L, 0L, j10);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j10 / 86400000000L);
                return localDateTimePlusDays.Z(localDateTimePlusDays.f139290a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j10 / l8.b.f93366d);
                return localDateTimePlusDays2.Z(localDateTimePlusDays2.f139290a, 0L, 0L, 0L, (j10 % l8.b.f93366d) * 1000000);
            case 4:
                return Q(j10);
            case 5:
                return Z(this.f139290a, 0L, j10, 0L, 0L);
            case 6:
                return Z(this.f139290a, j10, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimePlusDays3 = plusDays(j10 / 256);
                return localDateTimePlusDays3.Z(localDateTimePlusDays3.f139290a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return i0(this.f139290a.b(j10, temporalUnit), this.f139291b);
        }
    }

    public LocalDateTime minusYears(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return i0(this.f139290a.q0(-j10), this.f139291b);
        }
        LocalDateTime localDateTimeI0 = i0(this.f139290a.q0(Long.MAX_VALUE), this.f139291b);
        return localDateTimeI0.i0(localDateTimeI0.f139290a.q0(1L), localDateTimeI0.f139291b);
    }

    public LocalDateTime plusDays(long j10) {
        return i0(this.f139290a.plusDays(j10), this.f139291b);
    }

    public final LocalDateTime Q(long j10) {
        return Z(this.f139290a, 0L, 0L, j10, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoLocalDateTime c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    public final LocalDateTime Z(LocalDate localDate, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return i0(localDate, this.f139291b);
        }
        long j14 = 1;
        long jN0 = this.f139291b.n0();
        long j15 = ((((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L)) * j14) + jN0;
        long jFloorDiv = Math.floorDiv(j15, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
        long jFloorMod = Math.floorMod(j15, 86400000000000L);
        return i0(localDate.plusDays(jFloorDiv), jFloorMod == jN0 ? this.f139291b : LocalTime.Z(jFloorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139551f) {
            return this.f139290a;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j10;
        LocalDateTime localDateTimeFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeFrom);
        }
        if (((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDatePlusDays = localDateTimeFrom.f139290a;
            if (localDatePlusDays.isAfter(this.f139290a) && localDateTimeFrom.f139291b.isBefore(this.f139291b)) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.f139290a) && localDateTimeFrom.f139291b.isAfter(this.f139291b)) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.f139290a.until(localDatePlusDays, temporalUnit);
        }
        LocalDate localDate = this.f139290a;
        LocalDate localDate2 = localDateTimeFrom.f139290a;
        localDate.getClass();
        long jS = localDate2.S() - localDate.S();
        if (jS == 0) {
            return this.f139291b.until(localDateTimeFrom.f139291b, temporalUnit);
        }
        long jN0 = localDateTimeFrom.f139291b.n0() - this.f139291b.n0();
        if (jS > 0) {
            jMultiplyExact = jS - 1;
            j10 = jN0 + 86400000000000L;
        } else {
            jMultiplyExact = jS + 1;
            j10 = jN0 - 86400000000000L;
        }
        switch (f.f139387a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j10 /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, l8.b.f93366d);
                j10 /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400);
                j10 /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                j10 /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                j10 /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                j10 /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j10);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return C((LocalDateTime) chronoLocalDateTime);
        }
        return super.compareTo(chronoLocalDateTime);
    }

    public final int C(LocalDateTime localDateTime) {
        int iC = this.f139290a.C(localDateTime.l());
        return iC == 0 ? this.f139291b.compareTo(localDateTime.toLocalTime()) : iC;
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return C((LocalDateTime) chronoLocalDateTime) > 0;
        }
        long jS = ((LocalDate) l()).S();
        long jS2 = chronoLocalDateTime.l().S();
        return jS > jS2 || (jS == jS2 && toLocalTime().n0() > chronoLocalDateTime.toLocalTime().n0());
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return C((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long jS = ((LocalDate) l()).S();
        long jS2 = chronoLocalDateTime.l().S();
        return jS < jS2 || (jS == jS2 && toLocalTime().n0() < chronoLocalDateTime.toLocalTime().n0());
    }

    public boolean isEqual(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? C((LocalDateTime) chronoLocalDateTime) == 0 : toLocalTime().n0() == chronoLocalDateTime.toLocalTime().n0() && ((LocalDate) l()).S() == chronoLocalDateTime.l().S();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f139290a.equals(localDateTime.f139290a) && this.f139291b.equals(localDateTime.f139291b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f139290a.hashCode() ^ this.f139291b.hashCode();
    }

    public String toString() {
        return this.f139290a.toString() + "T" + this.f139291b.toString();
    }

    private Object writeReplace() {
        return new n((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
