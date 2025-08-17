package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Wi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7304Wi implements InterfaceC7069Pi {

    /* renamed from: d, reason: collision with root package name */
    static final Map f71144d = com.google.android.gms.common.util.g.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final Lc.b f71145a;

    /* renamed from: b, reason: collision with root package name */
    private final C7341Xm f71146b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7928en f71147c;

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws JSONException {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        int iIntValue = ((Integer) f71144d.get((String) map.get("a"))).intValue();
        int i10 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                Lc.b bVar = this.f71145a;
                if (!bVar.c()) {
                    bVar.b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f71146b.i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new C7502an(interfaceC9008ot, map).i();
                    return;
                }
                if (iIntValue == 4) {
                    new C7209Tm(interfaceC9008ot, map).j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f71146b.h(true);
                        return;
                    } else if (iIntValue != 7) {
                        Qc.p.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f71147c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z10 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC9008ot == null) {
            Qc.p.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z10 ? -1 : 14;
        }
        interfaceC9008ot.K(i10);
    }

    public C7304Wi(Lc.b bVar, C7341Xm c7341Xm, InterfaceC7928en interfaceC7928en) {
        this.f71145a = bVar;
        this.f71146b = c7341Xm;
        this.f71147c = interfaceC7928en;
    }
}
