package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9783w6 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f79430a = new GQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final S0 f79431b = new S0(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f79431b.a(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        return this.f79431b.b(interfaceC9236r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        this.f79430a.i(4);
        C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
        c7955f0.c(this.f79430a.n(), 0, 4, false);
        if (this.f79430a.K() == 1380533830) {
            c7955f0.h(4, false);
            this.f79430a.i(4);
            c7955f0.c(this.f79430a.n(), 0, 4, false);
            if (this.f79430a.K() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f79431b.d(interfaceC9450t0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
