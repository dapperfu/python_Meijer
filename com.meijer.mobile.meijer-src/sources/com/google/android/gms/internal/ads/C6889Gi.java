package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6889Gi implements InterfaceC7194Pi {
    C6889Gi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        if (interfaceC9133ot.k() != null) {
            interfaceC9133ot.k().zza();
        }
        com.google.android.gms.ads.internal.overlay.h hVarL = interfaceC9133ot.l();
        if (hVarL != null) {
            hVarL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.h hVarM = interfaceC9133ot.m();
        if (hVarM != null) {
            hVarM.zzb();
        } else {
            Sc.p.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
