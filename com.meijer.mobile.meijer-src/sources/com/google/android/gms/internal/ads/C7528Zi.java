package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7528Zi implements Qc.b {

    /* renamed from: a, reason: collision with root package name */
    boolean f73068a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f73069b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC4376a f73070c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f73071d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f73072e;

    @Override // Qc.b
    public final void zzb(int i10) {
    }

    C7528Zi(C7832cj c7832cj, boolean z10, InterfaceC4376a interfaceC4376a, Map map, Map map2) {
        this.f73069b = z10;
        this.f73070c = interfaceC4376a;
        this.f73071d = map;
        this.f73072e = map2;
    }

    @Override // Qc.b
    public final void a(boolean z10) {
        if (this.f73068a) {
            return;
        }
        if (z10 && this.f73069b) {
            ((InterfaceC8326hG) this.f73070c).Z();
        }
        this.f73068a = true;
        this.f73071d.put((String) this.f73072e.get("event_id"), Boolean.valueOf(z10));
        ((InterfaceC8261gk) this.f73070c).L("openIntentAsync", this.f73071d);
    }
}
