package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
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
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f138729a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f138730b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneId f138731c;

    public static ZonedDateTime now() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, "clock");
        return ofInstant(clockSystemDefaultZone.a(), clockSystemDefaultZone.getZone());
    }

    public static ZonedDateTime of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return O(LocalDateTime.of(localDate, localTime), zoneId, null);
    }

    public static ZonedDateTime of(int i10, int i11, int i12, int i13, int i14, int i15, int i16, ZoneId zoneId) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        return O(new LocalDateTime(LocalDate.of(i10, i11, i12), LocalTime.Q(i13, i14, i15, i16)), zoneId, null);
    }

    public static ZonedDateTime O(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarH = zoneId.H();
        List listF = fVarH.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarH.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.Q(Duration.ofSeconds(bVar.f138982d.f138727b - bVar.f138981c.f138727b).getSeconds());
            zoneOffset = bVar.f138982d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return C(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime H(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.H().f(localDateTime).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        return C(localDateTime.A(zoneOffset), localDateTime.f138702b.f138707d, zoneId);
    }

    public static ZonedDateTime C(long j10, int i10, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.H().d(Instant.ofEpochSecond(j10, i10));
        return new ZonedDateTime(LocalDateTime.H(j10, i10, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdC = ZoneId.C(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (temporalAccessor.h(chronoField)) {
                return C(temporalAccessor.j(chronoField), temporalAccessor.get(ChronoField.NANO_OF_SECOND), zoneIdC);
            }
            return of(LocalDate.from(temporalAccessor), LocalTime.from(temporalAccessor), zoneIdC);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f138729a = localDateTime;
        this.f138730b = zoneOffset;
        this.f138731c = zoneId;
    }

    public final ZonedDateTime Z(LocalDateTime localDateTime) {
        return O(localDateTime, this.f138731c, this.f138730b);
    }

    public final ZonedDateTime f0(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f138730b) || !this.f138731c.H().f(this.f138729a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f138729a, this.f138731c, zoneOffset);
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
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).f138926d;
            }
            return this.f138729a.k(temporalField);
        }
        return temporalField.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = r.f138921a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f138730b.f138727b;
            }
            return this.f138729a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = r.f138921a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return h0();
            }
            if (i10 == 2) {
                return this.f138730b.f138727b;
            }
            return this.f138729a.j(temporalField);
        }
        return temporalField.Z(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset m() {
        return this.f138730b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId R() {
        return this.f138731c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime M(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f138731c.equals(zoneId) ? this : O(this.f138729a, zoneId, this.f138730b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f138731c.equals(zoneId) ? this : C(this.f138729a.A(this.f138730b), this.f138729a.f138702b.f138707d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime D() {
        return this.f138729a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate l() {
        return this.f138729a.l();
    }

    public int getYear() {
        return this.f138729a.getYear();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return this.f138729a.toLocalTime();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return Z(LocalDateTime.of((LocalDate) kVar, this.f138729a.toLocalTime()));
        }
        if (kVar instanceof LocalTime) {
            return Z(LocalDateTime.of(this.f138729a.l(), (LocalTime) kVar));
        }
        if (kVar instanceof LocalDateTime) {
            return Z((LocalDateTime) kVar);
        }
        if (kVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) kVar;
            return O(offsetDateTime.toLocalDateTime(), this.f138731c, offsetDateTime.f138712b);
        }
        if (kVar instanceof Instant) {
            Instant instant = (Instant) kVar;
            return C(instant.getEpochSecond(), instant.getNano(), this.f138731c);
        }
        if (kVar instanceof ZoneOffset) {
            return f0((ZoneOffset) kVar);
        }
        return (ZonedDateTime) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = r.f138921a[chronoField.ordinal()];
            if (i10 == 1) {
                return C(j10, this.f138729a.f138702b.f138707d, this.f138731c);
            }
            if (i10 == 2) {
                return f0(ZoneOffset.ofTotalSeconds(chronoField.f138926d.a(j10, chronoField)));
            }
            return Z(this.f138729a.a(j10, temporalField));
        }
        return (ZonedDateTime) temporalField.f0(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return Z(this.f138729a.b(j10, temporalUnit));
            }
            return H(this.f138729a.b(j10, temporalUnit), this.f138731c, this.f138730b);
        }
        return (ZonedDateTime) temporalUnit.C(this, j10);
    }

    public ZonedDateTime plusDays(long j10) {
        return Z(this.f138729a.plusDays(j10));
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoZonedDateTime c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    public ZonedDateTime minusDays(long j10) {
        return j10 == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f138961f) {
            return l();
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeN = zonedDateTimeFrom.n(this.f138731c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.f138729a.until(zonedDateTimeN.f138729a, temporalUnit);
            }
            return new OffsetDateTime(this.f138729a, this.f138730b).until(new OffsetDateTime(zonedDateTimeN.f138729a, zonedDateTimeN.f138730b), temporalUnit);
        }
        return temporalUnit.between(this, zonedDateTimeFrom);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f138729a.equals(zonedDateTime.f138729a) && this.f138730b.equals(zonedDateTime.f138730b) && this.f138731c.equals(zonedDateTime.f138731c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f138729a.hashCode() ^ this.f138730b.f138727b) ^ Integer.rotateLeft(this.f138731c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f138729a.toString() + this.f138730b.f138728c;
        ZoneOffset zoneOffset = this.f138730b;
        ZoneId zoneId = this.f138731c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new n((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
