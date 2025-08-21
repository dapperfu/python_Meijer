package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8763lP implements Qc.p, InterfaceC8067eu {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76648a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f76649b;

    /* renamed from: c, reason: collision with root package name */
    private ZO f76650c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9133ot f76651d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f76652e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f76653f;

    /* renamed from: g, reason: collision with root package name */
    private long f76654g;

    /* renamed from: h, reason: collision with root package name */
    private Oc.H0 f76655h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f76656i;

    private final synchronized boolean g(Oc.H0 h02) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue()) {
            Sc.p.g("Ad inspector had an internal error.");
            try {
                h02.x1(V60.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f76650c == null) {
            Sc.p.g("Ad inspector had an internal error.");
            try {
                Nc.v.s().x(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                h02.x1(V60.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f76652e && !this.f76653f) {
            if (Nc.v.c().a() >= this.f76654g + ((Integer) Oc.A.c().a(C8784lf.f76973R8)).intValue()) {
                return true;
            }
        }
        Sc.p.g("Ad inspector cannot be opened because it is already open.");
        try {
            h02.x1(V60.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // Qc.p
    public final synchronized void I2() {
        this.f76653f = true;
        f("");
    }

    @Override // Qc.p
    public final void K1() {
    }

    @Override // Qc.p
    public final synchronized void Z3(int i10) {
        this.f76651d.destroy();
        if (!this.f76656i) {
            Rc.p0.k("Inspector closed.");
            Oc.H0 h02 = this.f76655h;
            if (h02 != null) {
                try {
                    h02.x1(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f76653f = false;
        this.f76652e = false;
        this.f76654g = 0L;
        this.f76656i = false;
        this.f76655h = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
    public final synchronized void a(boolean z10, int i10, String str, String str2) {
        if (z10) {
            Rc.p0.k("Ad inspector loaded.");
            this.f76652e = true;
            f("");
            return;
        }
        Sc.p.g("Ad inspector failed to load.");
        try {
            Nc.v.s().x(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            Oc.H0 h02 = this.f76655h;
            if (h02 != null) {
                h02.x1(V60.d(17, null, null));
            }
        } catch (RemoteException e10) {
            Nc.v.s().x(e10, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f76656i = true;
        this.f76651d.destroy();
    }

    public final void c(ZO zo2) {
        this.f76650c = zo2;
    }

    @Override // Qc.p
    public final void c2() {
    }

    public final synchronized void f(final String str) {
        if (this.f76652e && this.f76653f) {
            C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kP
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f76478a.d(str);
                }
            });
        }
    }

    @Override // Qc.p
    public final void m6() {
    }

    @Override // Qc.p
    public final void o7() {
    }

    public final Activity b() {
        InterfaceC9133ot interfaceC9133ot = this.f76651d;
        if (interfaceC9133ot == null || interfaceC9133ot.M()) {
            return null;
        }
        return this.f76651d.zzi();
    }

    final /* synthetic */ void d(String str) throws JSONException {
        JSONObject jSONObjectF = this.f76650c.f();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectF.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f76651d.a("window.inspectorInfo", jSONObjectF.toString());
    }

    public final synchronized void e(Oc.H0 h02, C8685kj c8685kj, C7939dj c7939dj, C7228Qi c7228Qi) {
        if (g(h02)) {
            try {
                Nc.v.a();
                InterfaceC9133ot interfaceC9133otA = C6798Dt.a(this.f76648a, C8493iu.a(), "", false, false, null, null, this.f76649b, null, null, null, C7517Zc.a(), null, null, null, null);
                this.f76651d = interfaceC9133otA;
                InterfaceC8281gu interfaceC8281guZzN = interfaceC9133otA.zzN();
                if (interfaceC8281guZzN == null) {
                    Sc.p.g("Failed to obtain a web view for the ad inspector");
                    try {
                        Nc.v.s().x(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        h02.x1(V60.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e10) {
                        Nc.v.s().x(e10, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f76655h = h02;
                interfaceC8281guZzN.N0(null, null, null, null, null, false, null, null, null, null, null, null, null, c8685kj, null, new C8578jj(this.f76648a), c7939dj, c7228Qi, null);
                interfaceC8281guZzN.P(this);
                this.f76651d.loadUrl((String) Oc.A.c().a(C8784lf.f76945P8));
                Nc.v.m();
                Qc.o.a(this.f76648a, new AdOverlayInfoParcel(this, this.f76651d, 1, this.f76649b), true, null);
                this.f76654g = Nc.v.c().a();
            } catch (zzcfj e11) {
                Sc.p.h("Failed to obtain a web view for the ad inspector", e11);
                try {
                    Nc.v.s().x(e11, "InspectorUi.openInspector 0");
                    h02.x1(V60.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e12) {
                    Nc.v.s().x(e12, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    C8763lP(Context context, Sc.a aVar) {
        this.f76648a = context;
        this.f76649b = aVar;
    }
}
