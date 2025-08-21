package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n extends AbstractC14872c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    public final transient l f139360a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f139361b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f139362c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f139363d;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime T(LocalTime localTime) {
        return new C14874e(this, localTime);
    }

    public n(l lVar, int i10, int i11, int i12) {
        lVar.l0(i10, i11, i12);
        this.f139360a = lVar;
        this.f139361b = i10;
        this.f139362c = i11;
        this.f139363d = i12;
    }

    public n(l lVar, long j10) {
        int i10 = (int) j10;
        lVar.i0();
        if (i10 < lVar.f139352e || i10 >= lVar.f139353f) {
            throw new DateTimeException("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(lVar.f139351d, i10);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {lVar.k0(iBinarySearch), ((lVar.f139354g + iBinarySearch) % 12) + 1, (i10 - lVar.f139351d[iBinarySearch]) + 1};
        this.f139360a = lVar;
        this.f139361b = iArr[0];
        this.f139362c = iArr[1];
        this.f139363d = iArr[2];
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return this.f139360a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j W() {
        return o.AH;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int e0() {
        return this.f139360a.o0(this.f139361b, 12);
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
        int i10 = m.f139359a[chronoField.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f139360a.F(chronoField) : j$.time.temporal.p.f(1L, 5L) : j$.time.temporal.p.f(1L, e0()) : j$.time.temporal.p.f(1L, this.f139360a.m0(this.f139361b, this.f139362c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Z(this);
        }
        switch (m.f139359a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f139363d;
            case 2:
                return f0();
            case 3:
                return ((this.f139363d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(S() + 3, 7)) + 1;
            case 5:
                return ((this.f139363d - 1) % 7) + 1;
            case 6:
                return ((f0() - 1) % 7) + 1;
            case 7:
                return S();
            case 8:
                return ((f0() - 1) / 7) + 1;
            case 9:
                return this.f139362c;
            case 10:
                return ((this.f139361b * 12) + this.f139362c) - 1;
            case 11:
                return this.f139361b;
            case 12:
                return this.f139361b;
            case 13:
                return this.f139361b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.o(j$.time.b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final n a(long j10, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (n) super.a(j10, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.f139360a.F(chronoField).b(j10, chronoField);
        int i10 = (int) j10;
        switch (m.f139359a[chronoField.ordinal()]) {
            case 1:
                return k0(this.f139361b, this.f139362c, i10);
            case 2:
                return O(Math.min(i10, e0()) - f0());
            case 3:
                return O((j10 - j(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return O(j10 - (((int) Math.floorMod(S() + 3, 7)) + 1));
            case 5:
                return O(j10 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return O(j10 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new n(this.f139360a, j10);
            case 8:
                return O((j10 - j(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return k0(this.f139361b, i10, this.f139363d);
            case 10:
                return Q(j10 - (((this.f139361b * 12) + this.f139362c) - 1));
            case 11:
                if (this.f139361b < 1) {
                    i10 = 1 - i10;
                }
                return k0(i10, this.f139362c, this.f139363d);
            case 12:
                return k0(i10, this.f139362c, this.f139363d);
            case 13:
                return k0(1 - this.f139361b, this.f139362c, this.f139363d);
            default:
                throw new j$.time.temporal.o(j$.time.b.a("Unsupported field: ", temporalField));
        }
    }

    public final n k0(int i10, int i11, int i12) {
        int iM0 = this.f139360a.m0(i10, i11);
        if (i12 > iM0) {
            i12 = iM0;
        }
        return new n(this.f139360a, i10, i11, i12);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (n) super.i(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (n) super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate b0(j$.time.temporal.m mVar) {
        return (n) super.b0(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long S() {
        return this.f139360a.l0(this.f139361b, this.f139362c, this.f139363d);
    }

    public final int f0() {
        return this.f139360a.o0(this.f139361b, this.f139362c - 1) + this.f139363d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean E() {
        return this.f139360a.g0(this.f139361b);
    }

    @Override // j$.time.chrono.AbstractC14872c
    public final ChronoLocalDate Z(long j10) {
        return j10 == 0 ? this : k0(Math.addExact(this.f139361b, (int) j10), this.f139362c, this.f139363d);
    }

    @Override // j$.time.chrono.AbstractC14872c
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final n Q(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f139361b * 12) + (this.f139362c - 1) + j10;
        l lVar = this.f139360a;
        long jFloorDiv = Math.floorDiv(j11, 12L);
        if (jFloorDiv >= lVar.k0(0) && jFloorDiv <= lVar.k0(lVar.f139351d.length - 1) - 1) {
            return k0((int) jFloorDiv, ((int) Math.floorMod(j11, 12L)) + 1, this.f139363d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.AbstractC14872c
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final n O(long j10) {
        return new n(this.f139360a, S() + j10);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j10, TemporalUnit temporalUnit) {
        return (n) super.b(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j10, TemporalUnit temporalUnit) {
        return (n) super.b(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j10, TemporalUnit temporalUnit) {
        return (n) super.c(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j10, TemporalUnit temporalUnit) {
        return (n) super.c(j10, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f139361b == nVar.f139361b && this.f139362c == nVar.f139362c && this.f139363d == nVar.f139363d && this.f139360a.equals(nVar.f139360a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC14872c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i10 = this.f139361b;
        int i11 = this.f139362c;
        int i12 = this.f139363d;
        this.f139360a.getClass();
        return (((i10 << 11) + (i11 << 6)) + i12) ^ ((i10 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new A((byte) 6, this);
    }
}
