package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes6.dex */
public final class TK implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6717Bh f71201a;

    /* renamed from: b, reason: collision with root package name */
    private final C8440iL f71202b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7863cy0 f71203c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f71201a.z7((InterfaceC9323qh) this.f71203c.zzb(), str);
        } catch (RemoteException e10) {
            Sc.p.h("Failed to call onCustomClick for asset " + str + ".", e10);
        }
    }

    public final void b() {
        if (this.f71201a == null) {
            return;
        }
        this.f71202b.l("/nativeAdCustomClick", this);
    }

    public TK(II ii2, C10039xI c10039xI, C8440iL c8440iL, InterfaceC7863cy0 interfaceC7863cy0) {
        this.f71201a = ii2.c(c10039xI.a());
        this.f71202b = c8440iL;
        this.f71203c = interfaceC7863cy0;
    }
}
