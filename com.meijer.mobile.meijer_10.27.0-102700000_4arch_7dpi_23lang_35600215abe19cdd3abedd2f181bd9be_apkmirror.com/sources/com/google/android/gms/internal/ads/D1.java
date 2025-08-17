package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class D1 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f66102a = new GQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final S0 f66103b = new S0(-1, -1, "image/heif");

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        ((C7955f0) interfaceC9236r0).h(4, false);
        return e(interfaceC9236r0, 1718909296) && e(interfaceC9236r0, 1751476579);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    private final boolean e(InterfaceC9236r0 interfaceC9236r0, int i10) throws IOException {
        this.f66102a.i(4);
        ((C7955f0) interfaceC9236r0).c(this.f66102a.n(), 0, 4, false);
        return this.f66102a.K() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f66103b.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        return this.f66103b.b(interfaceC9236r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f66103b.d(interfaceC9450t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
