package kt;

import java.io.Serializable;

/* loaded from: classes12.dex */
public class q implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f148901a;

    /* renamed from: b, reason: collision with root package name */
    private Long f148902b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f148903c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f148904d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f148905e;

    /* renamed from: f, reason: collision with root package name */
    private Long f148906f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f148907g;

    /* renamed from: h, reason: collision with root package name */
    private String f148908h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        Long l10 = this.f148902b;
        if (l10 == null) {
            if (qVar.f148902b != null) {
                return false;
            }
        } else if (!l10.equals(qVar.f148902b)) {
            return false;
        }
        if (this.f148904d != qVar.f148904d) {
            return false;
        }
        Long l11 = this.f148906f;
        if (l11 == null) {
            if (qVar.f148906f != null) {
                return false;
            }
        } else if (!l11.equals(qVar.f148906f)) {
            return false;
        }
        if (this.f148905e != qVar.f148905e || this.f148903c != qVar.f148903c) {
            return false;
        }
        Long l12 = this.f148901a;
        if (l12 == null) {
            if (qVar.f148901a != null) {
                return false;
            }
        } else if (!l12.equals(qVar.f148901a)) {
            return false;
        }
        if (this.f148907g != qVar.f148907g) {
            return false;
        }
        String str = this.f148908h;
        if (str == null) {
            if (qVar.f148908h != null) {
                return false;
            }
        } else if (!str.equals(qVar.f148908h)) {
            return false;
        }
        return true;
    }

    public Long a() {
        return this.f148902b;
    }

    public Long b() {
        return this.f148906f;
    }

    public Long c() {
        return this.f148901a;
    }

    public int hashCode() {
        Long l10 = this.f148902b;
        int iHashCode = ((((l10 == null ? 0 : l10.hashCode()) + 31) * 31) + (this.f148904d ? 1231 : 1237)) * 31;
        Long l11 = this.f148906f;
        int iHashCode2 = (((((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + (this.f148905e ? 1231 : 1237)) * 31) + (this.f148903c ? 1231 : 1237)) * 31;
        Long l12 = this.f148901a;
        int iHashCode3 = (((iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31) + (this.f148907g ? 1231 : 1237)) * 31;
        String str = this.f148908h;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format("UserApplication [userId=%s, applicationId=%s, subscriptionPermission=%s, locationPermission=%s, profilePermission=%s, organizationId=%s, valid=%s, receiverUid=%s]", this.f148901a, this.f148902b, Boolean.valueOf(this.f148903c), Boolean.valueOf(this.f148904d), Boolean.valueOf(this.f148905e), this.f148906f, Boolean.valueOf(this.f148907g), this.f148908h);
    }
}
