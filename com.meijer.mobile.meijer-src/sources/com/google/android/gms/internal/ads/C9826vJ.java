package com.google.android.gms.internal.ads;

import Oc.C4447y;
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
public final class C9826vJ {

    /* renamed from: a, reason: collision with root package name */
    private final UL f79878a;

    /* renamed from: b, reason: collision with root package name */
    private final C8440iL f79879b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f79880c = null;

    public C9826vJ(UL ul2, C8440iL c8440iL) {
        this.f79878a = ul2;
        this.f79879b = c8440iL;
    }

    public final View a(final View view, final WindowManager windowManager) throws zzcfj {
        InterfaceC9133ot interfaceC9133otA = this.f79878a.a(Oc.d2.b0(), null, null);
        interfaceC9133otA.zzF().setVisibility(4);
        interfaceC9133otA.zzF().setContentDescription("policy_validator");
        interfaceC9133otA.h0("/sendMessageToSdk", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.oJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f78197a.b((InterfaceC9133ot) obj, map);
            }
        });
        interfaceC9133otA.h0("/hideValidatorOverlay", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.pJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f78393a.c(windowManager, view, (InterfaceC9133ot) obj, map);
            }
        });
        interfaceC9133otA.h0("/open", new C7832cj(null, null, null, null, null));
        this.f79879b.m(new WeakReference(interfaceC9133otA), "/loadNativeAdPolicyViolations", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.qJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) throws NumberFormatException {
                this.f78604a.d(view, windowManager, (InterfaceC9133ot) obj, map);
            }
        });
        this.f79879b.m(new WeakReference(interfaceC9133otA), "/showValidatorOverlay", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.rJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                Sc.p.b("Show native ad policy validator overlay.");
                ((InterfaceC9133ot) obj).zzF().setVisibility(0);
            }
        });
        return interfaceC9133otA.zzF();
    }

    final /* synthetic */ void b(InterfaceC9133ot interfaceC9133ot, Map map) {
        this.f79879b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, InterfaceC9133ot interfaceC9133ot, Map map) {
        Sc.p.b("Hide native ad policy validator overlay.");
        interfaceC9133ot.zzF().setVisibility(8);
        if (interfaceC9133ot.zzF().getWindowToken() != null) {
            windowManager.removeView(interfaceC9133ot.zzF());
        }
        interfaceC9133ot.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f79880c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f79880c);
    }

    final /* synthetic */ void e(Map map, boolean z10, int i10, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put(PreferencesHelper.PREF_ID, (String) map.get(PreferencesHelper.PREF_ID));
        this.f79879b.j("sendMessageToNativeJs", map2);
    }

    private static final int f(Context context, String str, int i10) throws NumberFormatException {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C4447y.b();
        return Sc.g.z(context, i10);
    }

    final /* synthetic */ void d(final View view, final WindowManager windowManager, InterfaceC9133ot interfaceC9133ot, final Map map) throws NumberFormatException {
        int i10;
        final InterfaceC9133ot interfaceC9133ot2;
        interfaceC9133ot.zzN().P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.sJ
            @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
            public final void a(boolean z10, int i11, String str, String str2) {
                this.f79059a.e(map, z10, i11, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            int iF = f(context, (String) map.get("validator_width"), ((Integer) Oc.A.c().a(C8784lf.f77042W7)).intValue());
            int iF2 = f(context, (String) map.get("validator_height"), ((Integer) Oc.A.c().a(C8784lf.f77056X7)).intValue());
            int iF3 = f(context, (String) map.get("validator_x"), 0);
            int iF4 = f(context, (String) map.get("validator_y"), 0);
            interfaceC9133ot.n0(C8493iu.b(iF, iF2));
            try {
                interfaceC9133ot.zzG().getSettings().setUseWideViewPort(((Boolean) Oc.A.c().a(C8784lf.f77070Y7)).booleanValue());
                interfaceC9133ot.zzG().getSettings().setLoadWithOverviewMode(((Boolean) Oc.A.c().a(C8784lf.f77084Z7)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams layoutParamsB = Rc.X.b();
            layoutParamsB.x = iF3;
            layoutParamsB.y = iF4;
            windowManager.updateViewLayout(interfaceC9133ot.zzF(), layoutParamsB);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                interfaceC9133ot2 = interfaceC9133ot;
            } else {
                if (!"1".equals(str) && !"2".equals(str)) {
                    i10 = rect.top;
                } else {
                    i10 = rect.bottom;
                }
                final int i11 = i10 - iF4;
                interfaceC9133ot2 = interfaceC9133ot;
                this.f79880c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.uJ
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            InterfaceC9133ot interfaceC9133ot3 = interfaceC9133ot2;
                            if (interfaceC9133ot3.zzF().getWindowToken() == null) {
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
                            windowManager.updateViewLayout(interfaceC9133ot3.zzF(), layoutParams);
                        }
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f79880c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                interfaceC9133ot2.loadUrl(str2);
            }
        }
    }
}
