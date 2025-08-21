package ut;

/* renamed from: ut.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17476j {

    /* renamed from: a, reason: collision with root package name */
    public kt.k f164588a;

    /* renamed from: b, reason: collision with root package name */
    public kt.n f164589b;

    /* renamed from: c, reason: collision with root package name */
    public Long f164590c;

    /* renamed from: d, reason: collision with root package name */
    public double f164591d;

    /* renamed from: e, reason: collision with root package name */
    public double f164592e;

    public C17476j() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17476j.class != obj.getClass()) {
            return false;
        }
        C17476j c17476j = (C17476j) obj;
        if (Double.doubleToLongBits(this.f164591d) != Double.doubleToLongBits(c17476j.f164591d) || Double.doubleToLongBits(this.f164592e) != Double.doubleToLongBits(c17476j.f164592e)) {
            return false;
        }
        kt.k kVar = this.f164588a;
        if (kVar == null) {
            if (c17476j.f164588a != null) {
                return false;
            }
        } else if (!kVar.equals(c17476j.f164588a)) {
            return false;
        }
        if (this.f164589b != c17476j.f164589b) {
            return false;
        }
        Long l10 = this.f164590c;
        if (l10 == null) {
            if (c17476j.f164590c != null) {
                return false;
            }
        } else if (!l10.equals(c17476j.f164590c)) {
            return false;
        }
        return true;
    }

    public C17476j(kt.k kVar, kt.n nVar, Long l10, C17467a c17467a) {
        this.f164588a = kVar;
        this.f164589b = nVar;
        this.f164590c = l10;
        this.f164591d = c17467a.f164529a;
        this.f164592e = c17467a.f164530b;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f164591d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f164592e);
        int i10 = (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31;
        kt.k kVar = this.f164588a;
        int iHashCode = (i10 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        kt.n nVar = this.f164589b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Long l10 = this.f164590c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        kt.k kVar = this.f164588a;
        return String.format("%s %s", this.f164589b.toString(), kVar != null ? kVar.getName() : "");
    }
}
