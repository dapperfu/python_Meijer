package g8;

/* loaded from: classes4.dex */
public class o extends v {

    /* renamed from: z, reason: collision with root package name */
    private boolean f133105z;

    public o(String str, String str2, String str3, n8.b bVar, int i10, String str4, boolean z10) {
        super(str, 11, w.f133184q, str, str2, str3, 0L, bVar, i10, str4, z10);
        this.f133169y = z10;
        this.f133105z = true;
    }

    public void D(boolean z10) {
        this.f133105z = z10;
    }

    @Override // g8.v, g8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f133117j.e());
        sb2.append("&na=");
        sb2.append(x8.f.t(h()));
        sb2.append("&it=");
        sb2.append(x8.f.e());
        sb2.append("&pa=");
        sb2.append(0);
        sb2.append("&s0=");
        sb2.append(this.f133114g);
        sb2.append("&t0=");
        sb2.append(n());
        a(sb2, "&rs=", x8.f.t(this.f133166v));
        a(sb2, "&st=", x8.f.t(this.f133167w));
        sb2.append("&tt=");
        sb2.append(this.f133168x);
        sb2.append("&im=");
        sb2.append(this.f133105z ? "1" : "0");
        sb2.append("&fw=");
        sb2.append(this.f133169y ? "1" : "0");
        return sb2;
    }
}
