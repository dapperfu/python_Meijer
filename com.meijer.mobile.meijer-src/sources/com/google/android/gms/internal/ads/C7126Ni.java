package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7126Ni implements InterfaceC7194Pi {
    C7126Ni() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        if (map.keySet().contains("start")) {
            interfaceC9133ot.m0(true);
        }
        if (map.keySet().contains("stop")) {
            interfaceC9133ot.m0(false);
        }
    }
}
