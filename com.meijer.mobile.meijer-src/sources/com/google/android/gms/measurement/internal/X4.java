package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class X4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f86144a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86145b;

    X4(C11387w5 c11387w5, E4 e42) {
        this.f86144a = e42;
        Objects.requireNonNull(c11387w5);
        this.f86145b = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86145b;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Failed to send current screen to service");
            return;
        }
        try {
            E4 e42 = this.f86144a;
            if (e42 == null) {
                interfaceC4672dL.e6(0L, null, null, c11387w5.f85708a.zzaY().getPackageName());
            } else {
                interfaceC4672dL.e6(e42.f85840c, e42.f85838a, e42.f85839b, c11387w5.f85708a.zzaY().getPackageName());
            }
            c11387w5.H();
        } catch (RemoteException e10) {
            this.f86145b.f85708a.a().m().b("Failed to send current screen to the service", e10);
        }
    }
}
