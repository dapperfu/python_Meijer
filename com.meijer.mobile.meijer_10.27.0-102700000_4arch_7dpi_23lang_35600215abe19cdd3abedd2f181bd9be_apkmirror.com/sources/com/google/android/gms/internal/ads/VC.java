package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes6.dex */
public final class VC extends WE implements InterfaceC7918ei {

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f70823b;

    public final synchronized Bundle R0() {
        return new Bundle(this.f70823b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7918ei
    public final synchronized void b0(String str, Bundle bundle) {
        this.f70823b.putAll(bundle);
        K0(new VE() { // from class: com.google.android.gms.internal.ads.UC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((Yc.a) obj).q();
            }
        });
    }

    VC(Set set) {
        super(set);
        this.f70823b = new Bundle();
    }
}
