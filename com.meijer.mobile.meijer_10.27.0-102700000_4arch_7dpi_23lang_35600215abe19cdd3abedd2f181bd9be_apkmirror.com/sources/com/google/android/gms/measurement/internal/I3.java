package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class I3 extends AbstractC11263x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85056e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11263x
    public final void a() {
        final C11268x4 c11268x4Z = this.f85056e.f84868a.z();
        Objects.requireNonNull(c11268x4Z);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.H3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                c11268x4Z.s0();
            }
        }).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I3(C11268x4 c11268x4, C3 c32) {
        super(c32);
        Objects.requireNonNull(c11268x4);
        this.f85056e = c11268x4;
    }
}
