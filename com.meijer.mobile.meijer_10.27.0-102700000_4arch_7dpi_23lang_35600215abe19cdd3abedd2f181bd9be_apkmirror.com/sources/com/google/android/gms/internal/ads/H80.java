package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class H80 implements LF, InterfaceC9154qC, QF {

    /* renamed from: a, reason: collision with root package name */
    private final W80 f67381a;

    /* renamed from: b, reason: collision with root package name */
    private final K80 f67382b;

    @Override // com.google.android.gms.internal.ads.QF
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9154qC
    public final void j(Mc.W0 w02) {
        if (((Boolean) C8021fg.f74137d.e()).booleanValue()) {
            W80 w80 = this.f67381a;
            K80 k80 = this.f67382b;
            k80.p(w02.B().toString());
            k80.r0(false);
            w80.a(k80);
        }
    }

    @Override // com.google.android.gms.internal.ads.QF
    public final void zzb() {
        if (((Boolean) C8021fg.f74137d.e()).booleanValue()) {
            W80 w80 = this.f67381a;
            K80 k80 = this.f67382b;
            k80.r0(true);
            w80.a(k80);
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzl() {
        if (((Boolean) C8021fg.f74137d.e()).booleanValue()) {
            this.f67382b.zzi();
        }
    }

    H80(Context context, W80 w80) {
        this.f67381a = w80;
        this.f67382b = J80.a(context, 13);
    }
}
