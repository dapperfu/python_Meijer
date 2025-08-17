package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes6.dex */
final class X3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f85302a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85303b;

    X3(C11268x4 c11268x4, Bundle bundle) {
        this.f85302a = bundle;
        Objects.requireNonNull(c11268x4);
        this.f85303b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11268x4 c11268x4 = this.f85303b;
        c11268x4.f();
        c11268x4.h();
        Bundle bundle = this.f85302a;
        com.google.android.gms.common.internal.r.l(bundle);
        String strF = com.google.android.gms.common.internal.r.f(bundle.getString("name"));
        if (!c11268x4.f84868a.e()) {
            c11268x4.f84868a.a().u().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c11268x4.f84868a.H().b0(new C11157i(bundle.getString("app_id"), "", new v6(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c11268x4.f84868a.A().P(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
