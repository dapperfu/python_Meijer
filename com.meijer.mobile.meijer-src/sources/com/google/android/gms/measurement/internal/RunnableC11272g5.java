package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11272g5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86424a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86425b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B6 f86426c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f86427d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86428e;

    RunnableC11272g5(C11387w5 c11387w5, String str, String str2, B6 b62, InterfaceC10695y0 interfaceC10695y0) {
        this.f86424a = str;
        this.f86425b = str2;
        this.f86426c = b62;
        this.f86427d = interfaceC10695y0;
        Objects.requireNonNull(c11387w5);
        this.f86428e = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10695y0 interfaceC10695y0;
        z6 z6VarA;
        C11387w5 c11387w5;
        InterfaceC4672d interfaceC4672dL;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                c11387w5 = this.f86428e;
                interfaceC4672dL = c11387w5.L();
            } catch (RemoteException e10) {
                this.f86428e.f85708a.a().m().d("Failed to get conditional properties; remote exception", this.f86424a, this.f86425b, e10);
            }
            if (interfaceC4672dL == null) {
                X2 x22 = c11387w5.f85708a;
                x22.a().m().c("Failed to get conditional properties; not connected to service", this.f86424a, this.f86425b);
                z6VarA = x22.A();
                interfaceC10695y0 = this.f86427d;
                z6VarA.e0(interfaceC10695y0, arrayList);
            }
            B6 b62 = this.f86426c;
            com.google.android.gms.common.internal.r.l(b62);
            arrayList = z6.f0(interfaceC4672dL.c9(this.f86424a, this.f86425b, b62));
            c11387w5.H();
            C11387w5 c11387w52 = this.f86428e;
            interfaceC10695y0 = this.f86427d;
            z6VarA = c11387w52.f85708a.A();
            z6VarA.e0(interfaceC10695y0, arrayList);
        } catch (Throwable th2) {
            C11387w5 c11387w53 = this.f86428e;
            c11387w53.f85708a.A().e0(this.f86427d, arrayList);
            throw th2;
        }
    }
}
