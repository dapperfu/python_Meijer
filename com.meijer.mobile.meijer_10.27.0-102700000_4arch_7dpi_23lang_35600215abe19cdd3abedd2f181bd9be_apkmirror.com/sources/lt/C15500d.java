package lt;

import java.util.HashMap;
import java.util.Map;

/* renamed from: lt.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15500d {

    /* renamed from: a, reason: collision with root package name */
    private String f149382a;

    /* renamed from: b, reason: collision with root package name */
    private String f149383b;

    /* renamed from: c, reason: collision with root package name */
    private String f149384c;

    /* renamed from: d, reason: collision with root package name */
    private String f149385d;

    /* renamed from: e, reason: collision with root package name */
    private int f149386e;

    /* renamed from: f, reason: collision with root package name */
    private String f149387f;

    /* renamed from: g, reason: collision with root package name */
    private String f149388g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f149389h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private String f149390i;

    /* renamed from: j, reason: collision with root package name */
    private Long f149391j;

    /* renamed from: k, reason: collision with root package name */
    private Long f149392k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15500d c15500d = (C15500d) obj;
        Long l10 = this.f149391j;
        if (l10 == null) {
            if (c15500d.f149391j != null) {
                return false;
            }
        } else if (!l10.equals(c15500d.f149391j)) {
            return false;
        }
        Map<String, String> map = this.f149389h;
        if (map == null) {
            if (c15500d.f149389h != null) {
                return false;
            }
        } else if (!map.equals(c15500d.f149389h)) {
            return false;
        }
        String str = this.f149387f;
        if (str == null) {
            if (c15500d.f149387f != null) {
                return false;
            }
        } else if (!str.equals(c15500d.f149387f)) {
            return false;
        }
        String str2 = this.f149388g;
        if (str2 == null) {
            if (c15500d.f149388g != null) {
                return false;
            }
        } else if (!str2.equals(c15500d.f149388g)) {
            return false;
        }
        Long l11 = this.f149392k;
        if (l11 == null) {
            if (c15500d.f149392k != null) {
                return false;
            }
        } else if (!l11.equals(c15500d.f149392k)) {
            return false;
        }
        String str3 = this.f149390i;
        if (str3 == null) {
            if (c15500d.f149390i != null) {
                return false;
            }
        } else if (!str3.equals(c15500d.f149390i)) {
            return false;
        }
        if (this.f149386e != c15500d.f149386e) {
            return false;
        }
        String str4 = this.f149385d;
        if (str4 == null) {
            if (c15500d.f149385d != null) {
                return false;
            }
        } else if (!str4.equals(c15500d.f149385d)) {
            return false;
        }
        String str5 = this.f149384c;
        if (str5 == null) {
            if (c15500d.f149384c != null) {
                return false;
            }
        } else if (!str5.equals(c15500d.f149384c)) {
            return false;
        }
        String str6 = this.f149382a;
        if (str6 == null) {
            if (c15500d.f149382a != null) {
                return false;
            }
        } else if (!str6.equals(c15500d.f149382a)) {
            return false;
        }
        String str7 = this.f149383b;
        if (str7 == null) {
            if (c15500d.f149383b != null) {
                return false;
            }
        } else if (!str7.equals(c15500d.f149383b)) {
            return false;
        }
        return true;
    }

    public Map<String, String> a() {
        return this.f149389h;
    }

    public String b() {
        return this.f149387f;
    }

    public String c() {
        return this.f149388g;
    }

    public String d() {
        return this.f149385d;
    }

    public void e(Long l10) {
        this.f149391j = l10;
    }

    public void f(Map<String, String> map) {
        this.f149389h = map;
    }

    public void g(String str) {
        this.f149387f = str;
    }

    public void h(String str) {
        this.f149388g = str;
    }

    public int hashCode() {
        Long l10 = this.f149391j;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Map<String, String> map = this.f149389h;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f149387f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f149388g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f149392k;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.f149390i;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f149386e) * 31;
        String str4 = this.f149385d;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f149384c;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f149382a;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f149383b;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public void i(Long l10) {
        this.f149392k = l10;
    }

    public void j(String str) {
        this.f149390i = str;
    }

    public void k(int i10) {
        this.f149386e = i10;
    }

    public void l(String str) {
        this.f149385d = str;
    }

    public void m(String str) {
        this.f149384c = str;
    }

    public void n(String str) {
        this.f149382a = str;
    }

    public void o(String str) {
        this.f149383b = str;
    }

    public String toString() {
        return "ClientEvent [userId=" + this.f149382a + ", username=" + this.f149383b + ", type=" + this.f149384c + ", timestamp=" + this.f149385d + ", timeZoneOffset=" + this.f149386e + ", latitude=" + this.f149387f + ", longitude=" + this.f149388g + ", attributes=" + this.f149389h + ", platform=" + this.f149390i + ", applicationId=" + this.f149391j + ", organizationId=" + this.f149392k + "]";
    }
}
