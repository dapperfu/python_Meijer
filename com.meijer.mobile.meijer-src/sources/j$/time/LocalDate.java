package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
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
public final class LocalDate implements Temporal, j$.time.temporal.k, ChronoLocalDate, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDate f139284d = of(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final LocalDate f139285e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    public final int f139286a;

    /* renamed from: b, reason: collision with root package name */
    public final short f139287b;

    /* renamed from: c, reason: collision with root package name */
    public final short f139288c;

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        return k0(Clock.systemDefaultZone());
    }

    public static LocalDate now(ZoneId zoneId) {
        return k0(Clock.c(zoneId));
    }

    public static LocalDate k0(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instantA = clock.a();
        ZoneId zone = clock.getZone();
        Objects.requireNonNull(instantA, "instant");
        Objects.requireNonNull(zone, "zone");
        return l0(Math.floorDiv(instantA.getEpochSecond() + zone.H().d(instantA).f139317b, 86400));
    }

    public static LocalDate of(int i10, int i11, int i12) {
        ChronoField.YEAR.i0(i10);
        ChronoField.MONTH_OF_YEAR.i0(i11);
        ChronoField.DAY_OF_MONTH.i0(i12);
        return H(i10, i11, i12);
    }

    public static LocalDate m0(int i10, int i11) {
        long j10 = i10;
        ChronoField.YEAR.i0(j10);
        ChronoField.DAY_OF_YEAR.i0(i11);
        boolean zG0 = IsoChronology.INSTANCE.g0(j10);
        if (i11 == 366 && !zG0) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        Month monthO = Month.O(((i11 - 1) / 31) + 1);
        if (i11 > (monthO.H(zG0) + monthO.C(zG0)) - 1) {
            monthO = Month.f139298a[((((int) 1) + 12) + monthO.ordinal()) % 12];
        }
        return new LocalDate(i10, monthO.getValue(), (i11 - monthO.C(zG0)) + 1);
    }

    public static LocalDate l0(long j10) {
        long j11;
        ChronoField.EPOCH_DAY.i0(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + (i11 / 10);
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.f139516d.a(j16, chronoField), i12, i13);
    }

    public static LocalDate from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.d(j$.time.temporal.n.f139551f);
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new c(1));
    }

    public static LocalDate H(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else if (IsoChronology.INSTANCE.g0(i10)) {
                i13 = 29;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.O(i11).name() + " " + i12 + "'");
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate r0(int i10, int i11, int i12) {
        if (i11 == 2) {
            i12 = Math.min(i12, IsoChronology.INSTANCE.g0((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new LocalDate(i10, i11, i12);
    }

    public LocalDate(int i10, int i11, int i12) {
        this.f139286a = i10;
        this.f139287b = (short) i11;
        this.f139288c = (short) i12;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.H(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
        int i10 = e.f139385a[chronoField.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.p.f(1L, f0());
        }
        if (i10 == 2) {
            return j$.time.temporal.p.f(1L, e0());
        }
        if (i10 != 3) {
            return i10 != 4 ? ((ChronoField) temporalField).f139516d : getYear() <= 0 ? j$.time.temporal.p.f(1L, 1000000000L) : j$.time.temporal.p.f(1L, 999999999L);
        }
        return j$.time.temporal.p.f(1L, (Month.O(this.f139287b) != Month.FEBRUARY || E()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return O(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return S();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return Z();
            }
            return O(temporalField);
        }
        return temporalField.Z(this);
    }

    public final int O(TemporalField temporalField) {
        switch (e.f139385a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f139288c;
            case 2:
                return Q();
            case 3:
                return ((this.f139288c - 1) / 7) + 1;
            case 4:
                int i10 = this.f139286a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f139288c - 1) % 7) + 1;
            case 7:
                return ((Q() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.o("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Q() - 1) / 7) + 1;
            case 10:
                return this.f139287b;
            case 11:
                throw new j$.time.temporal.o("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f139286a;
            case 13:
                return this.f139286a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
    }

    public final long Z() {
        return ((this.f139286a * 12) + this.f139287b) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return IsoChronology.INSTANCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j W() {
        return getYear() >= 1 ? j$.time.chrono.p.CE : j$.time.chrono.p.BCE;
    }

    public int getYear() {
        return this.f139286a;
    }

    public int getMonthValue() {
        return this.f139287b;
    }

    public final int Q() {
        return (Month.O(this.f139287b).C(E()) + this.f139288c) - 1;
    }

    public int getDayOfMonth() {
        return this.f139288c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.C(((int) Math.floorMod(S() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean E() {
        return IsoChronology.INSTANCE.g0(this.f139286a);
    }

    public final int f0() {
        short s10 = this.f139287b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : E() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int e0() {
        return E() ? 366 : 365;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: t0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return (LocalDate) kVar;
        }
        return (LocalDate) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j10, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.f0(this, j10);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.i0(j10);
        switch (e.f139385a[chronoField.ordinal()]) {
            case 1:
                int i10 = (int) j10;
                if (this.f139288c != i10) {
                    return of(this.f139286a, this.f139287b, i10);
                }
                return this;
            case 2:
                int i11 = (int) j10;
                if (Q() != i11) {
                    return m0(this.f139286a, i11);
                }
                return this;
            case 3:
                return p0(j10 - j(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f139286a < 1) {
                    j10 = 1 - j10;
                }
                return u0((int) j10);
            case 5:
                return plusDays(j10 - getDayOfWeek().getValue());
            case 6:
                return plusDays(j10 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j10 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return l0(j10);
            case 9:
                return p0(j10 - j(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j10;
                if (this.f139287b != i12) {
                    ChronoField.MONTH_OF_YEAR.i0(i12);
                    return r0(this.f139286a, i12, this.f139288c);
                }
                return this;
            case 11:
                return o0(j10 - Z());
            case 12:
                return u0((int) j10);
            case 13:
                if (j(ChronoField.ERA) != j10) {
                    return u0(1 - this.f139286a);
                }
                return this;
            default:
                throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalDate u0(int i10) {
        if (this.f139286a == i10) {
            return this;
        }
        ChronoField.YEAR.i0(i10);
        return r0(i10, this.f139287b, this.f139288c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate b0(j$.time.temporal.m mVar) {
        if (mVar != null) {
            Period period = (Period) mVar;
            return o0((period.f139304a * 12) + period.f139305b).plusDays(period.getDays());
        }
        Objects.requireNonNull(mVar, "amountToAdd");
        return (LocalDate) ((Period) mVar).C(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.C(this, j10);
        }
        switch (e.f139386b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j10);
            case 2:
                return p0(j10);
            case 3:
                return o0(j10);
            case 4:
                return q0(j10);
            case 5:
                return q0(Math.multiplyExact(j10, 10));
            case 6:
                return q0(Math.multiplyExact(j10, 100));
            case 7:
                return q0(Math.multiplyExact(j10, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(Math.addExact(j(chronoField), j10), chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final LocalDate q0(long j10) {
        if (j10 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return r0(chronoField.f139516d.a(this.f139286a + j10, chronoField), this.f139287b, this.f139288c);
    }

    public final LocalDate o0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f139286a * 12) + (this.f139287b - 1) + j10;
        ChronoField chronoField = ChronoField.YEAR;
        long j12 = 12;
        return r0(chronoField.f139516d.a(Math.floorDiv(j11, j12), chronoField), ((int) Math.floorMod(j11, j12)) + 1, this.f139288c);
    }

    public final LocalDate p0(long j10) {
        return plusDays(Math.multiplyExact(j10, 7));
    }

    public LocalDate plusDays(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = this.f139288c + j10;
        if (j11 > 0) {
            if (j11 <= 28) {
                return new LocalDate(this.f139286a, this.f139287b, (int) j11);
            }
            if (j11 <= 59) {
                long jF0 = f0();
                if (j11 <= jF0) {
                    return new LocalDate(this.f139286a, this.f139287b, (int) j11);
                }
                short s10 = this.f139287b;
                if (s10 < 12) {
                    return new LocalDate(this.f139286a, s10 + 1, (int) (j11 - jF0));
                }
                ChronoField.YEAR.i0(this.f139286a + 1);
                return new LocalDate(this.f139286a + 1, 1, (int) (j11 - jF0));
            }
        }
        return l0(Math.addExact(S(), j10));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    public LocalDate minusYears(long j10) {
        return j10 == Long.MIN_VALUE ? q0(Long.MAX_VALUE).q0(1L) : q0(-j10);
    }

    public LocalDate minusDays(long j10) {
        return j10 == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f139551f ? this : super.d(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateFrom);
        }
        switch (e.f139386b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateFrom.S() - S();
            case 2:
                return (localDateFrom.S() - S()) / 7;
            case 3:
                return j0(localDateFrom);
            case 4:
                return j0(localDateFrom) / 12;
            case 5:
                return j0(localDateFrom) / 120;
            case 6:
                return j0(localDateFrom) / 1200;
            case 7:
                return j0(localDateFrom) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateFrom.j(chronoField) - j(chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long j0(LocalDate localDate) {
        return (((localDate.Z() * 32) + localDate.getDayOfMonth()) - ((Z() * 32) + getDayOfMonth())) / 32;
    }

    public Period until(ChronoLocalDate chronoLocalDate) {
        LocalDate localDateFrom = from(chronoLocalDate);
        long jZ = localDateFrom.Z() - Z();
        int iF0 = localDateFrom.f139288c - this.f139288c;
        if (jZ > 0 && iF0 < 0) {
            jZ--;
            iF0 = (int) (localDateFrom.S() - o0(jZ).S());
        } else if (jZ < 0 && iF0 > 0) {
            jZ++;
            iF0 -= localDateFrom.f0();
        }
        return Period.a(Math.toIntExact(jZ / 12), (int) (jZ % 12), iF0);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime T(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    public LocalDateTime atTime(int i10, int i11, int i12) {
        LocalTime localTime;
        LocalTime localTime2 = LocalTime.MIN;
        ChronoField.HOUR_OF_DAY.i0(i10);
        if ((i11 | i12) == 0) {
            localTime = LocalTime.f139293f[i10];
        } else {
            ChronoField.MINUTE_OF_HOUR.i0(i11);
            ChronoField.SECOND_OF_MINUTE.i0(i12);
            localTime = new LocalTime(i10, i11, i12, 0);
        }
        return T(localTime);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.of(this, LocalTime.f139292e);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeT = T(LocalTime.f139292e);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.H().e(localDateTimeT);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.C()) {
                localDateTimeT = bVar.f139570b.Q(bVar.f139572d.f139317b - bVar.f139571c.f139317b);
            }
        }
        return ZonedDateTime.O(localDateTimeT, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long S() {
        long j10 = this.f139286a;
        long j11 = this.f139287b;
        long j12 = 365 * j10;
        long j13 = (((367 * j11) - 362) / 12) + (j10 >= 0 ? ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12 : j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))))) + (this.f139288c - 1);
        if (j11 > 2) {
            j13 = !E() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return C((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    public final int C(LocalDate localDate) {
        int i10 = this.f139286a - localDate.f139286a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f139287b - localDate.f139287b;
        return i11 == 0 ? this.f139288c - localDate.f139288c : i11;
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? C((LocalDate) chronoLocalDate) > 0 : S() > chronoLocalDate.S();
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? C((LocalDate) chronoLocalDate) < 0 : S() < chronoLocalDate.S();
    }

    public boolean isEqual(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? C((LocalDate) chronoLocalDate) == 0 : S() == chronoLocalDate.S();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && C((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i10 = this.f139286a;
        return (((i10 << 11) + (this.f139287b << 6)) + this.f139288c) ^ (i10 & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i10 = this.f139286a;
        short s10 = this.f139287b;
        short s11 = this.f139288c;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new n((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
