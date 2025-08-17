package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Rm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7141Rm implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7209Tm f69932a;

    DialogInterfaceOnClickListenerC7141Rm(C7209Tm c7209Tm) {
        this.f69932a = c7209Tm;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C7209Tm c7209Tm = this.f69932a;
        Intent intentI = c7209Tm.i();
        Lc.v.t();
        Pc.D0.t(c7209Tm.f70452d, intentI);
    }
}
