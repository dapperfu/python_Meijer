package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class P40 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69249a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69250b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f69251c;

    public P40(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f69249a = interfaceC10088yy0;
        this.f69250b = interfaceC10088yy02;
        this.f69251c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N40 zzb() {
        Context context = (Context) this.f69249a.zzb();
        C7757d70 c7757d70 = (C7757d70) this.f69250b.zzb();
        C9786w70 c9786w70 = (C9786w70) this.f69251c.zzb();
        C9643uq c9643uqZzg = ((Boolean) Mc.A.c().a(C8659lf.f76340g6)).booleanValue() ? Lc.v.s().j().zzg() : Lc.v.s().j().zzh();
        boolean z10 = false;
        if (c9643uqZzg != null && c9643uqZzg.h()) {
            z10 = true;
        }
        if (((Integer) Mc.A.c().a(C8659lf.f76564w6)).intValue() > 0) {
            if (!((Boolean) Mc.A.c().a(C8659lf.f76326f6)).booleanValue() || z10) {
                C9679v70 c9679v70A = c9786w70.a(EnumC8717m70.AppOpen, context, c7757d70, new C9139q40(new C8818n40()));
                C40 c40 = new C40(new B40());
                InterfaceC8184h70 interfaceC8184h70 = c9679v70A.f78995a;
                Xj0 xj0 = C6908Kq.f68174a;
                return new C9352s40(c40, new C9994y40(interfaceC8184h70, xj0), c9679v70A.f78996b, c9679v70A.f78995a.zza().f77506h, xj0);
            }
        }
        return new B40();
    }
}
