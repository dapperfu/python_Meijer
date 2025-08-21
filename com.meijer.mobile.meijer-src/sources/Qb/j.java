package Qb;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Long f27999a;

    /* renamed from: b, reason: collision with root package name */
    private String f28000b;

    /* renamed from: c, reason: collision with root package name */
    private String f28001c;

    /* renamed from: d, reason: collision with root package name */
    private String f28002d;

    /* renamed from: e, reason: collision with root package name */
    private Long f28003e;

    /* renamed from: f, reason: collision with root package name */
    private Long f28004f;

    /* renamed from: g, reason: collision with root package name */
    private String f28005g;

    /* renamed from: h, reason: collision with root package name */
    private String f28006h;

    /* renamed from: i, reason: collision with root package name */
    private String f28007i;

    /* renamed from: j, reason: collision with root package name */
    private String f28008j;

    /* renamed from: k, reason: collision with root package name */
    private String f28009k;

    /* renamed from: l, reason: collision with root package name */
    private Long f28010l;

    /* renamed from: m, reason: collision with root package name */
    private b f28011m;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f28007i;
        if (str == null) {
            if (jVar.f28007i != null) {
                return false;
            }
        } else if (!str.equals(jVar.f28007i)) {
            return false;
        }
        Long l10 = this.f28003e;
        if (l10 == null) {
            if (jVar.f28003e != null) {
                return false;
            }
        } else if (!l10.equals(jVar.f28003e)) {
            return false;
        }
        String str2 = this.f28009k;
        if (str2 == null) {
            if (jVar.f28009k != null) {
                return false;
            }
        } else if (!str2.equals(jVar.f28009k)) {
            return false;
        }
        String str3 = this.f28000b;
        if (str3 == null) {
            if (jVar.f28000b != null) {
                return false;
            }
        } else if (!str3.equals(jVar.f28000b)) {
            return false;
        }
        Long l11 = this.f28004f;
        if (l11 == null) {
            if (jVar.f28004f != null) {
                return false;
            }
        } else if (!l11.equals(jVar.f28004f)) {
            return false;
        }
        String str4 = this.f28002d;
        if (str4 == null) {
            if (jVar.f28002d != null) {
                return false;
            }
        } else if (!str4.equals(jVar.f28002d)) {
            return false;
        }
        String str5 = this.f28008j;
        if (str5 == null) {
            if (jVar.f28008j != null) {
                return false;
            }
        } else if (!str5.equals(jVar.f28008j)) {
            return false;
        }
        String str6 = this.f28005g;
        if (str6 == null) {
            if (jVar.f28005g != null) {
                return false;
            }
        } else if (!str6.equals(jVar.f28005g)) {
            return false;
        }
        String str7 = this.f28006h;
        if (str7 == null) {
            if (jVar.f28006h != null) {
                return false;
            }
        } else if (!str7.equals(jVar.f28006h)) {
            return false;
        }
        Long l12 = this.f28010l;
        if (l12 == null) {
            if (jVar.f28010l != null) {
                return false;
            }
        } else if (!l12.equals(jVar.f28010l)) {
            return false;
        }
        Long l13 = this.f27999a;
        if (l13 == null) {
            if (jVar.f27999a != null) {
                return false;
            }
        } else if (!l13.equals(jVar.f27999a)) {
            return false;
        }
        String str8 = this.f28001c;
        if (str8 == null) {
            if (jVar.f28001c != null) {
                return false;
            }
        } else if (!str8.equals(jVar.f28001c)) {
            return false;
        }
        return true;
    }

    public b a() {
        return this.f28011m;
    }

    public Long b() {
        return this.f28003e;
    }

    public String c() {
        return this.f28000b;
    }

    public Long d() {
        return this.f28004f;
    }

    public String e() {
        return this.f28002d;
    }

    public String f() {
        return this.f28006h;
    }

    public Long g() {
        return this.f27999a;
    }

    public String h() {
        return this.f28001c;
    }

    public int hashCode() {
        String str = this.f28007i;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Long l10 = this.f28003e;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.f28009k;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28000b;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.f28004f;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.f28002d;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f28008j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f28005g;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f28006h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l12 = this.f28010l;
        int iHashCode10 = (iHashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f27999a;
        int iHashCode11 = (iHashCode10 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str8 = this.f28001c;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public void i(String str) {
        this.f28007i = str;
    }

    public void j(String str) {
        this.f28009k = str;
    }

    public void k(String str) {
        this.f28000b = str;
    }

    public void l(String str) {
        this.f28002d = str;
    }

    public void m(String str) {
        this.f28008j = str;
    }

    public void n(String str) {
        this.f28006h = str;
    }

    public void o(Long l10) {
        this.f28010l = l10;
    }

    public void p(String str) {
        this.f28001c = str;
    }
}
