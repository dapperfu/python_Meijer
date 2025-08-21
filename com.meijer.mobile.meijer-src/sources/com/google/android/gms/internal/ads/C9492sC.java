package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9492sC extends WE {

    /* renamed from: b, reason: collision with root package name */
    private boolean f79024b;

    public final synchronized void zza() {
        if (this.f79024b) {
            return;
        }
        J0(new VE() { // from class: com.google.android.gms.internal.ads.rC
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((InterfaceC9706uC) obj).zzr();
            }
        });
        this.f79024b = true;
    }

    public C9492sC(Set set) {
        super(set);
        this.f79024b = false;
    }
}
