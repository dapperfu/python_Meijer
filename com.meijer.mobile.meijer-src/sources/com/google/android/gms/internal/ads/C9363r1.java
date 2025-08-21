package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9363r1 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f78743a = new GQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final S0 f78744b = new S0(-1, -1, "image/avif");

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        ((C8080f0) interfaceC9361r0).h(4, false);
        return e(interfaceC9361r0, 1718909296) && e(interfaceC9361r0, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    private final boolean e(InterfaceC9361r0 interfaceC9361r0, int i10) throws IOException {
        this.f78743a.i(4);
        ((C8080f0) interfaceC9361r0).c(this.f78743a.n(), 0, 4, false);
        return this.f78743a.K() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f78744b.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        return this.f78744b.b(interfaceC9361r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f78744b.d(interfaceC9575t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
