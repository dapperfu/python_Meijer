package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class J5 extends AbstractC11263x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L5 f85077e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11263x
    public final void a() {
        L5 l52 = this.f85077e;
        N5 n52 = l52.f85105d;
        n52.f();
        X2 x22 = n52.f84868a;
        l52.d(false, false, x22.zzaZ().c());
        n52.f84868a.K().i(x22.zzaZ().c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J5(L5 l52, C3 c32) {
        super(c32);
        Objects.requireNonNull(l52);
        this.f85077e = l52;
    }
}
