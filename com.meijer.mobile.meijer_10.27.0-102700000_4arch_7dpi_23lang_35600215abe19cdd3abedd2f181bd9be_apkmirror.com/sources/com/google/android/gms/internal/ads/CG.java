package com.google.android.gms.internal.ads;

import Ec.r;
import java.util.Set;

/* loaded from: classes6.dex */
public final class CG extends WE {

    /* renamed from: b, reason: collision with root package name */
    private boolean f65750b;

    public final synchronized void R0() {
        K0(new AG());
        this.f65750b = true;
    }

    public final synchronized void zzc() {
        try {
            if (!this.f65750b) {
                K0(new AG());
                this.f65750b = true;
            }
            K0(new VE() { // from class: com.google.android.gms.internal.ads.BG
                @Override // com.google.android.gms.internal.ads.VE
                public final void zza(Object obj) {
                    ((r.a) obj).d();
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void zza() {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.zG
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((r.a) obj).a();
            }
        });
    }

    public final void zzb() {
        K0(new VE() { // from class: com.google.android.gms.internal.ads.yG
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((r.a) obj).c();
            }
        });
    }

    protected CG(Set set) {
        super(set);
    }
}
