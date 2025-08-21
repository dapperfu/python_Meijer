package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes6.dex */
final class X3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f86142a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86143b;

    X3(C11393x4 c11393x4, Bundle bundle) {
        this.f86142a = bundle;
        Objects.requireNonNull(c11393x4);
        this.f86143b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11393x4 c11393x4 = this.f86143b;
        c11393x4.f();
        c11393x4.h();
        Bundle bundle = this.f86142a;
        com.google.android.gms.common.internal.r.l(bundle);
        String strF = com.google.android.gms.common.internal.r.f(bundle.getString("name"));
        if (!c11393x4.f85708a.e()) {
            c11393x4.f85708a.a().u().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c11393x4.f85708a.H().b0(new C11282i(bundle.getString("app_id"), "", new v6(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c11393x4.f85708a.A().P(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
