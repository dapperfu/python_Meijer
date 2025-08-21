package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class H80 implements LF, InterfaceC9279qC, QF {

    /* renamed from: a, reason: collision with root package name */
    private final W80 f68221a;

    /* renamed from: b, reason: collision with root package name */
    private final K80 f68222b;

    @Override // com.google.android.gms.internal.ads.QF
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9279qC
    public final void j(Oc.W0 w02) {
        if (((Boolean) C8146fg.f74977d.e()).booleanValue()) {
            W80 w80 = this.f68221a;
            K80 k80 = this.f68222b;
            k80.p(w02.B().toString());
            k80.s0(false);
            w80.a(k80);
        }
    }

    @Override // com.google.android.gms.internal.ads.QF
    public final void zzb() {
        if (((Boolean) C8146fg.f74977d.e()).booleanValue()) {
            W80 w80 = this.f68221a;
            K80 k80 = this.f68222b;
            k80.s0(true);
            w80.a(k80);
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void zzl() {
        if (((Boolean) C8146fg.f74977d.e()).booleanValue()) {
            this.f68222b.zzi();
        }
    }

    H80(Context context, W80 w80) {
        this.f68221a = w80;
        this.f68222b = J80.a(context, 13);
    }
}
