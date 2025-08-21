package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Dy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6803Dy implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9677ty f67147a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f67148b;

    public C6803Dy(C9677ty c9677ty, InterfaceC10213yy0 interfaceC10213yy0) {
        this.f67147a = c9677ty;
        this.f67148b = interfaceC10213yy0;
    }

    public static Set a(C9677ty c9677ty, C9252pz c9252pz) {
        Set setSingleton = Collections.singleton(new ZF(c9252pz, C7033Kq.f69020g));
        C9358qy0.b(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f67147a, (C9252pz) this.f67148b.zzb());
    }
}
