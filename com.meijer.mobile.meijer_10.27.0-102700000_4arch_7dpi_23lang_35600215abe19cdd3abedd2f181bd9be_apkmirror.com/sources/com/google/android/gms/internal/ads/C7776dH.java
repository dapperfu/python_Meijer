package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7776dH implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final JG f73388a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f73389b;

    public C7776dH(JG jg2, InterfaceC10088yy0 interfaceC10088yy0) {
        this.f73388a = jg2;
        this.f73389b = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.f73388a.d((Executor) this.f73389b.zzb());
    }
}
