package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7137Ri implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final C7171Si f69923a;

    public C7137Ri(C7171Si c7171Si) {
        this.f69923a = c7171Si;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            Qc.p.e("Fail to parse float", e10);
        }
        this.f69923a.c(zEquals);
        this.f69923a.b(zEquals2, f10);
        interfaceC9008ot.Y(zEquals);
    }
}
