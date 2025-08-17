package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9367sC extends WE {

    /* renamed from: b, reason: collision with root package name */
    private boolean f78184b;

    public final synchronized void zza() {
        if (this.f78184b) {
            return;
        }
        K0(new VE() { // from class: com.google.android.gms.internal.ads.rC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9581uC) obj).zzr();
            }
        });
        this.f78184b = true;
    }

    public C9367sC(Set set) {
        super(set);
        this.f78184b = false;
    }
}
