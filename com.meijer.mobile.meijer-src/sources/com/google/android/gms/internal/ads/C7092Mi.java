package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7092Mi implements InterfaceC7194Pi {
    C7092Mi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        if (map.keySet().contains("start")) {
            interfaceC9133ot.zzN().zzm();
        } else if (map.keySet().contains("stop")) {
            interfaceC9133ot.zzN().zzn();
        } else if (map.keySet().contains("cancel")) {
            interfaceC9133ot.zzN().zzl();
        }
    }
}
