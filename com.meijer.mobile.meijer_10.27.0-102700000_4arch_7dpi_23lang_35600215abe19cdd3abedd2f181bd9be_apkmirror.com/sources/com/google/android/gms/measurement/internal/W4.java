package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class W4 extends AbstractC11263x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85266e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11263x
    public final void a() {
        C11262w5 c11262w5 = this.f85266e;
        c11262w5.f();
        if (c11262w5.U()) {
            c11262w5.f84868a.a().u().a("Inactivity, disconnecting from the service");
            c11262w5.y();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W4(C11262w5 c11262w5, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11262w5);
        this.f85266e = c11262w5;
    }
}
