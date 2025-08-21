package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.kt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC8705kt implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f76550a;

    DialogInterfaceOnClickListenerC8705kt(JsPromptResult jsPromptResult) {
        this.f76550a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f76550a.cancel();
    }
}
