package kt;

import java.io.Serializable;

/* loaded from: classes11.dex */
public class q implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f147991a;

    /* renamed from: b, reason: collision with root package name */
    private Long f147992b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f147993c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f147994d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f147995e;

    /* renamed from: f, reason: collision with root package name */
    private Long f147996f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f147997g;

    /* renamed from: h, reason: collision with root package name */
    private String f147998h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        Long l10 = this.f147992b;
        if (l10 == null) {
            if (qVar.f147992b != null) {
                return false;
            }
        } else if (!l10.equals(qVar.f147992b)) {
            return false;
        }
        if (this.f147994d != qVar.f147994d) {
            return false;
        }
        Long l11 = this.f147996f;
        if (l11 == null) {
            if (qVar.f147996f != null) {
                return false;
            }
        } else if (!l11.equals(qVar.f147996f)) {
            return false;
        }
        if (this.f147995e != qVar.f147995e || this.f147993c != qVar.f147993c) {
            return false;
        }
        Long l12 = this.f147991a;
        if (l12 == null) {
            if (qVar.f147991a != null) {
                return false;
            }
        } else if (!l12.equals(qVar.f147991a)) {
            return false;
        }
        if (this.f147997g != qVar.f147997g) {
            return false;
        }
        String str = this.f147998h;
        if (str == null) {
            if (qVar.f147998h != null) {
                return false;
            }
        } else if (!str.equals(qVar.f147998h)) {
            return false;
        }
        return true;
    }

    public Long a() {
        return this.f147992b;
    }

    public Long b() {
        return this.f147996f;
    }

    public Long c() {
        return this.f147991a;
    }

    public int hashCode() {
        Long l10 = this.f147992b;
        int iHashCode = ((((l10 == null ? 0 : l10.hashCode()) + 31) * 31) + (this.f147994d ? 1231 : 1237)) * 31;
        Long l11 = this.f147996f;
        int iHashCode2 = (((((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + (this.f147995e ? 1231 : 1237)) * 31) + (this.f147993c ? 1231 : 1237)) * 31;
        Long l12 = this.f147991a;
        int iHashCode3 = (((iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31) + (this.f147997g ? 1231 : 1237)) * 31;
        String str = this.f147998h;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format("UserApplication [userId=%s, applicationId=%s, subscriptionPermission=%s, locationPermission=%s, profilePermission=%s, organizationId=%s, valid=%s, receiverUid=%s]", this.f147991a, this.f147992b, Boolean.valueOf(this.f147993c), Boolean.valueOf(this.f147994d), Boolean.valueOf(this.f147995e), this.f147996f, Boolean.valueOf(this.f147997g), this.f147998h);
    }
}
