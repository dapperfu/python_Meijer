package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Sm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7175Sm implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7209Tm f70158a;

    DialogInterfaceOnClickListenerC7175Sm(C7209Tm c7209Tm) {
        this.f70158a = c7209Tm;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        this.f70158a.c("Operation denied by user.");
    }
}
