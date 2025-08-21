package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes6.dex */
final class F4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f85853a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f85854b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E4 f85855c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f85856d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f85857e;

    F4(M4 m42, Bundle bundle, E4 e42, E4 e43, long j10) {
        this.f85853a = bundle;
        this.f85854b = e42;
        this.f85855c = e43;
        this.f85856d = j10;
        Objects.requireNonNull(m42);
        this.f85857e = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85857e.y(this.f85853a, this.f85854b, this.f85855c, this.f85856d);
    }
}
