package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.lO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8762lO implements YN {

    /* renamed from: a, reason: collision with root package name */
    private final long f76646a;

    /* renamed from: b, reason: collision with root package name */
    private final BinderC8878mX f76647b;

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(Oc.Y1 y12) {
        this.f76647b.W7(y12);
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void zza() {
        this.f76647b.zzx();
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void zzc() {
        this.f76647b.J6(com.google.android.gms.dynamic.d.I2(null));
    }

    C8762lO(long j10, Context context, C8015eO c8015eO, AbstractC9135ou abstractC9135ou, String str) {
        this.f76646a = j10;
        InterfaceC7665b50 interfaceC7665b50B = abstractC9135ou.B();
        interfaceC7665b50B.zzc(context);
        interfaceC7665b50B.a(new Oc.d2());
        interfaceC7665b50B.d(str);
        BinderC8878mX binderC8878mXZza = interfaceC7665b50B.zzd().zza();
        this.f76647b = binderC8878mXZza;
        binderC8878mXZza.n9(new BinderC8655kO(this, c8015eO));
    }
}
