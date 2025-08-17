package ut;

/* renamed from: ut.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17324j {

    /* renamed from: a, reason: collision with root package name */
    public kt.k f163510a;

    /* renamed from: b, reason: collision with root package name */
    public kt.n f163511b;

    /* renamed from: c, reason: collision with root package name */
    public Long f163512c;

    /* renamed from: d, reason: collision with root package name */
    public double f163513d;

    /* renamed from: e, reason: collision with root package name */
    public double f163514e;

    public C17324j() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17324j.class != obj.getClass()) {
            return false;
        }
        C17324j c17324j = (C17324j) obj;
        if (Double.doubleToLongBits(this.f163513d) != Double.doubleToLongBits(c17324j.f163513d) || Double.doubleToLongBits(this.f163514e) != Double.doubleToLongBits(c17324j.f163514e)) {
            return false;
        }
        kt.k kVar = this.f163510a;
        if (kVar == null) {
            if (c17324j.f163510a != null) {
                return false;
            }
        } else if (!kVar.equals(c17324j.f163510a)) {
            return false;
        }
        if (this.f163511b != c17324j.f163511b) {
            return false;
        }
        Long l10 = this.f163512c;
        if (l10 == null) {
            if (c17324j.f163512c != null) {
                return false;
            }
        } else if (!l10.equals(c17324j.f163512c)) {
            return false;
        }
        return true;
    }

    public C17324j(kt.k kVar, kt.n nVar, Long l10, C17315a c17315a) {
        this.f163510a = kVar;
        this.f163511b = nVar;
        this.f163512c = l10;
        this.f163513d = c17315a.f163451a;
        this.f163514e = c17315a.f163452b;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f163513d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f163514e);
        int i10 = (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31;
        kt.k kVar = this.f163510a;
        int iHashCode = (i10 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        kt.n nVar = this.f163511b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Long l10 = this.f163512c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        kt.k kVar = this.f163510a;
        return String.format("%s %s", this.f163511b.toString(), kVar != null ? kVar.getName() : "");
    }
}
