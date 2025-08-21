package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import io.constructor.data.local.PreferencesHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8864mJ {

    /* renamed from: a, reason: collision with root package name */
    private final UL f77615a;

    /* renamed from: b, reason: collision with root package name */
    private final C8440iL f77616b;

    /* renamed from: c, reason: collision with root package name */
    private final C7209Px f77617c;

    /* renamed from: d, reason: collision with root package name */
    private final FI f77618d;

    public C8864mJ(UL ul2, C8440iL c8440iL, C7209Px c7209Px, FI fi2) {
        this.f77615a = ul2;
        this.f77616b = c8440iL;
        this.f77617c = c7209Px;
        this.f77618d = fi2;
    }

    public final View a() throws zzcfj {
        InterfaceC9133ot interfaceC9133otA = this.f77615a.a(Oc.d2.b0(), null, null);
        interfaceC9133otA.zzF().setVisibility(8);
        interfaceC9133otA.h0("/sendMessageToSdk", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.gJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f75135a.b((InterfaceC9133ot) obj, map);
            }
        });
        interfaceC9133otA.h0("/adMuted", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.hJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f75551a.c((InterfaceC9133ot) obj, map);
            }
        });
        this.f77616b.m(new WeakReference(interfaceC9133otA), "/loadHtml", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.iJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, final Map map) {
                InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
                InterfaceC8281gu interfaceC8281guZzN = interfaceC9133ot.zzN();
                final C8864mJ c8864mJ = this.f75783a;
                interfaceC8281guZzN.P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.lJ
                    @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
                    public final void a(boolean z10, int i10, String str, String str2) {
                        c8864mJ.d(map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    interfaceC9133ot.loadData(str, "text/html", "UTF-8");
                } else {
                    interfaceC9133ot.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f77616b.m(new WeakReference(interfaceC9133otA), "/showOverlay", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.jJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f76270a.e((InterfaceC9133ot) obj, map);
            }
        });
        this.f77616b.m(new WeakReference(interfaceC9133otA), "/hideOverlay", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.kJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f76445a.f((InterfaceC9133ot) obj, map);
            }
        });
        return interfaceC9133otA.zzF();
    }

    final /* synthetic */ void b(InterfaceC9133ot interfaceC9133ot, Map map) {
        this.f77616b.j("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(InterfaceC9133ot interfaceC9133ot, Map map) {
        this.f77618d.zzh();
    }

    final /* synthetic */ void d(Map map, boolean z10, int i10, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put(PreferencesHelper.PREF_ID, (String) map.get(PreferencesHelper.PREF_ID));
        this.f77616b.j("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(InterfaceC9133ot interfaceC9133ot, Map map) {
        Sc.p.f("Showing native ads overlay.");
        interfaceC9133ot.zzF().setVisibility(0);
        this.f77617c.p(true);
    }

    final /* synthetic */ void f(InterfaceC9133ot interfaceC9133ot, Map map) {
        Sc.p.f("Hiding native ads overlay.");
        interfaceC9133ot.zzF().setVisibility(8);
        this.f77617c.p(false);
    }
}
