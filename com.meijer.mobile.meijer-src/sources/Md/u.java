package Md;

import Md.C4110c;
import Od.C4466n;

/* loaded from: classes6.dex */
final class u extends Nd.F {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4110c.q f19804a;

    u(C4110c c4110c, C4110c.q qVar) {
        this.f19804a = qVar;
    }

    @Override // Nd.G
    public final void K5(Dd.e eVar) {
        this.f19804a.onMarkerDragStart(new C4466n(eVar));
    }

    @Override // Nd.G
    public final void f(Dd.e eVar) {
        this.f19804a.onMarkerDrag(new C4466n(eVar));
    }

    @Override // Nd.G
    public final void x0(Dd.e eVar) {
        this.f19804a.onMarkerDragEnd(new C4466n(eVar));
    }
}
