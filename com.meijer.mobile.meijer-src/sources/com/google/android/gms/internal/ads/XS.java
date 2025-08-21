package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class XS implements YS {
    static /* synthetic */ C7914dT k(String str, String str2, String str3, ZS zs2, String str4, WebView webView, String str5, String str6, EnumC7594aT enumC7594aT) {
        C7349Ua0 c7349Ua0A = C7349Ua0.a("Google", str2);
        EnumC7315Ta0 enumC7315Ta0O = o("javascript");
        EnumC7044La0 enumC7044La0M = m(zs2.toString());
        EnumC7315Ta0 enumC7315Ta0 = EnumC7315Ta0.NONE;
        if (enumC7315Ta0O == enumC7315Ta0) {
            Sc.p.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (enumC7044La0M == null) {
            Sc.p.g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zs2)));
            return null;
        }
        EnumC7315Ta0 enumC7315Ta0O2 = o(str4);
        if (enumC7044La0M == EnumC7044La0.VIDEO && enumC7315Ta0O2 == enumC7315Ta0) {
            Sc.p.g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C6942Ia0 c6942Ia0B = C6942Ia0.b(c7349Ua0A, webView, str5, "");
        return new C7914dT(AbstractC6874Ga0.a(C6908Ha0.a(enumC7044La0M, n(enumC7594aT.toString()), enumC7315Ta0O, enumC7315Ta0O2, true), c6942Ia0B), c6942Ia0B);
    }

    private static EnumC7315Ta0 o(String str) {
        return "native".equals(str) ? EnumC7315Ta0.NATIVE : "javascript".equals(str) ? EnumC7315Ta0.JAVASCRIPT : EnumC7315Ta0.NONE;
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final C7281Sa0 a(final Sc.a aVar, final WebView webView, boolean z10) {
        final boolean z11 = true;
        return (C7281Sa0) p(new WS(webView, z11) { // from class: com.google.android.gms.internal.ads.US

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebView f71455b;

            @Override // com.google.android.gms.internal.ads.WS
            public final Object zza() {
                Sc.a aVar2 = this.f71454a;
                return C7281Sa0.b(C7349Ua0.a("Google", aVar2.f34480b + "." + aVar2.f34481c), this.f71455b, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void b(final AbstractC6874Ga0 abstractC6874Ga0) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue() && C6806Ea0.b()) {
            Objects.requireNonNull(abstractC6874Ga0);
            q(new Runnable() { // from class: com.google.android.gms.internal.ads.OS
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC6874Ga0.e();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final boolean c(final Context context) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue()) {
            Boolean bool = (Boolean) p(new WS() { // from class: com.google.android.gms.internal.ads.QS
                @Override // com.google.android.gms.internal.ads.WS
                public final Object zza() {
                    if (C6806Ea0.b()) {
                        return Boolean.TRUE;
                    }
                    C6806Ea0.a(context);
                    return Boolean.valueOf(C6806Ea0.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        Sc.p.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final C7914dT d(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final EnumC7594aT enumC7594aT, final ZS zs2, final String str6) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue() || !C6806Ea0.b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (C7914dT) p(new WS(str5, str, str8, str4, zs2, webView, str6, str7, enumC7594aT) { // from class: com.google.android.gms.internal.ads.PS

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f70158a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f70159b;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70161d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ZS f70162e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f70163f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f70164g;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ EnumC7594aT f70166i;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70160c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f70165h = "";

            {
                this.f70161d = str4;
                this.f70162e = zs2;
                this.f70163f = webView;
                this.f70164g = str6;
                this.f70166i = enumC7594aT;
            }

            @Override // com.google.android.gms.internal.ads.WS
            public final Object zza() {
                return XS.l(this.f70158a, this.f70159b, this.f70160c, this.f70161d, this.f70162e, this.f70163f, this.f70164g, this.f70165h, this.f70166i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void e(final AbstractC6874Ga0 abstractC6874Ga0) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.VS
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue() && C6806Ea0.b()) {
                    abstractC6874Ga0.c();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void f(final C7281Sa0 c7281Sa0, final C6934Ht c6934Ht) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.TS
            @Override // java.lang.Runnable
            public final void run() {
                c7281Sa0.g(c6934Ht);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void g(final C7281Sa0 c7281Sa0, final View view) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.RS
            @Override // java.lang.Runnable
            public final void run() {
                c7281Sa0.f(view, EnumC7111Na0.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void h(final AbstractC6874Ga0 abstractC6874Ga0, final View view) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.NS
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue() && C6806Ea0.b()) {
                    abstractC6874Ga0.d(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final void i(final AbstractC6874Ga0 abstractC6874Ga0, final View view) {
        q(new Runnable() { // from class: com.google.android.gms.internal.ads.KS
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue() && C6806Ea0.b()) {
                    abstractC6874Ga0.b(view, EnumC7111Na0.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final C7914dT j(final String str, final WebView webView, String str2, String str3, final String str4, final EnumC7594aT enumC7594aT, final ZS zs2, final String str5) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue() || !C6806Ea0.b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (C7914dT) p(new WS(str7, str, str6, zs2, str4, webView, str5, str8, enumC7594aT) { // from class: com.google.android.gms.internal.ads.MS

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f69482b;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ZS f69484d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f69485e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f69486f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f69487g;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ EnumC7594aT f69489i;

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f69481a = "Google";

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f69483c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f69488h = "";

            {
                this.f69482b = str;
                this.f69484d = zs2;
                this.f69485e = str4;
                this.f69486f = webView;
                this.f69487g = str5;
                this.f69489i = enumC7594aT;
            }

            @Override // com.google.android.gms.internal.ads.WS
            public final Object zza() {
                return XS.k(this.f69481a, this.f69482b, this.f69483c, this.f69484d, this.f69485e, this.f69486f, this.f69487g, this.f69488h, this.f69489i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YS
    public final String zzf(Context context) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue()) {
            return (String) p(new WS() { // from class: com.google.android.gms.internal.ads.SS
                @Override // com.google.android.gms.internal.ads.WS
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    static /* synthetic */ C7914dT l(String str, String str2, String str3, String str4, ZS zs2, WebView webView, String str5, String str6, EnumC7594aT enumC7594aT) {
        C7349Ua0 c7349Ua0A = C7349Ua0.a(str, str2);
        EnumC7315Ta0 enumC7315Ta0O = o("javascript");
        EnumC7315Ta0 enumC7315Ta0O2 = o(str4);
        EnumC7044La0 enumC7044La0M = m(zs2.toString());
        EnumC7315Ta0 enumC7315Ta0 = EnumC7315Ta0.NONE;
        if (enumC7315Ta0O == enumC7315Ta0) {
            Sc.p.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (enumC7044La0M == null) {
            Sc.p.g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zs2)));
            return null;
        }
        if (enumC7044La0M == EnumC7044La0.VIDEO && enumC7315Ta0O2 == enumC7315Ta0) {
            Sc.p.g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C6942Ia0 c6942Ia0C = C6942Ia0.c(c7349Ua0A, webView, str5, "");
        return new C7914dT(AbstractC6874Ga0.a(C6908Ha0.a(enumC7044La0M, n(enumC7594aT.toString()), enumC7315Ta0O, enumC7315Ta0O2, true), c6942Ia0C), c6942Ia0C);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.EnumC7044La0 m(java.lang.String r4) {
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
            com.google.android.gms.internal.ads.La0 r4 = com.google.android.gms.internal.ads.EnumC7044La0.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.La0 r4 = com.google.android.gms.internal.ads.EnumC7044La0.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.La0 r4 = com.google.android.gms.internal.ads.EnumC7044La0.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XS.m(java.lang.String):com.google.android.gms.internal.ads.La0");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.EnumC7145Oa0 n(java.lang.String r4) {
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
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7145Oa0.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7145Oa0.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7145Oa0.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.Oa0 r4 = com.google.android.gms.internal.ads.EnumC7145Oa0.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XS.n(java.lang.String):com.google.android.gms.internal.ads.Oa0");
    }

    private static final Object p(WS ws2) {
        try {
            return ws2.zza();
        } catch (RuntimeException e10) {
            Nc.v.s().w(e10, "omid exception");
            return null;
        }
    }

    private static final void q(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            Nc.v.s().w(e10, "omid exception");
        }
    }
}
