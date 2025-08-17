package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6764Gi implements InterfaceC7069Pi {
    C6764Gi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        if (interfaceC9008ot.k() != null) {
            interfaceC9008ot.k().zza();
        }
        com.google.android.gms.ads.internal.overlay.h hVarL = interfaceC9008ot.l();
        if (hVarL != null) {
            hVarL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.h hVarM = interfaceC9008ot.m();
        if (hVarM != null) {
            hVarM.zzb();
        } else {
            Qc.p.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
