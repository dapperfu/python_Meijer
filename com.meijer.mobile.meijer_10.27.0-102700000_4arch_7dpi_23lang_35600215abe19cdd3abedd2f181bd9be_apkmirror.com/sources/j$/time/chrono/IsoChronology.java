package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.Year;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class IsoChronology extends AbstractC14782a implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.Chronology
    public final j I(int i10) {
        if (i10 == 0) {
            return p.BCE;
        }
        if (i10 == 1) {
            return p.CE;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final String v() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate a0(int i10, int i11, int i12) {
        return LocalDate.of(i10, i11, i12);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate y(int i10, int i11) {
        return LocalDate.m0(i10, i11);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate o(long j10) {
        return LocalDate.l0(j10);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P(TemporalAccessor temporalAccessor) {
        return LocalDate.from(temporalAccessor);
    }

    private IsoChronology() {
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime V(TemporalAccessor temporalAccessor) {
        return LocalDateTime.from(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime x(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.from(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime d0(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate U() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, "clock");
        return LocalDate.from(LocalDate.k0(clockSystemDefaultZone));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean g0(long j10) {
        if ((3 & j10) == 0) {
            return j10 % 100 != 0 || j10 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.Chronology
    public final int L(j jVar, int i10) {
        if (jVar instanceof p) {
            return jVar == p.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final List G() {
        return j$.desugar.sun.nio.fs.g.o(p.values());
    }

    @Override // j$.time.chrono.AbstractC14782a, j$.time.chrono.Chronology
    public final ChronoLocalDate c0(Map map, ResolverStyle resolverStyle) {
        return (LocalDate) super.c0(map, resolverStyle);
    }

    @Override // j$.time.chrono.AbstractC14782a
    public final void Q(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.i0(l10.longValue());
            }
            AbstractC14782a.C(map, ChronoField.MONTH_OF_YEAR, ((int) Math.floorMod(l10.longValue(), r4)) + 1);
            AbstractC14782a.C(map, ChronoField.YEAR, Math.floorDiv(l10.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC14782a
    public final ChronoLocalDate f0(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.i0(l10.longValue());
            }
            Long l11 = (Long) map.remove(ChronoField.ERA);
            if (l11 != null) {
                if (l11.longValue() == 1) {
                    AbstractC14782a.C(map, ChronoField.YEAR, l10.longValue());
                    return null;
                }
                if (l11.longValue() == 0) {
                    AbstractC14782a.C(map, ChronoField.YEAR, Math.subtractExact(1L, l10.longValue()));
                    return null;
                }
                throw new DateTimeException("Invalid value for era: " + l11);
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            Long l12 = (Long) map.get(chronoField2);
            if (resolverStyle != ResolverStyle.STRICT) {
                AbstractC14782a.C(map, chronoField2, (l12 == null || l12.longValue() > 0) ? l10.longValue() : Math.subtractExact(1L, l10.longValue()));
                return null;
            }
            if (l12 != null) {
                long jLongValue = l12.longValue();
                long jLongValue2 = l10.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractC14782a.C(map, chronoField2, jLongValue2);
                return null;
            }
            map.put(chronoField, l10);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        chronoField3.i0(((Long) map.get(chronoField3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC14782a
    public final ChronoLocalDate Z(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.f138926d.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z10 = true;
        if (resolverStyle == ResolverStyle.LENIENT) {
            return LocalDate.of(iA, 1, 1).o0(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.f138926d.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.f138926d.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (resolverStyle == ResolverStyle.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j10 = iA;
                int i10 = Year.f138717b;
                if ((3 & j10) != 0 || (j10 % 100 == 0 && j10 % 400 != 0)) {
                    z10 = false;
                }
                iA3 = Math.min(iA3, month.H(z10));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p F(ChronoField chronoField) {
        return chronoField.f138926d;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new A((byte) 1, this);
    }
}
