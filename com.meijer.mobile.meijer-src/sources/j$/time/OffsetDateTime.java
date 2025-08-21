package j$.time;

import j$.time.chrono.IsoChronology;
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
public final class OffsetDateTime implements Temporal, j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f139300c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f139301a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f139302b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f139302b.equals(offsetDateTime2.f139302b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f139301a.A(this.f139302b), offsetDateTime2.f139301a.A(offsetDateTime2.f139302b));
            if (iCompare == 0) {
                iCompare = this.f139301a.toLocalTime().f139297d - offsetDateTime2.f139301a.toLocalTime().f139297d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f139316g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f139289c;
        ZoneOffset zoneOffset2 = ZoneOffset.f139315f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime now() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, "clock");
        Instant instantA = clockSystemDefaultZone.a();
        return C(instantA, clockSystemDefaultZone.getZone().H().d(instantA));
    }

    public static OffsetDateTime of(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.of(localDate, localTime), zoneOffset);
    }

    public static OffsetDateTime C(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.H().d(instant);
        return new OffsetDateTime(LocalDateTime.H(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public static OffsetDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset zoneOffsetI0 = ZoneOffset.i0(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.d(j$.time.temporal.n.f139551f);
            LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.n.f139552g);
            if (localDate != null && localTime != null) {
                return of(localDate, localTime, zoneOffsetI0);
            }
            return C(Instant.from(temporalAccessor), zoneOffsetI0);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.parse(charSequence, new c(4));
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f139301a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f139302b = zoneOffset;
    }

    public final OffsetDateTime O(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f139301a == localDateTime && this.f139302b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return this.f139301a.k(temporalField);
            }
            return ((ChronoField) temporalField).f139516d;
        }
        return temporalField.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = k.f139497a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f139302b.f139317b;
            }
            return this.f139301a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = k.f139497a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return this.f139301a.A(this.f139302b);
            }
            if (i10 == 2) {
                return this.f139302b.f139317b;
            }
            return this.f139301a.j(temporalField);
        }
        return temporalField.Z(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f139301a;
    }

    public LocalDate toLocalDate() {
        return this.f139301a.l();
    }

    public int getYear() {
        return this.f139301a.getYear();
    }

    public int getMonthValue() {
        return this.f139301a.f139290a.getMonthValue();
    }

    public int getDayOfMonth() {
        return this.f139301a.f139290a.getDayOfMonth();
    }

    public int getDayOfYear() {
        return this.f139301a.getDayOfYear();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f139301a.getDayOfWeek();
    }

    public int getHour() {
        return this.f139301a.f139291b.getHour();
    }

    public int getMinute() {
        return this.f139301a.f139291b.getMinute();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        if (localDate != null) {
            return O(this.f139301a.i(localDate), this.f139302b);
        }
        return (OffsetDateTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = k.f139497a[chronoField.ordinal()];
            if (i10 == 1) {
                return C(Instant.ofEpochSecond(j10, this.f139301a.f139291b.f139297d), this.f139302b);
            }
            if (i10 == 2) {
                return O(this.f139301a, ZoneOffset.ofTotalSeconds(chronoField.f139516d.a(j10, chronoField)));
            }
            return O(this.f139301a.a(j10, temporalField), this.f139302b);
        }
        return (OffsetDateTime) temporalField.f0(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return O(this.f139301a.b(j10, temporalUnit), this.f139302b);
        }
        return (OffsetDateTime) temporalUnit.C(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139549d || temporalQuery == j$.time.temporal.n.f139550e) {
            return this.f139302b;
        }
        if (temporalQuery == j$.time.temporal.n.f139546a) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.f139551f) {
            return toLocalDate();
        }
        if (temporalQuery == j$.time.temporal.n.f139552g) {
            return this.f139301a.toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.n.f139547b) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == j$.time.temporal.n.f139548c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(toLocalDate().S(), ChronoField.EPOCH_DAY).a(this.f139301a.toLocalTime().n0(), ChronoField.NANO_OF_DAY).a(this.f139302b.f139317b, ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTimeFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.f139302b;
            if (!zoneOffset.equals(offsetDateTimeFrom.f139302b)) {
                offsetDateTimeFrom = new OffsetDateTime(offsetDateTimeFrom.f139301a.Q(zoneOffset.f139317b - offsetDateTimeFrom.f139302b.f139317b), zoneOffset);
            }
            return this.f139301a.until(offsetDateTimeFrom.f139301a, temporalUnit);
        }
        return temporalUnit.between(this, offsetDateTimeFrom);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public ZonedDateTime atZoneSameInstant(ZoneId zoneId) {
        return ZonedDateTime.H(this.f139301a, zoneId, this.f139302b);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(this.f139301a.A(this.f139302b), r0.toLocalTime().f139297d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f139301a.equals(offsetDateTime.f139301a) && this.f139302b.equals(offsetDateTime.f139302b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f139301a.hashCode() ^ this.f139302b.f139317b;
    }

    public String toString() {
        return this.f139301a.toString() + this.f139302b.f139318c;
    }

    private Object writeReplace() {
        return new n((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
