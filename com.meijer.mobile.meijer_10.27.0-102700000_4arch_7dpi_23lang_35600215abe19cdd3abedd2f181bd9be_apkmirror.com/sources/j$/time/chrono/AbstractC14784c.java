package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14784c implements ChronoLocalDate, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract ChronoLocalDate O(long j10);

    public abstract ChronoLocalDate Q(long j10);

    public abstract ChronoLocalDate Z(long j10);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal a(long j10, TemporalField temporalField) {
        return a(j10, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal c(long j10, TemporalUnit temporalUnit) {
        return c(j10, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public /* bridge */ /* synthetic */ Temporal i(LocalDate localDate) {
        return i(localDate);
    }

    public static ChronoLocalDate C(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.g())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.getId() + ", actual: " + chronoLocalDate.g().getId());
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate b(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.b(j10, temporalUnit);
        }
        switch (AbstractC14783b.f138744a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return O(j10);
            case 2:
                return O(Math.multiplyExact(j10, 7));
            case 3:
                return Q(j10);
            case 4:
                return Z(j10);
            case 5:
                return Z(Math.multiplyExact(j10, 10));
            case 6:
                return Z(Math.multiplyExact(j10, 100));
            case 7:
                return Z(Math.multiplyExact(j10, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(Math.addExact(j(chronoField), j10), (TemporalField) chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateP = g().P(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateP);
        }
        switch (AbstractC14783b.f138744a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateP.S() - S();
            case 2:
                return (chronoLocalDateP.S() - S()) / 7;
            case 3:
                return H(chronoLocalDateP);
            case 4:
                return H(chronoLocalDateP) / 12;
            case 5:
                return H(chronoLocalDateP) / 120;
            case 6:
                return H(chronoLocalDateP) / 1200;
            case 7:
                return H(chronoLocalDateP) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return chronoLocalDateP.j(chronoField) - j(chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long H(ChronoLocalDate chronoLocalDate) {
        if (g().F(ChronoField.MONTH_OF_YEAR).f138966d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j10 = j(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.j(chronoField) * 32) + chronoLocalDate.get(chronoField2)) - (j10 + get(chronoField2))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long jS = S();
        return ((int) (jS ^ (jS >>> 32))) ^ g().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long j10 = j(ChronoField.YEAR_OF_ERA);
        long j11 = j(ChronoField.MONTH_OF_YEAR);
        long j12 = j(ChronoField.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(g().toString());
        sb2.append(" ");
        sb2.append(W());
        sb2.append(" ");
        sb2.append(j10);
        sb2.append(j11 < 10 ? "-0" : "-");
        sb2.append(j11);
        sb2.append(j12 < 10 ? "-0" : "-");
        sb2.append(j12);
        return sb2.toString();
    }
}
