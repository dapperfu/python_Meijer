package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11224a5 extends AbstractC11388x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86192e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11388x
    public final void a() {
        this.f86192e.f85708a.a().p().a("Tasks have been queued for a long time");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11224a5(C11387w5 c11387w5, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11387w5);
        this.f86192e = c11387w5;
    }
}
