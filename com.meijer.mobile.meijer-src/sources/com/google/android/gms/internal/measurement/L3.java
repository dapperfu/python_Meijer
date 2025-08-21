package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes6.dex */
final class L3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O3 f82666a;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f82666a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L3(O3 o32, Handler handler) {
        super(null);
        Objects.requireNonNull(o32);
        this.f82666a = o32;
    }
}
