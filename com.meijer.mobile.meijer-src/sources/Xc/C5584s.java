package Xc;

import Rc.D0;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C8146fg;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C8913mq;
import com.google.android.gms.internal.ads.Ij0;
import com.google.android.gms.internal.ads.InterfaceC8166fq;
import com.google.android.gms.internal.ads.K80;
import com.google.android.gms.internal.ads.W80;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Xc.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5584s implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.q f42007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8913mq f42008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC8166fq f42009c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K80 f42010d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC5588w f42011e;

    C5584s(BinderC5588w binderC5588w, com.google.common.util.concurrent.q qVar, C8913mq c8913mq, InterfaceC8166fq interfaceC8166fq, K80 k80) {
        this.f42007a = qVar;
        this.f42008b = c8913mq;
        this.f42009c = interfaceC8166fq;
        this.f42010d = k80;
        this.f42011e = binderC5588w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        N n10 = (N) obj;
        W80 w80Ia = BinderC5588w.ia(this.f42007a, this.f42008b);
        this.f42011e.f42042B.set(true);
        if (!((Boolean) Oc.A.c().a(C8784lf.f77419x7)).booleanValue()) {
            try {
                InterfaceC8166fq interfaceC8166fq = this.f42009c;
                if (interfaceC8166fq != null) {
                    interfaceC8166fq.d("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e10) {
                Sc.p.d("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (!((Boolean) C8146fg.f74978e.e()).booleanValue() || w80Ia == null) {
                return;
            }
            K80 k80 = this.f42010d;
            k80.p("QueryInfo generation has been disabled.");
            k80.s0(false);
            w80Ia.a(k80);
            w80Ia.h();
            return;
        }
        try {
            try {
                if (n10 == null) {
                    InterfaceC8166fq interfaceC8166fq2 = this.f42009c;
                    if (interfaceC8166fq2 != null) {
                        interfaceC8166fq2.U1(null, null, null);
                    }
                    this.f42010d.s0(true);
                    if (!((Boolean) C8146fg.f74978e.e()).booleanValue() || w80Ia == null) {
                        return;
                    }
                    w80Ia.a(this.f42010d);
                    w80Ia.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(n10.f41881c) ? new JSONObject(n10.f41881c) : new JSONObject(n10.f41880b)).optString("request_id", ""))) {
                        Sc.p.g("The request ID is empty in request JSON.");
                        InterfaceC8166fq interfaceC8166fq3 = this.f42009c;
                        if (interfaceC8166fq3 != null) {
                            interfaceC8166fq3.d("Internal error: request ID is empty in request JSON.");
                        }
                        K80 k802 = this.f42010d;
                        k802.p("Request ID empty");
                        k802.s0(false);
                        if (!((Boolean) C8146fg.f74978e.e()).booleanValue() || w80Ia == null) {
                            return;
                        }
                        w80Ia.a(this.f42010d);
                        w80Ia.h();
                        return;
                    }
                    Bundle bundle = n10.f41884f;
                    BinderC5588w binderC5588w = this.f42011e;
                    if (binderC5588w.f42062p && bundle != null && bundle.getInt(binderC5588w.f42064r, -1) == -1) {
                        BinderC5588w binderC5588w2 = this.f42011e;
                        bundle.putInt(binderC5588w2.f42064r, binderC5588w2.f42065s.get());
                    }
                    BinderC5588w binderC5588w3 = this.f42011e;
                    if (binderC5588w3.f42061o && bundle != null && TextUtils.isEmpty(bundle.getString(binderC5588w3.f42063q))) {
                        if (TextUtils.isEmpty(this.f42011e.f42067u)) {
                            BinderC5588w binderC5588w4 = this.f42011e;
                            D0 d0T = Nc.v.t();
                            BinderC5588w binderC5588w5 = this.f42011e;
                            binderC5588w4.f42067u = d0T.H(binderC5588w5.f42048b, binderC5588w5.f42066t.f34479a);
                        }
                        BinderC5588w binderC5588w6 = this.f42011e;
                        bundle.putString(binderC5588w6.f42063q, binderC5588w6.f42067u);
                    }
                    if (this.f42009c != null) {
                        if (TextUtils.isEmpty(n10.f41881c)) {
                            this.f42009c.U1(n10.f41879a, n10.f41880b, bundle);
                        } else {
                            this.f42009c.U1(n10.f41879a, n10.f41881c, bundle);
                        }
                    }
                    this.f42010d.s0(true);
                    if (!((Boolean) C8146fg.f74978e.e()).booleanValue() || w80Ia == null) {
                        return;
                    }
                    w80Ia.a(this.f42010d);
                    w80Ia.h();
                } catch (JSONException e11) {
                    Sc.p.g("Failed to create JSON object from the request string.");
                    InterfaceC8166fq interfaceC8166fq4 = this.f42009c;
                    if (interfaceC8166fq4 != null) {
                        interfaceC8166fq4.d("Internal error for request JSON: " + e11.toString());
                    }
                    K80 k803 = this.f42010d;
                    k803.e(e11);
                    k803.s0(false);
                    Nc.v.s().x(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) C8146fg.f74978e.e()).booleanValue() || w80Ia == null) {
                        return;
                    }
                    w80Ia.a(this.f42010d);
                    w80Ia.h();
                }
            } catch (RemoteException e12) {
                K80 k804 = this.f42010d;
                k804.e(e12);
                k804.s0(false);
                Sc.p.e("", e12);
                Nc.v.s().x(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) C8146fg.f74978e.e()).booleanValue() || w80Ia == null) {
                    return;
                }
                w80Ia.a(this.f42010d);
                w80Ia.h();
            }
        } catch (Throwable th2) {
            if (((Boolean) C8146fg.f74978e.e()).booleanValue() && w80Ia != null) {
                w80Ia.a(this.f42010d);
                w80Ia.h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) Oc.A.c().a(C8784lf.f76762C7)).booleanValue()) {
            Nc.v.s().w(th2, "SignalGeneratorImpl.generateSignals");
        } else {
            Nc.v.s().x(th2, "SignalGeneratorImpl.generateSignals");
        }
        W80 w80Ia = BinderC5588w.ia(this.f42007a, this.f42008b);
        if (((Boolean) C8146fg.f74978e.e()).booleanValue() && w80Ia != null) {
            K80 k80 = this.f42010d;
            k80.e(th2);
            k80.s0(false);
            w80Ia.a(k80);
            w80Ia.h();
        }
        if (this.f42009c == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f42009c.d(message);
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
