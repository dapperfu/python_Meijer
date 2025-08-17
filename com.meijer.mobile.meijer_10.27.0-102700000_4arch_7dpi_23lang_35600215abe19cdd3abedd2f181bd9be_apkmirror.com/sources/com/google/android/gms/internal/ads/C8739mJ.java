package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import io.constructor.data.local.PreferencesHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8739mJ {

    /* renamed from: a, reason: collision with root package name */
    private final UL f76775a;

    /* renamed from: b, reason: collision with root package name */
    private final C8315iL f76776b;

    /* renamed from: c, reason: collision with root package name */
    private final C7084Px f76777c;

    /* renamed from: d, reason: collision with root package name */
    private final FI f76778d;

    public C8739mJ(UL ul2, C8315iL c8315iL, C7084Px c7084Px, FI fi2) {
        this.f76775a = ul2;
        this.f76776b = c8315iL;
        this.f76777c = c7084Px;
        this.f76778d = fi2;
    }

    public final View a() throws zzcfj {
        InterfaceC9008ot interfaceC9008otA = this.f76775a.a(Mc.d2.c0(), null, null);
        interfaceC9008otA.zzF().setVisibility(8);
        interfaceC9008otA.h0("/sendMessageToSdk", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.gJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f74295a.b((InterfaceC9008ot) obj, map);
            }
        });
        interfaceC9008otA.h0("/adMuted", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.hJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f74711a.c((InterfaceC9008ot) obj, map);
            }
        });
        this.f76776b.m(new WeakReference(interfaceC9008otA), "/loadHtml", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.iJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, final Map map) {
                InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
                InterfaceC8156gu interfaceC8156guZzN = interfaceC9008ot.zzN();
                final C8739mJ c8739mJ = this.f74943a;
                interfaceC8156guZzN.P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.lJ
                    @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
                    public final void a(boolean z10, int i10, String str, String str2) {
                        c8739mJ.d(map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    interfaceC9008ot.loadData(str, "text/html", "UTF-8");
                } else {
                    interfaceC9008ot.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f76776b.m(new WeakReference(interfaceC9008otA), "/showOverlay", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.jJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f75430a.e((InterfaceC9008ot) obj, map);
            }
        });
        this.f76776b.m(new WeakReference(interfaceC9008otA), "/hideOverlay", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.kJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f75605a.f((InterfaceC9008ot) obj, map);
            }
        });
        return interfaceC9008otA.zzF();
    }

    final /* synthetic */ void b(InterfaceC9008ot interfaceC9008ot, Map map) {
        this.f76776b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(InterfaceC9008ot interfaceC9008ot, Map map) {
        this.f76778d.zzh();
    }

    final /* synthetic */ void d(Map map, boolean z10, int i10, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put(PreferencesHelper.PREF_ID, (String) map.get(PreferencesHelper.PREF_ID));
        this.f76776b.j("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(InterfaceC9008ot interfaceC9008ot, Map map) {
        Qc.p.f("Showing native ads overlay.");
        interfaceC9008ot.zzF().setVisibility(0);
        this.f76777c.p(true);
    }

    final /* synthetic */ void f(InterfaceC9008ot interfaceC9008ot, Map map) {
        Qc.p.f("Hiding native ads overlay.");
        interfaceC9008ot.zzF().setVisibility(8);
        this.f76777c.p(false);
    }
}
