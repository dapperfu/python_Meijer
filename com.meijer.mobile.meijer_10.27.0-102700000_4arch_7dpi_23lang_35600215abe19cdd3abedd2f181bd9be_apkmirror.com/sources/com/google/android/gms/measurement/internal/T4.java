package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class T4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85237b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85238c;

    T4(C11262w5 c11262w5, B6 b62, InterfaceC10570y0 interfaceC10570y0) {
        this.f85236a = b62;
        this.f85237b = interfaceC10570y0;
        Objects.requireNonNull(c11262w5);
        this.f85238c = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10570y0 interfaceC10570y0;
        z6 z6VarA;
        C11262w5 c11262w5;
        X2 x22;
        String strI4 = null;
        try {
            try {
                c11262w5 = this.f85238c;
                x22 = c11262w5.f84868a;
            } catch (RemoteException e10) {
                this.f85238c.f84868a.a().m().b("Failed to get app instance id", e10);
            }
            if (x22.v().u().o(Od.v.ANALYTICS_STORAGE)) {
                InterfaceC4466d interfaceC4466dL = c11262w5.L();
                if (interfaceC4466dL != null) {
                    B6 b62 = this.f85236a;
                    com.google.android.gms.common.internal.r.l(b62);
                    strI4 = interfaceC4466dL.I4(b62);
                    if (strI4 != null) {
                        c11262w5.f84868a.z().C(strI4);
                        x22.v().f84976h.b(strI4);
                    }
                    c11262w5.H();
                    C11262w5 c11262w52 = this.f85238c;
                    interfaceC10570y0 = this.f85237b;
                    z6VarA = c11262w52.f84868a.A();
                    z6VarA.Y(interfaceC10570y0, strI4);
                }
                x22.a().m().a("Failed to get app instance id");
            } else {
                x22.a().r().a("Analytics storage consent denied; will not get app instance id");
                c11262w5.f84868a.z().C(null);
                x22.v().f84976h.b(null);
            }
            z6VarA = x22.A();
            interfaceC10570y0 = this.f85237b;
            z6VarA.Y(interfaceC10570y0, strI4);
        } catch (Throwable th2) {
            C11262w5 c11262w53 = this.f85238c;
            c11262w53.f84868a.A().Y(this.f85237b, null);
            throw th2;
        }
    }
}
