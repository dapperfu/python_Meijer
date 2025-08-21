package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.lD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8746lD extends WE implements InterfaceC9706uC, InterfaceC7573aD {

    /* renamed from: b, reason: collision with root package name */
    private final Z50 f76606b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f76607c;

    private final void zza() {
        final Oc.f2 f2Var;
        if (((Boolean) Oc.A.c().a(C8784lf.f76846I7)).booleanValue() && this.f76607c.compareAndSet(false, true) && (f2Var = this.f76606b.f72870e0) != null && f2Var.f23446a == 3) {
            J0(new VE() { // from class: com.google.android.gms.internal.ads.kD
                @Override // com.google.android.gms.internal.ads.VE
                public final void zza(Object obj) {
                    ((InterfaceC8960nD) obj).i(f2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7573aD
    public final void zzg() {
        if (this.f76606b.f72863b == 1) {
            zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() {
        int i10 = this.f76606b.f72863b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zza();
        }
    }

    public C8746lD(Set set, Z50 z50) {
        super(set);
        this.f76607c = new AtomicBoolean();
        this.f76606b = z50;
    }
}
