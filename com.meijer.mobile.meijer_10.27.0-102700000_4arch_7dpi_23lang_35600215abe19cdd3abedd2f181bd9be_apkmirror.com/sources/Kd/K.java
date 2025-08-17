package Kd;

import Ld.InterfaceC4067u;
import Ld.t0;

/* loaded from: classes6.dex */
final class K extends t0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3946d f16388a;

    K(C3945c c3945c, InterfaceC3946d interfaceC3946d) {
        this.f16388a = interfaceC3946d;
    }

    @Override // Ld.InterfaceC4044c
    public final void deactivate() {
        this.f16388a.deactivate();
    }

    @Override // Ld.InterfaceC4044c
    public final void i3(InterfaceC4067u interfaceC4067u) {
        this.f16388a.a(new D(this, interfaceC4067u));
    }
}
