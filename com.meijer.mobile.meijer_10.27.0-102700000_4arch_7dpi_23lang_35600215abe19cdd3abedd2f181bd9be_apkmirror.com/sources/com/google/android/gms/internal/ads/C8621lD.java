package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.lD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8621lD extends WE implements InterfaceC9581uC, InterfaceC7448aD {

    /* renamed from: b, reason: collision with root package name */
    private final Z50 f75766b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f75767c;

    private final void zza() {
        final Mc.f2 f2Var;
        if (((Boolean) Mc.A.c().a(C8659lf.f76006I7)).booleanValue() && this.f75767c.compareAndSet(false, true) && (f2Var = this.f75766b.f72030e0) != null && f2Var.f19259a == 3) {
            K0(new VE() { // from class: com.google.android.gms.internal.ads.kD
                @Override // com.google.android.gms.internal.ads.VE
                public final void zza(Object obj) {
                    ((InterfaceC8835nD) obj).i(f2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7448aD
    public final void zzg() {
        if (this.f75766b.f72023b == 1) {
            zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() {
        int i10 = this.f75766b.f72023b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zza();
        }
    }

    public C8621lD(Set set, Z50 z50) {
        super(set);
        this.f75767c = new AtomicBoolean();
        this.f75766b = z50;
    }
}
