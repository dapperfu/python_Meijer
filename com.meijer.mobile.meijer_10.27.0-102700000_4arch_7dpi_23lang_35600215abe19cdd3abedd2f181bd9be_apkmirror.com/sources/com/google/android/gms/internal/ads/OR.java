package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class OR implements PC, InterfaceC7659cC {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f69074c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int f69075d;

    /* renamed from: a, reason: collision with root package name */
    private final Pc.r0 f69076a;

    /* renamed from: b, reason: collision with root package name */
    private final YR f69077b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(Mc.W0 w02) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        a(true);
    }

    private final void a(boolean z10) {
        int i10;
        int iIntValue;
        if (((Boolean) Mc.A.c().a(C8659lf.f76270b6)).booleanValue() && !this.f69076a.zzN()) {
            Object obj = f69074c;
            synchronized (obj) {
                i10 = f69075d;
                iIntValue = ((Integer) Mc.A.c().a(C8659lf.f76284c6)).intValue();
            }
            if (i10 < iIntValue) {
                this.f69077b.e(z10);
                synchronized (obj) {
                    f69075d++;
                }
            }
        }
    }

    public OR(YR yr2, Pc.r0 r0Var) {
        this.f69077b = yr2;
        this.f69076a = r0Var;
    }
}
