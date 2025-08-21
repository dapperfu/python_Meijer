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
public final class C7160Oi {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC7194Pi f69972a = new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.li
        @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
        public final void a(Object obj, Map map) {
            InterfaceC7407Vt interfaceC7407Vt = (InterfaceC7407Vt) obj;
            InterfaceC7194Pi interfaceC7194Pi = C7160Oi.f69972a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                Sc.p.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = interfaceC7407Vt.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                map2.put(str2, boolValueOf);
                Rc.p0.k("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((InterfaceC8261gk) interfaceC7407Vt).L("openableURLs", map2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC7194Pi f69973b = new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.ni
        @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
        public final void a(Object obj, Map map) {
            InterfaceC7407Vt interfaceC7407Vt = (InterfaceC7407Vt) obj;
            InterfaceC7194Pi interfaceC7194Pi = C7160Oi.f69972a;
            if (!((Boolean) Oc.A.c().a(C8784lf.f77154e8)).booleanValue()) {
                Sc.p.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                Sc.p.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(interfaceC7407Vt.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            Rc.p0.k("/canOpenApp;" + str + ";" + boolValueOf);
            ((InterfaceC8261gk) interfaceC7407Vt).L("openableApp", map2);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC7194Pi f69974c = new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.qi
        @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
        public final void a(Object obj, Map map) throws JSONException, URISyntaxException {
            C7160Oi.b((InterfaceC7407Vt) obj, map);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC7194Pi f69975d = new C6889Gi();

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC7194Pi f69976e = new C6923Hi();

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC7194Pi f69977f = new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.ri
        @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
        public final void a(Object obj, Map map) {
            InterfaceC7407Vt interfaceC7407Vt = (InterfaceC7407Vt) obj;
            InterfaceC7194Pi interfaceC7194Pi = C7160Oi.f69972a;
            String str = (String) map.get("u");
            if (str == null) {
                Sc.p.g("URL missing from httpTrack GMSG.");
            } else {
                InterfaceC8065et interfaceC8065et = (InterfaceC8065et) interfaceC7407Vt;
                new Rc.Y(interfaceC7407Vt.getContext(), ((InterfaceC7854cu) interfaceC7407Vt).zzn().f34479a, str, null, interfaceC8065et.e() != null ? interfaceC8065et.e().f72908x0 : null).b();
            }
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC7194Pi f69978g = new C6957Ii();

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC7194Pi f69979h = new C6991Ji();

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC7194Pi f69980i = new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.oi
        @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
        public final void a(Object obj, Map map) throws NumberFormatException {
            InterfaceC7748bu interfaceC7748bu = (InterfaceC7748bu) obj;
            InterfaceC7194Pi interfaceC7194Pi = C7160Oi.f69972a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i10 = Integer.parseInt(str);
                int i11 = Integer.parseInt(str2);
                int i12 = Integer.parseInt(str3);
                M9 m9H = interfaceC7748bu.h();
                if (m9H != null) {
                    m9H.c().zzl(i10, i11, i12);
                }
            } catch (NumberFormatException unused) {
                Sc.p.g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final InterfaceC7194Pi f69981j = new C7025Ki();

    /* renamed from: k, reason: collision with root package name */
    public static final InterfaceC7194Pi f69982k = new C7059Li();

    /* renamed from: l, reason: collision with root package name */
    public static final InterfaceC7194Pi f69983l = new C8384hs();

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC7194Pi f69984m = new C8490is();

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC7194Pi f69985n = new C8364hi();

    /* renamed from: o, reason: collision with root package name */
    public static final C8259gj f69986o = new C8259gj();

    /* renamed from: p, reason: collision with root package name */
    public static final InterfaceC7194Pi f69987p = new C7092Mi();

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC7194Pi f69988q = new C7126Ni();

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC7194Pi f69989r = new C9538si();

    /* renamed from: s, reason: collision with root package name */
    public static final InterfaceC7194Pi f69990s = new C9645ti();

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC7194Pi f69991t = new C9752ui();

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC7194Pi f69992u = new C9859vi();

    /* renamed from: v, reason: collision with root package name */
    public static final InterfaceC7194Pi f69993v = new C9966wi();

    /* renamed from: w, reason: collision with root package name */
    public static final InterfaceC7194Pi f69994w = new C10073xi();

    /* renamed from: x, reason: collision with root package name */
    public static final InterfaceC7194Pi f69995x = new C10180yi();

    /* renamed from: y, reason: collision with root package name */
    public static final InterfaceC7194Pi f69996y = new C6685Ai();

    /* renamed from: z, reason: collision with root package name */
    public static final InterfaceC7194Pi f69997z = new C6719Bi();

    /* renamed from: A, reason: collision with root package name */
    public static final InterfaceC7194Pi f69969A = new C6753Ci();

    /* renamed from: B, reason: collision with root package name */
    public static final InterfaceC7194Pi f69970B = new C6821Ei();

    /* renamed from: C, reason: collision with root package name */
    public static final InterfaceC7194Pi f69971C = new C6855Fi();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceC7407Vt r16, java.util.Map r17) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7160Oi.b(com.google.android.gms.internal.ads.Vt, java.util.Map):void");
    }

    public static void c(Map map, InterfaceC8326hG interfaceC8326hG) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76793Ea)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && interfaceC8326hG != null) {
            interfaceC8326hG.Z();
        }
    }

    public static com.google.common.util.concurrent.q a(InterfaceC9133ot interfaceC9133ot, String str) {
        Uri uriA = Uri.parse(str);
        try {
            M9 m9H = interfaceC9133ot.h();
            C10123y60 c10123y60E = interfaceC9133ot.E();
            if (((Boolean) Oc.A.c().a(C8784lf.f76990Sb)).booleanValue() && c10123y60E != null) {
                if (m9H != null && m9H.f(uriA)) {
                    uriA = c10123y60E.a(uriA, interfaceC9133ot.getContext(), interfaceC9133ot.zzF(), interfaceC9133ot.zzi());
                }
            } else if (m9H != null && m9H.f(uriA)) {
                uriA = m9H.a(uriA, interfaceC9133ot.getContext(), interfaceC9133ot.zzF(), interfaceC9133ot.zzi());
            }
        } catch (zzavb unused) {
            Sc.p.g("Unable to append parameter to URL: ".concat(str));
        }
        Map map = new HashMap();
        if (interfaceC9133ot.e() != null) {
            map = interfaceC9133ot.e().f72906w0;
        }
        final String strB = C7502Yp.b(uriA, interfaceC9133ot.getContext(), map);
        long jLongValue = ((Long) C8786lg.f77458e.e()).longValue();
        if (jLongValue > 0 && jLongValue <= 244410203) {
            Cj0 cj0D = Cj0.D(interfaceC9133ot.u());
            InterfaceC9533sf0 interfaceC9533sf0 = new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.ii
                @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    InterfaceC7194Pi interfaceC7194Pi = C7160Oi.f69972a;
                    if (!((Boolean) C8786lg.f77462i.e()).booleanValue()) {
                        return "failure_click_attok";
                    }
                    Nc.v.s().x(th2, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
            };
            Xj0 xj0 = C7033Kq.f69020g;
            return (Cj0) Mj0.e((Cj0) Mj0.m((Cj0) Mj0.e(cj0D, Throwable.class, interfaceC9533sf0, xj0), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.ji
                /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
                @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.String r6 = (java.lang.String) r6
                        com.google.android.gms.internal.ads.Pi r0 = com.google.android.gms.internal.ads.C7160Oi.f69972a
                        java.lang.String r0 = r1
                        if (r6 != 0) goto L9
                        goto L74
                    L9:
                        com.google.android.gms.internal.ads.Vf r1 = com.google.android.gms.internal.ads.C8786lg.f77459f
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
                        com.google.android.gms.internal.ads.Vf r1 = com.google.android.gms.internal.ads.C8786lg.f77454a
                        java.lang.Object r1 = r1.e()
                        java.lang.String r1 = (java.lang.String) r1
                        com.google.android.gms.internal.ads.Vf r2 = com.google.android.gms.internal.ads.C8786lg.f77455b
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
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8576ji.apply(java.lang.Object):java.lang.Object");
                }
            }, xj0), Throwable.class, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.ki
                @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    InterfaceC7194Pi interfaceC7194Pi = C7160Oi.f69972a;
                    if (((Boolean) C8786lg.f77462i.e()).booleanValue()) {
                        Nc.v.s().x(th2, "prepareClickUrl.attestation2");
                    }
                    return strB;
                }
            }, xj0);
        }
        return Mj0.h(strB);
    }
}
