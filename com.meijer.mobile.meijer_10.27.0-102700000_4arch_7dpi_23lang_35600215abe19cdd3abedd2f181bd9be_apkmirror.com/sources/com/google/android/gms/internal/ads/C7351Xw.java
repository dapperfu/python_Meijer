package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Xw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7351Xw implements InterfaceC9688vC {

    /* renamed from: a, reason: collision with root package name */
    private final S60 f71441a;

    public C7351Xw(S60 s60) {
        this.f71441a = s60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void J(Context context) {
        try {
            this.f71441a.z();
            if (context != null) {
                this.f71441a.x(context);
            }
        } catch (zzfcq e10) {
            Qc.p.h("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void j(Context context) {
        try {
            this.f71441a.l();
        } catch (zzfcq e10) {
            Qc.p.h("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void q(Context context) {
        try {
            this.f71441a.y();
        } catch (zzfcq e10) {
            Qc.p.h("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }
}
