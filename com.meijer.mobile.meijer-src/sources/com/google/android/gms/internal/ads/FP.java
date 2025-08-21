package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class FP implements InterfaceC10243zD, InterfaceC9607tG {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67645a;

    /* renamed from: b, reason: collision with root package name */
    private final C9937wN f67646b;

    FP(Context context, C9937wN c9937wN) {
        this.f67645a = context;
        this.f67646b = c9937wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(C8733l60 c8733l60) {
    }

    private final void c(final Context context) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76815G4)).booleanValue()) {
            C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.DP
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67077a.b(context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void a(Xc.N n10) {
        c(this.f67645a);
    }

    final /* synthetic */ void b(Context context) {
        Nc.v.i().d(context, this.f67646b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) {
        c(this.f67645a);
    }
}
