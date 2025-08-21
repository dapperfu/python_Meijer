package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes6.dex */
final class H3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I3 f82619a;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f82619a.b().set(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H3(I3 i32, Handler handler) {
        super(null);
        Objects.requireNonNull(i32);
        this.f82619a = i32;
    }
}
