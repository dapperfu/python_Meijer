package ut;

import kt.C15422h;

/* renamed from: ut.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17478l {

    /* renamed from: a, reason: collision with root package name */
    public Long f164593a;

    /* renamed from: b, reason: collision with root package name */
    public C15422h f164594b;

    /* renamed from: c, reason: collision with root package name */
    public kt.n f164595c;

    /* renamed from: d, reason: collision with root package name */
    public Long f164596d;

    /* renamed from: e, reason: collision with root package name */
    public double f164597e;

    /* renamed from: f, reason: collision with root package name */
    public double f164598f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17478l.class != obj.getClass()) {
            return false;
        }
        C17478l c17478l = (C17478l) obj;
        if (Double.doubleToLongBits(this.f164597e) != Double.doubleToLongBits(c17478l.f164597e) || Double.doubleToLongBits(this.f164598f) != Double.doubleToLongBits(c17478l.f164598f)) {
            return false;
        }
        Long l10 = this.f164593a;
        if (l10 == null) {
            if (c17478l.f164593a != null) {
                return false;
            }
        } else if (!l10.equals(c17478l.f164593a)) {
            return false;
        }
        C15422h c15422h = this.f164594b;
        if (c15422h == null) {
            if (c17478l.f164594b != null) {
                return false;
            }
        } else if (!c15422h.equals(c17478l.f164594b)) {
            return false;
        }
        if (this.f164595c != c17478l.f164595c) {
            return false;
        }
        Long l11 = this.f164596d;
        if (l11 == null) {
            if (c17478l.f164596d != null) {
                return false;
            }
        } else if (!l11.equals(c17478l.f164596d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f164597e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f164598f);
        int i10 = (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31;
        Long l10 = this.f164593a;
        int iHashCode = (i10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        C15422h c15422h = this.f164594b;
        int iHashCode2 = (iHashCode + (c15422h == null ? 0 : c15422h.hashCode())) * 31;
        kt.n nVar = this.f164595c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Long l11 = this.f164596d;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }
}
