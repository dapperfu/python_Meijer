package S;

import C.p0;
import F.InterfaceC3627y;
import F.InterfaceC3628z;
import F.c0;
import S.f;
import androidx.camera.core.impl.CameraControlInternal;
import java.util.Collection;

/* loaded from: classes.dex */
class i implements InterfaceC3628z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3628z f33083a;

    /* renamed from: b, reason: collision with root package name */
    private final o f33084b;

    /* renamed from: c, reason: collision with root package name */
    private final p f33085c;

    /* renamed from: d, reason: collision with root package name */
    private final p0.b f33086d;

    @Override // F.InterfaceC3628z
    public boolean o() {
        return false;
    }

    @Override // F.InterfaceC3628z
    public CameraControlInternal c() {
        return this.f33084b;
    }

    @Override // F.InterfaceC3628z
    public void g(Collection<p0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.InterfaceC3628z
    public void h(Collection<p0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.InterfaceC3628z
    public InterfaceC3627y i() {
        return this.f33085c;
    }

    @Override // F.InterfaceC3628z
    public c0<InterfaceC3628z.a> n() {
        return this.f33083a.n();
    }

    void q(int i10) {
        this.f33085c.j(i10);
    }

    i(InterfaceC3628z interfaceC3628z, p0.b bVar, f.a aVar) {
        this.f33083a = interfaceC3628z;
        this.f33086d = bVar;
        this.f33084b = new o(interfaceC3628z.c(), aVar);
        this.f33085c = new p(interfaceC3628z.i());
    }

    @Override // C.p0.b
    public void b(p0 p0Var) {
        G.o.a();
        this.f33086d.b(p0Var);
    }

    @Override // C.p0.b
    public void e(p0 p0Var) {
        G.o.a();
        this.f33086d.e(p0Var);
    }

    @Override // C.p0.b
    public void j(p0 p0Var) {
        G.o.a();
        this.f33086d.j(p0Var);
    }

    @Override // C.p0.b
    public void l(p0 p0Var) {
        G.o.a();
        this.f33086d.l(p0Var);
    }
}
