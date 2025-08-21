package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class Q40 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70336a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70337b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f70338c;

    public Q40(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f70336a = interfaceC10213yy0;
        this.f70337b = interfaceC10213yy02;
        this.f70338c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N40 zzb() {
        Context context = (Context) this.f70336a.zzb();
        C7882d70 c7882d70 = (C7882d70) this.f70337b.zzb();
        C9911w70 c9911w70 = (C9911w70) this.f70338c.zzb();
        C9768uq c9768uqZzg = ((Boolean) Oc.A.c().a(C8784lf.f77180g6)).booleanValue() ? Nc.v.s().j().zzg() : Nc.v.s().j().zzh();
        boolean z10 = false;
        if (c9768uqZzg != null && c9768uqZzg.h()) {
            z10 = true;
        }
        if (((Integer) Oc.A.c().a(C8784lf.f77208i6)).intValue() > 0) {
            if (!((Boolean) Oc.A.c().a(C8784lf.f77166f6)).booleanValue() || z10) {
                C9804v70 c9804v70A = c9911w70.a(EnumC8842m70.Rewarded, context, c7882d70, new C9264q40(new C8943n40()));
                C40 c40 = new C40(new B40());
                InterfaceC8309h70 interfaceC8309h70 = c9804v70A.f79835a;
                Xj0 xj0 = C7033Kq.f69014a;
                return new C9477s40(c40, new C10119y40(interfaceC8309h70, xj0), c9804v70A.f79836b, c9804v70A.f79835a.zza().f78346h, xj0);
            }
        }
        return new B40();
    }
}
