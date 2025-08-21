package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class T4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86076a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f86077b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86078c;

    T4(C11387w5 c11387w5, B6 b62, InterfaceC10695y0 interfaceC10695y0) {
        this.f86076a = b62;
        this.f86077b = interfaceC10695y0;
        Objects.requireNonNull(c11387w5);
        this.f86078c = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10695y0 interfaceC10695y0;
        z6 z6VarA;
        C11387w5 c11387w5;
        X2 x22;
        String strS4 = null;
        try {
            try {
                c11387w5 = this.f86078c;
                x22 = c11387w5.f85708a;
            } catch (RemoteException e10) {
                this.f86078c.f85708a.a().m().b("Failed to get app instance id", e10);
            }
            if (x22.v().u().o(Qd.v.ANALYTICS_STORAGE)) {
                InterfaceC4672d interfaceC4672dL = c11387w5.L();
                if (interfaceC4672dL != null) {
                    B6 b62 = this.f86076a;
                    com.google.android.gms.common.internal.r.l(b62);
                    strS4 = interfaceC4672dL.S4(b62);
                    if (strS4 != null) {
                        c11387w5.f85708a.z().C(strS4);
                        x22.v().f85816h.b(strS4);
                    }
                    c11387w5.H();
                    C11387w5 c11387w52 = this.f86078c;
                    interfaceC10695y0 = this.f86077b;
                    z6VarA = c11387w52.f85708a.A();
                    z6VarA.Y(interfaceC10695y0, strS4);
                }
                x22.a().m().a("Failed to get app instance id");
            } else {
                x22.a().r().a("Analytics storage consent denied; will not get app instance id");
                c11387w5.f85708a.z().C(null);
                x22.v().f85816h.b(null);
            }
            z6VarA = x22.A();
            interfaceC10695y0 = this.f86077b;
            z6VarA.Y(interfaceC10695y0, strS4);
        } catch (Throwable th2) {
            C11387w5 c11387w53 = this.f86078c;
            c11387w53.f85708a.A().Y(this.f86077b, null);
            throw th2;
        }
    }
}
