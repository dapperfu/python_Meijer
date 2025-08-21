package S;

import C.p0;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import F.c0;
import S.f;
import androidx.camera.core.impl.CameraControlInternal;
import java.util.Collection;

/* loaded from: classes.dex */
class i implements InterfaceC3290z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3290z f34262a;

    /* renamed from: b, reason: collision with root package name */
    private final o f34263b;

    /* renamed from: c, reason: collision with root package name */
    private final p f34264c;

    /* renamed from: d, reason: collision with root package name */
    private final p0.b f34265d;

    @Override // F.InterfaceC3290z
    public boolean o() {
        return false;
    }

    @Override // F.InterfaceC3290z
    public CameraControlInternal c() {
        return this.f34263b;
    }

    @Override // F.InterfaceC3290z
    public void g(Collection<p0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.InterfaceC3290z
    public void h(Collection<p0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.InterfaceC3290z
    public InterfaceC3289y i() {
        return this.f34264c;
    }

    @Override // F.InterfaceC3290z
    public c0<InterfaceC3290z.a> n() {
        return this.f34262a.n();
    }

    void q(int i10) {
        this.f34264c.j(i10);
    }

    i(InterfaceC3290z interfaceC3290z, p0.b bVar, f.a aVar) {
        this.f34262a = interfaceC3290z;
        this.f34265d = bVar;
        this.f34263b = new o(interfaceC3290z.c(), aVar);
        this.f34264c = new p(interfaceC3290z.i());
    }

    @Override // C.p0.b
    public void b(p0 p0Var) {
        G.o.a();
        this.f34265d.b(p0Var);
    }

    @Override // C.p0.b
    public void e(p0 p0Var) {
        G.o.a();
        this.f34265d.e(p0Var);
    }

    @Override // C.p0.b
    public void j(p0 p0Var) {
        G.o.a();
        this.f34265d.j(p0Var);
    }

    @Override // C.p0.b
    public void l(p0 p0Var) {
        G.o.a();
        this.f34265d.l(p0Var);
    }
}
