package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6967Mi implements InterfaceC7069Pi {
    C6967Mi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        if (map.keySet().contains("start")) {
            interfaceC9008ot.zzN().zzm();
        } else if (map.keySet().contains("stop")) {
            interfaceC9008ot.zzN().zzn();
        } else if (map.keySet().contains("cancel")) {
            interfaceC9008ot.zzN().zzl();
        }
    }
}
