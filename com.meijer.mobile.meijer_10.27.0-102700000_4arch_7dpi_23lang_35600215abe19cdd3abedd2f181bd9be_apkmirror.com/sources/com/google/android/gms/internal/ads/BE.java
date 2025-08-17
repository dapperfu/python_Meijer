package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes6.dex */
public final class BE extends WE implements InterfaceC8132gi {
    @Override // com.google.android.gms.internal.ads.InterfaceC8132gi
    public final synchronized void a(final String str, final String str2) {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.AE
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((Fc.c) obj).s(str, str2);
            }
        });
    }

    public BE(Set set) {
        super(set);
    }
}
