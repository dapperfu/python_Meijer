package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7403Zi implements Oc.b {

    /* renamed from: a, reason: collision with root package name */
    boolean f72228a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f72229b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC4098a f72230c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f72231d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f72232e;

    @Override // Oc.b
    public final void zzb(int i10) {
    }

    C7403Zi(C7707cj c7707cj, boolean z10, InterfaceC4098a interfaceC4098a, Map map, Map map2) {
        this.f72229b = z10;
        this.f72230c = interfaceC4098a;
        this.f72231d = map;
        this.f72232e = map2;
    }

    @Override // Oc.b
    public final void a(boolean z10) {
        if (this.f72228a) {
            return;
        }
        if (z10 && this.f72229b) {
            ((InterfaceC8201hG) this.f72230c).Z();
        }
        this.f72228a = true;
        this.f72231d.put((String) this.f72232e.get("event_id"), Boolean.valueOf(z10));
        ((InterfaceC8136gk) this.f72230c).L("openIntentAsync", this.f72231d);
    }
}
