package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import id.C14724g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sd.C17067f;

/* renamed from: com.google.android.gms.internal.ads.Cp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6760Cp implements InterfaceC6930Hp {

    /* renamed from: l, reason: collision with root package name */
    private static final List f66664l = Collections.synchronizedList(new ArrayList());

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f66665m = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Bw0 f66666a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f66667b;

    /* renamed from: e, reason: collision with root package name */
    private final Context f66670e;

    /* renamed from: f, reason: collision with root package name */
    boolean f66671f;

    /* renamed from: g, reason: collision with root package name */
    private final C6828Ep f66672g;

    /* renamed from: c, reason: collision with root package name */
    private final List f66668c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f66669d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f66673h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private HashSet f66674i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private boolean f66675j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f66676k = false;

    final /* synthetic */ com.google.common.util.concurrent.q c(Map map) throws Exception {
        C9462rx0 c9462rx0;
        com.google.common.util.concurrent.q qVarM;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f66673h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.f66673h) {
                                    c9462rx0 = (C9462rx0) this.f66667b.get(str);
                                }
                                if (c9462rx0 == null) {
                                    C6896Gp.a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i10 = 0; i10 < length; i10++) {
                                        c9462rx0.u(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                                    }
                                    this.f66671f = (length > 0) | this.f66671f;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) C9748ug.f79729a.e()).booleanValue()) {
                    Sc.p.c("Failed to get SafeBrowsing metadata", e10);
                }
                return Mj0.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f66671f) {
            synchronized (this.f66673h) {
                this.f66666a.K(10);
            }
        }
        boolean z10 = this.f66671f;
        if (!(z10 && this.f66672g.f67362g) && (!(this.f66676k && this.f66672g.f67361f) && (z10 || !this.f66672g.f67359d))) {
            return Mj0.h(null);
        }
        synchronized (this.f66673h) {
            try {
                Iterator it = this.f66667b.values().iterator();
                while (it.hasNext()) {
                    this.f66666a.w((C9569sx0) ((C9462rx0) it.next()).p());
                }
                this.f66666a.u(this.f66668c);
                this.f66666a.v(this.f66669d);
                if (C6896Gp.b()) {
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.f66666a.I() + "\n  clickUrl: " + this.f66666a.H() + "\n  resources: \n");
                    for (C9569sx0 c9569sx0 : this.f66666a.J()) {
                        sb2.append("    [");
                        sb2.append(c9569sx0.b0());
                        sb2.append("] ");
                        sb2.append(c9569sx0.e0());
                    }
                    C6896Gp.a(sb2.toString());
                }
                com.google.common.util.concurrent.q qVarB = new Rc.P(this.f66670e).b(1, this.f66672g.f67357b, null, ((Cx0) this.f66666a.p()).j());
                if (C6896Gp.b()) {
                    qVarB.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zp
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6896Gp.a("Pinged SB successfully.");
                        }
                    }, C7033Kq.f69014a);
                }
                qVarM = Mj0.m(qVarB, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.Ap
                    @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                    public final Object apply(Object obj) {
                        int i11 = C6760Cp.f66665m;
                        return null;
                    }
                }, C7033Kq.f69020g);
            } finally {
            }
        }
        return qVarM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Hp
    public final C6828Ep zza() {
        return this.f66672g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Hp
    public final void N(String str) {
        synchronized (this.f66673h) {
            try {
                if (str == null) {
                    this.f66666a.x();
                } else {
                    this.f66666a.y(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Hp
    public final void a(String str, Map map, int i10) {
        synchronized (this.f66673h) {
            if (i10 == 3) {
                try {
                    this.f66676k = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f66667b.containsKey(str)) {
                if (i10 == 3) {
                    ((C9462rx0) this.f66667b.get(str)).y(4);
                }
                return;
            }
            C9462rx0 c9462rx0C0 = C9569sx0.c0();
            int iA = C9356qx0.a(i10);
            if (iA != 0) {
                c9462rx0C0.y(iA);
            }
            c9462rx0C0.v(this.f66667b.size());
            c9462rx0C0.x(str);
            Pw0 pw0B0 = Sw0.b0();
            if (!this.f66674i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f66674i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        Mw0 mw0B0 = Nw0.b0();
                        mw0B0.u(Zt0.B(str2));
                        mw0B0.v(Zt0.B(str3));
                        pw0B0.u((Nw0) mw0B0.p());
                    }
                }
            }
            c9462rx0C0.w((Sw0) pw0B0.p());
            this.f66667b.put(str, c9462rx0C0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC6930Hp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Ep r0 = r7.f66672g
            boolean r0 = r0.f67358c
            if (r0 != 0) goto L8
            goto L81
        L8:
            boolean r0 = r7.f66675j
            if (r0 != 0) goto L81
            Nc.v.t()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6f
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L26
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L26
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L26
            if (r3 == 0) goto L28
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L26
            goto L29
        L26:
            r2 = move-exception
            goto L2f
        L28:
            r3 = r1
        L29:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2d
            goto L35
        L2d:
            r2 = move-exception
            goto L30
        L2f:
            r3 = r1
        L30:
            java.lang.String r4 = "Fail to capture the web view"
            Sc.p.e(r4, r2)
        L35:
            if (r3 != 0) goto L6e
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            if (r2 == 0) goto L62
            if (r3 != 0) goto L44
            goto L62
        L44:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L60
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L60
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L60
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L60
            r1 = r4
            goto L6f
        L60:
            r8 = move-exception
            goto L68
        L62:
            java.lang.String r8 = "Width or height of view is zero"
            Sc.p.g(r8)     // Catch: java.lang.RuntimeException -> L60
            goto L6f
        L68:
            java.lang.String r2 = "Fail to capture the webview"
            Sc.p.e(r2, r8)
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 != 0) goto L77
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.C6896Gp.a(r8)
            return
        L77:
            r7.f66675j = r0
            com.google.android.gms.internal.ads.yp r8 = new com.google.android.gms.internal.ads.yp
            r8.<init>()
            Rc.D0.M(r8)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6760Cp.b(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Hp
    public final void zze() {
        synchronized (this.f66673h) {
            this.f66667b.keySet();
            com.google.common.util.concurrent.q qVarH = Mj0.h(Collections.EMPTY_MAP);
            InterfaceC9541sj0 interfaceC9541sj0 = new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.xp
                @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return this.f80712a.c((Map) obj);
                }
            };
            Xj0 xj0 = C7033Kq.f69020g;
            com.google.common.util.concurrent.q qVarN = Mj0.n(qVarH, interfaceC9541sj0, xj0);
            com.google.common.util.concurrent.q qVarO = Mj0.o(qVarN, 10L, TimeUnit.SECONDS, C7033Kq.f69017d);
            Mj0.r(qVarN, new C6726Bp(this, qVarO), xj0);
            f66664l.add(qVarO);
        }
    }

    public C6760Cp(Context context, Sc.a aVar, C6828Ep c6828Ep, String str, C6794Dp c6794Dp) {
        com.google.android.gms.common.internal.r.m(c6828Ep, "SafeBrowsing config is not present.");
        this.f66670e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f66667b = new LinkedHashMap();
        this.f66672g = c6828Ep;
        Iterator it = c6828Ep.f67360e.iterator();
        while (it.hasNext()) {
            this.f66674i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f66674i.remove("cookie".toLowerCase(Locale.ENGLISH));
        Bw0 bw0B0 = Cx0.b0();
        bw0B0.K(9);
        bw0B0.G(str);
        bw0B0.E(str);
        Cw0 cw0B0 = Dw0.b0();
        String str2 = this.f66672g.f67356a;
        if (str2 != null) {
            cw0B0.u(str2);
        }
        bw0B0.D((Dw0) cw0B0.p());
        C9676tx0 c9676tx0B0 = C9783ux0.b0();
        c9676tx0B0.w(C17067f.a(this.f66670e).g());
        String str3 = aVar.f34479a;
        if (str3 != null) {
            c9676tx0B0.u(str3);
        }
        long jA = C14724g.f().a(this.f66670e);
        if (jA > 0) {
            c9676tx0B0.v(jA);
        }
        bw0B0.z((C9783ux0) c9676tx0B0.p());
        this.f66666a = bw0B0;
    }

    final /* synthetic */ void e(Bitmap bitmap) {
        Xt0 xt0X = Zt0.x();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, xt0X);
        synchronized (this.f66673h) {
            Bw0 bw0 = this.f66666a;
            C8714kx0 c8714kx0B0 = C8928mx0.b0();
            c8714kx0B0.u(xt0X.b());
            c8714kx0B0.v("image/png");
            c8714kx0B0.w(2);
            bw0.F((C8928mx0) c8714kx0B0.p());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Hp
    public final boolean zzi() {
        if (com.google.android.gms.common.util.n.b() && this.f66672g.f67358c && !this.f66675j) {
            return true;
        }
        return false;
    }
}
