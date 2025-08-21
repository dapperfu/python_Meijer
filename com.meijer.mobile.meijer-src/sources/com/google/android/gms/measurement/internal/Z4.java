package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f86177a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86178b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f86179c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86180d;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10695y0 interfaceC10695y0;
        z6 z6VarA;
        C11387w5 c11387w5;
        InterfaceC4672d interfaceC4672dL;
        byte[] bArrV3 = null;
        try {
            try {
                c11387w5 = this.f86180d;
                interfaceC4672dL = c11387w5.L();
            } catch (RemoteException e10) {
                this.f86180d.f85708a.a().m().b("Failed to send event to the service to bundle", e10);
            }
            if (interfaceC4672dL == null) {
                X2 x22 = c11387w5.f85708a;
                x22.a().m().a("Discarding data. Failed to send event to service to bundle");
                z6VarA = x22.A();
                interfaceC10695y0 = this.f86179c;
                z6VarA.b0(interfaceC10695y0, bArrV3);
            }
            bArrV3 = interfaceC4672dL.v3(this.f86177a, this.f86178b);
            c11387w5.H();
            C11387w5 c11387w52 = this.f86180d;
            interfaceC10695y0 = this.f86179c;
            z6VarA = c11387w52.f85708a.A();
            z6VarA.b0(interfaceC10695y0, bArrV3);
        } catch (Throwable th2) {
            C11387w5 c11387w53 = this.f86180d;
            c11387w53.f85708a.A().b0(this.f86179c, null);
            throw th2;
        }
    }

    Z4(C11387w5 c11387w5, G g10, String str, InterfaceC10695y0 interfaceC10695y0) {
        this.f86177a = g10;
        this.f86178b = str;
        this.f86179c = interfaceC10695y0;
        Objects.requireNonNull(c11387w5);
        this.f86180d = c11387w5;
    }
}
