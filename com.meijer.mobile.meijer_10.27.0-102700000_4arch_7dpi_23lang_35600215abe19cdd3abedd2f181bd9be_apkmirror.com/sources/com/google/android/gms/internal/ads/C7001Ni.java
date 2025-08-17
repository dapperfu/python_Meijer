package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7001Ni implements InterfaceC7069Pi {
    C7001Ni() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        if (map.keySet().contains("start")) {
            interfaceC9008ot.m0(true);
        }
        if (map.keySet().contains("stop")) {
            interfaceC9008ot.m0(false);
        }
    }
}
