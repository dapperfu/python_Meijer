package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7262Ri implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final C7296Si f70763a;

    public C7262Ri(C7296Si c7296Si) {
        this.f70763a = c7296Si;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            Sc.p.e("Fail to parse float", e10);
        }
        this.f70763a.c(zEquals);
        this.f70763a.b(zEquals2, f10);
        interfaceC9133ot.Y(zEquals);
    }
}
