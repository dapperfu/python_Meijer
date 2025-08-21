package Yf;

/* loaded from: classes8.dex */
public class a extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Wf.a f43047c = Wf.a.e();

    /* renamed from: b, reason: collision with root package name */
    private final dg.c f43048b;

    private boolean g() {
        dg.c cVar = this.f43048b;
        if (cVar == null) {
            f43047c.j("ApplicationInfo is null");
            return false;
        }
        if (!cVar.l0()) {
            f43047c.j("GoogleAppId is null");
            return false;
        }
        if (!this.f43048b.j0()) {
            f43047c.j("AppInstanceId is null");
            return false;
        }
        if (!this.f43048b.k0()) {
            f43047c.j("ApplicationProcessState is null");
            return false;
        }
        if (!this.f43048b.i0()) {
            return true;
        }
        if (!this.f43048b.f0().e0()) {
            f43047c.j("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f43048b.f0().f0()) {
            return true;
        }
        f43047c.j("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    a(dg.c cVar) {
        this.f43048b = cVar;
    }

    @Override // Yf.e
    public boolean c() {
        if (!g()) {
            f43047c.j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}
