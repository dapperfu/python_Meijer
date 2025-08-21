package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class D1 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f66942a = new GQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final S0 f66943b = new S0(-1, -1, "image/heif");

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        ((C8080f0) interfaceC9361r0).h(4, false);
        return e(interfaceC9361r0, 1718909296) && e(interfaceC9361r0, 1751476579);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    private final boolean e(InterfaceC9361r0 interfaceC9361r0, int i10) throws IOException {
        this.f66942a.i(4);
        ((C8080f0) interfaceC9361r0).c(this.f66942a.n(), 0, 4, false);
        return this.f66942a.K() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f66943b.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        return this.f66943b.b(interfaceC9361r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f66943b.d(interfaceC9575t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
