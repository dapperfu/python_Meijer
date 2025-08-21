package com.google.android.gms.internal.ads;

import Oc.C4447y;
import Oc.InterfaceC4376a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7832cj implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Nc.b f74066a;

    /* renamed from: b, reason: collision with root package name */
    private final C9937wN f74067b;

    /* renamed from: d, reason: collision with root package name */
    private final C7466Xm f74069d;

    /* renamed from: e, reason: collision with root package name */
    private final C9835vS f74070e;

    /* renamed from: f, reason: collision with root package name */
    private final C8394hx f74071f;

    /* renamed from: g, reason: collision with root package name */
    private Qc.b f74072g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Xj0 f74073h = C7033Kq.f69020g;

    /* renamed from: c, reason: collision with root package name */
    private final Sc.u f74068c = new Sc.u(null);

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri c(Context context, M9 m92, Uri uri, View view, Activity activity, C10123y60 c10123y60) {
        if (m92 != null) {
            try {
                if (!((Boolean) Oc.A.c().a(C8784lf.f76990Sb)).booleanValue() || c10123y60 == null) {
                    if (m92.e(uri)) {
                        return m92.a(uri, context, view, activity);
                    }
                } else if (m92.e(uri)) {
                    return c10123y60.a(uri, context, view, activity);
                }
            } catch (zzavb unused) {
            } catch (Exception e10) {
                Nc.v.s().x(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e10) {
            Sc.p.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
            return uri;
        }
    }

    public static boolean f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r26, Oc.InterfaceC4376a r27, java.util.Map r28, java.lang.String r29) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7832cj.h(java.lang.String, Oc.a, java.util.Map, java.lang.String):void");
    }

    private final void i(Context context, String str, String str2) {
        this.f74070e.c(str);
        C9937wN c9937wN = this.f74067b;
        if (c9937wN != null) {
            GS.D9(context, c9937wN, this.f74070e, str, "dialog_not_shown", AbstractC8363hh0.f("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(Oc.InterfaceC4376a r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7832cj.j(Oc.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void k(boolean z10) {
        C7466Xm c7466Xm = this.f74069d;
        if (c7466Xm != null) {
            c7466Xm.h(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) Oc.A.c().a(com.google.android.gms.internal.ads.C8784lf.f77378u8)).booleanValue() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) Oc.A.c().a(com.google.android.gms.internal.ads.C8784lf.f77308p8)).booleanValue() : ((java.lang.Boolean) Oc.A.c().a(com.google.android.gms.internal.ads.C8784lf.f77294o8)).booleanValue()) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean l(Oc.InterfaceC4376a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7832cj.l(Oc.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i10) {
        C9937wN c9937wN;
        String str;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76801F4)).booleanValue() || (c9937wN = this.f74067b) == null) {
            return;
        }
        C9830vN c9830vNA = c9937wN.a();
        c9830vNA.b("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        c9830vNA.b("cct_open_status", str);
        c9830vNA.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4376a interfaceC4376a = (InterfaceC4376a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) interfaceC4376a;
        if (interfaceC9133ot.e() != null) {
            map2 = interfaceC9133ot.e().f72906w0;
        }
        String strC = C7502Yp.c(str, interfaceC9133ot.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            Sc.p.g("Action missing from an open GMSG.");
            return;
        }
        Nc.b bVar = this.f74066a;
        if (bVar == null || bVar.c()) {
            Mj0.r((((Boolean) Oc.A.c().a(C8784lf.f77016U9)).booleanValue() && this.f74071f != null && C8394hx.j(strC)) ? this.f74071f.b(strC, C4447y.e()) : Mj0.h(strC), new C7462Xi(this, map, interfaceC4376a, str2), this.f74073h);
        } else {
            bVar.b(strC);
        }
    }

    public C7832cj(Nc.b bVar, C7466Xm c7466Xm, C9835vS c9835vS, C9937wN c9937wN, C8394hx c8394hx) {
        this.f74066a = bVar;
        this.f74069d = c7466Xm;
        this.f74070e = c9835vS;
        this.f74067b = c9937wN;
        this.f74071f = c8394hx;
    }
}
