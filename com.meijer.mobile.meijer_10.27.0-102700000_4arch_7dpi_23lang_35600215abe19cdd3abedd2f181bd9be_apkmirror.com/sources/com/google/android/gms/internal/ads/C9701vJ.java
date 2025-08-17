package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import io.constructor.data.local.PreferencesHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9701vJ {

    /* renamed from: a, reason: collision with root package name */
    private final UL f79038a;

    /* renamed from: b, reason: collision with root package name */
    private final C8315iL f79039b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f79040c = null;

    public C9701vJ(UL ul2, C8315iL c8315iL) {
        this.f79038a = ul2;
        this.f79039b = c8315iL;
    }

    public final View a(final View view, final WindowManager windowManager) throws zzcfj {
        InterfaceC9008ot interfaceC9008otA = this.f79038a.a(Mc.d2.c0(), null, null);
        interfaceC9008otA.zzF().setVisibility(4);
        interfaceC9008otA.zzF().setContentDescription("policy_validator");
        interfaceC9008otA.h0("/sendMessageToSdk", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.oJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f77357a.b((InterfaceC9008ot) obj, map);
            }
        });
        interfaceC9008otA.h0("/hideValidatorOverlay", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.pJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f77553a.c(windowManager, view, (InterfaceC9008ot) obj, map);
            }
        });
        interfaceC9008otA.h0("/open", new C7707cj(null, null, null, null, null));
        this.f79039b.m(new WeakReference(interfaceC9008otA), "/loadNativeAdPolicyViolations", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.qJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) throws NumberFormatException {
                this.f77764a.d(view, windowManager, (InterfaceC9008ot) obj, map);
            }
        });
        this.f79039b.m(new WeakReference(interfaceC9008otA), "/showValidatorOverlay", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.rJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                Qc.p.b("Show native ad policy validator overlay.");
                ((InterfaceC9008ot) obj).zzF().setVisibility(0);
            }
        });
        return interfaceC9008otA.zzF();
    }

    final /* synthetic */ void b(InterfaceC9008ot interfaceC9008ot, Map map) {
        this.f79039b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, InterfaceC9008ot interfaceC9008ot, Map map) {
        Qc.p.b("Hide native ad policy validator overlay.");
        interfaceC9008ot.zzF().setVisibility(8);
        if (interfaceC9008ot.zzF().getWindowToken() != null) {
            windowManager.removeView(interfaceC9008ot.zzF());
        }
        interfaceC9008ot.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f79040c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f79040c);
    }

    final /* synthetic */ void e(Map map, boolean z10, int i10, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put(PreferencesHelper.PREF_ID, (String) map.get(PreferencesHelper.PREF_ID));
        this.f79039b.j("sendMessageToNativeJs", map2);
    }

    private static final int f(Context context, String str, int i10) throws NumberFormatException {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C4169y.b();
        return Qc.g.z(context, i10);
    }

    final /* synthetic */ void d(final View view, final WindowManager windowManager, InterfaceC9008ot interfaceC9008ot, final Map map) throws NumberFormatException {
        int i10;
        final InterfaceC9008ot interfaceC9008ot2;
        interfaceC9008ot.zzN().P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.sJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
            public final void a(boolean z10, int i11, String str, String str2) {
                this.f78219a.e(map, z10, i11, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            int iF = f(context, (String) map.get("validator_width"), ((Integer) Mc.A.c().a(C8659lf.f76202W7)).intValue());
            int iF2 = f(context, (String) map.get("validator_height"), ((Integer) Mc.A.c().a(C8659lf.f76216X7)).intValue());
            int iF3 = f(context, (String) map.get("validator_x"), 0);
            int iF4 = f(context, (String) map.get("validator_y"), 0);
            interfaceC9008ot.n0(C8368iu.b(iF, iF2));
            try {
                interfaceC9008ot.zzG().getSettings().setUseWideViewPort(((Boolean) Mc.A.c().a(C8659lf.f76230Y7)).booleanValue());
                interfaceC9008ot.zzG().getSettings().setLoadWithOverviewMode(((Boolean) Mc.A.c().a(C8659lf.f76244Z7)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams layoutParamsB = Pc.X.b();
            layoutParamsB.x = iF3;
            layoutParamsB.y = iF4;
            windowManager.updateViewLayout(interfaceC9008ot.zzF(), layoutParamsB);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                interfaceC9008ot2 = interfaceC9008ot;
            } else {
                if (!"1".equals(str) && !"2".equals(str)) {
                    i10 = rect.top;
                } else {
                    i10 = rect.bottom;
                }
                final int i11 = i10 - iF4;
                interfaceC9008ot2 = interfaceC9008ot;
                this.f79040c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.uJ
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            InterfaceC9008ot interfaceC9008ot3 = interfaceC9008ot2;
                            if (interfaceC9008ot3.zzF().getWindowToken() == null) {
                                return;
                            }
                            int i12 = i11;
                            WindowManager.LayoutParams layoutParams = layoutParamsB;
                            String str2 = str;
                            if ("1".equals(str2) || "2".equals(str2)) {
                                layoutParams.y = rect2.bottom - i12;
                            } else {
                                layoutParams.y = rect2.top - i12;
                            }
                            windowManager.updateViewLayout(interfaceC9008ot3.zzF(), layoutParams);
                        }
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f79040c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                interfaceC9008ot2.loadUrl(str2);
            }
        }
    }
}
