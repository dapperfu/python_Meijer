package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class N4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85968a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B6 f85970c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85971d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f85972e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11387w5 f85973f;

    N4(C11387w5 c11387w5, String str, String str2, B6 b62, boolean z10, InterfaceC10695y0 interfaceC10695y0) {
        this.f85968a = str;
        this.f85969b = str2;
        this.f85970c = b62;
        this.f85971d = z10;
        this.f85972e = interfaceC10695y0;
        Objects.requireNonNull(c11387w5);
        this.f85973f = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            C11387w5 c11387w5 = this.f85973f;
            InterfaceC4672d interfaceC4672dL = c11387w5.L();
            if (interfaceC4672dL == null) {
                X2 x22 = c11387w5.f85708a;
                x22.a().m().c("Failed to get user properties; not connected to service", this.f85968a, this.f85969b);
                x22.A().d0(this.f85972e, bundle2);
                return;
            }
            B6 b62 = this.f85970c;
            com.google.android.gms.common.internal.r.l(b62);
            List<v6> listM8 = interfaceC4672dL.M8(this.f85968a, this.f85969b, this.f85971d, b62);
            int i10 = z6.f86917k;
            bundle = new Bundle();
            if (listM8 != null) {
                for (v6 v6Var : listM8) {
                    String str = v6Var.f86769e;
                    if (str != null) {
                        bundle.putString(v6Var.f86766b, str);
                    } else {
                        Long l10 = v6Var.f86768d;
                        if (l10 != null) {
                            bundle.putLong(v6Var.f86766b, l10.longValue());
                        } else {
                            Double d10 = v6Var.f86771g;
                            if (d10 != null) {
                                bundle.putDouble(v6Var.f86766b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c11387w5.H();
                    X2 x23 = c11387w5.f85708a;
                    x23.A().d0(this.f85972e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f85973f.f85708a.a().m().c("Failed to get user properties; remote exception", this.f85968a, e10);
                    C11387w5 c11387w52 = this.f85973f;
                    c11387w52.f85708a.A().d0(this.f85972e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                C11387w5 c11387w53 = this.f85973f;
                c11387w53.f85708a.A().d0(this.f85972e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            C11387w5 c11387w532 = this.f85973f;
            c11387w532.f85708a.A().d0(this.f85972e, bundle2);
            throw th;
        }
    }
}
