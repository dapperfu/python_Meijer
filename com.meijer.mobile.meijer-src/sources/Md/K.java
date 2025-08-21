package Md;

import Nd.InterfaceC4199u;
import Nd.t0;

/* loaded from: classes6.dex */
final class K extends t0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4111d f19747a;

    K(C4110c c4110c, InterfaceC4111d interfaceC4111d) {
        this.f19747a = interfaceC4111d;
    }

    @Override // Nd.InterfaceC4176c
    public final void C2(InterfaceC4199u interfaceC4199u) {
        this.f19747a.a(new D(this, interfaceC4199u));
    }

    @Override // Nd.InterfaceC4176c
    public final void deactivate() {
        this.f19747a.deactivate();
    }
}
