package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public final class KG implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68909a;

    public KG(JG jg2, InterfaceC10213yy0 interfaceC10213yy0) {
        this.f68909a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new ZF((C9597tB) this.f68909a.zzb(), C7033Kq.f69020g));
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
