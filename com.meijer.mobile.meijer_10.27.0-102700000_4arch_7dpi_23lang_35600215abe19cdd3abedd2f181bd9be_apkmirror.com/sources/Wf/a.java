package Wf;

/* loaded from: classes7.dex */
public class a extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Uf.a f38648c = Uf.a.e();

    /* renamed from: b, reason: collision with root package name */
    private final bg.c f38649b;

    private boolean g() {
        bg.c cVar = this.f38649b;
        if (cVar == null) {
            f38648c.j("ApplicationInfo is null");
            return false;
        }
        if (!cVar.l0()) {
            f38648c.j("GoogleAppId is null");
            return false;
        }
        if (!this.f38649b.j0()) {
            f38648c.j("AppInstanceId is null");
            return false;
        }
        if (!this.f38649b.k0()) {
            f38648c.j("ApplicationProcessState is null");
            return false;
        }
        if (!this.f38649b.i0()) {
            return true;
        }
        if (!this.f38649b.f0().e0()) {
            f38648c.j("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f38649b.f0().f0()) {
            return true;
        }
        f38648c.j("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    a(bg.c cVar) {
        this.f38649b = cVar;
    }

    @Override // Wf.e
    public boolean c() {
        if (!g()) {
            f38648c.j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}
