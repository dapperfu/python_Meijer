package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11398y2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final q6 f86883a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f86884b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f86885c;

    final /* synthetic */ q6 c() {
        return this.f86883a;
    }

    public final void a() {
        q6 q6Var = this.f86883a;
        q6Var.M0();
        q6Var.b().f();
        if (this.f86884b) {
            return;
        }
        q6Var.zzaY().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f86885c = q6Var.C0().k();
        q6Var.a().u().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f86885c));
        this.f86884b = true;
    }

    public final void b() {
        q6 q6Var = this.f86883a;
        q6Var.M0();
        q6Var.b().f();
        q6Var.b().f();
        if (this.f86884b) {
            q6Var.a().u().a("Unregistering connectivity change receiver");
            this.f86884b = false;
            this.f86885c = false;
            try {
                q6Var.zzaY().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f86883a.a().m().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalStateException {
        q6 q6Var = this.f86883a;
        q6Var.M0();
        String action = intent.getAction();
        q6Var.a().u().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            q6Var.a().p().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zK = q6Var.C0().k();
        if (this.f86885c != zK) {
            this.f86885c = zK;
            q6Var.b().r(new RunnableC11391x2(this, zK));
        }
    }

    C11398y2(q6 q6Var) {
        com.google.android.gms.common.internal.r.l(q6Var);
        this.f86883a = q6Var;
    }
}
