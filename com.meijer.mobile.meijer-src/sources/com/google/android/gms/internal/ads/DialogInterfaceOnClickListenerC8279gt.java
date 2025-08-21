package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.gt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC8279gt implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsResult f75254a;

    DialogInterfaceOnClickListenerC8279gt(JsResult jsResult) {
        this.f75254a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f75254a.cancel();
    }
}
