package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.xu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9972xu implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9437su f79879a;

    public C9972xu(C9437su c9437su) {
        this.f79879a = c9437su;
    }

    public final WeakReference a() {
        return b(this.f79879a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* synthetic */ Object zzb() {
        return b(this.f79879a);
    }

    public static WeakReference b(C9437su c9437su) {
        WeakReference weakReferenceG = c9437su.g();
        C9233qy0.b(weakReferenceG);
        return weakReferenceG;
    }
}
