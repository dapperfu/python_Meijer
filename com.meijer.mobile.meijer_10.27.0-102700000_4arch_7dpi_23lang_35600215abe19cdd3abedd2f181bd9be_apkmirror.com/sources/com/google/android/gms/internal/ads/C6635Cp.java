package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import gd.C14248g;
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
import qd.C16519f;

/* renamed from: com.google.android.gms.internal.ads.Cp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6635Cp implements InterfaceC6805Hp {

    /* renamed from: l, reason: collision with root package name */
    private static final List f65824l = Collections.synchronizedList(new ArrayList());

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f65825m = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Bw0 f65826a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f65827b;

    /* renamed from: e, reason: collision with root package name */
    private final Context f65830e;

    /* renamed from: f, reason: collision with root package name */
    boolean f65831f;

    /* renamed from: g, reason: collision with root package name */
    private final C6703Ep f65832g;

    /* renamed from: c, reason: collision with root package name */
    private final List f65828c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f65829d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f65833h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private HashSet f65834i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private boolean f65835j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f65836k = false;

    final /* synthetic */ com.google.common.util.concurrent.q c(Map map) throws Exception {
        C9337rx0 c9337rx0;
        com.google.common.util.concurrent.q qVarM;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f65833h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.f65833h) {
                                    c9337rx0 = (C9337rx0) this.f65827b.get(str);
                                }
                                if (c9337rx0 == null) {
                                    C6771Gp.a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i10 = 0; i10 < length; i10++) {
                                        c9337rx0.u(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                                    }
                                    this.f65831f = (length > 0) | this.f65831f;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) C9623ug.f78889a.e()).booleanValue()) {
                    Qc.p.c("Failed to get SafeBrowsing metadata", e10);
                }
                return Mj0.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f65831f) {
            synchronized (this.f65833h) {
                this.f65826a.K(10);
            }
        }
        boolean z10 = this.f65831f;
        if (!(z10 && this.f65832g.f66522g) && (!(this.f65836k && this.f65832g.f66521f) && (z10 || !this.f65832g.f66519d))) {
            return Mj0.h(null);
        }
        synchronized (this.f65833h) {
            try {
                Iterator it = this.f65827b.values().iterator();
                while (it.hasNext()) {
                    this.f65826a.w((C9444sx0) ((C9337rx0) it.next()).p());
                }
                this.f65826a.u(this.f65828c);
                this.f65826a.v(this.f65829d);
                if (C6771Gp.b()) {
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.f65826a.I() + "\n  clickUrl: " + this.f65826a.H() + "\n  resources: \n");
                    for (C9444sx0 c9444sx0 : this.f65826a.J()) {
                        sb2.append("    [");
                        sb2.append(c9444sx0.b0());
                        sb2.append("] ");
                        sb2.append(c9444sx0.e0());
                    }
                    C6771Gp.a(sb2.toString());
                }
                com.google.common.util.concurrent.q qVarB = new Pc.P(this.f65830e).b(1, this.f65832g.f66517b, null, ((Cx0) this.f65826a.p()).j());
                if (C6771Gp.b()) {
                    qVarB.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zp
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6771Gp.a("Pinged SB successfully.");
                        }
                    }, C6908Kq.f68174a);
                }
                qVarM = Mj0.m(qVarB, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.Ap
                    @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                    public final Object apply(Object obj) {
                        int i11 = C6635Cp.f65825m;
                        return null;
                    }
                }, C6908Kq.f68180g);
            } finally {
            }
        }
        return qVarM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6805Hp
    public final C6703Ep zza() {
        return this.f65832g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6805Hp
    public final void N(String str) {
        synchronized (this.f65833h) {
            try {
                if (str == null) {
                    this.f65826a.x();
                } else {
                    this.f65826a.y(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6805Hp
    public final void a(String str, Map map, int i10) {
        synchronized (this.f65833h) {
            if (i10 == 3) {
                try {
                    this.f65836k = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f65827b.containsKey(str)) {
                if (i10 == 3) {
                    ((C9337rx0) this.f65827b.get(str)).y(4);
                }
                return;
            }
            C9337rx0 c9337rx0C0 = C9444sx0.c0();
            int iA = C9231qx0.a(i10);
            if (iA != 0) {
                c9337rx0C0.y(iA);
            }
            c9337rx0C0.v(this.f65827b.size());
            c9337rx0C0.x(str);
            Pw0 pw0B0 = Sw0.b0();
            if (!this.f65834i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f65834i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        Mw0 mw0B0 = Nw0.b0();
                        mw0B0.u(Zt0.B(str2));
                        mw0B0.v(Zt0.B(str3));
                        pw0B0.u((Nw0) mw0B0.p());
                    }
                }
            }
            c9337rx0C0.w((Sw0) pw0B0.p());
            this.f65827b.put(str, c9337rx0C0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC6805Hp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Ep r0 = r7.f65832g
            boolean r0 = r0.f66518c
            if (r0 != 0) goto L8
            goto L81
        L8:
            boolean r0 = r7.f65835j
            if (r0 != 0) goto L81
            Lc.v.t()
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
            Qc.p.e(r4, r2)
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
            Qc.p.g(r8)     // Catch: java.lang.RuntimeException -> L60
            goto L6f
        L68:
            java.lang.String r2 = "Fail to capture the webview"
            Qc.p.e(r2, r8)
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 != 0) goto L77
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.C6771Gp.a(r8)
            return
        L77:
            r7.f65835j = r0
            com.google.android.gms.internal.ads.yp r8 = new com.google.android.gms.internal.ads.yp
            r8.<init>()
            Pc.D0.M(r8)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6635Cp.b(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6805Hp
    public final void zze() {
        synchronized (this.f65833h) {
            this.f65827b.keySet();
            com.google.common.util.concurrent.q qVarH = Mj0.h(Collections.EMPTY_MAP);
            InterfaceC9416sj0 interfaceC9416sj0 = new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.xp
                @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return this.f79872a.c((Map) obj);
                }
            };
            Xj0 xj0 = C6908Kq.f68180g;
            com.google.common.util.concurrent.q qVarN = Mj0.n(qVarH, interfaceC9416sj0, xj0);
            com.google.common.util.concurrent.q qVarO = Mj0.o(qVarN, 10L, TimeUnit.SECONDS, C6908Kq.f68177d);
            Mj0.r(qVarN, new C6601Bp(this, qVarO), xj0);
            f65824l.add(qVarO);
        }
    }

    public C6635Cp(Context context, Qc.a aVar, C6703Ep c6703Ep, String str, C6669Dp c6669Dp) {
        com.google.android.gms.common.internal.r.m(c6703Ep, "SafeBrowsing config is not present.");
        this.f65830e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f65827b = new LinkedHashMap();
        this.f65832g = c6703Ep;
        Iterator it = c6703Ep.f66520e.iterator();
        while (it.hasNext()) {
            this.f65834i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f65834i.remove("cookie".toLowerCase(Locale.ENGLISH));
        Bw0 bw0B0 = Cx0.b0();
        bw0B0.K(9);
        bw0B0.G(str);
        bw0B0.E(str);
        Cw0 cw0B0 = Dw0.b0();
        String str2 = this.f65832g.f66516a;
        if (str2 != null) {
            cw0B0.u(str2);
        }
        bw0B0.D((Dw0) cw0B0.p());
        C9551tx0 c9551tx0B0 = C9658ux0.b0();
        c9551tx0B0.w(C16519f.a(this.f65830e).g());
        String str3 = aVar.f29929a;
        if (str3 != null) {
            c9551tx0B0.u(str3);
        }
        long jA = C14248g.f().a(this.f65830e);
        if (jA > 0) {
            c9551tx0B0.v(jA);
        }
        bw0B0.z((C9658ux0) c9551tx0B0.p());
        this.f65826a = bw0B0;
    }

    final /* synthetic */ void e(Bitmap bitmap) {
        Xt0 xt0X = Zt0.x();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, xt0X);
        synchronized (this.f65833h) {
            Bw0 bw0 = this.f65826a;
            C8589kx0 c8589kx0B0 = C8803mx0.b0();
            c8589kx0B0.u(xt0X.b());
            c8589kx0B0.v("image/png");
            c8589kx0B0.w(2);
            bw0.F((C8803mx0) c8589kx0B0.p());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6805Hp
    public final boolean zzi() {
        if (com.google.android.gms.common.util.n.b() && this.f65832g.f66518c && !this.f65835j) {
            return true;
        }
        return false;
    }
}
