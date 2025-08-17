package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class XS implements YS {
    static /* synthetic */ C7789dT k(String str, String str2, String str3, ZS zs2, String str4, WebView webView, String str5, String str6, EnumC7469aT enumC7469aT) {
        C7224Ua0 c7224Ua0A = C7224Ua0.a("Google", str2);
        EnumC7190Ta0 enumC7190Ta0O = o("javascript");
        EnumC6919La0 enumC6919La0M = m(zs2.toString());
        EnumC7190Ta0 enumC7190Ta0 = EnumC7190Ta0.NONE;
        if (enumC7190Ta0O == enumC7190Ta0) {
            Qc.p.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (enumC6919La0M == null) {
            Qc.p.g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zs2)));
            return null;
        }
        EnumC7190Ta0 enumC7190Ta0O2 = o(str4);
        if (enumC6919La0M == EnumC6919La0.VIDEO && enumC7190Ta0O2 == enumC7190Ta0) {
            Qc.p.g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C6817Ia0 c6817Ia0B = C6817Ia0.b(c7224Ua0A, webView, str5, "");
        return new C7789dT(AbstractC6749Ga0.a(C6783Ha0.a(enumC6919La0M, n(enumC7469aT.toString()), enumC7190Ta0O, enumC7190Ta0O2, true), c6817Ia0B), c6817Ia0B);
    }

    private static EnumC7190Ta0 o(String str) {
        return "native".equals(str) ? EnumC7190Ta0.NATIVE : "javascript".equals(str) ? EnumC7190Ta0.JAVASCRIPT : EnumC7190Ta0.NONE;
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void a(final AbstractC6749Ga0 abstractC6749Ga0) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue() && C6681Ea0.b()) {
            Objects.requireNonNull(abstractC6749Ga0);
            q(new Runnable() { // from class: com.google.android.gms.internal.ads.OS
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC6749Ga0.e();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final boolean b(final Context context) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue()) {
            Boolean bool = (Boolean) p(new WS() { // from class: com.google.android.gms.internal.ads.QS
                @Override // com.google.android.gms.internal.ads.WS
                public final Object zza() {
                    if (C6681Ea0.b()) {
                        return Boolean.TRUE;
                    }
                    C6681Ea0.a(context);
                    return Boolean.valueOf(C6681Ea0.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        Qc.p.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final C7789dT c(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final EnumC7469aT enumC7469aT, final ZS zs2, final String str6) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue() || !C6681Ea0.b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (C7789dT) p(new WS(str5, str, str8, str4, zs2, webView, str6, str7, enumC7469aT) { // from class: com.google.android.gms.internal.ads.PS

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f69318a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f69319b;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f69321d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ZS f69322e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f69323f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f69324g;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ EnumC7469aT f69326i;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f69320c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f69325h = "";

            {
                this.f69321d = str4;
                this.f69322e = zs2;
                this.f69323f = webView;
                this.f69324g = str6;
                this.f69326i = enumC7469aT;
            }

            @Override // com.google.android.gms.internal.ads.WS
            public final Object zza() {
                return XS.l(this.f69318a, this.f69319b, this.f69320c, this.f69321d, this.f69322e, this.f69323f, this.f69324g, this.f69325h, this.f69326i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void d(final AbstractC6749Ga0 abstractC6749Ga0) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.VS
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue() && C6681Ea0.b()) {
                    abstractC6749Ga0.c();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void e(final C7156Sa0 c7156Sa0, final C6809Ht c6809Ht) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.TS
            @Override // java.lang.Runnable
            public final void run() {
                c7156Sa0.g(c6809Ht);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final C7156Sa0 f(final Qc.a aVar, final WebView webView, boolean z10) {
        final boolean z11 = true;
        return (C7156Sa0) p(new WS(webView, z11) { // from class: com.google.android.gms.internal.ads.US

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebView f70615b;

            @Override // com.google.android.gms.internal.ads.WS
            public final Object zza() {
                Qc.a aVar2 = this.f70614a;
                return C7156Sa0.b(C7224Ua0.a("Google", aVar2.f29930b + "." + aVar2.f29931c), this.f70615b, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void g(final C7156Sa0 c7156Sa0, final View view) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.RS
            @Override // java.lang.Runnable
            public final void run() {
                c7156Sa0.f(view, EnumC6986Na0.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void h(final AbstractC6749Ga0 abstractC6749Ga0, final View view) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.NS
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue() && C6681Ea0.b()) {
                    abstractC6749Ga0.d(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void i(final AbstractC6749Ga0 abstractC6749Ga0, final View view) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.KS
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue() && C6681Ea0.b()) {
                    abstractC6749Ga0.b(view, EnumC6986Na0.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final C7789dT j(final String str, final WebView webView, String str2, String str3, final String str4, final EnumC7469aT enumC7469aT, final ZS zs2, final String str5) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue() || !C6681Ea0.b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (C7789dT) p(new WS(str7, str, str6, zs2, str4, webView, str5, str8, enumC7469aT) { // from class: com.google.android.gms.internal.ads.MS

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f68642b;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ZS f68644d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f68645e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f68646f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f68647g;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ EnumC7469aT f68649i;

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f68641a = "Google";

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f68643c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f68648h = "";

            {
                this.f68642b = str;
                this.f68644d = zs2;
                this.f68645e = str4;
                this.f68646f = webView;
                this.f68647g = str5;
                this.f68649i = enumC7469aT;
            }

            @Override // com.google.android.gms.internal.ads.WS
            public final Object zza() {
                return XS.k(this.f68641a, this.f68642b, this.f68643c, this.f68644d, this.f68645e, this.f68646f, this.f68647g, this.f68648h, this.f68649i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final String zzf(Context context) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue()) {
            return (String) p(new WS() { // from class: com.google.android.gms.internal.ads.SS
                @Override // com.google.android.gms.internal.ads.WS
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    static /* synthetic */ C7789dT l(String str, String str2, String str3, String str4, ZS zs2, WebView webView, String str5, String str6, EnumC7469aT enumC7469aT) {
        C7224Ua0 c7224Ua0A = C7224Ua0.a(str, str2);
        EnumC7190Ta0 enumC7190Ta0O = o("javascript");
        EnumC7190Ta0 enumC7190Ta0O2 = o(str4);
        EnumC6919La0 enumC6919La0M = m(zs2.toString());
        EnumC7190Ta0 enumC7190Ta0 = EnumC7190Ta0.NONE;
        if (enumC7190Ta0O == enumC7190Ta0) {
            Qc.p.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (enumC6919La0M == null) {
            Qc.p.g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zs2)));
            return null;
        }
        if (enumC6919La0M == EnumC6919La0.VIDEO && enumC7190Ta0O2 == enumC7190Ta0) {
            Qc.p.g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C6817Ia0 c6817Ia0C = C6817Ia0.c(c7224Ua0A, webView, str5, "");
        return new C7789dT(AbstractC6749Ga0.a(C6783Ha0.a(enumC6919La0M, n(enumC7469aT.toString()), enumC7190Ta0O, enumC7190Ta0O2, true), c6817Ia0C), c6817Ia0C);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.EnumC6919La0 m(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.La0 r4 = com.google.android.gms.internal.ads.EnumC6919La0.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.La0 r4 = com.google.android.gms.internal.ads.EnumC6919La0.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.La0 r4 = com.google.android.gms.internal.ads.EnumC6919La0.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XS.m(java.lang.String):com.google.android.gms.internal.ads.La0");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.EnumC7020Oa0 n(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7020Oa0.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7020Oa0.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7020Oa0.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7020Oa0.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XS.n(java.lang.String):com.google.android.gms.internal.ads.Oa0");
    }

    private static final Object p(WS ws2) {
        try {
            return ws2.zza();
        } catch (RuntimeException e10) {
            Lc.v.s().w(e10, "omid exception");
            return null;
        }
    }

    private static final void q(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            Lc.v.s().w(e10, "omid exception");
        }
    }
}
