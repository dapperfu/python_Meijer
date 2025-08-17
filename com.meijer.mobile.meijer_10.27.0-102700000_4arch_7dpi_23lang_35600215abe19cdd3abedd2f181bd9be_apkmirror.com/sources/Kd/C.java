package Kd;

import Bd.InterfaceC2952b;
import Kd.C3945c;
import Ld.AbstractBinderC4059l;
import Md.C4186l;

/* loaded from: classes6.dex */
final class C extends AbstractBinderC4059l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3945c.i f16380a;

    C(C3945c c3945c, C3945c.i iVar) {
        this.f16380a = iVar;
    }

    @Override // Ld.InterfaceC4060m
    public final void v9(InterfaceC2952b interfaceC2952b) {
        this.f16380a.onIndoorLevelActivated(new C4186l(interfaceC2952b));
    }

    @Override // Ld.InterfaceC4060m
    public final void zzb() {
        this.f16380a.onIndoorBuildingFocused();
    }
}
