package j$.time;

import fsimpl.C14045dq;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
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
public final class YearMonth implements Temporal, j$.time.temporal.k, Comparable<YearMonth>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f138719c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    public final int f138720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138721b;

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i10 = this.f138720a - yearMonth2.f138720a;
        return i10 == 0 ? this.f138721b - yearMonth2.f138721b : i10;
    }

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    }

    public static YearMonth now() {
        return now(Clock.systemDefaultZone());
    }

    public static YearMonth now(Clock clock) {
        LocalDate localDateK0 = LocalDate.k0(clock);
        int year = localDateK0.getYear();
        Month monthO = Month.O(localDateK0.f138698b);
        Objects.requireNonNull(monthO, "month");
        return of(year, monthO.getValue());
    }

    public static YearMonth of(int i10, int i11) {
        ChronoField.YEAR.i0(i10);
        ChronoField.MONTH_OF_YEAR.i0(i11);
        return new YearMonth(i10, i11);
    }

    public static YearMonth from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.q(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static YearMonth parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (YearMonth) dateTimeFormatter.parse(charSequence, new c(5));
    }

    public YearMonth(int i10, int i11) {
        this.f138720a = i10;
        this.f138721b = i11;
    }

    public final YearMonth Q(int i10, int i11) {
        return (this.f138720a == i10 && this.f138721b == i11) ? this : new YearMonth(i10, i11);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i10;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Z(this);
        }
        int i11 = p.f138916a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f138721b;
        } else {
            if (i11 == 2) {
                return C();
            }
            if (i11 == 3) {
                int i12 = this.f138720a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f138720a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
            }
            i10 = this.f138720a;
        }
        return i10;
    }

    public final long C() {
        return ((this.f138720a * 12) + this.f138721b) - 1;
    }

    public int getYear() {
        return this.f138720a;
    }

    public int getMonthValue() {
        return this.f138721b;
    }

    public Month getMonth() {
        return Month.O(this.f138721b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (YearMonth) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final YearMonth a(long j10, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.f0(this, j10);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.i0(j10);
        int i10 = p.f138916a[chronoField.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j10;
            ChronoField.MONTH_OF_YEAR.i0(i11);
            return Q(this.f138720a, i11);
        }
        if (i10 == 2) {
            return plusMonths(j10 - C());
        }
        if (i10 == 3) {
            if (this.f138720a < 1) {
                j10 = 1 - j10;
            }
            int i12 = (int) j10;
            ChronoField.YEAR.i0(i12);
            return Q(i12, this.f138721b);
        }
        if (i10 == 4) {
            int i13 = (int) j10;
            ChronoField.YEAR.i0(i13);
            return Q(i13, this.f138721b);
        }
        if (i10 != 5) {
            throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
        if (j(ChronoField.ERA) == j10) {
            return this;
        }
        int i14 = 1 - this.f138720a;
        ChronoField.YEAR.i0(i14);
        return Q(i14, this.f138721b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final YearMonth b(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (YearMonth) temporalUnit.C(this, j10);
        }
        switch (p.f138917b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusMonths(j10);
            case 2:
                return O(j10);
            case 3:
                return O(Math.multiplyExact(j10, 10));
            case 4:
                return O(Math.multiplyExact(j10, 100));
            case 5:
                return O(Math.multiplyExact(j10, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return a(Math.addExact(j(chronoField), j10), chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final YearMonth O(long j10) {
        if (j10 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return Q(chronoField.f138926d.a(this.f138720a + j10, chronoField), this.f138721b);
    }

    public YearMonth plusMonths(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f138720a * 12) + (this.f138721b - 1) + j10;
        ChronoField chronoField = ChronoField.YEAR;
        long j12 = 12;
        return Q(chronoField.f138926d.a(Math.floorDiv(j11, j12), chronoField), ((int) Math.floorMod(j11, j12)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    public YearMonth minusYears(long j10) {
        return j10 == Long.MIN_VALUE ? O(Long.MAX_VALUE).O(1L) : O(-j10);
    }

    public YearMonth minusMonths(long j10) {
        return j10 == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f138957b) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == j$.time.temporal.n.f138958c) {
            return ChronoUnit.MONTHS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.q(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(C(), ChronoField.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth yearMonthFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jC = yearMonthFrom.C() - C();
            switch (p.f138917b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jC;
                case 2:
                    return jC / 12;
                case 3:
                    return jC / 120;
                case 4:
                    return jC / 1200;
                case 5:
                    return jC / 12000;
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return yearMonthFrom.j(chronoField) - j(chronoField);
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, yearMonthFrom);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public LocalDate atDay(int i10) {
        return LocalDate.of(this.f138720a, this.f138721b, i10);
    }

    public boolean isAfter(YearMonth yearMonth) {
        int i10 = this.f138720a - yearMonth.f138720a;
        if (i10 == 0) {
            i10 = this.f138721b - yearMonth.f138721b;
        }
        return i10 > 0;
    }

    public boolean isBefore(YearMonth yearMonth) {
        int i10 = this.f138720a - yearMonth.f138720a;
        if (i10 == 0) {
            i10 = this.f138721b - yearMonth.f138721b;
        }
        return i10 < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.f138720a == yearMonth.f138720a && this.f138721b == yearMonth.f138721b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f138720a ^ (this.f138721b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f138720a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i10 = this.f138720a;
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f138720a);
        }
        sb2.append(this.f138721b < 10 ? "-0" : "-");
        sb2.append(this.f138721b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new n(C14045dq.XOR, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
