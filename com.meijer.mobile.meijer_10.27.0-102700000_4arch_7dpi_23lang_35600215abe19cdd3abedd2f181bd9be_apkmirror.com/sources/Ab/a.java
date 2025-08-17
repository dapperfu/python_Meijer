package Ab;

/* loaded from: classes4.dex */
public class a implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private Long f148a;

    /* renamed from: b, reason: collision with root package name */
    private String f149b;

    /* renamed from: c, reason: collision with root package name */
    private String f150c;

    /* renamed from: d, reason: collision with root package name */
    private Long f151d;

    /* renamed from: e, reason: collision with root package name */
    private Long f152e;

    /* renamed from: f, reason: collision with root package name */
    private double f153f;

    /* renamed from: g, reason: collision with root package name */
    private double f154g;

    /* renamed from: h, reason: collision with root package name */
    private EnumC0008a f155h;

    /* renamed from: i, reason: collision with root package name */
    private b f156i;

    /* renamed from: j, reason: collision with root package name */
    private Db.b f157j;

    /* renamed from: Ab.a$a, reason: collision with other inner class name */
    public enum EnumC0008a implements Nb.a {
        GEOFENCE,
        BEACON,
        IBEACON
    }

    public enum b implements Nb.a {
        ARRIVE_EVENT,
        DEPART_EVENT
    }

    public Long a() {
        return this.f151d;
    }

    public Long b() {
        return this.f152e;
    }

    public b c() {
        return this.f156i;
    }

    public String d() {
        b bVar = b.ARRIVE_EVENT;
        b bVar2 = this.f156i;
        if (bVar == bVar2) {
            return "AT";
        }
        if (b.DEPART_EVENT == bVar2) {
            return "LEFT";
        }
        return null;
    }

    public String e() {
        return this.f150c;
    }

    public String f() {
        EnumC0008a enumC0008a = this.f155h;
        if (enumC0008a == EnumC0008a.GEOFENCE) {
            return "GEOFENCE";
        }
        if (enumC0008a == EnumC0008a.BEACON) {
            return "BEACON";
        }
        if (enumC0008a == EnumC0008a.IBEACON) {
            return "IBEACON";
        }
        return null;
    }

    public Db.b g() {
        return this.f157j;
    }

    public double h() {
        return this.f154g;
    }

    public Long i() {
        return this.f148a;
    }

    public String j() {
        return this.f149b;
    }

    public double k() {
        return this.f153f;
    }

    public void l(Long l10) {
        this.f151d = l10;
    }

    public void m(Long l10) {
        this.f152e = l10;
    }

    public void n(b bVar) {
        this.f156i = bVar;
    }

    public void o(String str) {
        this.f150c = str;
    }

    public void p(EnumC0008a enumC0008a) {
        this.f155h = enumC0008a;
    }

    public void q(Db.b bVar) {
        this.f157j = bVar;
    }

    public void r(double d10) {
        this.f154g = d10;
    }

    public void s(Long l10) {
        this.f148a = l10;
    }

    public void t(String str) {
        this.f149b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b bVar = this.f156i;
        sb2.append(bVar == null ? "()" : bVar.toString());
        sb2.append(": ");
        sb2.append(this.f148a);
        sb2.append(" - ");
        sb2.append(this.f149b);
        return sb2.toString();
    }

    public void u(double d10) {
        this.f153f = d10;
    }
}
