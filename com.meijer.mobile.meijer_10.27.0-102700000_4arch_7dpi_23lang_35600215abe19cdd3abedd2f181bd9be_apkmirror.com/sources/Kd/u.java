package Kd;

import Kd.C3945c;
import Md.C4188n;

/* loaded from: classes6.dex */
final class u extends Ld.F {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3945c.q f16445a;

    u(C3945c c3945c, C3945c.q qVar) {
        this.f16445a = qVar;
    }

    @Override // Ld.G
    public final void h(Bd.e eVar) {
        this.f16445a.onMarkerDrag(new C4188n(eVar));
    }

    @Override // Ld.G
    public final void m0(Bd.e eVar) {
        this.f16445a.onMarkerDragEnd(new C4188n(eVar));
    }

    @Override // Ld.G
    public final void n4(Bd.e eVar) {
        this.f16445a.onMarkerDragStart(new C4188n(eVar));
    }
}
