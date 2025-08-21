package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class OR implements PC, InterfaceC7784cC {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f69914c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int f69915d;

    /* renamed from: a, reason: collision with root package name */
    private final Rc.r0 f69916a;

    /* renamed from: b, reason: collision with root package name */
    private final YR f69917b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(Oc.W0 w02) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        a(true);
    }

    private final void a(boolean z10) {
        int i10;
        int iIntValue;
        if (((Boolean) Oc.A.c().a(C8784lf.f77110b6)).booleanValue() && !this.f69916a.zzN()) {
            Object obj = f69914c;
            synchronized (obj) {
                i10 = f69915d;
                iIntValue = ((Integer) Oc.A.c().a(C8784lf.f77124c6)).intValue();
            }
            if (i10 < iIntValue) {
                this.f69917b.e(z10);
                synchronized (obj) {
                    f69915d++;
                }
            }
        }
    }

    public OR(YR yr2, Rc.r0 r0Var) {
        this.f69917b = yr2;
        this.f69916a = r0Var;
    }
}
