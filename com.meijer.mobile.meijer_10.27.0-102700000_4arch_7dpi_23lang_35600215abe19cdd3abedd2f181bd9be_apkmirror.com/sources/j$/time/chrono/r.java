package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r extends AbstractC14782a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final r f138777c = new r();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final String v() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate a0(int i10, int i11, int i12) {
        return new t(LocalDate.of(i10, i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate y(int i10, int i11) {
        return new t(LocalDate.m0(i10, i11));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate o(long j10) {
        return new t(LocalDate.l0(j10));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate U() {
        return new t(LocalDate.from(LocalDate.k0(Clock.systemDefaultZone())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof t) {
            return (t) temporalAccessor;
        }
        return new t(LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final List G() {
        u[] uVarArr = u.f138784e;
        return j$.desugar.sun.nio.fs.g.o((u[]) Arrays.copyOf(uVarArr, uVarArr.length));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean g0(long j10) {
        return IsoChronology.INSTANCE.g0(j10);
    }

    private r() {
    }

    @Override // j$.time.chrono.Chronology
    public final int L(j jVar, int i10) {
        if (!(jVar instanceof u)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        u uVar = (u) jVar;
        int year = (uVar.f138786b.getYear() + i10) - 1;
        if (i10 != 1 && (year < -999999999 || year > 999999999 || year < uVar.f138786b.getYear() || jVar != u.o(LocalDate.of(year, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.Chronology
    public final j I(int i10) {
        return u.q(i10);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p F(ChronoField chronoField) {
        switch (q.f138776a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.o("Unsupported field: " + chronoField);
            case 5:
                u[] uVarArr = u.f138784e;
                int year = uVarArr[uVarArr.length - 1].f138786b.getYear();
                int year2 = 1000000000 - uVarArr[uVarArr.length - 1].f138786b.getYear();
                int year3 = uVarArr[0].f138786b.getYear();
                int i10 = 1;
                while (true) {
                    u[] uVarArr2 = u.f138784e;
                    if (i10 >= uVarArr2.length) {
                        return j$.time.temporal.p.g(1L, year2, 999999999 - year);
                    }
                    u uVar = uVarArr2[i10];
                    year2 = Math.min(year2, (uVar.f138786b.getYear() - year3) + 1);
                    year3 = uVar.f138786b.getYear();
                    i10++;
                }
            case 6:
                u uVar2 = u.f138783d;
                long j10 = ChronoField.DAY_OF_YEAR.f138926d.f138965c;
                long jMin = j10;
                for (u uVar3 : u.f138784e) {
                    long jMin2 = Math.min(jMin, (uVar3.f138786b.e0() - uVar3.f138786b.Q()) + 1);
                    jMin = uVar3.p() != null ? Math.min(jMin2, uVar3.p().f138786b.Q() - 1) : jMin2;
                }
                return j$.time.temporal.p.g(1L, jMin, ChronoField.DAY_OF_YEAR.f138926d.f138966d);
            case 7:
                return j$.time.temporal.p.f(t.f138779d.getYear(), 999999999L);
            case 8:
                long j11 = u.f138783d.f138785a;
                u[] uVarArr3 = u.f138784e;
                return j$.time.temporal.p.f(j11, uVarArr3[uVarArr3.length - 1].f138785a);
            default:
                return chronoField.f138926d;
        }
    }

    @Override // j$.time.chrono.AbstractC14782a, j$.time.chrono.Chronology
    public final ChronoLocalDate c0(Map map, ResolverStyle resolverStyle) {
        return (t) super.c0(map, resolverStyle);
    }

    @Override // j$.time.chrono.AbstractC14782a
    public final ChronoLocalDate f0(Map map, ResolverStyle resolverStyle) {
        t tVarJ0;
        ChronoField chronoField = ChronoField.ERA;
        Long l10 = (Long) map.get(chronoField);
        u uVarQ = l10 != null ? u.q(F(chronoField).a(l10.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l11 = (Long) map.get(chronoField2);
        int iA = l11 != null ? F(chronoField2).a(l11.longValue(), chronoField2) : 0;
        if (uVarQ == null && l11 != null && !map.containsKey(ChronoField.YEAR) && resolverStyle != ResolverStyle.STRICT) {
            u[] uVarArr = u.f138784e;
            uVarQ = ((u[]) Arrays.copyOf(uVarArr, uVarArr.length))[((u[]) Arrays.copyOf(uVarArr, uVarArr.length)).length - 1];
        }
        if (l11 != null && uVarQ != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return new t(LocalDate.of((uVarQ.f138786b.getYear() + iA) - 1, 1, 1)).f0(Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).f0(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = F(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = F(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (resolverStyle != ResolverStyle.SMART) {
                        LocalDate localDate = t.f138779d;
                        LocalDate localDateOf = LocalDate.of((uVarQ.f138786b.getYear() + iA) - 1, iA2, iA3);
                        if (localDateOf.isBefore(uVarQ.f138786b) || uVarQ != u.o(localDateOf)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new t(uVarQ, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iA);
                    }
                    int year = (uVarQ.f138786b.getYear() + iA) - 1;
                    try {
                        tVarJ0 = new t(LocalDate.of(year, iA2, iA3));
                    } catch (DateTimeException unused) {
                        tVarJ0 = new t(LocalDate.of(year, iA2, 1)).j0(new j$.time.c(7));
                    }
                    if (tVarJ0.f138781b == uVarQ || tVarJ0.get(ChronoField.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return tVarJ0;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + uVarQ + " " + iA);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    return new t(LocalDate.m0((uVarQ.f138786b.getYear() + iA) - 1, 1)).f0(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = F(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = t.f138779d;
                LocalDate localDateM0 = iA == 1 ? LocalDate.m0(uVarQ.f138786b.getYear(), (uVarQ.f138786b.Q() + iA4) - 1) : LocalDate.m0((uVarQ.f138786b.getYear() + iA) - 1, iA4);
                if (localDateM0.isBefore(uVarQ.f138786b) || uVarQ != u.o(localDateM0)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new t(uVarQ, iA, localDateM0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime d0(Instant instant, ZoneId zoneId) {
        return i.O(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new A((byte) 1, this);
    }
}
