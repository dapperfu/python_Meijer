package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.lO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8637lO implements YN {

    /* renamed from: a, reason: collision with root package name */
    private final long f75806a;

    /* renamed from: b, reason: collision with root package name */
    private final BinderC8753mX f75807b;

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(Mc.Y1 y12) {
        this.f75807b.H4(y12);
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void zza() {
        this.f75807b.zzx();
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void zzc() {
        this.f75807b.u6(com.google.android.gms.dynamic.d.F2(null));
    }

    C8637lO(long j10, Context context, C7890eO c7890eO, AbstractC9010ou abstractC9010ou, String str) {
        this.f75806a = j10;
        InterfaceC7540b50 interfaceC7540b50B = abstractC9010ou.B();
        interfaceC7540b50B.zzc(context);
        interfaceC7540b50B.a(new Mc.d2());
        interfaceC7540b50B.d(str);
        BinderC8753mX binderC8753mXZza = interfaceC7540b50B.zzd().zza();
        this.f75807b = binderC8753mXZza;
        binderC8753mXZza.s8(new BinderC8530kO(this, c7890eO));
    }
}
