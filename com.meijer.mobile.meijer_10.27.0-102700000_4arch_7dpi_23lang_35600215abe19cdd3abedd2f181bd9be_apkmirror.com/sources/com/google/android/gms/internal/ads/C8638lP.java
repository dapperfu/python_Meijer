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
public final class C8638lP implements Oc.p, InterfaceC7942eu {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75808a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.a f75809b;

    /* renamed from: c, reason: collision with root package name */
    private ZO f75810c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9008ot f75811d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f75812e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f75813f;

    /* renamed from: g, reason: collision with root package name */
    private long f75814g;

    /* renamed from: h, reason: collision with root package name */
    private Mc.H0 f75815h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f75816i;

    private final synchronized boolean g(Mc.H0 h02) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue()) {
            Qc.p.g("Ad inspector had an internal error.");
            try {
                h02.P7(V60.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f75810c == null) {
            Qc.p.g("Ad inspector had an internal error.");
            try {
                Lc.v.s().x(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                h02.P7(V60.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f75812e && !this.f75813f) {
            if (Lc.v.c().a() >= this.f75814g + ((Integer) Mc.A.c().a(C8659lf.f76133R8)).intValue()) {
                return true;
            }
        }
        Qc.p.g("Ad inspector cannot be opened because it is already open.");
        try {
            h02.P7(V60.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // Oc.p
    public final void A1() {
    }

    @Override // Oc.p
    public final synchronized void F2() {
        this.f75813f = true;
        f("");
    }

    @Override // Oc.p
    public final synchronized void N3(int i10) {
        this.f75811d.destroy();
        if (!this.f75816i) {
            Pc.p0.k("Inspector closed.");
            Mc.H0 h02 = this.f75815h;
            if (h02 != null) {
                try {
                    h02.P7(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f75813f = false;
        this.f75812e = false;
        this.f75814g = 0L;
        this.f75816i = false;
        this.f75815h = null;
    }

    @Override // Oc.p
    public final void W5() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
    public final synchronized void a(boolean z10, int i10, String str, String str2) {
        if (z10) {
            Pc.p0.k("Ad inspector loaded.");
            this.f75812e = true;
            f("");
            return;
        }
        Qc.p.g("Ad inspector failed to load.");
        try {
            Lc.v.s().x(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            Mc.H0 h02 = this.f75815h;
            if (h02 != null) {
                h02.P7(V60.d(17, null, null));
            }
        } catch (RemoteException e10) {
            Lc.v.s().x(e10, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f75816i = true;
        this.f75811d.destroy();
    }

    @Override // Oc.p
    public final void b2() {
    }

    public final void c(ZO zo2) {
        this.f75810c = zo2;
    }

    @Override // Oc.p
    public final void d7() {
    }

    public final synchronized void f(final String str) {
        if (this.f75812e && this.f75813f) {
            C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kP
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f75638a.d(str);
                }
            });
        }
    }

    public final Activity b() {
        InterfaceC9008ot interfaceC9008ot = this.f75811d;
        if (interfaceC9008ot == null || interfaceC9008ot.M()) {
            return null;
        }
        return this.f75811d.zzi();
    }

    final /* synthetic */ void d(String str) throws JSONException {
        JSONObject jSONObjectF = this.f75810c.f();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectF.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f75811d.a("window.inspectorInfo", jSONObjectF.toString());
    }

    public final synchronized void e(Mc.H0 h02, C8560kj c8560kj, C7814dj c7814dj, C7103Qi c7103Qi) {
        if (g(h02)) {
            try {
                Lc.v.a();
                InterfaceC9008ot interfaceC9008otA = C6673Dt.a(this.f75808a, C8368iu.a(), "", false, false, null, null, this.f75809b, null, null, null, C7392Zc.a(), null, null, null, null);
                this.f75811d = interfaceC9008otA;
                InterfaceC8156gu interfaceC8156guZzN = interfaceC9008otA.zzN();
                if (interfaceC8156guZzN == null) {
                    Qc.p.g("Failed to obtain a web view for the ad inspector");
                    try {
                        Lc.v.s().x(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        h02.P7(V60.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e10) {
                        Lc.v.s().x(e10, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f75815h = h02;
                interfaceC8156guZzN.r0(null, null, null, null, null, false, null, null, null, null, null, null, null, c8560kj, null, new C8453jj(this.f75808a), c7814dj, c7103Qi, null);
                interfaceC8156guZzN.P(this);
                this.f75811d.loadUrl((String) Mc.A.c().a(C8659lf.f76105P8));
                Lc.v.m();
                Oc.o.a(this.f75808a, new AdOverlayInfoParcel(this, this.f75811d, 1, this.f75809b), true, null);
                this.f75814g = Lc.v.c().a();
            } catch (zzcfj e11) {
                Qc.p.h("Failed to obtain a web view for the ad inspector", e11);
                try {
                    Lc.v.s().x(e11, "InspectorUi.openInspector 0");
                    h02.P7(V60.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e12) {
                    Lc.v.s().x(e12, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    C8638lP(Context context, Qc.a aVar) {
        this.f75808a = context;
        this.f75809b = aVar;
    }
}
