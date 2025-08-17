package ut;

import kt.C15319h;

/* renamed from: ut.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17326l {

    /* renamed from: a, reason: collision with root package name */
    public Long f163515a;

    /* renamed from: b, reason: collision with root package name */
    public C15319h f163516b;

    /* renamed from: c, reason: collision with root package name */
    public kt.n f163517c;

    /* renamed from: d, reason: collision with root package name */
    public Long f163518d;

    /* renamed from: e, reason: collision with root package name */
    public double f163519e;

    /* renamed from: f, reason: collision with root package name */
    public double f163520f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17326l.class != obj.getClass()) {
            return false;
        }
        C17326l c17326l = (C17326l) obj;
        if (Double.doubleToLongBits(this.f163519e) != Double.doubleToLongBits(c17326l.f163519e) || Double.doubleToLongBits(this.f163520f) != Double.doubleToLongBits(c17326l.f163520f)) {
            return false;
        }
        Long l10 = this.f163515a;
        if (l10 == null) {
            if (c17326l.f163515a != null) {
                return false;
            }
        } else if (!l10.equals(c17326l.f163515a)) {
            return false;
        }
        C15319h c15319h = this.f163516b;
        if (c15319h == null) {
            if (c17326l.f163516b != null) {
                return false;
            }
        } else if (!c15319h.equals(c17326l.f163516b)) {
            return false;
        }
        if (this.f163517c != c17326l.f163517c) {
            return false;
        }
        Long l11 = this.f163518d;
        if (l11 == null) {
            if (c17326l.f163518d != null) {
                return false;
            }
        } else if (!l11.equals(c17326l.f163518d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f163519e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f163520f);
        int i10 = (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31;
        Long l10 = this.f163515a;
        int iHashCode = (i10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        C15319h c15319h = this.f163516b;
        int iHashCode2 = (iHashCode + (c15319h == null ? 0 : c15319h.hashCode())) * 31;
        kt.n nVar = this.f163517c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Long l11 = this.f163518d;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }
}
