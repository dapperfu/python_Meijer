package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Sm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7300Sm implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7334Tm f70998a;

    DialogInterfaceOnClickListenerC7300Sm(C7334Tm c7334Tm) {
        this.f70998a = c7334Tm;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        this.f70998a.c("Operation denied by user.");
    }
}
