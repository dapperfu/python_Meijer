package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC6521c;
import hd.InterfaceC14403d;

/* loaded from: classes4.dex */
final class I implements AbstractC6521c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC14403d f64809a;

    I(InterfaceC14403d interfaceC14403d) {
        this.f64809a = interfaceC14403d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        this.f64809a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) {
        this.f64809a.onConnectionSuspended(i10);
    }
}
