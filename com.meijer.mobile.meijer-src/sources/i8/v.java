package i8;

/* loaded from: classes4.dex */
public class v extends p {

    /* renamed from: u, reason: collision with root package name */
    protected String f137381u;

    /* renamed from: v, reason: collision with root package name */
    protected String f137382v;

    /* renamed from: w, reason: collision with root package name */
    protected String f137383w;

    /* renamed from: x, reason: collision with root package name */
    protected String f137384x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f137385y;

    protected v(String str, String str2, String str3, String str4, long j10, p8.b bVar, int i10, String str5, boolean z10) {
        this(str, 6, w.f137399p, str2, str3, str4, j10, bVar, i10, str5, z10);
    }

    protected v(String str, int i10, w wVar, String str2, String str3, String str4, long j10, p8.b bVar, int i11, String str5, boolean z10) {
        super(str, i10, wVar, j10, bVar, i11, z10);
        this.f137381u = str2;
        this.f137382v = str3;
        this.f137383w = str4;
        this.f137384x = str5;
        this.f137385y = z10;
    }

    @Override // i8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f137333j.e());
        sb2.append("&na=");
        sb2.append(z8.f.t(h()));
        sb2.append("&it=");
        sb2.append(z8.f.e());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
        a(sb2, "&rs=", z8.f.t(this.f137382v));
        a(sb2, "&ev=", z8.f.t(this.f137381u));
        a(sb2, "&st=", z8.f.t(this.f137383w));
        sb2.append("&tt=");
        sb2.append(this.f137384x);
        sb2.append("&fw=");
        sb2.append(this.f137385y ? "1" : "0");
        return sb2;
    }
}
