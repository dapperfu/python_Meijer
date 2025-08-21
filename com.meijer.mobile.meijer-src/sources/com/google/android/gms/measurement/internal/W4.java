package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class W4 extends AbstractC11388x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86106e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11388x
    public final void a() {
        C11387w5 c11387w5 = this.f86106e;
        c11387w5.f();
        if (c11387w5.U()) {
            c11387w5.f85708a.a().u().a("Inactivity, disconnecting from the service");
            c11387w5.y();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W4(C11387w5 c11387w5, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11387w5);
        this.f86106e = c11387w5;
    }
}
