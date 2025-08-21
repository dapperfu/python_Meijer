package kc;

import java.util.Date;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private String f141804a;

    /* renamed from: b, reason: collision with root package name */
    private int f141805b;

    /* renamed from: c, reason: collision with root package name */
    private Date f141806c;

    /* renamed from: d, reason: collision with root package name */
    private String f141807d;

    /* renamed from: e, reason: collision with root package name */
    private String f141808e;

    /* renamed from: f, reason: collision with root package name */
    private String f141809f;

    /* renamed from: g, reason: collision with root package name */
    private String f141810g;

    /* renamed from: h, reason: collision with root package name */
    private String f141811h;

    /* renamed from: i, reason: collision with root package name */
    private String f141812i;

    /* renamed from: j, reason: collision with root package name */
    private Long f141813j;

    /* renamed from: k, reason: collision with root package name */
    private Byte f141814k;

    /* renamed from: l, reason: collision with root package name */
    private int f141815l;

    /* renamed from: m, reason: collision with root package name */
    private int f141816m;

    /* renamed from: n, reason: collision with root package name */
    private Byte f141817n;

    /* renamed from: o, reason: collision with root package name */
    private String f141818o;

    /* renamed from: p, reason: collision with root package name */
    private String f141819p;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f141811h;
        if (str == null) {
            if (jVar.f141811h != null) {
                return false;
            }
        } else if (!str.equals(jVar.f141811h)) {
            return false;
        }
        if (this.f141816m != jVar.f141816m) {
            return false;
        }
        Date date = this.f141806c;
        if (date == null) {
            if (jVar.f141806c != null) {
                return false;
            }
        } else if (!date.equals(jVar.f141806c)) {
            return false;
        }
        String str2 = this.f141812i;
        if (str2 == null) {
            if (jVar.f141812i != null) {
                return false;
            }
        } else if (!str2.equals(jVar.f141812i)) {
            return false;
        }
        String str3 = this.f141809f;
        if (str3 == null) {
            if (jVar.f141809f != null) {
                return false;
            }
        } else if (!str3.equals(jVar.f141809f)) {
            return false;
        }
        String str4 = this.f141810g;
        if (str4 == null) {
            if (jVar.f141810g != null) {
                return false;
            }
        } else if (!str4.equals(jVar.f141810g)) {
            return false;
        }
        String str5 = this.f141804a;
        if (str5 == null) {
            if (jVar.f141804a != null) {
                return false;
            }
        } else if (!str5.equals(jVar.f141804a)) {
            return false;
        }
        if (this.f141805b != jVar.f141805b) {
            return false;
        }
        Long l10 = this.f141813j;
        if (l10 == null) {
            if (jVar.f141813j != null) {
                return false;
            }
        } else if (!l10.equals(jVar.f141813j)) {
            return false;
        }
        String str6 = this.f141807d;
        if (str6 == null) {
            if (jVar.f141807d != null) {
                return false;
            }
        } else if (!str6.equals(jVar.f141807d)) {
            return false;
        }
        if (this.f141815l != jVar.f141815l) {
            return false;
        }
        String str7 = this.f141808e;
        if (str7 == null) {
            if (jVar.f141808e != null) {
                return false;
            }
        } else if (!str7.equals(jVar.f141808e)) {
            return false;
        }
        Byte b10 = this.f141814k;
        if (b10 == null) {
            if (jVar.f141814k != null) {
                return false;
            }
        } else if (!b10.equals(jVar.f141814k)) {
            return false;
        }
        return true;
    }

    public void A(String str) {
        this.f141804a = str;
    }

    public void C(int i10) {
        this.f141805b = i10;
    }

    public void D(Long l10) {
        this.f141813j = l10;
    }

    public void E(String str) {
        this.f141807d = str;
    }

    public void G(String str) {
        this.f141808e = str;
    }

    public void H(Byte b10) {
        this.f141814k = b10;
    }

    public String a() {
        return this.f141811h;
    }

    public Integer b() {
        return Integer.valueOf(this.f141816m);
    }

    public Date c() {
        return this.f141806c;
    }

    public String d() {
        return this.f141812i;
    }

    public String e() {
        return this.f141819p;
    }

    public String f() {
        return this.f141818o;
    }

    public String g() {
        return this.f141809f;
    }

    public int hashCode() {
        String str = this.f141811h;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f141816m) * 31;
        Date date = this.f141806c;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.f141812i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141809f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141810g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f141804a;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f141805b) * 31;
        Long l10 = this.f141813j;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str6 = this.f141807d;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f141815l) * 31;
        String str7 = this.f141808e;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Byte b10 = this.f141814k;
        return iHashCode9 + (b10 != null ? b10.hashCode() : 0);
    }

    public String i() {
        return this.f141810g;
    }

    public Byte j() {
        return this.f141817n;
    }

    public String k() {
        return this.f141804a;
    }

    public int l() {
        return this.f141805b;
    }

    public Long m() {
        return this.f141813j;
    }

    public String n() {
        return this.f141807d;
    }

    public Integer o() {
        return Integer.valueOf(this.f141815l);
    }

    public String p() {
        return this.f141808e;
    }

    public Byte q() {
        return this.f141814k;
    }

    public void r(String str) {
        this.f141811h = str;
    }

    public void t(Date date) {
        this.f141806c = date;
    }

    public void u(String str) {
        this.f141812i = str;
    }

    public void v(String str) {
        this.f141819p = str;
    }

    public void w(String str) {
        this.f141818o = str;
    }

    public void x(String str) {
        this.f141809f = str;
    }

    public void y(String str) {
        this.f141810g = str;
    }

    public void z(Byte b10) {
        this.f141817n = b10;
    }

    public void F(Integer num) {
        this.f141815l = num.intValue();
    }

    public void s(Integer num) {
        this.f141816m = num.intValue();
    }
}
