package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8726mC extends WE implements InterfaceC7766dC {
    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void i(final Mc.W0 w02) {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.lC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9154qC) obj).j(w02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void k0(final zzdgb zzdgbVar) {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.jC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                InterfaceC9154qC interfaceC9154qC = (InterfaceC9154qC) obj;
                String message = zzdgbVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC9154qC.j(V60.d(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void zzb() {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.kC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9154qC) obj).j(V60.d(11, null, null));
            }
        });
    }

    public C8726mC(Set set) {
        super(set);
    }
}
