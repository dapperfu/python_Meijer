package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnCancelListenerC8473jt implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f75528a;

    DialogInterfaceOnCancelListenerC8473jt(JsPromptResult jsPromptResult) {
        this.f75528a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f75528a.cancel();
    }
}
