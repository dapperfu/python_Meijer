package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11099a5 extends AbstractC11263x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85352e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11263x
    public final void a() {
        this.f85352e.f84868a.a().p().a("Tasks have been queued for a long time");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11099a5(C11262w5 c11262w5, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11262w5);
        this.f85352e = c11262w5;
    }
}
