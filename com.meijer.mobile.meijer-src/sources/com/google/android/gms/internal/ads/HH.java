package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public final class HH implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68261a;

    public HH(InterfaceC10213yy0 interfaceC10213yy0) {
        this.f68261a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((EH) this.f68261a).a().e() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
