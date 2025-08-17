package g8;

/* loaded from: classes4.dex */
public class v extends p {

    /* renamed from: u, reason: collision with root package name */
    protected String f133165u;

    /* renamed from: v, reason: collision with root package name */
    protected String f133166v;

    /* renamed from: w, reason: collision with root package name */
    protected String f133167w;

    /* renamed from: x, reason: collision with root package name */
    protected String f133168x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f133169y;

    protected v(String str, String str2, String str3, String str4, long j10, n8.b bVar, int i10, String str5, boolean z10) {
        this(str, 6, w.f133183p, str2, str3, str4, j10, bVar, i10, str5, z10);
    }

    protected v(String str, int i10, w wVar, String str2, String str3, String str4, long j10, n8.b bVar, int i11, String str5, boolean z10) {
        super(str, i10, wVar, j10, bVar, i11, z10);
        this.f133165u = str2;
        this.f133166v = str3;
        this.f133167w = str4;
        this.f133168x = str5;
        this.f133169y = z10;
    }

    @Override // g8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f133117j.e());
        sb2.append("&na=");
        sb2.append(x8.f.t(h()));
        sb2.append("&it=");
        sb2.append(x8.f.e());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
        a(sb2, "&rs=", x8.f.t(this.f133166v));
        a(sb2, "&ev=", x8.f.t(this.f133165u));
        a(sb2, "&st=", x8.f.t(this.f133167w));
        sb2.append("&tt=");
        sb2.append(this.f133168x);
        sb2.append("&fw=");
        sb2.append(this.f133169y ? "1" : "0");
        return sb2;
    }
}
