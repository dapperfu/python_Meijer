package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes6.dex */
public final class TK implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6592Bh f70361a;

    /* renamed from: b, reason: collision with root package name */
    private final C8315iL f70362b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7738cy0 f70363c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f70361a.t7((InterfaceC9198qh) this.f70363c.zzb(), str);
        } catch (RemoteException e10) {
            Qc.p.h("Failed to call onCustomClick for asset " + str + ".", e10);
        }
    }

    public final void b() {
        if (this.f70361a == null) {
            return;
        }
        this.f70362b.l("/nativeAdCustomClick", this);
    }

    public TK(II ii2, C9914xI c9914xI, C8315iL c8315iL, InterfaceC7738cy0 interfaceC7738cy0) {
        this.f70361a = ii2.c(c9914xI.a());
        this.f70362b = c8315iL;
        this.f70363c = interfaceC7738cy0;
    }
}
