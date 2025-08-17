package Vc;

import Pc.D0;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C8021fg;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8788mq;
import com.google.android.gms.internal.ads.Ij0;
import com.google.android.gms.internal.ads.InterfaceC8041fq;
import com.google.android.gms.internal.ads.K80;
import com.google.android.gms.internal.ads.W80;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Vc.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5381s implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.q f37295a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8788mq f37296b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC8041fq f37297c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K80 f37298d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC5385w f37299e;

    C5381s(BinderC5385w binderC5385w, com.google.common.util.concurrent.q qVar, C8788mq c8788mq, InterfaceC8041fq interfaceC8041fq, K80 k80) {
        this.f37295a = qVar;
        this.f37296b = c8788mq;
        this.f37297c = interfaceC8041fq;
        this.f37298d = k80;
        this.f37299e = binderC5385w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        N n10 = (N) obj;
        W80 w80Ia = BinderC5385w.ia(this.f37295a, this.f37296b);
        this.f37299e.f37330B.set(true);
        if (!((Boolean) Mc.A.c().a(C8659lf.f76579x7)).booleanValue()) {
            try {
                InterfaceC8041fq interfaceC8041fq = this.f37297c;
                if (interfaceC8041fq != null) {
                    interfaceC8041fq.d("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e10) {
                Qc.p.d("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (!((Boolean) C8021fg.f74138e.e()).booleanValue() || w80Ia == null) {
                return;
            }
            K80 k80 = this.f37298d;
            k80.p("QueryInfo generation has been disabled.");
            k80.r0(false);
            w80Ia.a(k80);
            w80Ia.h();
            return;
        }
        try {
            try {
                if (n10 == null) {
                    InterfaceC8041fq interfaceC8041fq2 = this.f37297c;
                    if (interfaceC8041fq2 != null) {
                        interfaceC8041fq2.P1(null, null, null);
                    }
                    this.f37298d.r0(true);
                    if (!((Boolean) C8021fg.f74138e.e()).booleanValue() || w80Ia == null) {
                        return;
                    }
                    w80Ia.a(this.f37298d);
                    w80Ia.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(n10.f37169c) ? new JSONObject(n10.f37169c) : new JSONObject(n10.f37168b)).optString("request_id", ""))) {
                        Qc.p.g("The request ID is empty in request JSON.");
                        InterfaceC8041fq interfaceC8041fq3 = this.f37297c;
                        if (interfaceC8041fq3 != null) {
                            interfaceC8041fq3.d("Internal error: request ID is empty in request JSON.");
                        }
                        K80 k802 = this.f37298d;
                        k802.p("Request ID empty");
                        k802.r0(false);
                        if (!((Boolean) C8021fg.f74138e.e()).booleanValue() || w80Ia == null) {
                            return;
                        }
                        w80Ia.a(this.f37298d);
                        w80Ia.h();
                        return;
                    }
                    Bundle bundle = n10.f37172f;
                    BinderC5385w binderC5385w = this.f37299e;
                    if (binderC5385w.f37350p && bundle != null && bundle.getInt(binderC5385w.f37352r, -1) == -1) {
                        BinderC5385w binderC5385w2 = this.f37299e;
                        bundle.putInt(binderC5385w2.f37352r, binderC5385w2.f37353s.get());
                    }
                    BinderC5385w binderC5385w3 = this.f37299e;
                    if (binderC5385w3.f37349o && bundle != null && TextUtils.isEmpty(bundle.getString(binderC5385w3.f37351q))) {
                        if (TextUtils.isEmpty(this.f37299e.f37355u)) {
                            BinderC5385w binderC5385w4 = this.f37299e;
                            D0 d0T = Lc.v.t();
                            BinderC5385w binderC5385w5 = this.f37299e;
                            binderC5385w4.f37355u = d0T.H(binderC5385w5.f37336b, binderC5385w5.f37354t.f29929a);
                        }
                        BinderC5385w binderC5385w6 = this.f37299e;
                        bundle.putString(binderC5385w6.f37351q, binderC5385w6.f37355u);
                    }
                    if (this.f37297c != null) {
                        if (TextUtils.isEmpty(n10.f37169c)) {
                            this.f37297c.P1(n10.f37167a, n10.f37168b, bundle);
                        } else {
                            this.f37297c.P1(n10.f37167a, n10.f37169c, bundle);
                        }
                    }
                    this.f37298d.r0(true);
                    if (!((Boolean) C8021fg.f74138e.e()).booleanValue() || w80Ia == null) {
                        return;
                    }
                    w80Ia.a(this.f37298d);
                    w80Ia.h();
                } catch (JSONException e11) {
                    Qc.p.g("Failed to create JSON object from the request string.");
                    InterfaceC8041fq interfaceC8041fq4 = this.f37297c;
                    if (interfaceC8041fq4 != null) {
                        interfaceC8041fq4.d("Internal error for request JSON: " + e11.toString());
                    }
                    K80 k803 = this.f37298d;
                    k803.e(e11);
                    k803.r0(false);
                    Lc.v.s().x(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) C8021fg.f74138e.e()).booleanValue() || w80Ia == null) {
                        return;
                    }
                    w80Ia.a(this.f37298d);
                    w80Ia.h();
                }
            } catch (RemoteException e12) {
                K80 k804 = this.f37298d;
                k804.e(e12);
                k804.r0(false);
                Qc.p.e("", e12);
                Lc.v.s().x(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) C8021fg.f74138e.e()).booleanValue() || w80Ia == null) {
                    return;
                }
                w80Ia.a(this.f37298d);
                w80Ia.h();
            }
        } catch (Throwable th2) {
            if (((Boolean) C8021fg.f74138e.e()).booleanValue() && w80Ia != null) {
                w80Ia.a(this.f37298d);
                w80Ia.h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) Mc.A.c().a(C8659lf.f75922C7)).booleanValue()) {
            Lc.v.s().w(th2, "SignalGeneratorImpl.generateSignals");
        } else {
            Lc.v.s().x(th2, "SignalGeneratorImpl.generateSignals");
        }
        W80 w80Ia = BinderC5385w.ia(this.f37295a, this.f37296b);
        if (((Boolean) C8021fg.f74138e.e()).booleanValue() && w80Ia != null) {
            K80 k80 = this.f37298d;
            k80.e(th2);
            k80.r0(false);
            w80Ia.a(k80);
            w80Ia.h();
        }
        if (this.f37297c == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f37297c.d(message);
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
