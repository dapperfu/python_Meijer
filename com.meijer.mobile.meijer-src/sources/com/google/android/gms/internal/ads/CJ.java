package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CJ implements FI {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7231Ql f66596a;

    /* renamed from: b, reason: collision with root package name */
    private final C9492sC f66597b;

    /* renamed from: c, reason: collision with root package name */
    private final XB f66598c;

    /* renamed from: d, reason: collision with root package name */
    private final C8112fG f66599d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f66600e;

    /* renamed from: f, reason: collision with root package name */
    private final Z50 f66601f;

    /* renamed from: g, reason: collision with root package name */
    private final Sc.a f66602g;

    /* renamed from: h, reason: collision with root package name */
    private final C9695u60 f66603h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f66604i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f66605j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f66606k = true;

    /* renamed from: l, reason: collision with root package name */
    private final C7095Ml f66607l;

    /* renamed from: m, reason: collision with root package name */
    private final C7129Nl f66608m;

    @Override // com.google.android.gms.internal.ads.FI
    public final void A(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void B(String str) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void D(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void F(InterfaceC7226Qh interfaceC7226Qh) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void H(View view) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean I(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void K(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final JSONObject L(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final JSONObject N(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean r() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean x() {
        return this.f66601f.f72846L;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzw() {
        this.f66605j = true;
    }

    private final void a(View view) {
        try {
            InterfaceC7231Ql interfaceC7231Ql = this.f66596a;
            if (interfaceC7231Ql != null && !interfaceC7231Ql.v()) {
                this.f66596a.E5(com.google.android.gms.dynamic.d.I2(view));
                this.f66598c.v();
                if (((Boolean) Oc.A.c().a(C8784lf.f76807Fa)).booleanValue()) {
                    this.f66599d.Z();
                    return;
                }
                return;
            }
            C7095Ml c7095Ml = this.f66607l;
            if (c7095Ml != null && !c7095Ml.E9()) {
                this.f66607l.D(com.google.android.gms.dynamic.d.I2(view));
                this.f66598c.v();
                if (((Boolean) Oc.A.c().a(C8784lf.f76807Fa)).booleanValue()) {
                    this.f66599d.Z();
                    return;
                }
                return;
            }
            C7129Nl c7129Nl = this.f66608m;
            if (c7129Nl == null || c7129Nl.zzv()) {
                return;
            }
            this.f66608m.C9(com.google.android.gms.dynamic.d.I2(view));
            this.f66598c.v();
            if (((Boolean) Oc.A.c().a(C8784lf.f76807Fa)).booleanValue()) {
                this.f66599d.Z();
            }
        } catch (RemoteException e10) {
            Sc.p.h("Failed to call handleClick", e10);
        }
    }

    private static final HashMap b(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void E(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        if (!this.f66605j) {
            Sc.p.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f66601f.f72846L) {
            a(view2);
        } else {
            Sc.p.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void G(Oc.D0 d02) {
        Sc.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void M(Oc.A0 a02) {
        Sc.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void y(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f66604i) {
                this.f66604i = Nc.v.w().n(this.f66600e, this.f66602g.f34479a, this.f66601f.f72837C.toString(), this.f66603h.f79580f);
            }
            if (this.f66606k) {
                InterfaceC7231Ql interfaceC7231Ql = this.f66596a;
                if (interfaceC7231Ql != null && !interfaceC7231Ql.r()) {
                    this.f66596a.zzx();
                    this.f66597b.zza();
                    return;
                }
                C7095Ml c7095Ml = this.f66607l;
                if (c7095Ml != null && !c7095Ml.F9()) {
                    this.f66607l.zzt();
                    this.f66597b.zza();
                    return;
                }
                C7129Nl c7129Nl = this.f66608m;
                if (c7129Nl == null || c7129Nl.F9()) {
                    return;
                }
                this.f66608m.zzr();
                this.f66597b.zza();
            }
        } catch (RemoteException e10) {
            Sc.p.h("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void z(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.f66605j && this.f66601f.f72846L) {
            return;
        }
        a(view);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzh() {
        Sc.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    public CJ(C7095Ml c7095Ml, C7129Nl c7129Nl, InterfaceC7231Ql interfaceC7231Ql, C9492sC c9492sC, XB xb2, C8112fG c8112fG, Context context, Z50 z50, Sc.a aVar, C9695u60 c9695u60) {
        this.f66607l = c7095Ml;
        this.f66608m = c7129Nl;
        this.f66596a = interfaceC7231Ql;
        this.f66597b = c9492sC;
        this.f66598c = xb2;
        this.f66599d = c8112fG;
        this.f66600e = context;
        this.f66601f = z50;
        this.f66602g = aVar;
        this.f66603h = c9695u60;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void C(View view, Map map) {
        try {
            com.google.android.gms.dynamic.b bVarI2 = com.google.android.gms.dynamic.d.I2(view);
            InterfaceC7231Ql interfaceC7231Ql = this.f66596a;
            if (interfaceC7231Ql != null) {
                interfaceC7231Ql.K(bVarI2);
                return;
            }
            C7095Ml c7095Ml = this.f66607l;
            if (c7095Ml != null) {
                c7095Ml.E5(bVarI2);
                return;
            }
            C7129Nl c7129Nl = this.f66608m;
            if (c7129Nl != null) {
                c7129Nl.E9(bVarI2);
            }
        } catch (RemoteException e10) {
            Sc.p.h("Failed to call untrackView", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.FI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CJ.J(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }
}
