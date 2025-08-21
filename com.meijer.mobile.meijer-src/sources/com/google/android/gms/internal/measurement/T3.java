package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes6.dex */
final class T3 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T3(V3 v32, Handler handler) {
        super(null);
        Objects.requireNonNull(v32);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC10574k4.c();
    }
}
