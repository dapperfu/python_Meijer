package Cb;

/* loaded from: classes4.dex */
public class a implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private Long f4144a;

    /* renamed from: b, reason: collision with root package name */
    private String f4145b;

    /* renamed from: c, reason: collision with root package name */
    private String f4146c;

    /* renamed from: d, reason: collision with root package name */
    private Long f4147d;

    /* renamed from: e, reason: collision with root package name */
    private Long f4148e;

    /* renamed from: f, reason: collision with root package name */
    private double f4149f;

    /* renamed from: g, reason: collision with root package name */
    private double f4150g;

    /* renamed from: h, reason: collision with root package name */
    private EnumC0085a f4151h;

    /* renamed from: i, reason: collision with root package name */
    private b f4152i;

    /* renamed from: j, reason: collision with root package name */
    private Fb.b f4153j;

    /* renamed from: Cb.a$a, reason: collision with other inner class name */
    public enum EnumC0085a implements Pb.a {
        GEOFENCE,
        BEACON,
        IBEACON
    }

    public enum b implements Pb.a {
        ARRIVE_EVENT,
        DEPART_EVENT
    }

    public Long a() {
        return this.f4147d;
    }

    public Long b() {
        return this.f4148e;
    }

    public b c() {
        return this.f4152i;
    }

    public String d() {
        b bVar = b.ARRIVE_EVENT;
        b bVar2 = this.f4152i;
        if (bVar == bVar2) {
            return "AT";
        }
        if (b.DEPART_EVENT == bVar2) {
            return "LEFT";
        }
        return null;
    }

    public String e() {
        return this.f4146c;
    }

    public String f() {
        EnumC0085a enumC0085a = this.f4151h;
        if (enumC0085a == EnumC0085a.GEOFENCE) {
            return "GEOFENCE";
        }
        if (enumC0085a == EnumC0085a.BEACON) {
            return "BEACON";
        }
        if (enumC0085a == EnumC0085a.IBEACON) {
            return "IBEACON";
        }
        return null;
    }

    public Fb.b g() {
        return this.f4153j;
    }

    public double h() {
        return this.f4150g;
    }

    public Long i() {
        return this.f4144a;
    }

    public String j() {
        return this.f4145b;
    }

    public double k() {
        return this.f4149f;
    }

    public void l(Long l10) {
        this.f4147d = l10;
    }

    public void m(Long l10) {
        this.f4148e = l10;
    }

    public void n(b bVar) {
        this.f4152i = bVar;
    }

    public void o(String str) {
        this.f4146c = str;
    }

    public void p(EnumC0085a enumC0085a) {
        this.f4151h = enumC0085a;
    }

    public void q(Fb.b bVar) {
        this.f4153j = bVar;
    }

    public void r(double d10) {
        this.f4150g = d10;
    }

    public void s(Long l10) {
        this.f4144a = l10;
    }

    public void t(String str) {
        this.f4145b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b bVar = this.f4152i;
        sb2.append(bVar == null ? "()" : bVar.toString());
        sb2.append(": ");
        sb2.append(this.f4144a);
        sb2.append(" - ");
        sb2.append(this.f4145b);
        return sb2.toString();
    }

    public void u(double d10) {
        this.f4149f = d10;
    }
}
