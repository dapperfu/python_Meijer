package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Zm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7532Zm implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7627an f73084a;

    DialogInterfaceOnClickListenerC7532Zm(C7627an c7627an) {
        this.f73084a = c7627an;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        this.f73084a.c("User canceled the download.");
    }
}
