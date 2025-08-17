package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.lt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC8687lt implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f76670a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f76671b;

    DialogInterfaceOnClickListenerC8687lt(JsPromptResult jsPromptResult, EditText editText) {
        this.f76670a = jsPromptResult;
        this.f76671b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f76670a.confirm(this.f76671b.getText().toString());
    }
}
