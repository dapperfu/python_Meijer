package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class S4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85216a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f85217b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85218c;

    S4(C11262w5 c11262w5, AtomicReference atomicReference, B6 b62) {
        this.f85216a = atomicReference;
        this.f85217b = b62;
        Objects.requireNonNull(c11262w5);
        this.f85218c = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C11262w5 c11262w5;
        X2 x22;
        AtomicReference atomicReference2 = this.f85216a;
        synchronized (atomicReference2) {
            try {
                try {
                    c11262w5 = this.f85218c;
                    x22 = c11262w5.f84868a;
                } catch (RemoteException e10) {
                    this.f85218c.f84868a.a().m().b("Failed to get app instance id", e10);
                    atomicReference = this.f85216a;
                }
                if (x22.v().u().o(Od.v.ANALYTICS_STORAGE)) {
                    InterfaceC4466d interfaceC4466dL = c11262w5.L();
                    if (interfaceC4466dL != null) {
                        B6 b62 = this.f85217b;
                        com.google.android.gms.common.internal.r.l(b62);
                        atomicReference2.set(interfaceC4466dL.I4(b62));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            c11262w5.f84868a.z().C(str);
                            x22.v().f84976h.b(str);
                        }
                        c11262w5.H();
                        atomicReference = this.f85216a;
                        atomicReference.notify();
                        return;
                    }
                    x22.a().m().a("Failed to get app instance id");
                    atomicReference2.notify();
                } else {
                    x22.a().r().a("Analytics storage consent denied; will not get app instance id");
                    c11262w5.f84868a.z().C(null);
                    x22.v().f84976h.b(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                }
            } catch (Throwable th2) {
                this.f85216a.notify();
                throw th2;
            }
        }
    }
}
