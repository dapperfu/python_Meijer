package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    public final transient C14786e f138755a;

    /* renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f138756b;

    /* renamed from: c, reason: collision with root package name */
    public final transient ZoneId f138757c;

    public static i H(ZoneId zoneId, ZoneOffset zoneOffset, C14786e c14786e) {
        Objects.requireNonNull(c14786e, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, c14786e);
        }
        j$.time.zone.f fVarH = zoneId.H();
        LocalDateTime localDateTimeFrom = LocalDateTime.from(c14786e);
        List listF = fVarH.f(localDateTimeFrom);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c14786e = c14786e;
        } else {
            Object objE = fVarH.e(localDateTimeFrom);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c14786e = c14786e.O(c14786e.f138746a, 0L, 0L, Duration.ofSeconds(bVar.f138982d.f138727b - bVar.f138981c.f138727b).getSeconds(), 0L);
            zoneOffset = bVar.f138982d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, c14786e);
    }

    public static i O(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.H().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new i(zoneId, zoneOffsetD, (C14786e) chronology.V(LocalDateTime.H(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    public static i C(Chronology chronology, Temporal temporal) {
        i iVar = (i) temporal;
        if (chronology.equals(iVar.g())) {
            return iVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + iVar.g().getId());
    }

    public i(ZoneId zoneId, ZoneOffset zoneOffset, C14786e c14786e) {
        Objects.requireNonNull(c14786e, "dateTime");
        this.f138755a = c14786e;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f138756b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f138757c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset m() {
        return this.f138756b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime D() {
        return this.f138755a;
    }

    public final int hashCode() {
        return (this.f138755a.hashCode() ^ this.f138756b.f138727b) ^ Integer.rotateLeft(this.f138757c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f138755a.toString() + this.f138756b.f138728c;
        ZoneOffset zoneOffset = this.f138756b;
        ZoneId zoneId = this.f138757c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId R() {
        return this.f138757c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime M(ZoneId zoneId) {
        return H(zoneId, this.f138756b, this.f138755a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f138757c.equals(zoneId)) {
            return this;
        }
        return O(g(), Instant.ofEpochSecond(this.f138755a.A(this.f138756b), r0.toLocalTime().f138707d), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = h.f138754a[chronoField.ordinal()];
            if (i10 == 1) {
                return b(j10 - h0(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            if (i10 == 2) {
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.f138926d.a(j10, chronoField));
                return O(g(), Instant.ofEpochSecond(this.f138755a.A(zoneOffsetOfTotalSeconds), r5.toLocalTime().f138707d), this.f138757c);
            }
            return H(this.f138757c, this.f138756b, this.f138755a.a(j10, temporalField));
        }
        return C(g(), temporalField.f0(this, j10));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime b(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return i(this.f138755a.b(j10, temporalUnit));
        }
        return C(g(), temporalUnit.C(this, j10));
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeX = g().x(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f138755a.until(chronoZonedDateTimeX.n(this.f138756b).D(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeX);
    }

    private Object writeReplace() {
        return new A((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }
}
