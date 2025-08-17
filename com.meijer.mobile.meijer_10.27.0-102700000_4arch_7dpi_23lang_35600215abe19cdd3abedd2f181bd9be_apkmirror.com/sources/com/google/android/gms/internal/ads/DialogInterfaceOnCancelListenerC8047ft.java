package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnCancelListenerC8047ft implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f74185a;

    DialogInterfaceOnCancelListenerC8047ft(JsResult jsResult) {
        this.f74185a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f74185a.cancel();
    }
}
