package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8088f4 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final S0 f74861a = new S0(35152, 2, "image/png");

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f74861a.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        return this.f74861a.b(interfaceC9361r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        return this.f74861a.c(interfaceC9361r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f74861a.d(interfaceC9575t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
