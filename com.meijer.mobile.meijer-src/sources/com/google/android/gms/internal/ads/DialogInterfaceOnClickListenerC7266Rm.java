package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Rm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7266Rm implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7334Tm f70772a;

    DialogInterfaceOnClickListenerC7266Rm(C7334Tm c7334Tm) {
        this.f70772a = c7334Tm;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C7334Tm c7334Tm = this.f70772a;
        Intent intentI = c7334Tm.i();
        Nc.v.t();
        Rc.D0.t(c7334Tm.f71292d, intentI);
    }
}
