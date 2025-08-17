package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Dy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6678Dy implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9552ty f66307a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f66308b;

    public C6678Dy(C9552ty c9552ty, InterfaceC10088yy0 interfaceC10088yy0) {
        this.f66307a = c9552ty;
        this.f66308b = interfaceC10088yy0;
    }

    public static Set a(C9552ty c9552ty, C9127pz c9127pz) {
        Set setSingleton = Collections.singleton(new ZF(c9127pz, C6908Kq.f68180g));
        C9233qy0.b(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f66307a, (C9127pz) this.f66308b.zzb());
    }
}
