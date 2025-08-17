package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.B;
import j$.time.format.ResolverStyle;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q implements TemporalField {

    /* renamed from: f, reason: collision with root package name */
    public static final p f138967f = p.f(1, 7);

    /* renamed from: g, reason: collision with root package name */
    public static final p f138968g = p.g(0, 4, 6);

    /* renamed from: h, reason: collision with root package name */
    public static final p f138969h = p.g(0, 52, 54);

    /* renamed from: i, reason: collision with root package name */
    public static final p f138970i = p.g(1, 52, 53);

    /* renamed from: a, reason: collision with root package name */
    public final String f138971a;

    /* renamed from: b, reason: collision with root package name */
    public final WeekFields f138972b;

    /* renamed from: c, reason: collision with root package name */
    public final TemporalUnit f138973c;

    /* renamed from: d, reason: collision with root package name */
    public final TemporalUnit f138974d;

    /* renamed from: e, reason: collision with root package name */
    public final p f138975e;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public final ChronoLocalDate e(Chronology chronology, int i10, int i11, int i12) {
        ChronoLocalDate chronoLocalDateA0 = chronology.a0(i10, 1, 1);
        int iH = h(1, b(chronoLocalDateA0));
        int i13 = i12 - 1;
        return chronoLocalDateA0.b(((Math.min(i11, a(iH, chronoLocalDateA0.e0() + this.f138972b.f138932b) - 1) - 1) * 7) + i13 + (-iH), (TemporalUnit) ChronoUnit.DAYS);
    }

    public q(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, p pVar) {
        this.f138971a = str;
        this.f138972b = weekFields;
        this.f138973c = temporalUnit;
        this.f138974d = temporalUnit2;
        this.f138975e = pVar;
    }

    @Override // j$.time.temporal.TemporalField
    public final long Z(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f138974d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit != ChronoUnit.MONTHS) {
            if (temporalUnit != ChronoUnit.YEARS) {
                if (temporalUnit == WeekFields.f138930i) {
                    iC = d(temporalAccessor);
                } else if (temporalUnit == ChronoUnit.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int i10 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                iC = a(h(i10, iB), i10);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int i11 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            iC = a(h(i11, iB2), i11);
        }
        return iC;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.f138972b.f138931a.getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int i10 = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i11 = temporalAccessor.get(chronoField);
        int iH = h(i11, iB);
        int iA = a(iH, i11);
        return iA == 0 ? i10 - 1 : iA >= a(iH, ((int) temporalAccessor.k(chronoField).f138966d) + this.f138972b.f138932b) ? i10 + 1 : i10;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i10 = temporalAccessor.get(chronoField);
        int iH = h(i10, iB);
        int iA2 = a(iH, i10);
        if (iA2 == 0) {
            return d(Chronology.q(temporalAccessor).P(temporalAccessor).c(i10, (TemporalUnit) ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.k(chronoField).f138966d) + this.f138972b.f138932b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i10, int i11) {
        int iFloorMod = Math.floorMod(i10 - i11, 7);
        return iFloorMod + 1 > this.f138972b.f138932b ? 7 - iFloorMod : -iFloorMod;
    }

    public static int a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal f0(Temporal temporal, long j10) {
        if (this.f138975e.a(j10, this) == temporal.get(this)) {
            return temporal;
        }
        if (this.f138974d != ChronoUnit.FOREVER) {
            return temporal.b(r0 - r1, this.f138973c);
        }
        WeekFields weekFields = this.f138972b;
        return e(Chronology.q(temporal), (int) j10, temporal.get(weekFields.f138936f), temporal.get(weekFields.f138933c));
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor O(Map map, B b10, ResolverStyle resolverStyle) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        ChronoLocalDate chronoLocalDateB3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        p pVar = this.f138975e;
        WeekFields weekFields = this.f138972b;
        TemporalUnit temporalUnit = this.f138974d;
        if (temporalUnit == chronoUnit) {
            long jFloorMod = Math.floorMod((pVar.a(jLongValue, this) - 1) + (weekFields.f138931a.getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int iFloorMod = Math.floorMod(chronoField.f138926d.a(((Long) map.get(chronoField)).longValue(), chronoField) - weekFields.f138931a.getValue(), 7) + 1;
        Chronology chronologyQ = Chronology.q(b10);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            if ((temporalUnit != WeekFields.f138930i && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(weekFields.f138937g) || !map.containsKey(weekFields.f138936f)) {
                return null;
            }
            q qVar = weekFields.f138937g;
            int iA = qVar.f138975e.a(((Long) map.get(qVar)).longValue(), weekFields.f138937g);
            if (resolverStyle == ResolverStyle.LENIENT) {
                chronoLocalDateB = e(chronologyQ, iA, 1, iFloorMod).b(Math.subtractExact(((Long) map.get(weekFields.f138936f)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                q qVar2 = weekFields.f138936f;
                ChronoLocalDate chronoLocalDateE = e(chronologyQ, iA, qVar2.f138975e.a(((Long) map.get(qVar2)).longValue(), weekFields.f138936f), iFloorMod);
                if (resolverStyle == ResolverStyle.STRICT && c(chronoLocalDateE) != iA) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(weekFields.f138937g);
            map.remove(weekFields.f138936f);
            map.remove(chronoField);
            return chronoLocalDateB;
        }
        int iA2 = chronoField2.f138926d.a(((Long) map.get(chronoField2)).longValue(), chronoField2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                long jLongValue2 = ((Long) map.get(chronoField3)).longValue();
                long j10 = intExact;
                if (resolverStyle == ResolverStyle.LENIENT) {
                    ChronoLocalDate chronoLocalDateB4 = chronologyQ.a0(iA2, 1, 1).b(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(chronoLocalDateB4);
                    int i10 = chronoLocalDateB4.get(ChronoField.DAY_OF_MONTH);
                    chronoLocalDateB3 = chronoLocalDateB4.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j10, a(h(i10, iB), i10)), 7), iFloorMod - b(chronoLocalDateB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateA0 = chronologyQ.a0(iA2, chronoField3.f138926d.a(jLongValue2, chronoField3), 1);
                    long jA = pVar.a(j10, this);
                    int iB2 = b(chronoLocalDateA0);
                    int i11 = chronoLocalDateA0.get(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateB5 = chronoLocalDateA0.b((((int) (jA - a(h(i11, iB2), i11))) * 7) + (iFloorMod - b(chronoLocalDateA0)), (TemporalUnit) ChronoUnit.DAYS);
                    if (resolverStyle == ResolverStyle.STRICT && chronoLocalDateB5.j(chronoField3) != jLongValue2) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDateB3 = chronoLocalDateB5;
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField3);
                map.remove(chronoField);
                return chronoLocalDateB3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j11 = intExact;
        ChronoLocalDate chronoLocalDateA02 = chronologyQ.a0(iA2, 1, 1);
        if (resolverStyle == ResolverStyle.LENIENT) {
            int iB3 = b(chronoLocalDateA02);
            int i12 = chronoLocalDateA02.get(ChronoField.DAY_OF_YEAR);
            chronoLocalDateB2 = chronoLocalDateA02.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j11, a(h(i12, iB3), i12)), 7), iFloorMod - b(chronoLocalDateA02)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = pVar.a(j11, this);
            int iB4 = b(chronoLocalDateA02);
            int i13 = chronoLocalDateA02.get(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateB6 = chronoLocalDateA02.b((((int) (jA2 - a(h(i13, iB4), i13))) * 7) + (iFloorMod - b(chronoLocalDateA02)), (TemporalUnit) ChronoUnit.DAYS);
            if (resolverStyle == ResolverStyle.STRICT && chronoLocalDateB6.j(chronoField2) != iA2) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateB2 = chronoLocalDateB6;
        }
        map.remove(this);
        map.remove(chronoField2);
        map.remove(chronoField);
        return chronoLocalDateB2;
    }

    @Override // j$.time.temporal.TemporalField
    public final p Q() {
        return this.f138975e;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean C(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.h(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f138974d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.h(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f138930i) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.h(ChronoField.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final p H(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f138974d;
        if (temporalUnit == chronoUnit) {
            return this.f138975e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f138930i) {
            return g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.f138926d;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    public final p f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iH = h(temporalAccessor.get(chronoField), b(temporalAccessor));
        p pVarK = temporalAccessor.k(chronoField);
        return p.f(a(iH, (int) pVarK.f138963a), a(iH, (int) pVarK.f138966d));
    }

    public final p g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.h(chronoField)) {
            return f138969h;
        }
        int iB = b(temporalAccessor);
        int i10 = temporalAccessor.get(chronoField);
        int iH = h(i10, iB);
        int iA = a(iH, i10);
        if (iA != 0) {
            if (iA >= a(iH, this.f138972b.f138932b + ((int) temporalAccessor.k(chronoField).f138966d))) {
                return g(Chronology.q(temporalAccessor).P(temporalAccessor).b((r0 - i10) + 8, (TemporalUnit) ChronoUnit.DAYS));
            }
            return p.f(1L, r1 - 1);
        }
        return g(Chronology.q(temporalAccessor).P(temporalAccessor).c(i10 + 7, (TemporalUnit) ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.f138971a + "[" + this.f138972b.toString() + "]";
    }
}
