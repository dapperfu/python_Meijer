package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC6646c;
import jd.InterfaceC14981d;

/* loaded from: classes4.dex */
final class I implements AbstractC6646c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC14981d f65649a;

    I(InterfaceC14981d interfaceC14981d) {
        this.f65649a = interfaceC14981d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        this.f65649a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) {
        this.f65649a.onConnectionSuspended(i10);
    }
}
