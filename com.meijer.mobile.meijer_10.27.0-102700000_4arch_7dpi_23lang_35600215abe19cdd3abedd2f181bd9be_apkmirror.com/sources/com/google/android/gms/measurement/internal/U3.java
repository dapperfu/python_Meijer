package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class U3 extends AbstractC11263x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85244e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11263x
    public final void a() {
        C11268x4 c11268x4 = this.f85244e;
        if (c11268x4.f84868a.l()) {
            c11268x4.a0().b(2000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U3(C11268x4 c11268x4, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11268x4);
        this.f85244e = c11268x4;
    }
}
