package com.google.android.gms.internal.ads;

import ad.InterfaceC5681a;
import android.os.Bundle;
import java.util.Set;

/* loaded from: classes6.dex */
public final class VC extends WE implements InterfaceC8043ei {

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f71663b;

    public final synchronized Bundle R0() {
        return new Bundle(this.f71663b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8043ei
    public final synchronized void g0(String str, Bundle bundle) {
        this.f71663b.putAll(bundle);
        J0(new VE() { // from class: com.google.android.gms.internal.ads.UC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC5681a) obj).q();
            }
        });
    }

    VC(Set set) {
        super(set);
        this.f71663b = new Bundle();
    }
}
