package i8;

/* loaded from: classes4.dex */
public class o extends v {

    /* renamed from: z, reason: collision with root package name */
    private boolean f137321z;

    public o(String str, String str2, String str3, p8.b bVar, int i10, String str4, boolean z10) {
        super(str, 11, w.f137400q, str, str2, str3, 0L, bVar, i10, str4, z10);
        this.f137385y = z10;
        this.f137321z = true;
    }

    public void D(boolean z10) {
        this.f137321z = z10;
    }

    @Override // i8.v, i8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f137333j.e());
        sb2.append("&na=");
        sb2.append(z8.f.t(h()));
        sb2.append("&it=");
        sb2.append(z8.f.e());
        sb2.append("&pa=");
        sb2.append(0);
        sb2.append("&s0=");
        sb2.append(this.f137330g);
        sb2.append("&t0=");
        sb2.append(n());
        a(sb2, "&rs=", z8.f.t(this.f137382v));
        a(sb2, "&st=", z8.f.t(this.f137383w));
        sb2.append("&tt=");
        sb2.append(this.f137384x);
        sb2.append("&im=");
        sb2.append(this.f137321z ? "1" : "0");
        sb2.append("&fw=");
        sb2.append(this.f137385y ? "1" : "0");
        return sb2;
    }
}
