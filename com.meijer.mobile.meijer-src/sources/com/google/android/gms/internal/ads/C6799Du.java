package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Du, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6799Du implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f67135a;

    public C6799Du(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f67135a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) Oc.A.c().a(C8784lf.f76882L1)).booleanValue() ? Collections.singleton(new ZF((GO) this.f67135a.zzb(), U70.b())) : Collections.EMPTY_SET;
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
