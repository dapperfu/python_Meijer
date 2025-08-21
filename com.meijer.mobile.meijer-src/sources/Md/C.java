package Md;

import Dd.InterfaceC3101b;
import Md.C4110c;
import Nd.AbstractBinderC4191l;
import Od.C4464l;

/* loaded from: classes6.dex */
final class C extends AbstractBinderC4191l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4110c.i f19739a;

    C(C4110c c4110c, C4110c.i iVar) {
        this.f19739a = iVar;
    }

    @Override // Nd.InterfaceC4192m
    public final void v8(InterfaceC3101b interfaceC3101b) {
        this.f19739a.onIndoorLevelActivated(new C4464l(interfaceC3101b));
    }

    @Override // Nd.InterfaceC4192m
    public final void zzb() {
        this.f19739a.onIndoorBuildingFocused();
    }
}
