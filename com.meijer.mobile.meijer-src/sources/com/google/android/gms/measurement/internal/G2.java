package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class G2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f85867a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H2 f85868b;

    final /* synthetic */ String a() {
        return this.f85867a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f85868b.f85885a.a().p().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.U uA2 = com.google.android.gms.internal.measurement.T.a2(iBinder);
            if (uA2 == null) {
                this.f85868b.f85885a.a().p().a("Install Referrer Service implementation was not found");
                return;
            }
            X2 x22 = this.f85868b.f85885a;
            x22.a().u().a("Install Referrer Service connected");
            x22.b().r(new F2(this, uA2, this));
        } catch (RuntimeException e10) {
            this.f85868b.f85885a.a().p().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f85868b.f85885a.a().u().a("Install Referrer Service disconnected");
    }

    G2(H2 h22, String str) {
        Objects.requireNonNull(h22);
        this.f85868b = h22;
        this.f85867a = str;
    }
}
