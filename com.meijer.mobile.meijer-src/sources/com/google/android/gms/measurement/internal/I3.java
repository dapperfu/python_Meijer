package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class I3 extends AbstractC11388x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11393x4 f85896e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11388x
    public final void a() {
        final C11393x4 c11393x4Z = this.f85896e.f85708a.z();
        Objects.requireNonNull(c11393x4Z);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.H3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                c11393x4Z.s0();
            }
        }).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I3(C11393x4 c11393x4, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11393x4);
        this.f85896e = c11393x4;
    }
}
