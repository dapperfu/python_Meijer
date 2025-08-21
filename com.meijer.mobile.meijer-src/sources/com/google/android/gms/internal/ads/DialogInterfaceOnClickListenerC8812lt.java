package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.lt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC8812lt implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f77510a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f77511b;

    DialogInterfaceOnClickListenerC8812lt(JsPromptResult jsPromptResult, EditText editText) {
        this.f77510a = jsPromptResult;
        this.f77511b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f77510a.confirm(this.f77511b.getText().toString());
    }
}
