package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Oi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7035Oi {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC7069Pi f69132a = new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.li
        @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
        public final void a(Object obj, Map map) {
            InterfaceC7282Vt interfaceC7282Vt = (InterfaceC7282Vt) obj;
            InterfaceC7069Pi interfaceC7069Pi = C7035Oi.f69132a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                Qc.p.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = interfaceC7282Vt.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                map2.put(str2, boolValueOf);
                Pc.p0.k("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((InterfaceC8136gk) interfaceC7282Vt).L("openableURLs", map2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC7069Pi f69133b = new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.ni
        @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
        public final void a(Object obj, Map map) {
            InterfaceC7282Vt interfaceC7282Vt = (InterfaceC7282Vt) obj;
            InterfaceC7069Pi interfaceC7069Pi = C7035Oi.f69132a;
            if (!((Boolean) Mc.A.c().a(C8659lf.f76314e8)).booleanValue()) {
                Qc.p.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                Qc.p.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(interfaceC7282Vt.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            Pc.p0.k("/canOpenApp;" + str + ";" + boolValueOf);
            ((InterfaceC8136gk) interfaceC7282Vt).L("openableApp", map2);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC7069Pi f69134c = new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.qi
        @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
        public final void a(Object obj, Map map) throws JSONException, URISyntaxException {
            C7035Oi.b((InterfaceC7282Vt) obj, map);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC7069Pi f69135d = new C6764Gi();

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC7069Pi f69136e = new C6798Hi();

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC7069Pi f69137f = new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.ri
        @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
        public final void a(Object obj, Map map) {
            InterfaceC7282Vt interfaceC7282Vt = (InterfaceC7282Vt) obj;
            InterfaceC7069Pi interfaceC7069Pi = C7035Oi.f69132a;
            String str = (String) map.get("u");
            if (str == null) {
                Qc.p.g("URL missing from httpTrack GMSG.");
            } else {
                InterfaceC7940et interfaceC7940et = (InterfaceC7940et) interfaceC7282Vt;
                new Pc.Y(interfaceC7282Vt.getContext(), ((InterfaceC7729cu) interfaceC7282Vt).zzn().f29929a, str, null, interfaceC7940et.e() != null ? interfaceC7940et.e().f72068x0 : null).b();
            }
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC7069Pi f69138g = new C6832Ii();

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC7069Pi f69139h = new C6866Ji();

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC7069Pi f69140i = new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.oi
        @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
        public final void a(Object obj, Map map) throws NumberFormatException {
            InterfaceC7623bu interfaceC7623bu = (InterfaceC7623bu) obj;
            InterfaceC7069Pi interfaceC7069Pi = C7035Oi.f69132a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i10 = Integer.parseInt(str);
                int i11 = Integer.parseInt(str2);
                int i12 = Integer.parseInt(str3);
                M9 m9G = interfaceC7623bu.g();
                if (m9G != null) {
                    m9G.c().zzl(i10, i11, i12);
                }
            } catch (NumberFormatException unused) {
                Qc.p.g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final InterfaceC7069Pi f69141j = new C6900Ki();

    /* renamed from: k, reason: collision with root package name */
    public static final InterfaceC7069Pi f69142k = new C6934Li();

    /* renamed from: l, reason: collision with root package name */
    public static final InterfaceC7069Pi f69143l = new C8259hs();

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC7069Pi f69144m = new C8365is();

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC7069Pi f69145n = new C8239hi();

    /* renamed from: o, reason: collision with root package name */
    public static final C8134gj f69146o = new C8134gj();

    /* renamed from: p, reason: collision with root package name */
    public static final InterfaceC7069Pi f69147p = new C6967Mi();

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC7069Pi f69148q = new C7001Ni();

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC7069Pi f69149r = new C9413si();

    /* renamed from: s, reason: collision with root package name */
    public static final InterfaceC7069Pi f69150s = new C9520ti();

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC7069Pi f69151t = new C9627ui();

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC7069Pi f69152u = new C9734vi();

    /* renamed from: v, reason: collision with root package name */
    public static final InterfaceC7069Pi f69153v = new C9841wi();

    /* renamed from: w, reason: collision with root package name */
    public static final InterfaceC7069Pi f69154w = new C9948xi();

    /* renamed from: x, reason: collision with root package name */
    public static final InterfaceC7069Pi f69155x = new C10055yi();

    /* renamed from: y, reason: collision with root package name */
    public static final InterfaceC7069Pi f69156y = new C6560Ai();

    /* renamed from: z, reason: collision with root package name */
    public static final InterfaceC7069Pi f69157z = new C6594Bi();

    /* renamed from: A, reason: collision with root package name */
    public static final InterfaceC7069Pi f69129A = new C6628Ci();

    /* renamed from: B, reason: collision with root package name */
    public static final InterfaceC7069Pi f69130B = new C6696Ei();

    /* renamed from: C, reason: collision with root package name */
    public static final InterfaceC7069Pi f69131C = new C6730Fi();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceC7282Vt r16, java.util.Map r17) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7035Oi.b(com.google.android.gms.internal.ads.Vt, java.util.Map):void");
    }

    public static void c(Map map, InterfaceC8201hG interfaceC8201hG) {
        if (((Boolean) Mc.A.c().a(C8659lf.f75953Ea)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && interfaceC8201hG != null) {
            interfaceC8201hG.Z();
        }
    }

    public static com.google.common.util.concurrent.q a(InterfaceC9008ot interfaceC9008ot, String str) {
        Uri uriA = Uri.parse(str);
        try {
            M9 m9G = interfaceC9008ot.g();
            C9998y60 c9998y60E = interfaceC9008ot.E();
            if (((Boolean) Mc.A.c().a(C8659lf.f76150Sb)).booleanValue() && c9998y60E != null) {
                if (m9G != null && m9G.f(uriA)) {
                    uriA = c9998y60E.a(uriA, interfaceC9008ot.getContext(), interfaceC9008ot.zzF(), interfaceC9008ot.zzi());
                }
            } else if (m9G != null && m9G.f(uriA)) {
                uriA = m9G.a(uriA, interfaceC9008ot.getContext(), interfaceC9008ot.zzF(), interfaceC9008ot.zzi());
            }
        } catch (zzavb unused) {
            Qc.p.g("Unable to append parameter to URL: ".concat(str));
        }
        Map map = new HashMap();
        if (interfaceC9008ot.e() != null) {
            map = interfaceC9008ot.e().f72066w0;
        }
        final String strB = C7377Yp.b(uriA, interfaceC9008ot.getContext(), map);
        long jLongValue = ((Long) C8661lg.f76618e.e()).longValue();
        if (jLongValue > 0 && jLongValue <= 244410203) {
            Cj0 cj0D = Cj0.D(interfaceC9008ot.u());
            InterfaceC9408sf0 interfaceC9408sf0 = new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.ii
                @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    InterfaceC7069Pi interfaceC7069Pi = C7035Oi.f69132a;
                    if (!((Boolean) C8661lg.f76622i.e()).booleanValue()) {
                        return "failure_click_attok";
                    }
                    Lc.v.s().x(th2, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
            };
            Xj0 xj0 = C6908Kq.f68180g;
            return (Cj0) Mj0.e((Cj0) Mj0.m((Cj0) Mj0.e(cj0D, Throwable.class, interfaceC9408sf0, xj0), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.ji
                /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
                @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.String r6 = (java.lang.String) r6
                        com.google.android.gms.internal.ads.Pi r0 = com.google.android.gms.internal.ads.C7035Oi.f69132a
                        java.lang.String r0 = r1
                        if (r6 != 0) goto L9
                        goto L74
                    L9:
                        com.google.android.gms.internal.ads.Vf r1 = com.google.android.gms.internal.ads.C8661lg.f76619f
                        java.lang.Object r1 = r1.e()
                        java.lang.Boolean r1 = (java.lang.Boolean) r1
                        boolean r1 = r1.booleanValue()
                        if (r1 != 0) goto L18
                        goto L39
                    L18:
                        java.lang.String r1 = ".googleadservices.com"
                        java.lang.String r2 = ".googlesyndication.com"
                        java.lang.String r3 = ".doubleclick.net"
                        java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                        android.net.Uri r2 = android.net.Uri.parse(r0)
                        java.lang.String r2 = r2.getHost()
                        r3 = 0
                    L2b:
                        r4 = 3
                        if (r3 >= r4) goto L74
                        r4 = r1[r3]
                        boolean r4 = r2.endsWith(r4)
                        if (r4 != 0) goto L39
                        int r3 = r3 + 1
                        goto L2b
                    L39:
                        com.google.android.gms.internal.ads.Vf r1 = com.google.android.gms.internal.ads.C8661lg.f76614a
                        java.lang.Object r1 = r1.e()
                        java.lang.String r1 = (java.lang.String) r1
                        com.google.android.gms.internal.ads.Vf r2 = com.google.android.gms.internal.ads.C8661lg.f76615b
                        java.lang.Object r2 = r2.e()
                        java.lang.String r2 = (java.lang.String) r2
                        boolean r3 = android.text.TextUtils.isEmpty(r1)
                        if (r3 != 0) goto L53
                        java.lang.String r0 = r0.replace(r1, r6)
                    L53:
                        boolean r1 = android.text.TextUtils.isEmpty(r2)
                        if (r1 != 0) goto L74
                        android.net.Uri r1 = android.net.Uri.parse(r0)
                        java.lang.String r3 = r1.getQueryParameter(r2)
                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                        if (r3 == 0) goto L74
                        android.net.Uri$Builder r0 = r1.buildUpon()
                        android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                        java.lang.String r6 = r6.toString()
                        return r6
                    L74:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8451ji.apply(java.lang.Object):java.lang.Object");
                }
            }, xj0), Throwable.class, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.ki
                @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    InterfaceC7069Pi interfaceC7069Pi = C7035Oi.f69132a;
                    if (((Boolean) C8661lg.f76622i.e()).booleanValue()) {
                        Lc.v.s().x(th2, "prepareClickUrl.attestation2");
                    }
                    return strB;
                }
            }, xj0);
        }
        return Mj0.h(strB);
    }
}
