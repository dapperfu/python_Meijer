package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes6.dex */
final class W3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f85264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85265b;

    W3(C11268x4 c11268x4, Bundle bundle) {
        this.f85264a = bundle;
        Objects.requireNonNull(c11268x4);
        this.f85265b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11268x4 c11268x4 = this.f85265b;
        c11268x4.f();
        c11268x4.h();
        Bundle bundle = this.f85264a;
        com.google.android.gms.common.internal.r.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.r.f(string);
        com.google.android.gms.common.internal.r.f(string2);
        com.google.android.gms.common.internal.r.l(bundle.get("value"));
        if (!c11268x4.f84868a.e()) {
            c11268x4.f84868a.a().u().a("Conditional property not set since app measurement is disabled");
            return;
        }
        v6 v6Var = new v6(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            X2 x22 = c11268x4.f84868a;
            G gP = x22.A().P(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c11268x4.f84868a.H().b0(new C11157i(bundle.getString("app_id"), string2, v6Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), x22.A().P(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), gP, bundle.getLong("time_to_live"), x22.A().P(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
