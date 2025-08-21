package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4680l;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes6.dex */
final class F3 implements InterfaceC4680l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ X2 f85852a;

    F3(G3 g32, X2 x22) {
        this.f85852a = x22;
        Objects.requireNonNull(g32);
    }

    @Override // Qd.InterfaceC4680l
    public final boolean zza() {
        return Log.isLoggable(this.f85852a.a().x(), 3);
    }
}
