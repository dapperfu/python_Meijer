package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class U3 extends AbstractC11388x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86084e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11388x
    public final void a() {
        C11393x4 c11393x4 = this.f86084e;
        if (c11393x4.f85708a.l()) {
            c11393x4.a0().b(2000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U3(C11393x4 c11393x4, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11393x4);
        this.f86084e = c11393x4;
    }
}
