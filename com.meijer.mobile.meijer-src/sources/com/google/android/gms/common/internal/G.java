package com.google.android.gms.common.internal;

import android.content.Intent;
import jd.InterfaceC14986i;

/* loaded from: classes4.dex */
final class G extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f65647a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC14986i f65648b;

    G(Intent intent, InterfaceC14986i interfaceC14986i, int i10) {
        this.f65647a = intent;
        this.f65648b = interfaceC14986i;
    }

    @Override // com.google.android.gms.common.internal.H
    public final void a() {
        Intent intent = this.f65647a;
        if (intent != null) {
            this.f65648b.startActivityForResult(intent, 2);
        }
    }
}
