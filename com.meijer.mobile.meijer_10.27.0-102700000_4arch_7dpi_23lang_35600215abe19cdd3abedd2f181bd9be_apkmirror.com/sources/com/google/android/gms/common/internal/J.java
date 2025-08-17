package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;
import hd.InterfaceC14412m;

/* loaded from: classes4.dex */
final class J implements AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC14412m f64810a;

    J(InterfaceC14412m interfaceC14412m) {
        this.f64810a = interfaceC14412m;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) {
        this.f64810a.onConnectionFailed(c14243b);
    }
}
