package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes6.dex */
public final class BE extends WE implements InterfaceC8257gi {
    @Override // com.google.android.gms.internal.ads.InterfaceC8257gi
    public final synchronized void a(final String str, final String str2) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.AE
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((Hc.c) obj).s(str, str2);
            }
        });
    }

    public BE(Set set) {
        super(set);
    }
}
