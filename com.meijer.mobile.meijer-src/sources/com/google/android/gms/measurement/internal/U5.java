package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class U5 extends AbstractC11388x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ V5 f86087e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11388x
    public final void a() {
        V5 v52 = this.f86087e;
        v52.l();
        v52.f85708a.a().u().a("Starting upload from DelayedRunnable");
        v52.f86107b.p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U5(V5 v52, C3 c32) {
        super(c32);
        Objects.requireNonNull(v52);
        this.f86087e = v52;
    }
}
