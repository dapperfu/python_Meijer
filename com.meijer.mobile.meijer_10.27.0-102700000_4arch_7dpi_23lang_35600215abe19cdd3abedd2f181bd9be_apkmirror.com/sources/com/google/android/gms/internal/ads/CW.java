package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CW extends AbstractBinderC6598Bm {

    /* renamed from: a, reason: collision with root package name */
    private final String f65795a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10170zm f65796b;

    /* renamed from: c, reason: collision with root package name */
    private final C7145Rq f65797c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f65798d;

    /* renamed from: e, reason: collision with root package name */
    private final long f65799e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f65800f;

    private final synchronized void C9(String str, int i10) {
        try {
            if (this.f65800f) {
                return;
            }
            try {
                this.f65798d.put("signal_error", str);
                if (((Boolean) Mc.A.c().a(C8659lf.f76014J1)).booleanValue()) {
                    this.f65798d.put("latency", Lc.v.c().c() - this.f65799e);
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76000I1)).booleanValue()) {
                    this.f65798d.put("signal_error_code", i10);
                }
            } catch (JSONException unused) {
            }
            this.f65797c.b(this.f65798d);
            this.f65800f = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6632Cm
    public final synchronized void a(String str) throws RemoteException {
        if (this.f65800f) {
            return;
        }
        if (str == null) {
            i("Adapter returned null signals");
            return;
        }
        try {
            this.f65798d.put("signals", str);
            if (((Boolean) Mc.A.c().a(C8659lf.f76014J1)).booleanValue()) {
                this.f65798d.put("latency", Lc.v.c().c() - this.f65799e);
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f76000I1)).booleanValue()) {
                this.f65798d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f65797c.b(this.f65798d);
        this.f65800f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6632Cm
    public final synchronized void i(String str) throws RemoteException {
        C9(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6632Cm
    public final synchronized void k2(Mc.W0 w02) throws RemoteException {
        C9(w02.f19160b, 2);
    }

    public final synchronized void zzc() {
        C9("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f65800f) {
            return;
        }
        try {
            if (((Boolean) Mc.A.c().a(C8659lf.f76000I1)).booleanValue()) {
                this.f65798d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f65797c.b(this.f65798d);
        this.f65800f = true;
    }

    public static synchronized void B9(String str, C7145Rq c7145Rq) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) Mc.A.c().a(C8659lf.f76000I1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                c7145Rq.b(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public CW(String str, InterfaceC10170zm interfaceC10170zm, C7145Rq c7145Rq, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f65798d = jSONObject;
        this.f65800f = false;
        this.f65797c = c7145Rq;
        this.f65795a = str;
        this.f65796b = interfaceC10170zm;
        this.f65799e = j10;
        try {
            jSONObject.put("adapter_version", interfaceC10170zm.zzf().toString());
            jSONObject.put("sdk_version", interfaceC10170zm.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }
}
