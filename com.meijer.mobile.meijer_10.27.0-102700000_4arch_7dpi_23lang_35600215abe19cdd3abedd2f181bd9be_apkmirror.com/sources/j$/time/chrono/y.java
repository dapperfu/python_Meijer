package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class y extends AbstractC14784c {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a, reason: collision with root package name */
    public final transient LocalDate f138791a;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime T(LocalTime localTime) {
        return new C14786e(this, localTime);
    }

    public y(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f138791a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return w.f138789c;
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        w.f138789c.getClass();
        return this.f138791a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j W() {
        return f0() >= 1 ? z.ROC : z.BEFORE_ROC;
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
        int i10 = x.f138790a[chronoField.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f138791a.k(temporalField);
        }
        if (i10 != 4) {
            return w.f138789c.F(chronoField);
        }
        j$.time.temporal.p pVar = ChronoField.YEAR.f138926d;
        return j$.time.temporal.p.f(1L, f0() <= 0 ? (-pVar.f138963a) + 1912 : pVar.f138966d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = x.f138790a[((ChronoField) temporalField).ordinal()];
            if (i10 == 4) {
                int iF0 = f0();
                if (iF0 < 1) {
                    iF0 = 1 - iF0;
                }
                return iF0;
            }
            if (i10 == 5) {
                return ((f0() * 12) + this.f138791a.getMonthValue()) - 1;
            }
            if (i10 == 6) {
                return f0();
            }
            if (i10 != 7) {
                return this.f138791a.j(temporalField);
            }
            return f0() < 1 ? 0 : 1;
        }
        return temporalField.Z(this);
    }

    public final int f0() {
        return this.f138791a.getYear() - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.y a(long r8, j$.time.temporal.TemporalField r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto La3
            r0 = r10
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r7.j(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.x.f138790a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L4d
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L4d
            if (r2 == r3) goto L4d
            goto L63
        L25:
            j$.time.chrono.w r10 = j$.time.chrono.w.f138789c
            j$.time.temporal.p r10 = r10.F(r0)
            r10.b(r8, r0)
            int r10 = r7.f0()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.LocalDate r10 = r7.f138791a
            int r10 = r10.getMonthValue()
            long r2 = (long) r10
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.LocalDate r10 = r7.f138791a
            j$.time.LocalDate r8 = r10.o0(r8)
            j$.time.chrono.y r8 = r7.j0(r8)
            return r8
        L4d:
            j$.time.chrono.w r2 = j$.time.chrono.w.f138789c
            j$.time.temporal.p r2 = r2.F(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L8c
            if (r0 == r4) goto L7f
            if (r0 == r3) goto L6e
        L63:
            j$.time.LocalDate r0 = r7.f138791a
            j$.time.LocalDate r8 = r0.a(r8, r10)
            j$.time.chrono.y r8 = r7.j0(r8)
            return r8
        L6e:
            j$.time.LocalDate r8 = r7.f138791a
            int r9 = r7.f0()
            int r9 = 1912 - r9
            j$.time.LocalDate r8 = r8.u0(r9)
            j$.time.chrono.y r8 = r7.j0(r8)
            return r8
        L7f:
            j$.time.LocalDate r8 = r7.f138791a
            int r2 = r2 + 1911
            j$.time.LocalDate r8 = r8.u0(r2)
            j$.time.chrono.y r8 = r7.j0(r8)
            return r8
        L8c:
            j$.time.LocalDate r8 = r7.f138791a
            int r9 = r7.f0()
            r10 = 1
            if (r9 < r10) goto L98
            int r2 = r2 + 1911
            goto L9a
        L98:
            int r2 = 1912 - r2
        L9a:
            j$.time.LocalDate r8 = r8.u0(r2)
            j$.time.chrono.y r8 = r7.j0(r8)
            return r8
        La3:
            j$.time.chrono.ChronoLocalDate r8 = super.a(r8, r10)
            j$.time.chrono.y r8 = (j$.time.chrono.y) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.a(long, j$.time.temporal.TemporalField):j$.time.chrono.y");
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (y) super.i(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (y) super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate b0(j$.time.temporal.m mVar) {
        return (y) super.b0(mVar);
    }

    @Override // j$.time.chrono.AbstractC14784c
    public final ChronoLocalDate Z(long j10) {
        return j0(this.f138791a.q0(j10));
    }

    @Override // j$.time.chrono.AbstractC14784c
    public final ChronoLocalDate Q(long j10) {
        return j0(this.f138791a.o0(j10));
    }

    @Override // j$.time.chrono.AbstractC14784c
    public final ChronoLocalDate O(long j10) {
        return j0(this.f138791a.plusDays(j10));
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j10, TemporalUnit temporalUnit) {
        return (y) super.b(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j10, TemporalUnit temporalUnit) {
        return (y) super.b(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j10, TemporalUnit temporalUnit) {
        return (y) super.c(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return (y) super.c(j10, temporalUnit);
    }

    public final y j0(LocalDate localDate) {
        return localDate.equals(this.f138791a) ? this : new y(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long S() {
        return this.f138791a.S();
    }

    @Override // j$.time.chrono.AbstractC14784c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f138791a.equals(((y) obj).f138791a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new A((byte) 7, this);
    }
}
