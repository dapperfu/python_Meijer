package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Wi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7429Wi implements InterfaceC7194Pi {

    /* renamed from: d, reason: collision with root package name */
    static final Map f71984d = com.google.android.gms.common.util.g.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final Nc.b f71985a;

    /* renamed from: b, reason: collision with root package name */
    private final C7466Xm f71986b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8053en f71987c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws JSONException {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        int iIntValue = ((Integer) f71984d.get((String) map.get("a"))).intValue();
        int i10 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                Nc.b bVar = this.f71985a;
                if (!bVar.c()) {
                    bVar.b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f71986b.i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new C7627an(interfaceC9133ot, map).i();
                    return;
                }
                if (iIntValue == 4) {
                    new C7334Tm(interfaceC9133ot, map).j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f71986b.h(true);
                        return;
                    } else if (iIntValue != 7) {
                        Sc.p.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f71987c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z10 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC9133ot == null) {
            Sc.p.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z10 ? -1 : 14;
        }
        interfaceC9133ot.K(i10);
    }

    public C7429Wi(Nc.b bVar, C7466Xm c7466Xm, InterfaceC8053en interfaceC8053en) {
        this.f71985a = bVar;
        this.f71986b = c7466Xm;
        this.f71987c = interfaceC8053en;
    }
}
