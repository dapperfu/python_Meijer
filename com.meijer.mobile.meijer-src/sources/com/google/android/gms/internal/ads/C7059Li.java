package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7059Li implements InterfaceC7194Pi {
    C7059Li() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC9133ot.g0();
        } else if ("resume".equals(str)) {
            interfaceC9133ot.z0();
        }
    }
}
