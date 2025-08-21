package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ci, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6753Ci implements InterfaceC7194Pi {
    C6753Ci() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        try {
            String str = (String) map.get("enabled");
            if (!C8571jf0.c("true", str) && !C8571jf0.c("false", str)) {
                return;
            }
            C7185Pd0.a(interfaceC9133ot.getContext()).b(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            Nc.v.s().x(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
