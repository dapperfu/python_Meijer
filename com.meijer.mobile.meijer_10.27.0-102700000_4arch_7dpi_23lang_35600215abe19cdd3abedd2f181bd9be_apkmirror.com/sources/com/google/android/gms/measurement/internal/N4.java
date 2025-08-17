package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class N4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85128a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85129b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B6 f85130c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85131d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85132e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85133f;

    N4(C11262w5 c11262w5, String str, String str2, B6 b62, boolean z10, InterfaceC10570y0 interfaceC10570y0) {
        this.f85128a = str;
        this.f85129b = str2;
        this.f85130c = b62;
        this.f85131d = z10;
        this.f85132e = interfaceC10570y0;
        Objects.requireNonNull(c11262w5);
        this.f85133f = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            C11262w5 c11262w5 = this.f85133f;
            InterfaceC4466d interfaceC4466dL = c11262w5.L();
            if (interfaceC4466dL == null) {
                X2 x22 = c11262w5.f84868a;
                x22.a().m().c("Failed to get user properties; not connected to service", this.f85128a, this.f85129b);
                x22.A().d0(this.f85132e, bundle2);
                return;
            }
            B6 b62 = this.f85130c;
            com.google.android.gms.common.internal.r.l(b62);
            List<v6> listS8 = interfaceC4466dL.S8(this.f85128a, this.f85129b, this.f85131d, b62);
            int i10 = z6.f86077k;
            bundle = new Bundle();
            if (listS8 != null) {
                for (v6 v6Var : listS8) {
                    String str = v6Var.f85929e;
                    if (str != null) {
                        bundle.putString(v6Var.f85926b, str);
                    } else {
                        Long l10 = v6Var.f85928d;
                        if (l10 != null) {
                            bundle.putLong(v6Var.f85926b, l10.longValue());
                        } else {
                            Double d10 = v6Var.f85931g;
                            if (d10 != null) {
                                bundle.putDouble(v6Var.f85926b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c11262w5.H();
                    X2 x23 = c11262w5.f84868a;
                    x23.A().d0(this.f85132e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f85133f.f84868a.a().m().c("Failed to get user properties; remote exception", this.f85128a, e10);
                    C11262w5 c11262w52 = this.f85133f;
                    c11262w52.f84868a.A().d0(this.f85132e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                C11262w5 c11262w53 = this.f85133f;
                c11262w53.f84868a.A().d0(this.f85132e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            C11262w5 c11262w532 = this.f85133f;
            c11262w532.f84868a.A().d0(this.f85132e, bundle2);
            throw th;
        }
    }
}
