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
    private final InterfaceC7106Ql f65756a;

    /* renamed from: b, reason: collision with root package name */
    private final C9367sC f65757b;

    /* renamed from: c, reason: collision with root package name */
    private final XB f65758c;

    /* renamed from: d, reason: collision with root package name */
    private final C7987fG f65759d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f65760e;

    /* renamed from: f, reason: collision with root package name */
    private final Z50 f65761f;

    /* renamed from: g, reason: collision with root package name */
    private final Qc.a f65762g;

    /* renamed from: h, reason: collision with root package name */
    private final C9570u60 f65763h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f65764i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f65765j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f65766k = true;

    /* renamed from: l, reason: collision with root package name */
    private final C6970Ml f65767l;

    /* renamed from: m, reason: collision with root package name */
    private final C7004Nl f65768m;

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
    public final void F(InterfaceC7101Qh interfaceC7101Qh) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void H(View view) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean J(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void L(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final JSONObject M(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
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
        return this.f65761f.f72006L;
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
        this.f65765j = true;
    }

    private final void a(View view) {
        try {
            InterfaceC7106Ql interfaceC7106Ql = this.f65756a;
            if (interfaceC7106Ql != null && !interfaceC7106Ql.v()) {
                this.f65756a.x5(com.google.android.gms.dynamic.d.F2(view));
                this.f65758c.v();
                if (((Boolean) Mc.A.c().a(C8659lf.f75967Fa)).booleanValue()) {
                    this.f65759d.Z();
                    return;
                }
                return;
            }
            C6970Ml c6970Ml = this.f65767l;
            if (c6970Ml != null && !c6970Ml.E9()) {
                this.f65767l.D(com.google.android.gms.dynamic.d.F2(view));
                this.f65758c.v();
                if (((Boolean) Mc.A.c().a(C8659lf.f75967Fa)).booleanValue()) {
                    this.f65759d.Z();
                    return;
                }
                return;
            }
            C7004Nl c7004Nl = this.f65768m;
            if (c7004Nl == null || c7004Nl.zzv()) {
                return;
            }
            this.f65768m.C9(com.google.android.gms.dynamic.d.F2(view));
            this.f65758c.v();
            if (((Boolean) Mc.A.c().a(C8659lf.f75967Fa)).booleanValue()) {
                this.f65759d.Z();
            }
        } catch (RemoteException e10) {
            Qc.p.h("Failed to call handleClick", e10);
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
        if (!this.f65765j) {
            Qc.p.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f65761f.f72006L) {
            a(view2);
        } else {
            Qc.p.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void G(Mc.D0 d02) {
        Qc.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void I(Mc.A0 a02) {
        Qc.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void y(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f65764i) {
                this.f65764i = Lc.v.w().n(this.f65760e, this.f65762g.f29929a, this.f65761f.f71997C.toString(), this.f65763h.f78740f);
            }
            if (this.f65766k) {
                InterfaceC7106Ql interfaceC7106Ql = this.f65756a;
                if (interfaceC7106Ql != null && !interfaceC7106Ql.r()) {
                    this.f65756a.zzx();
                    this.f65757b.zza();
                    return;
                }
                C6970Ml c6970Ml = this.f65767l;
                if (c6970Ml != null && !c6970Ml.F9()) {
                    this.f65767l.zzt();
                    this.f65757b.zza();
                    return;
                }
                C7004Nl c7004Nl = this.f65768m;
                if (c7004Nl == null || c7004Nl.F9()) {
                    return;
                }
                this.f65768m.zzr();
                this.f65757b.zza();
            }
        } catch (RemoteException e10) {
            Qc.p.h("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void z(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.f65765j && this.f65761f.f72006L) {
            return;
        }
        a(view);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzh() {
        Qc.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    public CJ(C6970Ml c6970Ml, C7004Nl c7004Nl, InterfaceC7106Ql interfaceC7106Ql, C9367sC c9367sC, XB xb2, C7987fG c7987fG, Context context, Z50 z50, Qc.a aVar, C9570u60 c9570u60) {
        this.f65767l = c6970Ml;
        this.f65768m = c7004Nl;
        this.f65756a = interfaceC7106Ql;
        this.f65757b = c9367sC;
        this.f65758c = xb2;
        this.f65759d = c7987fG;
        this.f65760e = context;
        this.f65761f = z50;
        this.f65762g = aVar;
        this.f65763h = c9570u60;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void C(View view, Map map) {
        try {
            com.google.android.gms.dynamic.b bVarF2 = com.google.android.gms.dynamic.d.F2(view);
            InterfaceC7106Ql interfaceC7106Ql = this.f65756a;
            if (interfaceC7106Ql != null) {
                interfaceC7106Ql.K(bVarF2);
                return;
            }
            C6970Ml c6970Ml = this.f65767l;
            if (c6970Ml != null) {
                c6970Ml.x5(bVarF2);
                return;
            }
            C7004Nl c7004Nl = this.f65768m;
            if (c7004Nl != null) {
                c7004Nl.E9(bVarF2);
            }
        } catch (RemoteException e10) {
            Qc.p.h("Failed to call untrackView", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.FI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CJ.K(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }
}
