package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC10580l1 extends D0 {

    /* renamed from: a, reason: collision with root package name */
    private final Qd.A f83100a;

    @Override // com.google.android.gms.internal.measurement.E0
    public final void X0(String str, String str2, Bundle bundle, long j10) {
        this.f83100a.a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final int zzf() {
        return System.identityHashCode(this.f83100a);
    }

    BinderC10580l1(Qd.A a10) {
        this.f83100a = a10;
    }
}
