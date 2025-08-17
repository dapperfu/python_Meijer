package mt;

import java.io.Serializable;

/* renamed from: mt.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15708b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f150733a;

    /* renamed from: b, reason: collision with root package name */
    private String f150734b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f150735c;

    /* renamed from: d, reason: collision with root package name */
    private String f150736d;

    /* renamed from: e, reason: collision with root package name */
    private String f150737e;

    /* renamed from: f, reason: collision with root package name */
    private String f150738f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f150739g;

    /* renamed from: h, reason: collision with root package name */
    private Long f150740h;

    /* renamed from: i, reason: collision with root package name */
    private Long f150741i;

    /* renamed from: j, reason: collision with root package name */
    private String f150742j;

    /* renamed from: k, reason: collision with root package name */
    private Long f150743k;

    /* renamed from: l, reason: collision with root package name */
    private Long f150744l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f150745m;

    public C15707a a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15708b c15708b = (C15708b) obj;
        String str = this.f150738f;
        if (str == null) {
            if (c15708b.f150738f != null) {
                return false;
            }
        } else if (!str.equals(c15708b.f150738f)) {
            return false;
        }
        if (this.f150735c != c15708b.f150735c) {
            return false;
        }
        String str2 = this.f150737e;
        if (str2 == null) {
            if (c15708b.f150737e != null) {
                return false;
            }
        } else if (!str2.equals(c15708b.f150737e)) {
            return false;
        }
        Long l10 = this.f150744l;
        if (l10 == null) {
            if (c15708b.f150744l != null) {
                return false;
            }
        } else if (!l10.equals(c15708b.f150744l)) {
            return false;
        }
        String str3 = this.f150734b;
        if (str3 == null) {
            if (c15708b.f150734b != null) {
                return false;
            }
        } else if (!str3.equals(c15708b.f150734b)) {
            return false;
        }
        Long l11 = this.f150740h;
        if (l11 == null) {
            if (c15708b.f150740h != null) {
                return false;
            }
        } else if (!l11.equals(c15708b.f150740h)) {
            return false;
        }
        Long l12 = this.f150743k;
        if (l12 == null) {
            if (c15708b.f150743k != null) {
                return false;
            }
        } else if (!l12.equals(c15708b.f150743k)) {
            return false;
        }
        String str4 = this.f150736d;
        if (str4 == null) {
            if (c15708b.f150736d != null) {
                return false;
            }
        } else if (!str4.equals(c15708b.f150736d)) {
            return false;
        }
        Long l13 = this.f150741i;
        if (l13 == null) {
            if (c15708b.f150741i != null) {
                return false;
            }
        } else if (!l13.equals(c15708b.f150741i)) {
            return false;
        }
        if (this.f150739g != c15708b.f150739g) {
            return false;
        }
        String str5 = this.f150733a;
        if (str5 == null) {
            if (c15708b.f150733a != null) {
                return false;
            }
        } else if (!str5.equals(c15708b.f150733a)) {
            return false;
        }
        String str6 = this.f150742j;
        if (str6 == null) {
            if (c15708b.f150742j != null) {
                return false;
            }
        } else if (!str6.equals(c15708b.f150742j)) {
            return false;
        }
        Boolean bool = this.f150745m;
        if (bool == null) {
            if (c15708b.f150745m != null) {
                return false;
            }
        } else if (!bool.equals(c15708b.f150745m)) {
            return false;
        }
        return true;
    }

    public String b() {
        return this.f150737e;
    }

    public Long c() {
        return this.f150744l;
    }

    public String d() {
        return this.f150734b;
    }

    public Long e() {
        return this.f150740h;
    }

    public Long f() {
        return this.f150743k;
    }

    public Boolean g() {
        return this.f150745m;
    }

    public String h() {
        return this.f150733a;
    }

    public int hashCode() {
        String str = this.f150738f;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f150735c ? 1231 : 1237)) * 961;
        String str2 = this.f150737e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f150744l;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.f150734b;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.f150740h;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f150743k;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.f150736d;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l13 = this.f150741i;
        int iHashCode8 = (((iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31) + (this.f150739g ? 1231 : 1237)) * 31;
        String str5 = this.f150733a;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f150742j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f150745m;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public String i() {
        return this.f150742j;
    }

    public String toString() {
        return "ContentDescriptor [title=" + this.f150733a + ", description=" + this.f150734b + ", combineTitleDescription=" + this.f150735c + ", iconUrl=" + this.f150736d + ", contentUrl=" + this.f150737e + ", campaignId=" + this.f150738f + ", notifyUser=" + this.f150739g + ", expires=" + this.f150740h + ", lastTriggerTime=" + this.f150741i + ", uuid=" + this.f150742j + ", frequencyLimitInHours=" + this.f150743k + ", contentAttributes=" + ((Object) null) + ", delayInSeconds=" + this.f150744l + ", renderWebView=" + this.f150745m + "]";
    }
}
