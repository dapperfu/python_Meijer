package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ci, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6628Ci implements InterfaceC7069Pi {
    C6628Ci() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        try {
            String str = (String) map.get("enabled");
            if (!C8446jf0.c("true", str) && !C8446jf0.c("false", str)) {
                return;
            }
            C7060Pd0.a(interfaceC9008ot.getContext()).b(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            Lc.v.s().x(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
