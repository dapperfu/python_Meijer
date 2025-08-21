package mt;

import java.io.Serializable;

/* renamed from: mt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15767b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f151624a;

    /* renamed from: b, reason: collision with root package name */
    private String f151625b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f151626c;

    /* renamed from: d, reason: collision with root package name */
    private String f151627d;

    /* renamed from: e, reason: collision with root package name */
    private String f151628e;

    /* renamed from: f, reason: collision with root package name */
    private String f151629f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f151630g;

    /* renamed from: h, reason: collision with root package name */
    private Long f151631h;

    /* renamed from: i, reason: collision with root package name */
    private Long f151632i;

    /* renamed from: j, reason: collision with root package name */
    private String f151633j;

    /* renamed from: k, reason: collision with root package name */
    private Long f151634k;

    /* renamed from: l, reason: collision with root package name */
    private Long f151635l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f151636m;

    public C15766a a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15767b c15767b = (C15767b) obj;
        String str = this.f151629f;
        if (str == null) {
            if (c15767b.f151629f != null) {
                return false;
            }
        } else if (!str.equals(c15767b.f151629f)) {
            return false;
        }
        if (this.f151626c != c15767b.f151626c) {
            return false;
        }
        String str2 = this.f151628e;
        if (str2 == null) {
            if (c15767b.f151628e != null) {
                return false;
            }
        } else if (!str2.equals(c15767b.f151628e)) {
            return false;
        }
        Long l10 = this.f151635l;
        if (l10 == null) {
            if (c15767b.f151635l != null) {
                return false;
            }
        } else if (!l10.equals(c15767b.f151635l)) {
            return false;
        }
        String str3 = this.f151625b;
        if (str3 == null) {
            if (c15767b.f151625b != null) {
                return false;
            }
        } else if (!str3.equals(c15767b.f151625b)) {
            return false;
        }
        Long l11 = this.f151631h;
        if (l11 == null) {
            if (c15767b.f151631h != null) {
                return false;
            }
        } else if (!l11.equals(c15767b.f151631h)) {
            return false;
        }
        Long l12 = this.f151634k;
        if (l12 == null) {
            if (c15767b.f151634k != null) {
                return false;
            }
        } else if (!l12.equals(c15767b.f151634k)) {
            return false;
        }
        String str4 = this.f151627d;
        if (str4 == null) {
            if (c15767b.f151627d != null) {
                return false;
            }
        } else if (!str4.equals(c15767b.f151627d)) {
            return false;
        }
        Long l13 = this.f151632i;
        if (l13 == null) {
            if (c15767b.f151632i != null) {
                return false;
            }
        } else if (!l13.equals(c15767b.f151632i)) {
            return false;
        }
        if (this.f151630g != c15767b.f151630g) {
            return false;
        }
        String str5 = this.f151624a;
        if (str5 == null) {
            if (c15767b.f151624a != null) {
                return false;
            }
        } else if (!str5.equals(c15767b.f151624a)) {
            return false;
        }
        String str6 = this.f151633j;
        if (str6 == null) {
            if (c15767b.f151633j != null) {
                return false;
            }
        } else if (!str6.equals(c15767b.f151633j)) {
            return false;
        }
        Boolean bool = this.f151636m;
        if (bool == null) {
            if (c15767b.f151636m != null) {
                return false;
            }
        } else if (!bool.equals(c15767b.f151636m)) {
            return false;
        }
        return true;
    }

    public String b() {
        return this.f151628e;
    }

    public Long c() {
        return this.f151635l;
    }

    public String d() {
        return this.f151625b;
    }

    public Long e() {
        return this.f151631h;
    }

    public Long f() {
        return this.f151634k;
    }

    public Boolean g() {
        return this.f151636m;
    }

    public String h() {
        return this.f151624a;
    }

    public int hashCode() {
        String str = this.f151629f;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f151626c ? 1231 : 1237)) * 961;
        String str2 = this.f151628e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f151635l;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.f151625b;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.f151631h;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f151634k;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.f151627d;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l13 = this.f151632i;
        int iHashCode8 = (((iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31) + (this.f151630g ? 1231 : 1237)) * 31;
        String str5 = this.f151624a;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f151633j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f151636m;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public String i() {
        return this.f151633j;
    }

    public String toString() {
        return "ContentDescriptor [title=" + this.f151624a + ", description=" + this.f151625b + ", combineTitleDescription=" + this.f151626c + ", iconUrl=" + this.f151627d + ", contentUrl=" + this.f151628e + ", campaignId=" + this.f151629f + ", notifyUser=" + this.f151630g + ", expires=" + this.f151631h + ", lastTriggerTime=" + this.f151632i + ", uuid=" + this.f151633j + ", frequencyLimitInHours=" + this.f151634k + ", contentAttributes=" + ((Object) null) + ", delayInSeconds=" + this.f151635l + ", renderWebView=" + this.f151636m + "]";
    }
}
