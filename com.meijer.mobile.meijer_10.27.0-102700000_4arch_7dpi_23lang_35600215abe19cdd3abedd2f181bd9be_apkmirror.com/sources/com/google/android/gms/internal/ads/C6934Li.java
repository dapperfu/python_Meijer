package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6934Li implements InterfaceC7069Pi {
    C6934Li() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC9008ot.g0();
        } else if ("resume".equals(str)) {
            interfaceC9008ot.A0();
        }
    }
}
