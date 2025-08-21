package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CW extends AbstractBinderC6723Bm {

    /* renamed from: a, reason: collision with root package name */
    private final String f66635a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10295zm f66636b;

    /* renamed from: c, reason: collision with root package name */
    private final C7270Rq f66637c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f66638d;

    /* renamed from: e, reason: collision with root package name */
    private final long f66639e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66640f;

    private final synchronized void C9(String str, int i10) {
        try {
            if (this.f66640f) {
                return;
            }
            try {
                this.f66638d.put("signal_error", str);
                if (((Boolean) Oc.A.c().a(C8784lf.f76854J1)).booleanValue()) {
                    this.f66638d.put("latency", Nc.v.c().c() - this.f66639e);
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f76840I1)).booleanValue()) {
                    this.f66638d.put("signal_error_code", i10);
                }
            } catch (JSONException unused) {
            }
            this.f66637c.b(this.f66638d);
            this.f66640f = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6757Cm
    public final synchronized void C1(Oc.W0 w02) throws RemoteException {
        C9(w02.f23347b, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6757Cm
    public final synchronized void a(String str) throws RemoteException {
        if (this.f66640f) {
            return;
        }
        if (str == null) {
            i("Adapter returned null signals");
            return;
        }
        try {
            this.f66638d.put("signals", str);
            if (((Boolean) Oc.A.c().a(C8784lf.f76854J1)).booleanValue()) {
                this.f66638d.put("latency", Nc.v.c().c() - this.f66639e);
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f76840I1)).booleanValue()) {
                this.f66638d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f66637c.b(this.f66638d);
        this.f66640f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6757Cm
    public final synchronized void i(String str) throws RemoteException {
        C9(str, 2);
    }

    public final synchronized void zzc() {
        C9("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f66640f) {
            return;
        }
        try {
            if (((Boolean) Oc.A.c().a(C8784lf.f76840I1)).booleanValue()) {
                this.f66638d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f66637c.b(this.f66638d);
        this.f66640f = true;
    }

    public static synchronized void B9(String str, C7270Rq c7270Rq) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) Oc.A.c().a(C8784lf.f76840I1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                c7270Rq.b(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public CW(String str, InterfaceC10295zm interfaceC10295zm, C7270Rq c7270Rq, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f66638d = jSONObject;
        this.f66640f = false;
        this.f66637c = c7270Rq;
        this.f66635a = str;
        this.f66636b = interfaceC10295zm;
        this.f66639e = j10;
        try {
            jSONObject.put("adapter_version", interfaceC10295zm.zzf().toString());
            jSONObject.put("sdk_version", interfaceC10295zm.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }
}
