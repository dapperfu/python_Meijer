package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Du, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6674Du implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f66295a;

    public C6674Du(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f66295a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) Mc.A.c().a(C8659lf.f76042L1)).booleanValue() ? Collections.singleton(new ZF((GO) this.f66295a.zzb(), U70.b())) : Collections.EMPTY_SET;
        C9233qy0.b(setSingleton);
        return setSingleton;
    }
}
