package com.google.android.gms.common.internal;

import android.content.Intent;
import hd.InterfaceC14408i;

/* loaded from: classes4.dex */
final class G extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f64807a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC14408i f64808b;

    G(Intent intent, InterfaceC14408i interfaceC14408i, int i10) {
        this.f64807a = intent;
        this.f64808b = interfaceC14408i;
    }

    @Override // com.google.android.gms.common.internal.H
    public final void a() {
        Intent intent = this.f64807a;
        if (intent != null) {
            this.f64808b.startActivityForResult(intent, 2);
        }
    }
}
