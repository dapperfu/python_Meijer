package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class S4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86056a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f86057b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86058c;

    S4(C11387w5 c11387w5, AtomicReference atomicReference, B6 b62) {
        this.f86056a = atomicReference;
        this.f86057b = b62;
        Objects.requireNonNull(c11387w5);
        this.f86058c = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C11387w5 c11387w5;
        X2 x22;
        AtomicReference atomicReference2 = this.f86056a;
        synchronized (atomicReference2) {
            try {
                try {
                    c11387w5 = this.f86058c;
                    x22 = c11387w5.f85708a;
                } catch (RemoteException e10) {
                    this.f86058c.f85708a.a().m().b("Failed to get app instance id", e10);
                    atomicReference = this.f86056a;
                }
                if (x22.v().u().o(Qd.v.ANALYTICS_STORAGE)) {
                    InterfaceC4672d interfaceC4672dL = c11387w5.L();
                    if (interfaceC4672dL != null) {
                        B6 b62 = this.f86057b;
                        com.google.android.gms.common.internal.r.l(b62);
                        atomicReference2.set(interfaceC4672dL.S4(b62));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            c11387w5.f85708a.z().C(str);
                            x22.v().f85816h.b(str);
                        }
                        c11387w5.H();
                        atomicReference = this.f86056a;
                        atomicReference.notify();
                        return;
                    }
                    x22.a().m().a("Failed to get app instance id");
                    atomicReference2.notify();
                } else {
                    x22.a().r().a("Analytics storage consent denied; will not get app instance id");
                    c11387w5.f85708a.z().C(null);
                    x22.v().f85816h.b(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                }
            } catch (Throwable th2) {
                this.f86056a.notify();
                throw th2;
            }
        }
    }
}
