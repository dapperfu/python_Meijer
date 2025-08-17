package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Zm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7407Zm implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7502an f72244a;

    DialogInterfaceOnClickListenerC7407Zm(C7502an c7502an) {
        this.f72244a = c7502an;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        this.f72244a.c("User canceled the download.");
    }
}
