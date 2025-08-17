package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes6.dex */
final class F4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f85013a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f85014b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E4 f85015c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f85016d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f85017e;

    F4(M4 m42, Bundle bundle, E4 e42, E4 e43, long j10) {
        this.f85013a = bundle;
        this.f85014b = e42;
        this.f85015c = e43;
        this.f85016d = j10;
        Objects.requireNonNull(m42);
        this.f85017e = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85017e.y(this.f85013a, this.f85014b, this.f85015c, this.f85016d);
    }
}
