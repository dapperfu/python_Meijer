package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class FP implements InterfaceC10118zD, InterfaceC9482tG {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66805a;

    /* renamed from: b, reason: collision with root package name */
    private final C9812wN f66806b;

    FP(Context context, C9812wN c9812wN) {
        this.f66805a = context;
        this.f66806b = c9812wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void i(String str) {
    }

    private final void c(final Context context) {
        if (((Boolean) Mc.A.c().a(C8659lf.f75975G4)).booleanValue()) {
            C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.DP
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66237a.b(context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
        c(this.f66805a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void a(Vc.N n10) {
        c(this.f66805a);
    }

    final /* synthetic */ void b(Context context) {
        Lc.v.i().d(context, this.f66806b);
    }
}
