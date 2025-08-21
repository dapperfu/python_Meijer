package lt;

import java.util.HashMap;
import java.util.Map;

/* renamed from: lt.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15611d {

    /* renamed from: a, reason: collision with root package name */
    private String f150220a;

    /* renamed from: b, reason: collision with root package name */
    private String f150221b;

    /* renamed from: c, reason: collision with root package name */
    private String f150222c;

    /* renamed from: d, reason: collision with root package name */
    private String f150223d;

    /* renamed from: e, reason: collision with root package name */
    private int f150224e;

    /* renamed from: f, reason: collision with root package name */
    private String f150225f;

    /* renamed from: g, reason: collision with root package name */
    private String f150226g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f150227h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private String f150228i;

    /* renamed from: j, reason: collision with root package name */
    private Long f150229j;

    /* renamed from: k, reason: collision with root package name */
    private Long f150230k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15611d c15611d = (C15611d) obj;
        Long l10 = this.f150229j;
        if (l10 == null) {
            if (c15611d.f150229j != null) {
                return false;
            }
        } else if (!l10.equals(c15611d.f150229j)) {
            return false;
        }
        Map<String, String> map = this.f150227h;
        if (map == null) {
            if (c15611d.f150227h != null) {
                return false;
            }
        } else if (!map.equals(c15611d.f150227h)) {
            return false;
        }
        String str = this.f150225f;
        if (str == null) {
            if (c15611d.f150225f != null) {
                return false;
            }
        } else if (!str.equals(c15611d.f150225f)) {
            return false;
        }
        String str2 = this.f150226g;
        if (str2 == null) {
            if (c15611d.f150226g != null) {
                return false;
            }
        } else if (!str2.equals(c15611d.f150226g)) {
            return false;
        }
        Long l11 = this.f150230k;
        if (l11 == null) {
            if (c15611d.f150230k != null) {
                return false;
            }
        } else if (!l11.equals(c15611d.f150230k)) {
            return false;
        }
        String str3 = this.f150228i;
        if (str3 == null) {
            if (c15611d.f150228i != null) {
                return false;
            }
        } else if (!str3.equals(c15611d.f150228i)) {
            return false;
        }
        if (this.f150224e != c15611d.f150224e) {
            return false;
        }
        String str4 = this.f150223d;
        if (str4 == null) {
            if (c15611d.f150223d != null) {
                return false;
            }
        } else if (!str4.equals(c15611d.f150223d)) {
            return false;
        }
        String str5 = this.f150222c;
        if (str5 == null) {
            if (c15611d.f150222c != null) {
                return false;
            }
        } else if (!str5.equals(c15611d.f150222c)) {
            return false;
        }
        String str6 = this.f150220a;
        if (str6 == null) {
            if (c15611d.f150220a != null) {
                return false;
            }
        } else if (!str6.equals(c15611d.f150220a)) {
            return false;
        }
        String str7 = this.f150221b;
        if (str7 == null) {
            if (c15611d.f150221b != null) {
                return false;
            }
        } else if (!str7.equals(c15611d.f150221b)) {
            return false;
        }
        return true;
    }

    public Map<String, String> a() {
        return this.f150227h;
    }

    public String b() {
        return this.f150225f;
    }

    public String c() {
        return this.f150226g;
    }

    public String d() {
        return this.f150223d;
    }

    public void e(Long l10) {
        this.f150229j = l10;
    }

    public void f(Map<String, String> map) {
        this.f150227h = map;
    }

    public void g(String str) {
        this.f150225f = str;
    }

    public void h(String str) {
        this.f150226g = str;
    }

    public int hashCode() {
        Long l10 = this.f150229j;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Map<String, String> map = this.f150227h;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f150225f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f150226g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f150230k;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.f150228i;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f150224e) * 31;
        String str4 = this.f150223d;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f150222c;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f150220a;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f150221b;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public void i(Long l10) {
        this.f150230k = l10;
    }

    public void j(String str) {
        this.f150228i = str;
    }

    public void k(int i10) {
        this.f150224e = i10;
    }

    public void l(String str) {
        this.f150223d = str;
    }

    public void m(String str) {
        this.f150222c = str;
    }

    public void n(String str) {
        this.f150220a = str;
    }

    public void o(String str) {
        this.f150221b = str;
    }

    public String toString() {
        return "ClientEvent [userId=" + this.f150220a + ", username=" + this.f150221b + ", type=" + this.f150222c + ", timestamp=" + this.f150223d + ", timeZoneOffset=" + this.f150224e + ", latitude=" + this.f150225f + ", longitude=" + this.f150226g + ", attributes=" + this.f150227h + ", platform=" + this.f150228i + ", applicationId=" + this.f150229j + ", organizationId=" + this.f150230k + "]";
    }
}
