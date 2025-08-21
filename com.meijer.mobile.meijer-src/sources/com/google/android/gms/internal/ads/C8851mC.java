package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8851mC extends WE implements InterfaceC7891dC {
    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void i(final Oc.W0 w02) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.lC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9279qC) obj).j(w02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void k0(final zzdgb zzdgbVar) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.jC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                InterfaceC9279qC interfaceC9279qC = (InterfaceC9279qC) obj;
                String message = zzdgbVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC9279qC.j(V60.d(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void zzb() {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.kC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9279qC) obj).j(V60.d(11, null, null));
            }
        });
    }

    public C8851mC(Set set) {
        super(set);
    }
}
