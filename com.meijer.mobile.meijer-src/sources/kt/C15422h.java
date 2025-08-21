package kt;

/* renamed from: kt.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15422h extends C15415a {

    /* renamed from: g, reason: collision with root package name */
    private String f148876g;

    /* renamed from: h, reason: collision with root package name */
    private String f148877h;

    /* renamed from: i, reason: collision with root package name */
    private String f148878i;

    /* renamed from: j, reason: collision with root package name */
    private String f148879j;

    /* renamed from: k, reason: collision with root package name */
    private String f148880k;

    /* renamed from: l, reason: collision with root package name */
    private String f148881l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f148882m;

    @Override // kt.C15415a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C15422h c15422h = (C15422h) obj;
        String str = this.f148876g;
        if (str == null) {
            if (c15422h.f148876g != null) {
                return false;
            }
        } else if (!str.equals(c15422h.f148876g)) {
            return false;
        }
        String str2 = this.f148877h;
        if (str2 == null) {
            if (c15422h.f148877h != null) {
                return false;
            }
        } else if (!str2.equals(c15422h.f148877h)) {
            return false;
        }
        String str3 = this.f148878i;
        if (str3 == null) {
            if (c15422h.f148878i != null) {
                return false;
            }
        } else if (!str3.equals(c15422h.f148878i)) {
            return false;
        }
        String str4 = this.f148881l;
        if (str4 == null) {
            if (c15422h.f148881l != null) {
                return false;
            }
        } else if (!str4.equals(c15422h.f148881l)) {
            return false;
        }
        String str5 = this.f148879j;
        if (str5 == null) {
            if (c15422h.f148879j != null) {
                return false;
            }
        } else if (!str5.equals(c15422h.f148879j)) {
            return false;
        }
        String str6 = this.f148880k;
        if (str6 == null) {
            if (c15422h.f148880k != null) {
                return false;
            }
        } else if (!str6.equals(c15422h.f148880k)) {
            return false;
        }
        return this.f148882m == c15422h.f148882m;
    }

    @Override // kt.C15415a
    public String toString() {
        return "OrganizationPlace [addressLineOne=" + this.f148876g + ", addressLineTwo=" + this.f148877h + ", city=" + this.f148878i + ", state=" + this.f148879j + ", zipcode=" + this.f148880k + ", country=" + this.f148881l + ", hideGeoFence=" + this.f148882m + "]";
    }

    @Override // kt.C15415a
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i10;
        int iHashCode6 = super.hashCode() * 31;
        String str = this.f148876g;
        int iHashCode7 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i11 = (iHashCode6 + iHashCode) * 31;
        String str2 = this.f148877h;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int i12 = (i11 + iHashCode2) * 31;
        String str3 = this.f148878i;
        if (str3 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        int i13 = (i12 + iHashCode3) * 31;
        String str4 = this.f148881l;
        if (str4 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        int i14 = (i13 + iHashCode4) * 31;
        String str5 = this.f148879j;
        if (str5 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
        }
        int i15 = (i14 + iHashCode5) * 31;
        String str6 = this.f148880k;
        if (str6 != null) {
            iHashCode7 = str6.hashCode();
        }
        int i16 = (i15 + iHashCode7) * 31;
        if (this.f148882m) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i16 + i10;
    }
}
