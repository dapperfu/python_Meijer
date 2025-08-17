package ic;

import java.util.Date;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private String f137715a;

    /* renamed from: b, reason: collision with root package name */
    private int f137716b;

    /* renamed from: c, reason: collision with root package name */
    private Date f137717c;

    /* renamed from: d, reason: collision with root package name */
    private String f137718d;

    /* renamed from: e, reason: collision with root package name */
    private String f137719e;

    /* renamed from: f, reason: collision with root package name */
    private String f137720f;

    /* renamed from: g, reason: collision with root package name */
    private String f137721g;

    /* renamed from: h, reason: collision with root package name */
    private String f137722h;

    /* renamed from: i, reason: collision with root package name */
    private String f137723i;

    /* renamed from: j, reason: collision with root package name */
    private Long f137724j;

    /* renamed from: k, reason: collision with root package name */
    private Byte f137725k;

    /* renamed from: l, reason: collision with root package name */
    private int f137726l;

    /* renamed from: m, reason: collision with root package name */
    private int f137727m;

    /* renamed from: n, reason: collision with root package name */
    private Byte f137728n;

    /* renamed from: o, reason: collision with root package name */
    private String f137729o;

    /* renamed from: p, reason: collision with root package name */
    private String f137730p;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f137722h;
        if (str == null) {
            if (jVar.f137722h != null) {
                return false;
            }
        } else if (!str.equals(jVar.f137722h)) {
            return false;
        }
        if (this.f137727m != jVar.f137727m) {
            return false;
        }
        Date date = this.f137717c;
        if (date == null) {
            if (jVar.f137717c != null) {
                return false;
            }
        } else if (!date.equals(jVar.f137717c)) {
            return false;
        }
        String str2 = this.f137723i;
        if (str2 == null) {
            if (jVar.f137723i != null) {
                return false;
            }
        } else if (!str2.equals(jVar.f137723i)) {
            return false;
        }
        String str3 = this.f137720f;
        if (str3 == null) {
            if (jVar.f137720f != null) {
                return false;
            }
        } else if (!str3.equals(jVar.f137720f)) {
            return false;
        }
        String str4 = this.f137721g;
        if (str4 == null) {
            if (jVar.f137721g != null) {
                return false;
            }
        } else if (!str4.equals(jVar.f137721g)) {
            return false;
        }
        String str5 = this.f137715a;
        if (str5 == null) {
            if (jVar.f137715a != null) {
                return false;
            }
        } else if (!str5.equals(jVar.f137715a)) {
            return false;
        }
        if (this.f137716b != jVar.f137716b) {
            return false;
        }
        Long l10 = this.f137724j;
        if (l10 == null) {
            if (jVar.f137724j != null) {
                return false;
            }
        } else if (!l10.equals(jVar.f137724j)) {
            return false;
        }
        String str6 = this.f137718d;
        if (str6 == null) {
            if (jVar.f137718d != null) {
                return false;
            }
        } else if (!str6.equals(jVar.f137718d)) {
            return false;
        }
        if (this.f137726l != jVar.f137726l) {
            return false;
        }
        String str7 = this.f137719e;
        if (str7 == null) {
            if (jVar.f137719e != null) {
                return false;
            }
        } else if (!str7.equals(jVar.f137719e)) {
            return false;
        }
        Byte b10 = this.f137725k;
        if (b10 == null) {
            if (jVar.f137725k != null) {
                return false;
            }
        } else if (!b10.equals(jVar.f137725k)) {
            return false;
        }
        return true;
    }

    public void A(String str) {
        this.f137715a = str;
    }

    public void C(int i10) {
        this.f137716b = i10;
    }

    public void D(Long l10) {
        this.f137724j = l10;
    }

    public void E(String str) {
        this.f137718d = str;
    }

    public void G(String str) {
        this.f137719e = str;
    }

    public void H(Byte b10) {
        this.f137725k = b10;
    }

    public String a() {
        return this.f137722h;
    }

    public Integer b() {
        return Integer.valueOf(this.f137727m);
    }

    public Date c() {
        return this.f137717c;
    }

    public String d() {
        return this.f137723i;
    }

    public String e() {
        return this.f137730p;
    }

    public String f() {
        return this.f137729o;
    }

    public String g() {
        return this.f137720f;
    }

    public int hashCode() {
        String str = this.f137722h;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f137727m) * 31;
        Date date = this.f137717c;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.f137723i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f137720f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f137721g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f137715a;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f137716b) * 31;
        Long l10 = this.f137724j;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str6 = this.f137718d;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f137726l) * 31;
        String str7 = this.f137719e;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Byte b10 = this.f137725k;
        return iHashCode9 + (b10 != null ? b10.hashCode() : 0);
    }

    public String i() {
        return this.f137721g;
    }

    public Byte j() {
        return this.f137728n;
    }

    public String k() {
        return this.f137715a;
    }

    public int l() {
        return this.f137716b;
    }

    public Long m() {
        return this.f137724j;
    }

    public String n() {
        return this.f137718d;
    }

    public Integer o() {
        return Integer.valueOf(this.f137726l);
    }

    public String p() {
        return this.f137719e;
    }

    public Byte q() {
        return this.f137725k;
    }

    public void r(String str) {
        this.f137722h = str;
    }

    public void t(Date date) {
        this.f137717c = date;
    }

    public void u(String str) {
        this.f137723i = str;
    }

    public void v(String str) {
        this.f137730p = str;
    }

    public void w(String str) {
        this.f137729o = str;
    }

    public void x(String str) {
        this.f137720f = str;
    }

    public void y(String str) {
        this.f137721g = str;
    }

    public void z(Byte b10) {
        this.f137728n = b10;
    }

    public void F(Integer num) {
        this.f137726l = num.intValue();
    }

    public void s(Integer num) {
        this.f137727m = num.intValue();
    }
}
