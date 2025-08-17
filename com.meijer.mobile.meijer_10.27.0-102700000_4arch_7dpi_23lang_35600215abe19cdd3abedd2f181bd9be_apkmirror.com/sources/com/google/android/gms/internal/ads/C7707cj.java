package com.google.android.gms.internal.ads;

import Mc.C4169y;
import Mc.InterfaceC4098a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7707cj implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Lc.b f73226a;

    /* renamed from: b, reason: collision with root package name */
    private final C9812wN f73227b;

    /* renamed from: d, reason: collision with root package name */
    private final C7341Xm f73229d;

    /* renamed from: e, reason: collision with root package name */
    private final C9710vS f73230e;

    /* renamed from: f, reason: collision with root package name */
    private final C8269hx f73231f;

    /* renamed from: g, reason: collision with root package name */
    private Oc.b f73232g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Xj0 f73233h = C6908Kq.f68180g;

    /* renamed from: c, reason: collision with root package name */
    private final Qc.u f73228c = new Qc.u(null);

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

    static Uri c(Context context, M9 m92, Uri uri, View view, Activity activity, C9998y60 c9998y60) {
        if (m92 != null) {
            try {
                if (!((Boolean) Mc.A.c().a(C8659lf.f76150Sb)).booleanValue() || c9998y60 == null) {
                    if (m92.e(uri)) {
                        return m92.a(uri, context, view, activity);
                    }
                } else if (m92.e(uri)) {
                    return c9998y60.a(uri, context, view, activity);
                }
            } catch (zzavb unused) {
            } catch (Exception e10) {
                Lc.v.s().x(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
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
            Qc.p.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
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
    public final void h(java.lang.String r26, Mc.InterfaceC4098a r27, java.util.Map r28, java.lang.String r29) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7707cj.h(java.lang.String, Mc.a, java.util.Map, java.lang.String):void");
    }

    private final void i(Context context, String str, String str2) {
        this.f73230e.c(str);
        C9812wN c9812wN = this.f73227b;
        if (c9812wN != null) {
            GS.D9(context, c9812wN, this.f73230e, str, "dialog_not_shown", AbstractC8238hh0.f("dialog_not_shown_reason", str2));
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
    private final void j(Mc.InterfaceC4098a r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7707cj.j(Mc.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void k(boolean z10) {
        C7341Xm c7341Xm = this.f73229d;
        if (c7341Xm != null) {
            c7341Xm.h(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) Mc.A.c().a(com.google.android.gms.internal.ads.C8659lf.f76538u8)).booleanValue() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) Mc.A.c().a(com.google.android.gms.internal.ads.C8659lf.f76468p8)).booleanValue() : ((java.lang.Boolean) Mc.A.c().a(com.google.android.gms.internal.ads.C8659lf.f76454o8)).booleanValue()) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean l(Mc.InterfaceC4098a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7707cj.l(Mc.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i10) {
        C9812wN c9812wN;
        String str;
        if (!((Boolean) Mc.A.c().a(C8659lf.f75961F4)).booleanValue() || (c9812wN = this.f73227b) == null) {
            return;
        }
        C9705vN c9705vNA = c9812wN.a();
        c9705vNA.b("action", "cct_action");
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
        c9705vNA.b("cct_open_status", str);
        c9705vNA.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4098a interfaceC4098a = (InterfaceC4098a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) interfaceC4098a;
        if (interfaceC9008ot.e() != null) {
            map2 = interfaceC9008ot.e().f72066w0;
        }
        String strC = C7377Yp.c(str, interfaceC9008ot.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            Qc.p.g("Action missing from an open GMSG.");
            return;
        }
        Lc.b bVar = this.f73226a;
        if (bVar == null || bVar.c()) {
            Mj0.r((((Boolean) Mc.A.c().a(C8659lf.f76176U9)).booleanValue() && this.f73231f != null && C8269hx.j(strC)) ? this.f73231f.b(strC, C4169y.e()) : Mj0.h(strC), new C7337Xi(this, map, interfaceC4098a, str2), this.f73233h);
        } else {
            bVar.b(strC);
        }
    }

    public C7707cj(Lc.b bVar, C7341Xm c7341Xm, C9710vS c9710vS, C9812wN c9812wN, C8269hx c8269hx) {
        this.f73226a = bVar;
        this.f73229d = c7341Xm;
        this.f73230e = c9710vS;
        this.f73227b = c9812wN;
        this.f73231f = c8269hx;
    }
}
