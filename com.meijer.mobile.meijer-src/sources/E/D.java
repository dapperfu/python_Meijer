package E;

import F.S;
import F.x0;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class D implements F.S {

    /* renamed from: a, reason: collision with root package name */
    private final F.S f6817a;

    /* renamed from: b, reason: collision with root package name */
    private O f6818b;

    private androidx.camera.core.n j(androidx.camera.core.n nVar) {
        if (nVar == null) {
            return null;
        }
        x0 x0VarB = this.f6818b == null ? x0.b() : x0.a(new Pair(this.f6818b.i(), this.f6818b.h().get(0)));
        this.f6818b = null;
        return new androidx.camera.core.r(nVar, new Size(nVar.getWidth(), nVar.getHeight()), new J.b(new S.k(x0VarB, nVar.S2().getTimestamp())));
    }

    void i() {
        this.f6818b = null;
    }

    @Override // F.S
    public androidx.camera.core.n b() {
        return j(this.f6817a.b());
    }

    @Override // F.S
    public int c() {
        return this.f6817a.c();
    }

    @Override // F.S
    public void close() {
        this.f6817a.close();
    }

    @Override // F.S
    public void d() {
        this.f6817a.d();
    }

    @Override // F.S
    public int e() {
        return this.f6817a.e();
    }

    @Override // F.S
    public void f(final S.a aVar, Executor executor) {
        this.f6817a.f(new S.a() { // from class: E.C
            @Override // F.S.a
            public final void a(F.S s10) {
                D.a(this.f6815a, aVar, s10);
            }
        }, executor);
    }

    @Override // F.S
    public androidx.camera.core.n g() {
        return j(this.f6817a.g());
    }

    @Override // F.S
    public int getHeight() {
        return this.f6817a.getHeight();
    }

    @Override // F.S
    public Surface getSurface() {
        return this.f6817a.getSurface();
    }

    @Override // F.S
    public int getWidth() {
        return this.f6817a.getWidth();
    }

    void h(O o10) {
        o2.i.j(this.f6818b == null, "Pending request should be null");
        this.f6818b = o10;
    }

    D(F.S s10) {
        this.f6817a = s10;
    }

    public static /* synthetic */ void a(D d10, S.a aVar, F.S s10) {
        d10.getClass();
        aVar.a(d10);
    }
}
