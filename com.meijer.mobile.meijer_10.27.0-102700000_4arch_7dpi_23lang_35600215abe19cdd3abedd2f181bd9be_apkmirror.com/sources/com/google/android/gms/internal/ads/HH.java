package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public final class HH implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67421a;

    public HH(InterfaceC10088yy0 interfaceC10088yy0) {
        this.f67421a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((EH) this.f67421a).a().e() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        C9233qy0.b(setSingleton);
        return setSingleton;
    }
}
