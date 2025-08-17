package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11147g5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85584a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85585b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B6 f85586c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85587d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85588e;

    RunnableC11147g5(C11262w5 c11262w5, String str, String str2, B6 b62, InterfaceC10570y0 interfaceC10570y0) {
        this.f85584a = str;
        this.f85585b = str2;
        this.f85586c = b62;
        this.f85587d = interfaceC10570y0;
        Objects.requireNonNull(c11262w5);
        this.f85588e = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10570y0 interfaceC10570y0;
        z6 z6VarA;
        C11262w5 c11262w5;
        InterfaceC4466d interfaceC4466dL;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                c11262w5 = this.f85588e;
                interfaceC4466dL = c11262w5.L();
            } catch (RemoteException e10) {
                this.f85588e.f84868a.a().m().d("Failed to get conditional properties; remote exception", this.f85584a, this.f85585b, e10);
            }
            if (interfaceC4466dL == null) {
                X2 x22 = c11262w5.f84868a;
                x22.a().m().c("Failed to get conditional properties; not connected to service", this.f85584a, this.f85585b);
                z6VarA = x22.A();
                interfaceC10570y0 = this.f85587d;
                z6VarA.e0(interfaceC10570y0, arrayList);
            }
            B6 b62 = this.f85586c;
            com.google.android.gms.common.internal.r.l(b62);
            arrayList = z6.f0(interfaceC4466dL.a9(this.f85584a, this.f85585b, b62));
            c11262w5.H();
            C11262w5 c11262w52 = this.f85588e;
            interfaceC10570y0 = this.f85587d;
            z6VarA = c11262w52.f84868a.A();
            z6VarA.e0(interfaceC10570y0, arrayList);
        } catch (Throwable th2) {
            C11262w5 c11262w53 = this.f85588e;
            c11262w53.f84868a.A().e0(this.f85587d, arrayList);
            throw th2;
        }
    }
}
