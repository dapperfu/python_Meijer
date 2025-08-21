package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.xu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10097xu implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9562su f80719a;

    public C10097xu(C9562su c9562su) {
        this.f80719a = c9562su;
    }

    public final WeakReference a() {
        return b(this.f80719a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        return b(this.f80719a);
    }

    public static WeakReference b(C9562su c9562su) {
        WeakReference weakReferenceG = c9562su.g();
        C9358qy0.b(weakReferenceG);
        return weakReferenceG;
    }
}
