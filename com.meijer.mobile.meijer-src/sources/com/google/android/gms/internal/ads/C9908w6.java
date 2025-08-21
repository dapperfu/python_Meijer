package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9908w6 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f80270a = new GQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final S0 f80271b = new S0(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f80271b.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        return this.f80271b.b(interfaceC9361r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        this.f80270a.i(4);
        C8080f0 c8080f0 = (C8080f0) interfaceC9361r0;
        c8080f0.c(this.f80270a.n(), 0, 4, false);
        if (this.f80270a.K() == 1380533830) {
            c8080f0.h(4, false);
            this.f80270a.i(4);
            c8080f0.c(this.f80270a.n(), 0, 4, false);
            if (this.f80270a.K() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f80271b.d(interfaceC9575t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
