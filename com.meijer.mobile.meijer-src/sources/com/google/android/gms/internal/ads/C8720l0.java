package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8720l0 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f76573a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // com.google.android.gms.internal.ads.X0
    public final void a(long j10, int i10, int i11, int i12, W0 w02) {
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ int b(InterfaceC9810vA0 interfaceC9810vA0, int i10, boolean z10) {
        return V0.a(this, interfaceC9810vA0, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void c(GQ gq2, int i10) {
        V0.b(this, gq2, i10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void d(C c10) {
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void e(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final int f(InterfaceC9810vA0 interfaceC9810vA0, int i10, boolean z10, int i11) throws IOException {
        int iZza = interfaceC9810vA0.zza(this.f76573a, 0, Math.min(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void g(GQ gq2, int i10, int i11) {
        gq2.m(i10);
    }
}
