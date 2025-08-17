package com.google.android.gms.measurement.internal;

import Od.InterfaceC4474l;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes6.dex */
final class F3 implements InterfaceC4474l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ X2 f85012a;

    F3(G3 g32, X2 x22) {
        this.f85012a = x22;
        Objects.requireNonNull(g32);
    }

    @Override // Od.InterfaceC4474l
    public final boolean zza() {
        return Log.isLoggable(this.f85012a.a().x(), 3);
    }
}
