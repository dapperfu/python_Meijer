package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes.dex */
public class o extends n {
    o(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    o(Object obj) {
        super(obj);
    }

    static o m(OutputConfiguration outputConfiguration) {
        return new o(outputConfiguration);
    }

    @Override // x.p, x.k.a
    public void a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) h()).setStreamUseCase(j10);
    }

    @Override // x.n, x.m, x.l, x.p, x.k.a
    public Object h() {
        o2.i.a(this.f167716a instanceof OutputConfiguration);
        return this.f167716a;
    }

    @Override // x.m, x.p, x.k.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // x.n, x.m, x.l, x.p, x.k.a
    public void c(long j10) {
        ((OutputConfiguration) h()).setDynamicRangeProfile(j10);
    }

    @Override // x.n, x.m, x.l, x.p, x.k.a
    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    @Override // x.n, x.m, x.l, x.p, x.k.a
    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    @Override // x.p
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // x.m, x.l, x.p, x.k.a
    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // x.p, x.k.a
    public void g(int i10) {
        ((OutputConfiguration) h()).setMirrorMode(i10);
    }

    @Override // x.l, x.p, x.k.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // x.p
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
