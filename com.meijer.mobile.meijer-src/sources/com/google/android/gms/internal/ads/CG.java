package com.google.android.gms.internal.ads;

import Gc.r;
import java.util.Set;

/* loaded from: classes6.dex */
public final class CG extends WE {

    /* renamed from: b, reason: collision with root package name */
    private boolean f66590b;

    public final synchronized void R0() {
        J0(new AG());
        this.f66590b = true;
    }

    public final synchronized void zzc() {
        try {
            if (!this.f66590b) {
                J0(new AG());
                this.f66590b = true;
            }
            J0(new VE() { // from class: com.google.android.gms.internal.ads.BG
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
        J0(new VE() { // from class: com.google.android.gms.internal.ads.zG
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((r.a) obj).a();
            }
        });
    }

    public final void zzb() {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.yG
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
