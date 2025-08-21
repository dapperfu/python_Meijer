package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.B;
import j$.time.format.ResolverStyle;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class f implements TemporalField {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f139529a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f139530b;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f139530b.clone();
    }

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final p Q() {
                return p.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean C(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.DAY_OF_YEAR) || !temporalAccessor.h(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.h(ChronoField.YEAR)) {
                    return false;
                }
                f fVar2 = h.f139533a;
                return Chronology.q(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final p H(TemporalAccessor temporalAccessor) {
                if (!C(temporalAccessor)) {
                    throw new o("Unsupported field: DayOfQuarter");
                }
                long j10 = temporalAccessor.j(f.QUARTER_OF_YEAR);
                if (j10 == 1) {
                    return IsoChronology.INSTANCE.g0(temporalAccessor.j(ChronoField.YEAR)) ? p.f(1L, 91L) : p.f(1L, 90L);
                }
                if (j10 == 2) {
                    return p.f(1L, 91L);
                }
                if (j10 == 3 || j10 == 4) {
                    return p.f(1L, 92L);
                }
                return Q();
            }

            @Override // j$.time.temporal.TemporalField
            public final long Z(TemporalAccessor temporalAccessor) {
                if (!C(temporalAccessor)) {
                    throw new o("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(ChronoField.DAY_OF_YEAR) - f.f139529a[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.g0(temporalAccessor.j(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal f0(Temporal temporal, long j10) {
                long jZ = Z(temporal);
                Q().b(j10, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.a((j10 - jZ) + temporal.j(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor O(Map map, B b10, ResolverStyle resolverStyle) {
                long jSubtractExact;
                LocalDate localDateO0;
                ChronoField chronoField = ChronoField.YEAR;
                Long l10 = (Long) map.get(chronoField);
                TemporalField temporalField = f.QUARTER_OF_YEAR;
                Long l11 = (Long) map.get(temporalField);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = chronoField.f139516d.a(l10.longValue(), chronoField);
                long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f fVar2 = h.f139533a;
                if (!Chronology.q(b10).equals(IsoChronology.INSTANCE)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (resolverStyle == ResolverStyle.LENIENT) {
                    localDateO0 = LocalDate.of(iA, 1, 1).o0(Math.multiplyExact(Math.subtractExact(l11.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iA, ((temporalField.Q().a(l11.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (resolverStyle == ResolverStyle.STRICT) {
                            H(localDateOf).b(jLongValue, this);
                        } else {
                            Q().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDateO0 = localDateOf;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDateO0.plusDays(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final p Q() {
                return p.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean C(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.f139533a;
                return Chronology.q(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final long Z(TemporalAccessor temporalAccessor) {
                if (!C(temporalAccessor)) {
                    throw new o("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.j(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.TemporalField
            public final p H(TemporalAccessor temporalAccessor) {
                if (!C(temporalAccessor)) {
                    throw new o("Unsupported field: QuarterOfYear");
                }
                return Q();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal f0(Temporal temporal, long j10) {
                long jZ = Z(temporal);
                Q().b(j10, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.a(((j10 - jZ) * 3) + temporal.j(chronoField), chronoField);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final p Q() {
                return p.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean C(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.f139533a;
                return Chronology.q(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final p H(TemporalAccessor temporalAccessor) {
                if (C(temporalAccessor)) {
                    return f.l0(LocalDate.from(temporalAccessor));
                }
                throw new o("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final long Z(TemporalAccessor temporalAccessor) {
                if (!C(temporalAccessor)) {
                    throw new o("Unsupported field: WeekOfWeekBasedYear");
                }
                return f.i0(LocalDate.from(temporalAccessor));
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal f0(Temporal temporal, long j10) {
                Q().b(j10, this);
                return temporal.b(Math.subtractExact(j10, Z(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor O(Map map, B b10, ResolverStyle resolverStyle) {
                LocalDate localDateA;
                long j10;
                long j11;
                TemporalField temporalField = f.WEEK_BASED_YEAR;
                Long l10 = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l11 = (Long) map.get(chronoField);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = temporalField.Q().a(l10.longValue(), temporalField);
                long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f fVar4 = h.f139533a;
                if (!Chronology.q(b10).equals(IsoChronology.INSTANCE)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long jLongValue2 = l11.longValue();
                    if (jLongValue2 > 7) {
                        long j12 = jLongValue2 - 1;
                        j10 = 1;
                        localDateOf = localDateOf.p0(j12 / 7);
                        j11 = j12 % 7;
                    } else {
                        j10 = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.p0(Math.subtractExact(jLongValue2, 7L) / 7);
                            j11 = (jLongValue2 + 6) % 7;
                        }
                        localDateA = localDateOf.p0(Math.subtractExact(jLongValue, j10)).a(jLongValue2, chronoField);
                    }
                    jLongValue2 = j11 + j10;
                    localDateA = localDateOf.p0(Math.subtractExact(jLongValue, j10)).a(jLongValue2, chronoField);
                } else {
                    int iA2 = chronoField.f139516d.a(l11.longValue(), chronoField);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (resolverStyle == ResolverStyle.STRICT) {
                            f.l0(localDateOf).b(jLongValue, this);
                        } else {
                            Q().b(jLongValue, this);
                        }
                    }
                    localDateA = localDateOf.p0(jLongValue - 1).a(iA2, chronoField);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateA;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final p Q() {
                return ChronoField.YEAR.f139516d;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean C(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.f139533a;
                return Chronology.q(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final long Z(TemporalAccessor temporalAccessor) {
                if (C(temporalAccessor)) {
                    return f.j0(LocalDate.from(temporalAccessor));
                }
                throw new o("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final p H(TemporalAccessor temporalAccessor) {
                if (!C(temporalAccessor)) {
                    throw new o("Unsupported field: WeekBasedYear");
                }
                return Q();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal f0(Temporal temporal, long j10) {
                if (!C(temporal)) {
                    throw new o("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.f139516d.a(j10, f.WEEK_BASED_YEAR);
                LocalDate localDateFrom = LocalDate.from(temporal);
                int i10 = localDateFrom.get(ChronoField.DAY_OF_WEEK);
                int iI0 = f.i0(localDateFrom);
                if (iI0 == 53 && f.k0(iA) == 52) {
                    iI0 = 52;
                }
                return temporal.i(LocalDate.of(iA, 1, 4).plusDays(((iI0 - 1) * 7) + (i10 - r6.get(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        f139530b = new f[]{fVar, fVar2, fVar3, fVar4};
        f139529a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static p l0(LocalDate localDate) {
        return p.f(1L, k0(j0(localDate)));
    }

    public static int k0(int i10) {
        LocalDate localDateOf = LocalDate.of(i10, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.E()) ? 53 : 52;
        }
        return 53;
    }

    public static int i0(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iQ = localDate.Q() - 1;
        int i10 = (3 - iOrdinal) + iQ;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iQ >= i12) {
            int i13 = ((iQ - i12) / 7) + 1;
            if (i13 != 53 || i12 == -3 || (i12 == -2 && localDate.E())) {
                return i13;
            }
            return 1;
        }
        if (localDate.Q() != 180) {
            localDate = LocalDate.m0(localDate.f139286a, 180);
        }
        return (int) l0(localDate.minusYears(1L)).f139556d;
    }

    public static int j0(LocalDate localDate) {
        int year = localDate.getYear();
        int iQ = localDate.Q();
        if (iQ <= 3) {
            return iQ - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iQ >= 363) {
            return ((iQ - 363) - (localDate.E() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
