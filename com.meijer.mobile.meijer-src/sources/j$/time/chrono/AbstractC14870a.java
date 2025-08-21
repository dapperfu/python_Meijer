package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14870a implements Chronology {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f139332a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f139333b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static Chronology H(Chronology chronology, String str) {
        String strV;
        Chronology chronology2 = (Chronology) f139332a.putIfAbsent(str, chronology);
        if (chronology2 == null && (strV = chronology.v()) != null) {
            f139333b.putIfAbsent(strV, chronology);
        }
        return chronology2;
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate c0(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return o(((Long) map.remove(chronoField)).longValue());
        }
        Q(map, resolverStyle);
        ChronoLocalDate chronoLocalDateF0 = f0(map, resolverStyle);
        if (chronoLocalDateF0 != null) {
            return chronoLocalDateF0;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return Z(map, resolverStyle);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int iA = F(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return a0(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = F(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = F(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    ChronoLocalDate chronoLocalDateB = a0(iA, iA2, 1).b((F(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateB.get(chronoField3) == iA2) {
                        return chronoLocalDateB;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int iA4 = F(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return O(a0(iA4, 1, 1), Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int iA5 = F(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    ChronoLocalDate chronoLocalDateI = a0(iA4, iA5, 1).b((F(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new j$.time.temporal.l(DayOfWeek.C(F(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                    if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateI.get(chronoField3) == iA5) {
                        return chronoLocalDateI;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int iA6 = F(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (resolverStyle != ResolverStyle.LENIENT) {
                return y(iA6, F(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            return y(iA6, 1).b(Math.subtractExact(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int iA7 = F(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (resolverStyle == ResolverStyle.LENIENT) {
                return y(iA7, 1).b(Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = F(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            ChronoLocalDate chronoLocalDateB2 = y(iA7, 1).b((F(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateB2.get(chronoField2) == iA7) {
                return chronoLocalDateB2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int iA9 = F(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return O(y(iA9, 1), 0L, Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        ChronoLocalDate chronoLocalDateI2 = y(iA9, 1).b((F(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new j$.time.temporal.l(DayOfWeek.C(F(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
        if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateI2.get(chronoField2) == iA9) {
            return chronoLocalDateI2;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    public void Q(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.i0(l10.longValue());
            }
            ChronoLocalDate chronoLocalDateA = U().a(1L, (TemporalField) ChronoField.DAY_OF_MONTH).a(l10.longValue(), (TemporalField) chronoField);
            C(map, ChronoField.MONTH_OF_YEAR, chronoLocalDateA.get(r0));
            C(map, ChronoField.YEAR, chronoLocalDateA.get(r0));
        }
    }

    public ChronoLocalDate f0(Map map, ResolverStyle resolverStyle) {
        int intExact;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            Long l11 = (Long) map.remove(ChronoField.ERA);
            if (resolverStyle != ResolverStyle.LENIENT) {
                intExact = F(chronoField).a(l10.longValue(), chronoField);
            } else {
                intExact = Math.toIntExact(l10.longValue());
            }
            if (l11 != null) {
                C(map, ChronoField.YEAR, L(I(F(r2).a(l11.longValue(), r2)), intExact));
                return null;
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            if (map.containsKey(chronoField2)) {
                C(map, chronoField2, L(y(F(chronoField2).a(((Long) map.get(chronoField2)).longValue(), chronoField2), 1).W(), intExact));
                return null;
            }
            if (resolverStyle == ResolverStyle.STRICT) {
                map.put(chronoField, l10);
                return null;
            }
            if (G().isEmpty()) {
                C(map, chronoField2, intExact);
                return null;
            }
            C(map, chronoField2, L((j) r9.get(r9.size() - 1), intExact));
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        F(chronoField3).b(((Long) map.get(chronoField3)).longValue(), chronoField3);
        return null;
    }

    public ChronoLocalDate Z(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = F(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return a0(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = F(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = F(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (resolverStyle != ResolverStyle.SMART) {
            return a0(iA, iA2, iA3);
        }
        try {
            return a0(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return a0(iA, iA2, 1).i(new j$.time.c(7));
        }
    }

    public static ChronoLocalDate O(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12) {
        long j13;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j10, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j11, (TemporalUnit) chronoUnit);
        if (j12 > 7) {
            long j14 = j12 - 1;
            chronoLocalDateB2 = chronoLocalDateB2.b(j14 / 7, (TemporalUnit) chronoUnit);
            j13 = j14 % 7;
        } else {
            if (j12 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(Math.subtractExact(j12, 7L) / 7, (TemporalUnit) chronoUnit);
                j13 = (j12 + 6) % 7;
            }
            return chronoLocalDateB2.i(new j$.time.temporal.l(DayOfWeek.C((int) j12).getValue(), 0));
        }
        j12 = j13 + 1;
        return chronoLocalDateB2.i(new j$.time.temporal.l(DayOfWeek.C((int) j12).getValue(), 0));
    }

    public static void C(Map map, ChronoField chronoField, long j10) {
        Long l10 = (Long) map.get(chronoField);
        if (l10 != null && l10.longValue() != j10) {
            throw new DateTimeException("Conflict found: " + chronoField + " " + l10 + " differs from " + chronoField + " " + j10);
        }
        map.put(chronoField, Long.valueOf(j10));
    }

    @Override // j$.time.chrono.Chronology, java.lang.Comparable
    /* renamed from: K */
    public final int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC14870a) && compareTo((AbstractC14870a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return getId();
    }
}
