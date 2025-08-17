package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class t extends AbstractC14784c {

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDate f138779d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    public final transient LocalDate f138780a;

    /* renamed from: b, reason: collision with root package name */
    public final transient u f138781b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f138782c;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime T(LocalTime localTime) {
        return new C14786e(this, localTime);
    }

    public t(LocalDate localDate) {
        if (localDate.isBefore(f138779d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        u uVarO = u.o(localDate);
        this.f138781b = uVarO;
        this.f138782c = (localDate.getYear() - uVarO.f138786b.getYear()) + 1;
        this.f138780a = localDate;
    }

    public t(u uVar, int i10, LocalDate localDate) {
        if (localDate.isBefore(f138779d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f138781b = uVar;
        this.f138782c = i10;
        this.f138780a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return r.f138777c;
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        r.f138777c.getClass();
        return this.f138780a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j W() {
        return this.f138781b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int e0() {
        int iE0;
        u uVarP = this.f138781b.p();
        if (uVarP != null && uVarP.f138786b.getYear() == this.f138780a.getYear()) {
            iE0 = uVarP.f138786b.Q() - 1;
        } else {
            iE0 = this.f138780a.e0();
        }
        return this.f138782c == 1 ? iE0 - (this.f138781b.f138786b.Q() - 1) : iE0;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.H(this);
        }
        if (!h(temporalField)) {
            throw new j$.time.temporal.o(j$.time.b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i10 = s.f138778a[chronoField.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.p.f(1L, this.f138780a.f0());
        }
        if (i10 == 2) {
            return j$.time.temporal.p.f(1L, e0());
        }
        if (i10 != 3) {
            return r.f138777c.F(chronoField);
        }
        int year = this.f138781b.f138786b.getYear();
        return this.f138781b.p() != null ? j$.time.temporal.p.f(1L, (r0.f138786b.getYear() - year) + 1) : j$.time.temporal.p.f(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Z(this);
        }
        switch (s.f138778a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.f138782c == 1 ? (this.f138780a.Q() - this.f138781b.f138786b.Q()) + 1 : this.f138780a.Q();
            case 3:
                return this.f138782c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.o(j$.time.b.a("Unsupported field: ", temporalField));
            case 8:
                return this.f138781b.f138785a;
            default:
                return this.f138780a.j(temporalField);
        }
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final t a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j10) {
                return this;
            }
            int[] iArr = s.f138778a;
            int i10 = iArr[chronoField.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                r rVar = r.f138777c;
                int iA = rVar.F(chronoField).a(j10, chronoField);
                int i11 = iArr[chronoField.ordinal()];
                if (i11 == 3) {
                    return k0(this.f138780a.u0(rVar.L(this.f138781b, iA)));
                }
                if (i11 == 8) {
                    return k0(this.f138780a.u0(rVar.L(u.q(iA), this.f138782c)));
                }
                if (i11 == 9) {
                    return k0(this.f138780a.u0(iA));
                }
            }
            return k0(this.f138780a.a(j10, temporalField));
        }
        return (t) super.a(j10, temporalField);
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (t) super.i(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (t) super.i(kVar);
    }

    public final t j0(j$.time.c cVar) {
        return (t) super.i(cVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate b0(j$.time.temporal.m mVar) {
        return (t) super.b0(mVar);
    }

    @Override // j$.time.chrono.AbstractC14784c
    public final ChronoLocalDate Z(long j10) {
        return k0(this.f138780a.q0(j10));
    }

    @Override // j$.time.chrono.AbstractC14784c
    public final ChronoLocalDate Q(long j10) {
        return k0(this.f138780a.o0(j10));
    }

    @Override // j$.time.chrono.AbstractC14784c
    public final ChronoLocalDate O(long j10) {
        return k0(this.f138780a.plusDays(j10));
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j10, TemporalUnit temporalUnit) {
        return (t) super.b(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j10, TemporalUnit temporalUnit) {
        return (t) super.b(j10, temporalUnit);
    }

    public final t f0(long j10, ChronoUnit chronoUnit) {
        return (t) super.b(j10, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j10, TemporalUnit temporalUnit) {
        return (t) super.c(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return (t) super.c(j10, temporalUnit);
    }

    public final t k0(LocalDate localDate) {
        return localDate.equals(this.f138780a) ? this : new t(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long S() {
        return this.f138780a.S();
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f138780a.equals(((t) obj).f138780a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new A((byte) 4, this);
    }
}
