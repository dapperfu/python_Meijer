package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnCancelListenerC8598jt implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f76368a;

    DialogInterfaceOnCancelListenerC8598jt(JsPromptResult jsPromptResult) {
        this.f76368a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f76368a.cancel();
    }
}
