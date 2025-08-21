package j$.time;

import fsimpl.C14170dq;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
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
public final class Year implements Temporal, j$.time.temporal.k, Comparable<Year>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f139307b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    public final int f139308a;

    @Override // java.lang.Comparable
    public final int compareTo(Year year) {
        return this.f139308a - year.f139308a;
    }

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    }

    public static Year now() {
        return of(LocalDate.k0(Clock.systemDefaultZone()).getYear());
    }

    public static Year of(int i10) {
        ChronoField.YEAR.i0(i10);
        return new Year(i10);
    }

    public static Year from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Year) {
            return (Year) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.q(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(ChronoField.YEAR));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public Year(int i10) {
        this.f139308a = i10;
    }

    public int getValue() {
        return this.f139308a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, this.f139308a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Z(this);
        }
        int i10 = o.f139504a[((ChronoField) temporalField).ordinal()];
        if (i10 == 1) {
            int i11 = this.f139308a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f139308a;
        }
        if (i10 == 3) {
            return this.f139308a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (Year) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Year a(long j10, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Year) temporalField.f0(this, j10);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.i0(j10);
        int i10 = o.f139504a[chronoField.ordinal()];
        if (i10 == 1) {
            if (this.f139308a < 1) {
                j10 = 1 - j10;
            }
            return of((int) j10);
        }
        if (i10 == 2) {
            return of((int) j10);
        }
        if (i10 == 3) {
            return j(ChronoField.ERA) == j10 ? this : of(1 - this.f139308a);
        }
        throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final Year b(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Year) temporalUnit.C(this, j10);
        }
        int i10 = o.f139505b[((ChronoUnit) temporalUnit).ordinal()];
        if (i10 == 1) {
            return H(j10);
        }
        if (i10 == 2) {
            return H(Math.multiplyExact(j10, 10));
        }
        if (i10 == 3) {
            return H(Math.multiplyExact(j10, 100));
        }
        if (i10 == 4) {
            return H(Math.multiplyExact(j10, 1000));
        }
        if (i10 == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return a(Math.addExact(j(chronoField), j10), chronoField);
        }
        throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
    }

    public final Year H(long j10) {
        if (j10 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return of(chronoField.f139516d.a(this.f139308a + j10, chronoField));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }

    public Year minusYears(long j10) {
        return j10 == Long.MIN_VALUE ? H(Long.MAX_VALUE).H(1L) : H(-j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139547b) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == j$.time.temporal.n.f139548c) {
            return ChronoUnit.YEARS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.q(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(this.f139308a, ChronoField.YEAR);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Year yearFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long j10 = yearFrom.f139308a - this.f139308a;
            int i10 = o.f139505b[((ChronoUnit) temporalUnit).ordinal()];
            if (i10 == 1) {
                return j10;
            }
            if (i10 == 2) {
                return j10 / 10;
            }
            if (i10 == 3) {
                return j10 / 100;
            }
            if (i10 == 4) {
                return j10 / 1000;
            }
            if (i10 == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return yearFrom.j(chronoField) - j(chronoField);
            }
            throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, yearFrom);
    }

    public LocalDate atDay(int i10) {
        return LocalDate.m0(this.f139308a, i10);
    }

    public YearMonth atMonth(Month month) {
        int i10 = this.f139308a;
        int i11 = YearMonth.f139309c;
        Objects.requireNonNull(month, "month");
        return YearMonth.of(i10, month.getValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Year) && this.f139308a == ((Year) obj).f139308a;
    }

    public int hashCode() {
        return this.f139308a;
    }

    public String toString() {
        return Integer.toString(this.f139308a);
    }

    private Object writeReplace() {
        return new n(C14170dq.DST_ATOP, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
