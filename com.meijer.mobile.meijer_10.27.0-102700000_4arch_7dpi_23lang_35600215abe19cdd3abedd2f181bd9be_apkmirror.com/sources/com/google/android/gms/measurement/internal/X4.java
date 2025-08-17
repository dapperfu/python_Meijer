package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class X4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f85304a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85305b;

    X4(C11262w5 c11262w5, E4 e42) {
        this.f85304a = e42;
        Objects.requireNonNull(c11262w5);
        this.f85305b = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85305b;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Failed to send current screen to service");
            return;
        }
        try {
            E4 e42 = this.f85304a;
            if (e42 == null) {
                interfaceC4466dL.S5(0L, null, null, c11262w5.f84868a.zzaY().getPackageName());
            } else {
                interfaceC4466dL.S5(e42.f85000c, e42.f84998a, e42.f84999b, c11262w5.f84868a.zzaY().getPackageName());
            }
            c11262w5.H();
        } catch (RemoteException e10) {
            this.f85305b.f84868a.a().m().b("Failed to send current screen to the service", e10);
        }
    }
}
