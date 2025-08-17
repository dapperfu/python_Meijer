package kt;

/* renamed from: kt.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15319h extends C15312a {

    /* renamed from: g, reason: collision with root package name */
    private String f147966g;

    /* renamed from: h, reason: collision with root package name */
    private String f147967h;

    /* renamed from: i, reason: collision with root package name */
    private String f147968i;

    /* renamed from: j, reason: collision with root package name */
    private String f147969j;

    /* renamed from: k, reason: collision with root package name */
    private String f147970k;

    /* renamed from: l, reason: collision with root package name */
    private String f147971l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f147972m;

    @Override // kt.C15312a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C15319h c15319h = (C15319h) obj;
        String str = this.f147966g;
        if (str == null) {
            if (c15319h.f147966g != null) {
                return false;
            }
        } else if (!str.equals(c15319h.f147966g)) {
            return false;
        }
        String str2 = this.f147967h;
        if (str2 == null) {
            if (c15319h.f147967h != null) {
                return false;
            }
        } else if (!str2.equals(c15319h.f147967h)) {
            return false;
        }
        String str3 = this.f147968i;
        if (str3 == null) {
            if (c15319h.f147968i != null) {
                return false;
            }
        } else if (!str3.equals(c15319h.f147968i)) {
            return false;
        }
        String str4 = this.f147971l;
        if (str4 == null) {
            if (c15319h.f147971l != null) {
                return false;
            }
        } else if (!str4.equals(c15319h.f147971l)) {
            return false;
        }
        String str5 = this.f147969j;
        if (str5 == null) {
            if (c15319h.f147969j != null) {
                return false;
            }
        } else if (!str5.equals(c15319h.f147969j)) {
            return false;
        }
        String str6 = this.f147970k;
        if (str6 == null) {
            if (c15319h.f147970k != null) {
                return false;
            }
        } else if (!str6.equals(c15319h.f147970k)) {
            return false;
        }
        return this.f147972m == c15319h.f147972m;
    }

    @Override // kt.C15312a
    public String toString() {
        return "OrganizationPlace [addressLineOne=" + this.f147966g + ", addressLineTwo=" + this.f147967h + ", city=" + this.f147968i + ", state=" + this.f147969j + ", zipcode=" + this.f147970k + ", country=" + this.f147971l + ", hideGeoFence=" + this.f147972m + "]";
    }

    @Override // kt.C15312a
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i10;
        int iHashCode6 = super.hashCode() * 31;
        String str = this.f147966g;
        int iHashCode7 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i11 = (iHashCode6 + iHashCode) * 31;
        String str2 = this.f147967h;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int i12 = (i11 + iHashCode2) * 31;
        String str3 = this.f147968i;
        if (str3 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        int i13 = (i12 + iHashCode3) * 31;
        String str4 = this.f147971l;
        if (str4 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        int i14 = (i13 + iHashCode4) * 31;
        String str5 = this.f147969j;
        if (str5 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
        }
        int i15 = (i14 + iHashCode5) * 31;
        String str6 = this.f147970k;
        if (str6 != null) {
            iHashCode7 = str6.hashCode();
        }
        int i16 = (i15 + iHashCode7) * 31;
        if (this.f147972m) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i16 + i10;
    }
}
