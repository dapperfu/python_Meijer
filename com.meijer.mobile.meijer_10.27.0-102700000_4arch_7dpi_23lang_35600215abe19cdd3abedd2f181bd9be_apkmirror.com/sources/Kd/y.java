package Kd;

import Kd.C3945c;
import Ld.r0;
import Md.C4188n;

/* loaded from: classes6.dex */
final class y extends r0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3945c.b f16449a;

    y(C3945c c3945c, C3945c.b bVar) {
        this.f16449a = bVar;
    }

    @Override // Ld.s0
    public final com.google.android.gms.dynamic.b h(Bd.e eVar) {
        return com.google.android.gms.dynamic.d.F2(this.f16449a.getInfoContents(new C4188n(eVar)));
    }

    @Override // Ld.s0
    public final com.google.android.gms.dynamic.b m0(Bd.e eVar) {
        return com.google.android.gms.dynamic.d.F2(this.f16449a.getInfoWindow(new C4188n(eVar)));
    }
}
