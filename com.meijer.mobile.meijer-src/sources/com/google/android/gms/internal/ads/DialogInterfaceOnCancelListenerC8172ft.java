package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnCancelListenerC8172ft implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f75025a;

    DialogInterfaceOnCancelListenerC8172ft(JsResult jsResult) {
        this.f75025a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f75025a.cancel();
    }
}
