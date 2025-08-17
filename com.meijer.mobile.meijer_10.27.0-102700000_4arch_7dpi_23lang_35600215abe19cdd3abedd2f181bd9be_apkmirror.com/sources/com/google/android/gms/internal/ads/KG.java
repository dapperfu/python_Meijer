package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public final class KG implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68069a;

    public KG(JG jg2, InterfaceC10088yy0 interfaceC10088yy0) {
        this.f68069a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new ZF((C9472tB) this.f68069a.zzb(), C6908Kq.f68180g));
        C9233qy0.b(setSingleton);
        return setSingleton;
    }
}
