package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class J5 extends AbstractC11388x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L5 f85917e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11388x
    public final void a() {
        L5 l52 = this.f85917e;
        N5 n52 = l52.f85945d;
        n52.f();
        X2 x22 = n52.f85708a;
        l52.d(false, false, x22.zzaZ().c());
        n52.f85708a.K().i(x22.zzaZ().c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J5(L5 l52, C3 c32) {
        super(c32);
        Objects.requireNonNull(l52);
        this.f85917e = l52;
    }
}
