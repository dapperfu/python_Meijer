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
public final class t extends AbstractC14872c {

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDate f139369d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    public final transient LocalDate f139370a;

    /* renamed from: b, reason: collision with root package name */
    public final transient u f139371b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f139372c;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime T(LocalTime localTime) {
        return new C14874e(this, localTime);
    }

    public t(LocalDate localDate) {
        if (localDate.isBefore(f139369d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        u uVarO = u.o(localDate);
        this.f139371b = uVarO;
        this.f139372c = (localDate.getYear() - uVarO.f139376b.getYear()) + 1;
        this.f139370a = localDate;
    }

    public t(u uVar, int i10, LocalDate localDate) {
        if (localDate.isBefore(f139369d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f139371b = uVar;
        this.f139372c = i10;
        this.f139370a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return r.f139367c;
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        r.f139367c.getClass();
        return this.f139370a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j W() {
        return this.f139371b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int e0() {
        int iE0;
        u uVarP = this.f139371b.p();
        if (uVarP != null && uVarP.f139376b.getYear() == this.f139370a.getYear()) {
            iE0 = uVarP.f139376b.Q() - 1;
        } else {
            iE0 = this.f139370a.e0();
        }
        return this.f139372c == 1 ? iE0 - (this.f139371b.f139376b.Q() - 1) : iE0;
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
        int i10 = s.f139368a[chronoField.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.p.f(1L, this.f139370a.f0());
        }
        if (i10 == 2) {
            return j$.time.temporal.p.f(1L, e0());
        }
        if (i10 != 3) {
            return r.f139367c.F(chronoField);
        }
        int year = this.f139371b.f139376b.getYear();
        return this.f139371b.p() != null ? j$.time.temporal.p.f(1L, (r0.f139376b.getYear() - year) + 1) : j$.time.temporal.p.f(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Z(this);
        }
        switch (s.f139368a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.f139372c == 1 ? (this.f139370a.Q() - this.f139371b.f139376b.Q()) + 1 : this.f139370a.Q();
            case 3:
                return this.f139372c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.o(j$.time.b.a("Unsupported field: ", temporalField));
            case 8:
                return this.f139371b.f139375a;
            default:
                return this.f139370a.j(temporalField);
        }
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final t a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j10) {
                return this;
            }
            int[] iArr = s.f139368a;
            int i10 = iArr[chronoField.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                r rVar = r.f139367c;
                int iA = rVar.F(chronoField).a(j10, chronoField);
                int i11 = iArr[chronoField.ordinal()];
                if (i11 == 3) {
                    return k0(this.f139370a.u0(rVar.L(this.f139371b, iA)));
                }
                if (i11 == 8) {
                    return k0(this.f139370a.u0(rVar.L(u.q(iA), this.f139372c)));
                }
                if (i11 == 9) {
                    return k0(this.f139370a.u0(iA));
                }
            }
            return k0(this.f139370a.a(j10, temporalField));
        }
        return (t) super.a(j10, temporalField);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
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

    @Override // j$.time.chrono.AbstractC14872c
    public final ChronoLocalDate Z(long j10) {
        return k0(this.f139370a.q0(j10));
    }

    @Override // j$.time.chrono.AbstractC14872c
    public final ChronoLocalDate Q(long j10) {
        return k0(this.f139370a.o0(j10));
    }

    @Override // j$.time.chrono.AbstractC14872c
    public final ChronoLocalDate O(long j10) {
        return k0(this.f139370a.plusDays(j10));
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j10, TemporalUnit temporalUnit) {
        return (t) super.b(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j10, TemporalUnit temporalUnit) {
        return (t) super.b(j10, temporalUnit);
    }

    public final t f0(long j10, ChronoUnit chronoUnit) {
        return (t) super.b(j10, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j10, TemporalUnit temporalUnit) {
        return (t) super.c(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return (t) super.c(j10, temporalUnit);
    }

    public final t k0(LocalDate localDate) {
        return localDate.equals(this.f139370a) ? this : new t(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long S() {
        return this.f139370a.S();
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f139370a.equals(((t) obj).f139370a);
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
