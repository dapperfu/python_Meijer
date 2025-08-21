package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Xw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7476Xw implements InterfaceC9813vC {

    /* renamed from: a, reason: collision with root package name */
    private final S60 f72281a;

    public C7476Xw(S60 s60) {
        this.f72281a = s60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void L(Context context) {
        try {
            this.f72281a.z();
            if (context != null) {
                this.f72281a.x(context);
            }
        } catch (zzfcq e10) {
            Sc.p.h("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void j(Context context) {
        try {
            this.f72281a.l();
        } catch (zzfcq e10) {
            Sc.p.h("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void q(Context context) {
        try {
            this.f72281a.y();
        } catch (zzfcq e10) {
            Sc.p.h("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }
}
