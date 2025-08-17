package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f85337a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85338b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85339c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85340d;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10570y0 interfaceC10570y0;
        z6 z6VarA;
        C11262w5 c11262w5;
        InterfaceC4466d interfaceC4466dL;
        byte[] bArrO3 = null;
        try {
            try {
                c11262w5 = this.f85340d;
                interfaceC4466dL = c11262w5.L();
            } catch (RemoteException e10) {
                this.f85340d.f84868a.a().m().b("Failed to send event to the service to bundle", e10);
            }
            if (interfaceC4466dL == null) {
                X2 x22 = c11262w5.f84868a;
                x22.a().m().a("Discarding data. Failed to send event to service to bundle");
                z6VarA = x22.A();
                interfaceC10570y0 = this.f85339c;
                z6VarA.b0(interfaceC10570y0, bArrO3);
            }
            bArrO3 = interfaceC4466dL.o3(this.f85337a, this.f85338b);
            c11262w5.H();
            C11262w5 c11262w52 = this.f85340d;
            interfaceC10570y0 = this.f85339c;
            z6VarA = c11262w52.f84868a.A();
            z6VarA.b0(interfaceC10570y0, bArrO3);
        } catch (Throwable th2) {
            C11262w5 c11262w53 = this.f85340d;
            c11262w53.f84868a.A().b0(this.f85339c, null);
            throw th2;
        }
    }

    Z4(C11262w5 c11262w5, G g10, String str, InterfaceC10570y0 interfaceC10570y0) {
        this.f85337a = g10;
        this.f85338b = str;
        this.f85339c = interfaceC10570y0;
        Objects.requireNonNull(c11262w5);
        this.f85340d = c11262w5;
    }
}
