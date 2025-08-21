package Md;

import Md.C4110c;
import Nd.r0;
import Od.C4466n;

/* loaded from: classes6.dex */
final class y extends r0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4110c.b f19808a;

    y(C4110c c4110c, C4110c.b bVar) {
        this.f19808a = bVar;
    }

    @Override // Nd.s0
    public final com.google.android.gms.dynamic.b f(Dd.e eVar) {
        return com.google.android.gms.dynamic.d.I2(this.f19808a.getInfoContents(new C4466n(eVar)));
    }

    @Override // Nd.s0
    public final com.google.android.gms.dynamic.b x0(Dd.e eVar) {
        return com.google.android.gms.dynamic.d.I2(this.f19808a.getInfoWindow(new C4466n(eVar)));
    }
}
